package Interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ExecutionTime extends HandlerInterceptorAdapter {

	 private static Logger log = Logger.getLogger(ExecutionTime.class);
	
	 public static String lctn;
	 
	@Override
	public boolean preHandle(HttpServletRequest req ,HttpServletResponse res ,Object o) throws Exception
	{try{
		
		long starttime = System.currentTimeMillis();
		
		req.setAttribute("StartTime", starttime);
		lctn= "prehandle";
		return true;
			
	}
	catch(NullPointerException e){
		
		System.out.println("exception cached");
		return false;
		
	}
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView)
	{
		try{
		lctn = "postHandle";
long startTime = (Long)request.getAttribute("StartTime");
		
		long endTime = System.currentTimeMillis();

		long executeTime = endTime - startTime;
		
		//modified the exisitng modelAndView
		lctn = "postHandle1";
		modelAndView.addObject("executeTime",executeTime);
		System.out.println("time"+executeTime);
		lctn = "postHandle2";
		log.info("Executiontime:"+executeTime);
		lctn = "postHandle3";
		}
		catch(NullPointerException e){
			
			System.out.println("exception cached");
			
		}
		
		
	}
	
	
	
	
}
 