package br.com.bytebank.repository;

import br.com.bytebank.modelo.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

    @Query("")
        // TODO: DESENVOLVER CONSULTA
    Conta getContaByDocumento(String documento);

}
