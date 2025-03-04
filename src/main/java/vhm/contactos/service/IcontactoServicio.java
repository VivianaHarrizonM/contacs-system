package vhm.contactos.service;

import vhm.contactos.modelo.Contacto;
import java.util.List;

public interface IcontactoServicio {
  public List<Contacto> listarContactos();

  public Contacto buscarContactoPorId(Integer idContacto);

  public void guardarContacto(Contacto contacto);

  public void eliminarContacto(Contacto contacto);
}

