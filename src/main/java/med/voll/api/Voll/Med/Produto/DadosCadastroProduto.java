package med.voll.api.Voll.Med.Produto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.Voll.Med.Enums.Qualidade;
import med.voll.api.Voll.Med.Fornecedor.FornecedorDTO;

public record DadosCadastroProduto(


        @NotBlank
        String nome,
        @NotBlank
        String quantidade,
        @NotBlank
        @Pattern(regexp = "\\d{6}", message = "O código deve conter exatamente 6 dígitos.")
        String codigo,
        @NotNull
        Qualidade qualidade,
        @NotNull
        @Valid
        FornecedorDTO fornecedor) {
}
