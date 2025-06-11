package br.com.cdb.bancodigital.seguranca.application.port.in;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsuarioUseCase extends UserDetailsService {

    void deleteUsuario(Long usuarioId);

}
