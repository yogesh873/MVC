package Controllers;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import DAO.Department;
import DAO.Employee;
import Service.DepartmentCRUD;
import Validation.EmpValidator;
import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
@SessionAttributes("Emp")
public class Registercontroller {

	@Autowired
	DepartmentCRUD dc;
	
	Map<Integer,String> page = new HashMap<>(3);

	EmpValidator vldtr = new EmpValidator();
	
	@InitBinder
	public void prevalidation(WebDataBinder binder)
	{
		
		binder.setValidator(vldtr);
	}
	

	@PostConstruct
	public void initialize()
	{
		page.put(0,"Add_Employee");
	
	    page.put(1,"Add_employee_pg2");
	
	    page.put(2,"Add_employee_pg3");
	
	}
	
	
@ModelAttribute("DNAME")
public List<Department> getalldeps()
{
	System.out.println("Adding DNAME");
return dc.getalldep();	
}

	
	@GetMapping("/Add employee")
	public ModelAndView addemployee()
		{
				return new ModelAndView("Add_Employee","Emp",new Employee());
				}
	
	
	@PostMapping(params = {"_cancel"})
public ModelAndView cancel(@RequestParam("currentpage")int pageno){
		
		return new ModelAndView(page.get(pageno));
		
		
	}
	
	
	@PostMapping(params = {"_Finish"})
	public ModelAndView finish(@ModelAttribute("Emp") @Validated Employee Emp,BindingResult br, SessionStatus status,@RequestParam("_page")int currentpage)
	{
		
		if(!br.hasErrors()){
			status.setComplete();
			return new ModelAndView("registersuccess");
		
		}
			else 
				return new ModelAndView(page.get(currentpage));
	
	}

	@PostMapping
public ModelAndView process(HttpServletRequest request,@RequestParam("_page") int currentpage, @ModelAttribute("Emp") Employee emp, BindingResult br)
{
	
int targetpage = getTargetPage(request,"_target",currentpage);
ModelAndView mav;
System.out.println("targetpage"+page.get(targetpage));
if(targetpage == currentpage)
	mav = new ModelAndView("error");

if(targetpage < currentpage)//previous
	mav = new ModelAndView(page.get(targetpage));

else 
{System.out.println("gonna validate");
	validatecurrentpage(currentpage,emp,br);

	System.out.println("validated");
if(!br.hasErrors()){
	System.out.println("callcing target page");
	mav = new ModelAndView(page.get(targetpage));
}
else
mav = new ModelAndView(page.get(currentpage));	

}

return mav;
}
	
public int getTargetPage(HttpServletRequest req, String prefix , int currntpg)
{
Enumeration<String> reqprms =  req.getParameterNames();
String[] s= req.getParameterValues("_target1");

int crrnt = currntpg;

for(String s1 :s)
System.out.println("Entry sey"+s1);


while(reqprms.hasMoreElements())
	{
String paramnm = reqprms.nextElement();
System.out.println("reqprms = "+ paramnm);
if(paramnm.startsWith(prefix))
{
	System.out.println("Willnot run");
	
	String suffix = paramnm.substring(prefix.length(),paramnm.length());
	
	crrnt = Integer.parseInt(suffix);
	
//for(int i =0;i<WebUtils.SUBMIT_IMAGE_SUFFIXES.length; i++){
//	System.out.println("check"+WebUtils.SUBMIT_IMAGE_SUFFIXES[i]);
//	String suffix = WebUtils.SUBMIT_IMAGE_SUFFIXES[i];

//	System.out.println(WebUtils.SUBMIT_IMAGE_SUFFIXES[i]);
//if(paramnm.endsWith(suffix))
//	crrnt = Integer.parseInt(suffix);

//}
System.out.println("crrnt =" +crrnt);
}
}
return crrnt;
}

public void validatecurrentpage(int currentpage , Employee emp ,BindingResult br)
{
	System.out.println("validate current page");
switch(currentpage){
case 0:
	System.out.println("this will cause issue");
vldtr.validatepg1(emp, br);
System.out.println("wont print");
break;
case 1:
	vldtr.validatepg2(emp, br);
	break;
case 2:
	vldtr.validatepg3(emp, br);
	break;
}
}



}


	





	

 