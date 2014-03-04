package cn.ctp.web;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import cn.ctp.service.HelloWorldService;
import cn.ctp.service.UserService;

public class TaskApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(HelloWorldService.class);
		classes.add(UserService.class);
		return classes;
	}
}
