package br.com.conhecimento.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.conhecimento.model.Post;
import br.com.conhecimento.repository.BaseDeConhecimentoRepository;
import br.com.conhecimento.service.BaseDeConhecimentoService;

@Service
public class BaseDeConhecimentoServiceImpl implements BaseDeConhecimentoService {

	@Autowired
	BaseDeConhecimentoRepository baseDeConhecimentorepository;
	
	@Override
	public List<Post> findAll() {
		return baseDeConhecimentorepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return baseDeConhecimentorepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return baseDeConhecimentorepository.save(post);
	}

}
