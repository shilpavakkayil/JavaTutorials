package test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
// creating a rest api
@Path("/hello")
public class Hello{
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello_Xml() {
		String resource = null;
		resource = "<?xml version='1.0'>"+
		"<hello>This is hello from xml</hello>";
		return resource;
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHello_HTML(@QueryParam("name") String name, @QueryParam("bill_amount")Float billAmount) {
		String resource = null, message = null;
		if(billAmount >1000)
		{
			message = "The bill for the month is too much";
		}
		else
		{
			message = "The bill is ok";
		}
		resource = "<h1>This is hello from html and "+message+"</h1>";
		return resource;
	}
	
}
