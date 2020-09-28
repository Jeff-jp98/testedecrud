package br.com.TestedeCrud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import br.com.TestedeCrud.model.Usuario;
import br.com.TestedeCrud.repository.LivroRepository;

@Controller
public class HomeController {

	@Autowired
	private LivroRepository li;
	private List<Usuario> user=new ArrayList<Usuario>();
	
	@RequestMapping("/ativos")
	@ResponseBody
	public String ativos() {
		for(Usuario u:li.findAll()) {
			user.add(u);
		}
		Gson gson = new Gson();
		String json = gson.toJson(user);
		return json;
	}
	@RequestMapping("/todos")
	@ResponseBody
	public String todos() {
		user.addAll(li.findAll());
		Gson gson = new Gson();
		return gson.toJson(user);
	}
}
