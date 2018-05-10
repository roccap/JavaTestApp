package com.db.customer;





/**
 * @author roccap
 */
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/getCustomerList")
public class CustomerInfo {
	@GET
	@Produces("application/xml")
	public String getCustomerList() {
 
		
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + "Bob, ted, ian";
		return "<ctofservice>" + "<celsius>" + "sum num" + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
}