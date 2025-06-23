package med.voll.api.Voll.Med.domain.endereco;

import jakarta.validation.constraints.Pattern;

public record EnderecoAtualizarDTO(
        String uf,
        String cidade,
        @Pattern(regexp = "\\d{5}-\\d{3}", message = "Formato de CEP inválido. Use 99999-999")
        String cep,
        String bairro,
        String numero,
        String complemento){}

