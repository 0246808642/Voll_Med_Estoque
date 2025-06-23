package med.voll.api.Voll.Med.domain.produto;

import med.voll.api.Voll.Med.enums.Qualidade;
import med.voll.api.Voll.Med.domain.fornecedor.Fornecedor;

public record DadosDetalhesProduto(Long id, String nome, String codigo,String telefone, String quantidade, Qualidade qualidade, Fornecedor fornecedor) {

    public DadosDetalhesProduto(Produto produto){
        this(produto.getId(),produto.getNome(), produto.getCodigo(),produto.getFornecedor().getTelefone(), produto.getQuantidade(), produto.getQualidade(), produto.getFornecedor());
    }
}
