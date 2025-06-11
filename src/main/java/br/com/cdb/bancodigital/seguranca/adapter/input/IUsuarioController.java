package br.com.cdb.bancodigital.seguranca.adapter.input;

import br.com.cdb.bancodigital.seguranca.application.core.domain.Usuario;
import br.com.cdb.bancodigital.seguranca.application.core.domain.UsuarioResponse;
import br.com.cdb.bancodigital.seguranca.utils.ConstantUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface IUsuarioController {

    @GetMapping(ConstantUtils.GET_USUARIO)
    ResponseEntity<UsuarioResponse> getUsuarioLogado(@AuthenticationPrincipal Usuario usuario);

    @DeleteMapping(ConstantUtils.DELETE_USUARIO)
    ResponseEntity<Void> deleteUsuario(@PathVariable Long id);
}
