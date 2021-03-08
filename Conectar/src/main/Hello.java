package main;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Application;

@Path("/website")
public class Hello {
	
	@GET
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public String login(@QueryParam("username") String username,@QueryParam("password") String password)
	{
	 if(username!=null & password!=null) {
		 //need to check in db whether profile exists or not
		 return "Welcome!!!";
	 }
	 return "Profile does not exist";
	}
	
	@POST
	@Path("/register")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String register(@QueryParam("Name") String name,@QueryParam("mail-Id") String mailId,
			@QueryParam("username") String username,@QueryParam("date-of-birth") String dob,
			@QueryParam("password") String password) {
	
		if(username!=null && password!=null) {
			if(password.length()>=8)
			return "registered";
		}
	return "registration failed";
		
	}

}
