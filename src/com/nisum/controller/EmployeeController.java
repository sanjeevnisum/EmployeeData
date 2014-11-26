package com.nisum.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.bean.Employee;

import com.nisum.service.EmployeeService;
@Controller
public class EmployeeController {
	
	static final Logger logger = Logger.getLogger(EmployeeController.class); 
	
	@Autowired
	private EmployeeService employeeService;
	

	
	@RequestMapping(value="/index",method = RequestMethod.GET)  
	 public ModelAndView show() {  
		logger.info("getting employee form...");
		
	  return new ModelAndView("redirect:/register.html");  
	 }  
	
	   @RequestMapping(value="/register",method = RequestMethod.GET) 
	   public ModelAndView Welcome(@ModelAttribute Employee employee)
	    {   
	    return new ModelAndView("addEmployee");  
	    }  
	 
	    @RequestMapping("/insert")
	    public ModelAndView addPerson(@ModelAttribute @Valid Employee employee,BindingResult result,HttpServletRequest request,HttpServletResponse response){	 
		 
		 if(result.hasErrors())
		  {
			  return new ModelAndView("addEmployee");
		  }
		 int empid=Integer.parseInt(request.getParameter("employeeId"));
		 System.out.println(empid);
		 List<Integer> list=employeeService.employeeIds();
		 System.out.println(list);
		 Iterator itr=list.iterator();
		 while(itr.hasNext())
		 { 
		   Employee emp=(Employee)itr.next();
		   if(emp.getEmployeeId()==empid)
		   {
		  return new ModelAndView("addEmployee","error","EmployeeId Already exist please provide another Id");
		   }
		   
		 }
		 logger.info("details inserted...");
		 
		    employeeService.addEmployee(employee);
	        return new ModelAndView("success");   
			 }
        
	    @RequestMapping("/empList")
	    public ModelAndView listEmployees(@ModelAttribute("employee") Employee employee){	 
		logger.info("getting employee List...");
		      @SuppressWarnings("unchecked")
			List<Employee> employeeList=employeeService.employeesList();
		      return new ModelAndView("employeeList", "employeeList", employeeList); 
	     }
		      
		      
	   @RequestMapping("/edit")  
	   public ModelAndView editUser(@RequestParam Integer id, @ModelAttribute Employee employee) { 
		  logger.info("getting employee form of..."+id);
		  logger.debug("edit employee id="+id);
		  employee = employeeService.getEmployee(id);
		  
		  Map<String, Object> map = new HashMap<String, Object>();  
		   map.put("employee", employee);  
		   return new ModelAndView("edit", "map", map);  
		}
	
	  @RequestMapping("/update")
	  public ModelAndView updateEmployee(@ModelAttribute Employee employee)
	  {
		employeeService.updateEmployee(employee);
		return new ModelAndView("redirect:/empList.html");
	  }
	
	   @RequestMapping("/delete")  
	   public ModelAndView deleteEmployee(@RequestParam Integer id, @ModelAttribute Employee employee) {  
		       
		employeeService.deleteEmployee(id);
		return new ModelAndView("redirect:/empList.html"); 
	}
	
	
	
}