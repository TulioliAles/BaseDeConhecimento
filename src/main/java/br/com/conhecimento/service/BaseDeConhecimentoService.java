package br.com.conhecimento.service;

import java.util.List;

import br.com.conhecimento.model.Post;

public interface BaseDeConhecimentoService {
	
	List<Post> findAll();
	
	Post findById(Long id);
	
	Post save(Post post);

}
