package Controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import Interceptors.ExecutionTime;

@ControllerAdvice
public class HANDLE_EXCEPTION {

	static final Logger log = Logger.getLogger(HANDLE_EXCEPTION.class);
	
	
	@InitBinder
	public void dateformat(WebDataBinder bndr)
	{
		System.out.println("controller advice initbinder invoked");
		//This shd work in all date binding;
		SimpleDateFormat df  = new SimpleDateFormat("YYYY/MM/DD");
		bndr.registerCustomEditor(Date.class, new CustomDateEditor(df,false));
	}
	
	@ExceptionHandler(Exception.class)
	public String EXCPTN(Exception e)
	{
		System.out.println("Exception is"+e+"at"+ExecutionTime.lctn);
		log.info(e);
		return "error";
		
		
		
	}
	
}
