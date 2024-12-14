package edu.utez.supermercado.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import edu.utez.supermercado.Entities.Cliente;

public class CajaRepository extends JpaRepositoryExtension<Cliente, Long> {
    
}
