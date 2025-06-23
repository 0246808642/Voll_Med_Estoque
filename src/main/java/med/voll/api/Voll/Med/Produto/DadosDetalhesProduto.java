package med.voll.api.Voll.Med.Produto;

import med.voll.api.Voll.Med.Enums.Qualidade;
import med.voll.api.Voll.Med.Fornecedor.Fornecedor;

public record DadosDetalhesProduto(Long id, String nome, String codigo,String telefone, String quantidade, Qualidade qualidade, Fornecedor fornecedor) {

    public DadosDetalhesProduto(Produto produto){
        this(produto.getId(),produto.getNome(), produto.getCodigo(),produto.getFornecedor().getTelefone(), produto.getQuantidade(), produto.getQualidade(), produto.getFornecedor());
    }
}
