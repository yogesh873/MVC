package Validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import DAO.Employee;

@Component
public class EmpValidator implements Validator{
	
	
	@Override
	public boolean supports(Class<?> clzz){
		
		return Employee.class.isAssignableFrom(clzz);
		
		
	}


	@Override
	public void validate(Object Target, Errors err) {
		// TODO Auto-generated method stub
		validatepg1(Target,err);
		validatepg2(Target,err);
		validatepg3(Target,err);
	}

public void validatepg1(Object Target, Errors err)
{
	System.out.println("validating page 1");
ValidationUtils.rejectIfEmpty(err, "ename", "required.ename", "Employe name is required");
ValidationUtils.rejectIfEmpty(err, "job", "required.job", "job detail is required");



}
public void validatepg2(Object Target, Errors err)
{try{
ValidationUtils.rejectIfEmpty(err, "sal", "required.sal","sal details is required");	
ValidationUtils.rejectIfEmpty(err, "dnmae", "required.dname","department must be selected");
}
catch(NullPointerException e){
System.out.println("caught");
}
}
public void validatepg3(Object Target, Errors err)
{
	ValidationUtils.rejectIfEmpty(err,"Laptop.Lid","required.Laptop.Lid", "LID si required");
	
	
}
	
	

}
