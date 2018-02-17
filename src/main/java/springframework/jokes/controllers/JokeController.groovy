package springframework.jokes.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import springframework.jokes.services.JokeService

@Controller
class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService
    }

    @RequestMapping("/")
    private String getJokes(Model model){
        String joke = jokeService.getRandomJoke();
        model.addAttribute("joke", joke);
        "chucknorris"
    }
}
