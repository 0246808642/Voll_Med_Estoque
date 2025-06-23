package med.voll.api.Voll.Med.domain.fornecedor;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import med.voll.api.Voll.Med.domain.endereco.EnderecoAtualizarDTO;

public record FornecedorAtualizarDTO(
        String nome,
        @Email
        String email,
        @Pattern(regexp = "\\(\\d{2}\\)\\s?\\d{4,5}-\\d{4}", message = "Formato de telefone inválido. Use (99) 99999-9999")
        String telefone,
        @Valid
        EnderecoAtualizarDTO endereco){}


