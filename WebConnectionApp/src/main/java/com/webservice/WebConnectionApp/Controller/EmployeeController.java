package com.webservice.WebConnectionApp.Controller;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservice.WebConnectionApp.Bean.EmployeeBean;
import com.webservice.WebConnectionApp.Dao.EmployeeDao;

@Path("/employee")
public class EmployeeController {

	@POST
	@Produces(MediaType.APPLICATION_XML)
	public EmployeeBean insertUserValue(@FormParam("name") String name,
			@FormParam("address") String address,
			@FormParam("email") String email) {

		EmployeeDao dao = new EmployeeDao();
		EmployeeBean bean = new EmployeeBean();
		bean.setAddress(address);
		bean.setEmail(email);
		bean.setEmployeeName(name);

		bean = dao.setNewValue(bean);

		return bean;

	}

}
