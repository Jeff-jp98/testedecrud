package br.com.TestedeCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import br.com.TestedeCrud.model.Locacao;
import br.com.TestedeCrud.model.Usuario;
import br.com.TestedeCrud.repository.LivroRepository;
import br.com.TestedeCrud.repository.LocacaoRepository;

@Controller
public class CadastroController {
	@Autowired
	private LivroRepository li;
	@Autowired
	private LocacaoRepository lo;
	private Usuario user;
	
	@RequestMapping("/cadastro")
	public HttpStatus cadastrar(@RequestBody String json) {
		user=new Gson().fromJson(json, Usuario.class);
		Locacao loc= new Locacao();
		loc.setDescricao(user.getLocacao().getDescricao());
		user.setLocacao(loc);
		try {
			lo.save(loc);
			li.save(user);
			return HttpStatus.CREATED;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return HttpStatus.BAD_REQUEST;
	}

}
