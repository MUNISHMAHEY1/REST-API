package com.First.Api.demoRestApi.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepository {

	/*
	 * we are autowiringjdbc template using the properties we have configured in
	 * application.properties spring automatically detects and creates jdbc template
	 * object using the configuration.
	 */
	@Autowired

	JdbcTemplate jdbcTemplate;

	public List<String> getAllUserNames() {
		List<String> usernameList = new ArrayList<String>();
		usernameList.addAll(jdbcTemplate.queryForList("SELECT username FROM database_user.user;", String.class));
		return usernameList;
	}

}
