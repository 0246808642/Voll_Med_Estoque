package med.voll.api.Voll.Med.Endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EnderecoDTO(

        @NotBlank
        String uf,
        @NotBlank
        String cidade,
        @NotBlank
        @Pattern(regexp = "\\d{5}-\\d{3}", message = "Formato de CEP inválido. Use 99999-999")
        String cep,
        @NotBlank
        String bairro,
        String numero,
        String complemento) {
}
