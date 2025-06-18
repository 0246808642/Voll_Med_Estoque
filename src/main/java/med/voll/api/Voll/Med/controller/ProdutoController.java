package med.voll.api.Voll.Med.controller;

import med.voll.api.Voll.Med.Produto.DadosCadastroProduto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroProduto dados){
        System.out.println(dados);

    }

}
