package med.voll.api.Voll.Med.Fornecedor;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.Voll.Med.Endereco.EnderecoDTO;

public record FornecedorDTO(

        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{6}", message = "O campo deve conter exatamente 6 dígitos.")
        String crm,
        @Pattern(regexp = "\\(\\d{2}\\)\\s?\\d{4,5}-\\d{4}", message = "Formato de telefone inválido. Use (99) 99999-9999")
        String telefone,
        @NotNull
        @Valid
        EnderecoDTO endereco) {
}
