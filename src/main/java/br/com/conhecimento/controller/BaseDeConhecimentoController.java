package br.com.conhecimento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.conhecimento.model.Post;
import br.com.conhecimento.service.BaseDeConhecimentoService;

@Controller
public class BaseDeConhecimentoController {

	@Autowired
	private BaseDeConhecimentoService baseService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPost() {
		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = baseService.findAll();
		mv.addObject("posts", posts);
		return mv;
	}
}
