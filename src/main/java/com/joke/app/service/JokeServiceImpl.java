package com.joke.app.service;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	
	private ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl() {
		if(chuckNorrisQuotes == null)
			this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getRadomJokes() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
