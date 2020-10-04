package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@Autowired
	JdbcTemplate jdbc;
	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("insert into user(name,email) values('Pavan','pavan123@gmail.com')");
		return "data inserted successfully";
	}

}
