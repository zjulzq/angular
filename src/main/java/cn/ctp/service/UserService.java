package cn.ctp.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

import cn.ctp.entity.User;

@Path("/user")
public class UserService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getUser() {
		User user = new User();
		user.setId(1);
		user.setUsername("li_z");
		user.setPassword("3021");
		JSONObject json = new JSONObject(user);
		return json.toString();
	}

}
