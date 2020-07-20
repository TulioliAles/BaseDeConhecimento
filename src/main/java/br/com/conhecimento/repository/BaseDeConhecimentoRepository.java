package br.com.conhecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.conhecimento.model.Post;

@Repository
public interface BaseDeConhecimentoRepository extends JpaRepository<Post, Long>{

}
