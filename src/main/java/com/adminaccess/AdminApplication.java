package com.adminaccess;

import com.adminaccess.repository.ManagerRepository;
import com.adminaccess.repository.RoleRepository;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
@RestController
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

	@Autowired
      ManagerRepository managerRepository;

    @Autowired
      RoleRepository roleRepository;

	@RequestMapping("/login")
	public Map<String, Object> meizilogin(HttpServletRequest request){
		Map<String, Object> modle = new HashMap<>();
		String name = request.getParameter("name");
		String password = request.getParameter("password");


		System.out.println(name+"#");
		System.out.println(password+"#");
		modle.put("status", true);
		return modle;
	}
}
