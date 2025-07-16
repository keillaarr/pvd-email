package br.com.provavida.pvdemail.controller;

import br.com.provavida.pvdemail.model.Pessoa;
import br.com.provavida.pvdemail.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public List<Pessoa> listar() {
        return pessoaService.listarTodas();
    }

    @GetMapping("/total")
    public long total() {
        return pessoaService.contarPessoas();
    }
}
