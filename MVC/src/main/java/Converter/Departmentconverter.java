package Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import DAO.Department;
import Service.DepartmentCRUD;

public class Departmentconverter implements Converter<String , Department> {

	@Autowired
	DepartmentCRUD dc;
	
	@Override
	public Department convert(String arg0) {
		// TODO Auto-generated method stub
			System.out.println("converter called");
	Department d =	dc.getdep(arg0);
		
			return d;
	}

	
	
	
}
