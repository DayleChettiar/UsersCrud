package com.dayle.users.controller;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.dayle.users.domain.User;

public class UserControllerTest {

	public static final String REST_SERVICE_URI = "http://localhost:8080/users";
	
	/* GET */
	@SuppressWarnings("unchecked")
	private static void getAllUsers(){
		System.out.println("Testing listAllUsers API-----------");
		
		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI+"/users/", List.class);
		
		if(usersMap!=null){
			for(LinkedHashMap<String, Object> map : usersMap){
	            System.out.println("User : id="+map.get("id")+", FirstName="+map.get("firstname")+", LastName="+map.get("lastname")+", Age="+map.get("age"));
	        }
		}else{
			System.out.println("No user exist----------");
		}
	}
	
	/* GET */
	private static void getUser(){
		System.out.println("Testing getUser API----------");
		RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject(REST_SERVICE_URI+"/user/1", User.class);
        System.out.println(user);
	}
	
	/* POST */
    private static void createUser() {
		System.out.println("Testing create User API----------");
    	RestTemplate restTemplate = new RestTemplate();
        User user = new User((long) 1,"Sarah", "Shahi", "sShahi", 51);
        URI uri = restTemplate.postForLocation(REST_SERVICE_URI+"/create", user, User.class);
        System.out.println("Location : "+uri.toASCIIString());
    }

    /* PUT */
    private static void updateUser() {
		System.out.println("Testing update User API----------");
        RestTemplate restTemplate = new RestTemplate();
        User user = new User((long) 1,"Sarah", "Ghabrial", "sGhab", 51);
        restTemplate.put(REST_SERVICE_URI+"/users", user);
        System.out.println(user);
    }

    /* DELETE */
    private static void deleteUser() {
		System.out.println("Testing delete User API----------");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(REST_SERVICE_URI+"/user/3");
    }


    /* DELETE */
    private static void deleteAllUsers() {
		System.out.println("Testing all delete Users API----------");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(REST_SERVICE_URI+"/user/");
    }

    public static void main(String args[]){
    	getAllUsers();
		getUser();
		createUser();
		getAllUsers();
		updateUser();
		getAllUsers();
    }
}