package med.voll.api.Voll.Med.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.Voll.Med.Produto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;
import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroProduto dados){
       repository.save(new Produto(dados));
    }

    @GetMapping
    public Page<DadosListagemProduto> listar(@PageableDefault(size = 10,sort = {"id"}) Pageable pag){
        return repository.findAllByAtivoTrue(pag).map(DadosListagemProduto::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizaProduto dados){
        var produto = repository.getReferenceById(dados.id());
        produto.atualizarDados(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var produto = repository.getReferenceById(id);
        produto.excluir();

    }
}
