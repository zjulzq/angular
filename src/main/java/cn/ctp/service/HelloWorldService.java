package cn.ctp.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/helloworld")
public class HelloWorldService {

	@GET
	public String hello() {
		return "Hello World!";
	}
}
