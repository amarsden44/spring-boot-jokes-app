package guru.springframework.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesService implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuotesService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
