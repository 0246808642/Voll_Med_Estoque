package med.voll.api.Voll.Med.domain.fornecedor;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.Voll.Med.domain.endereco.Endereco;
import med.voll.api.Voll.Med.domain.produto.DadosAtualizaProduto;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Fornecedor {

    @Column(name = "nome_Fornecedor")
    private String nome;
    private String email;
    private String crm;
    private String telefone;
    @Embedded
    private Endereco endereco;

    public Fornecedor(FornecedorDTO fornecedorDTO) {
        this.nome = fornecedorDTO.nome();
        this.email= fornecedorDTO.email();
        this.crm = fornecedorDTO.crm();
        this.telefone = fornecedorDTO.telefone();
        this.endereco= new Endereco(fornecedorDTO.endereco());

    }

    public void atualizarFornecedor(DadosAtualizaProduto dados) {
        if(dados.nome_Fornecedor() != null) {
            this.nome = dados.nome_Fornecedor();
        }
        if(dados.email()!= null) {
            this.email = dados.email();
        }
        if(dados.telefone()!= null) {
            this.telefone = dados.telefone();
        }
        this.endereco.atualizar(dados);
    }
}
