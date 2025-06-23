package med.voll.api.Voll.Med.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.Voll.Med.Produto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.beans.Transient;
import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroProduto dados, UriComponentsBuilder uriBuilder){
        var produto = new Produto(dados);
       repository.save(produto);

       var uri = uriBuilder.path("/produto/{id}").buildAndExpand(produto.getId()).toUri();
       return ResponseEntity.created(uri).body(new DadosDetalhesProduto(produto));
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemProduto>> listar(@PageableDefault(size = 10,sort = {"id"}) Pageable pag){
        var page = repository.findAllByAtivoTrue(pag).map(DadosListagemProduto::new);
        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizaProduto dados){
        var produto = repository.getReferenceById(dados.id());
        produto.atualizarDados(dados);

        return ResponseEntity.ok(new DadosDetalhesProduto(produto));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id){
        var produto = repository.getReferenceById(id);
        produto.excluir();
        return  ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id){
        var produto = repository.getReferenceById(id);
        return  ResponseEntity.ok(new DadosDetalhesProduto(produto));
    }
}
