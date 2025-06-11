package br.com.cdb.bancodigital.seguranca.adapter.input;

import br.com.cdb.bancodigital.seguranca.application.core.domain.LoginDTO;
import br.com.cdb.bancodigital.seguranca.application.core.domain.LoginResponse;
import br.com.cdb.bancodigital.seguranca.application.core.domain.UsuarioDTO;
import br.com.cdb.bancodigital.seguranca.utils.ConstantUtils;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IAuthController {

    @PostMapping(ConstantUtils.SIGNIN)
    ResponseEntity<LoginResponse> signIn(@Valid @RequestBody UsuarioDTO dto);

    @PostMapping(ConstantUtils.LOGIN)
    ResponseEntity<LoginResponse> logIn(@Valid @RequestBody LoginDTO dto);

}
