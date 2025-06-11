package br.com.cdb.bancodigital.seguranca.application.port.in;

import br.com.cdb.bancodigital.seguranca.application.core.domain.Usuario;

public interface SecurityUseCase {
    boolean isAdmin(Usuario usuario);
    boolean isOwner(Usuario usuario, Cliente cliente);
    void validateAccess(Usuario usuario, Cliente cliente);
}
