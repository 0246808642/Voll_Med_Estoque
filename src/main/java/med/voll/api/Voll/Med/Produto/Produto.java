package med.voll.api.Voll.Med.Produto;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.Voll.Med.Enums.Qualidade;
import med.voll.api.Voll.Med.Fornecedor.Fornecedor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@Table(name = "produtos")
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean ativo;
    private String nome;
    private String quantidade;
    private String codigo;
    @Enumerated(EnumType.STRING)
    private Qualidade qualidade;
    @Embedded
    private Fornecedor fornecedor;

    public Produto(DadosCadastroProduto dados) {
        this.ativo=true;
        this.nome = dados.nome();
        this.quantidade = dados.quantidade()  ;
        this.codigo = dados.codigo();
        this.qualidade = dados.qualidade();
        this.fornecedor= new Fornecedor(dados.fornecedor());

    }

    public void atualizarDados( DadosAtualizaProduto dados) {
        if(dados.nome()!=null) {
            this.nome = dados.nome();
        }
        if(dados.qualidade() != null) {
            this.qualidade = dados.qualidade();
        }
            this.fornecedor.atualizarFornecedor(dados);
    }
    public void excluir() {
        this.ativo =false;
    }

}
