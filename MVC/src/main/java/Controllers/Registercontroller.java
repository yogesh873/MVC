package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import DAO.Employee;

@Controller
@SessionAttributes("Emp")
public class Registercontroller {


	@GetMapping("/Add employee")
	public ModelAndView addemployee()
		{
				return new ModelAndView("Add_Employee","EMP",new Employee());
				}
	
	
}
