package med.voll.api.Voll.Med.Produto;

import med.voll.api.Voll.Med.Fornecedor.Fornecedor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto,Long > {
    Page<Produto> findAllByAtivoTrue(Pageable pag);


}
