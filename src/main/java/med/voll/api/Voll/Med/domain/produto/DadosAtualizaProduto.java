package med.voll.api.Voll.Med.domain.produto;

import jakarta.validation.constraints.NotNull;
import med.voll.api.Voll.Med.domain.endereco.EnderecoAtualizarDTO;
import med.voll.api.Voll.Med.enums.Qualidade;

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
