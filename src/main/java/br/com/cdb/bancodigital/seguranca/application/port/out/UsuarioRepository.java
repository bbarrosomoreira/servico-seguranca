package br.com.cdb.bancodigital.seguranca.application.port.out;

import br.com.cdb.bancodigital.seguranca.application.core.domain.Role;
import br.com.cdb.bancodigital.seguranca.application.core.domain.Usuario;

import java.util.Optional;

public interface UsuarioRepository {

    Usuario add(String email, String senha, Role role);
    boolean existWithEmail(String email);
    Usuario findByEmail(String email);
    Optional<Usuario> findById(Long id);
    void update(Long id, String email, String senha, Role role);
    void delete(Long id);
}
