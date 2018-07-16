package Controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import Validation.Loginbean;
//import DAO.user;

import Validation.Loginbean;

@Controller
public class First_Controller {

	
	@GetMapping(value = {"/" , "/index"})
	public ModelAndView m1(){
		
		return new ModelAndView("index");
			
	}
	
	
	@GetMapping("/login")
	public String login(@ModelAttribute("Loginbean") Loginbean lbean){
		
		//m.addAttribute("lbean",new Loginbean());
			return "Login";
	}
	
	
	
}



