package vhm.contactos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vhm.contactos.modelo.Contacto;

public interface ContactoRepositorio extends JpaRepository <Contacto, Integer> {
}
