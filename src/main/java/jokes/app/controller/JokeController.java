package jokes.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jokes.app.services.JokesService;

@Controller
public class JokeController {

	private final JokesService jokesService;

	@Autowired
	public JokeController(JokesService jokesService) {
		
		this.jokesService = jokesService;
	}
	
	@RequestMapping({"/baba","bubu"})
	public String showJoke(Model model)
	{
		model.addAttribute("joke",this.jokesService.getJoke());
		
		return "index";
	}
	
	
}
