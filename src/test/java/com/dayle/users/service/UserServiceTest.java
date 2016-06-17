package com.dayle.users.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.dayle.users.*;
import com.dayle.users.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:*-context.xml"})
@TestExecutionListeners(listeners={DependencyInjectionTestExecutionListener.class})
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	@Ignore
	public void testGetUsers() {
		System.out.println("testGetAllUsers");
		Object list = userService.findAll();
		assertNotNull(list);
	}

	@Test
	public void testGetUsersById() {
		System.out.println("testGetUsersById");
		Long employeeId = (long) 2;
 
		User user = userService.findById(employeeId);
		assertNotNull(user.getUserName());
		assertNotNull(user.getId());
	}
}

