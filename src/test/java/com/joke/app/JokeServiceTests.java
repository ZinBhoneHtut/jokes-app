package com.joke.app;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.util.StringUtils;

import com.joke.app.service.JokeService;

@SpringBootTest
class JokeServiceTests {
	
	@Autowired
	private JokeService jokeService;
	
	@Test
	void test() {
		String jokes = jokeService.getRadomJokes();
		boolean isJokesStringNull;
		isJokesStringNull = StringUtils.isEmpty(jokes);
		System.out.println("Jokes => " + jokes);
		assertEquals(isJokesStringNull, false);
	}

}
