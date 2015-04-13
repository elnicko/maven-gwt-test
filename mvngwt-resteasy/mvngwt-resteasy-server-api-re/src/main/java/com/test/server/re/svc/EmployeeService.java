package com.test.server.re.svc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.test.server.re.model.Employee;

@Path("/sampleservice")
public class EmployeeService {

	private static Map<String, Employee> employees = new HashMap<String, Employee>();

	static {

		Employee employee1 = new Employee();
		employee1.setEmployeeId("1");
		employee1.setEmployeeName("Fabrizio");
		employee1.setJob("Software Engineer");
		employees.put(employee1.getEmployeeId(), employee1);

		Employee employee2 = new Employee();
		employee2.setEmployeeId("2");
		employee2.setEmployeeName("Justin");
		employee2.setJob("Business Analyst");
		employees.put(employee2.getEmployeeId(), employee2);

	}

	@GET
	@Path("/plain/hello")
	@Produces("text/plain")
	public String hello() {
		return "EmployeeService: hello.";
	}

	@GET
	@Path("/plain/echo/{message}")
	@Produces("text/plain")
	public String echo(@PathParam("message") String message) {
		return message;
	}

	@GET
	@Path("/xml/employees")
	@Produces("application/xml")
	public List<Employee> listEmployees() {
		return new ArrayList<Employee>(employees.values());
	}

	@GET
	@Path("/xml/employee/{employeeid}")
	@Produces("application/xml")
	public Employee getEmployee(@PathParam("employeeid") String employeeId) {
		return employees.get(employeeId);
	}

	@GET
	@Path("/json/employees/")
	@Produces("application/json")
	public List<Employee> listEmployeesJSON() {
		return new ArrayList<Employee>(employees.values());
	}

	@GET
	@Path("/json/employee/{employeeid}")
	@Produces("application/json")
	public Employee getEmployeeJSON(@PathParam("employeeid") String employeeId) {
		return employees.get(employeeId);
	}

}
