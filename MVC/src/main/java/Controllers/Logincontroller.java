package Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DAO.useraccess;
import Validation.Loginbean;
import DAO.user;



@Controller
@SessionAttributes("lbean")
public class Logincontroller {

	@Autowired
	useraccess ua;
	
	
	
	@PostMapping("/loginprocess")
	public ModelAndView m2(@Valid @ModelAttribute("Loginbean") Loginbean lbean, BindingResult br){
	
	ModelAndView mav ;
	System.out.println("sd1");
	
	
	
	if(br.hasErrors()){
		//System.out.println("binding result has errors");
		 mav =new ModelAndView("Login");
		 		 mav.addObject("message","Username or password is empty");
		return mav;
		}
	
	System.out.println("no binding errors");
	
	if(ua.validate(lbean) == false)
	{System.out.println("validation failed");
	
		mav = new ModelAndView("Login");
			mav.addObject("message","Username or password is incorrect");
	}
	else
	{
		System.out.println("sd3");
	mav =	new ModelAndView("welcome");
	mav.addObject("firstname", lbean.uid);
	}
	return mav;
	
}
	
	
	
	
	
	@GetMapping("/logout")
public ModelAndView m1(SessionStatus status){
		
		status.setComplete();
		return new ModelAndView("index");
			
	}
	
}
