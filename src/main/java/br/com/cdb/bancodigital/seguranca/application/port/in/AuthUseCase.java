package br.com.cdb.bancodigital.seguranca.application.port.in;

import br.com.cdb.bancodigital.seguranca.application.core.domain.LoginDTO;
import br.com.cdb.bancodigital.seguranca.application.core.domain.LoginResponse;
import br.com.cdb.bancodigital.seguranca.application.core.domain.UsuarioDTO;

public interface AuthUseCase {

    LoginResponse registrar(UsuarioDTO dto);
    LoginResponse autenticar(LoginDTO dto);
}
