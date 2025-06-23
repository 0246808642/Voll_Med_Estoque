package med.voll.api.Voll.Med.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.Voll.Med.domain.produto.DadosAtualizaProduto;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Endereco {
    private String uf;
    private String cidade;
    private String cep;
    private String bairro;
    private String numero;
    private String complemento;

    public Endereco(EnderecoDTO enderecoDTO) {
        this.uf = enderecoDTO.uf();
        this.cidade = enderecoDTO.cidade();
        this.cep= enderecoDTO.cep();
        this.bairro = enderecoDTO.bairro();
        this.numero = enderecoDTO.numero();
        this.complemento = enderecoDTO.complemento();
    }

    public void atualizar(DadosAtualizaProduto dados) {

        if(dados.endereco()==null){
            return;
        }
        if(dados.endereco().uf() !=null) {
            this.uf = dados.endereco().uf();
        }
        if(dados.endereco().cidade() != null) {
            this.cidade = dados.endereco().cidade();
        }
        if(dados.endereco().cep() != null) {
            this.cep = dados.endereco().cep();
        }
        if(dados.endereco().bairro() != null) {
            this.bairro = dados.endereco().bairro();
        }
        if(dados.endereco().numero() != null) {
            this.numero = dados.endereco().numero();
        }
        if(dados.endereco().complemento() != null) {
            this.complemento = dados.endereco().complemento();
        }

    }
}
