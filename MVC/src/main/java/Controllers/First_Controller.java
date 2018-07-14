package Controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
//import DAO.user;

@Controller
public class First_Controller {

	
	@GetMapping(value = {"/" , "/index"})
	public ModelAndView m1(){
		
		return new ModelAndView("index");
			
	}
	
	
	
	
	
}



