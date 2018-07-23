package Controllers;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import Interceptors.ExecutionTime;

@ControllerAdvice
public class HANDLE_EXCEPTION {

	static final Logger log = Logger.getLogger(HANDLE_EXCEPTION.class);
	@ExceptionHandler(Exception.class)
	public String EXCPTN(Exception e)
	{
		System.out.println("Exception is"+e+"at"+ExecutionTime.lctn);
		log.info(e);
		return "error";
		
		
		
	}
	
}
