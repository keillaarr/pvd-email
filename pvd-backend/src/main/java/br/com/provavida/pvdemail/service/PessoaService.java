package br.com.provavida.pvdemail.service;

import br.com.provavida.pvdemail.model.Pessoa;
import br.com.provavida.pvdemail.repository.PessoaRepository;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class PessoaService {
      private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> listarTodas() {
        return pessoaRepository.findAll();
    }

    public long contarPessoas() {
        return pessoaRepository.count();
    }
}
