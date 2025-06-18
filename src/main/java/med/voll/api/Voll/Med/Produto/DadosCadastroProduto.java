package med.voll.api.Voll.Med.Produto;

import med.voll.api.Voll.Med.Enums.Qualidade;
import med.voll.api.Voll.Med.Fornecedor.Fornecedor;

public record DadosCadastroProduto(String nome, String quantidade, String codigo, Qualidade qualidade, Fornecedor fornecedor) {
}
