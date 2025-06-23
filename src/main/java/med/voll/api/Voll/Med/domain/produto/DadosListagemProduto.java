package med.voll.api.Voll.Med.domain.produto;

import med.voll.api.Voll.Med.enums.Qualidade;

public record DadosListagemProduto(Long id, String nome, String codigo, Qualidade qualidade,String nome_Fornecedor,String email,String telefone,String uf,String cidade) {

    public DadosListagemProduto(Produto produto){
        this(
        // Produto
        produto.getId(),produto.getNome(), produto.getCodigo(), produto.getQualidade(),
        // Fornecedor
        produto.getFornecedor().getNome(),produto.getFornecedor().getEmail(),produto.getFornecedor().getTelefone(),
        // Endereco
        produto.getFornecedor().getEndereco().getUf(), produto.getFornecedor().getEndereco().getCidade()
        );
    }
}
