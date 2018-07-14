package Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DAO.useraccess;
import Validation.Loginbean;
import DAO.user;

@Controller
public class Logincontroller {

	@Autowired
	useraccess ua;
	
	@GetMapping("/login")
	public String login(@ModelAttribute("Loginbean") Loginbean lbean){
		
		//m.addAttribute("lbean",new Loginbean());
			return "Login";
	}
	
	
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
	
}
