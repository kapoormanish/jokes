package springframework.jokes.services.impl

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import springframework.jokes.services.JokeService

@Component
class JokeServiceImpl implements JokeService{
    @Override
    String getRandomJoke() {
        return (new ChuckNorrisQuotes()).getRandomQuote();
    }
}
