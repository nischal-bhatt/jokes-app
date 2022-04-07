package jokes.app.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokesService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	

	@Override
	public String getJoke() {
		return this.chuckNorrisQuotes.getRandomQuote();
	}

}
