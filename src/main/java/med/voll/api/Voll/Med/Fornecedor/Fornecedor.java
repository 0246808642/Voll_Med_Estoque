package med.voll.api.Voll.Med.Fornecedor;

import med.voll.api.Voll.Med.Endereco.Endereco;

public record Fornecedor(String nome, String email, String crm, Endereco endereco) {
}
