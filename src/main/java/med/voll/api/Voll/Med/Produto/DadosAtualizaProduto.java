package med.voll.api.Voll.Med.Produto;

import jakarta.validation.constraints.NotNull;
import med.voll.api.Voll.Med.Endereco.EnderecoAtualizarDTO;
import med.voll.api.Voll.Med.Enums.Qualidade;

public record DadosAtualizaProduto(
        @NotNull
        Long id,
        String nome,
        Qualidade qualidade,
        String nome_Fornecedor,
        String email,
        String telefone,
        EnderecoAtualizarDTO endereco) {
}
