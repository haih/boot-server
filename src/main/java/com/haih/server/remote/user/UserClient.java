package com.haih.server.remote.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haih.server.remote.user.dto.UserDTO;


@FeignClient(name = "user-service", url = "${remote.github.endpoint}")
public interface UserClient {

	@RequestMapping(value = "/users/haih", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	UserDTO getUser();
}
