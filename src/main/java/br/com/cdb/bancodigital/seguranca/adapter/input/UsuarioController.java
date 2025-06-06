package br.com.cdb.bancodigital.seguranca.adapter.input;

import br.com.cdb.bancodigital.seguranca.application.core.domain.Usuario;
import br.com.cdb.bancodigital.seguranca.application.port.in.UsuarioUseCase;
import br.com.cdb.bancodigital.seguranca.utils.ConstantUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ConstantUtils.USUARIO)
@AllArgsConstructor
@Slf4j
public class UsuarioController implements IUsuarioController {

    private final UsuarioUseCase usuarioUseCase;

    @GetMapping(ConstantUtils.GET_USUARIO)
    public ResponseEntity<UsuarioResponse> getUsuarioLogado(@AuthenticationPrincipal Usuario usuario) {
        long startTime = System.currentTimeMillis();
        log.info(ConstantUtils.INICIO_BUSCA_USUARIO);

        UsuarioResponse dto = new UsuarioResponse(usuario);
        log.info(ConstantUtils.SUCESSO_BUSCA_USUARIO);

        long endTime = System.currentTimeMillis();
        log.info(ConstantUtils.FIM_CHAMADA, endTime - startTime);
        return ResponseEntity.ok(dto);
    }

    @PreAuthorize(ConstantUtils.ROLE_ADMIN)
    @DeleteMapping(ConstantUtils.DELETE_USUARIO)
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        long startTime = System.currentTimeMillis();
        log.info(ConstantUtils.INICIO_DELETE_USUARIO, id);

        usuarioUseCase.deleteUsuario(id);
        log.info(ConstantUtils.SUCESSO_DELETE_USUARIO, id);

        long endTime = System.currentTimeMillis();
        log.info(ConstantUtils.FIM_CHAMADA, endTime - startTime);
        return ResponseEntity.noContent().build();
    }

}
