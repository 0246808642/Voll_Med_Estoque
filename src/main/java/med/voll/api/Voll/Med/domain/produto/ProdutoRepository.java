package med.voll.api.Voll.Med.domain.produto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long > {
    Page<Produto> findAllByAtivoTrue(Pageable pag);


}
