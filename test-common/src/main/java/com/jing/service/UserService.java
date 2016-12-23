package com.jing.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jing.entity.User;
import com.jing.response.ResponseResult;

@Path("userInfo")
public interface UserService {
	
	@GET
	@Path("getUser")
	@Produces({MediaType.APPLICATION_JSON} )
	public User getUser();
	
	@POST
	@Path("saveUser")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public ResponseResult saveUser(User user);
}
