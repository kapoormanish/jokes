package springframework.jokes.services.impl

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Service
import springframework.jokes.services.JokeService

@Service
class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes
    }

    @Override
    String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
