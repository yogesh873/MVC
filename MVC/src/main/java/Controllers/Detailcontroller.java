package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import Service.GetDetails;

@SessionAttributes("lbean")
@Controller
public class Detailcontroller {

	@Autowired
	GetDetails gd;
	
	@GetMapping("/employees")
	public ModelAndView getemp()
	{
		
		System.out.println("fetching employee");
		//model.addattribute(gd.getallemployee());
		
		
		
		return new ModelAndView("Employee","Employee",gd.getallemployee());
		
		
	}
}
