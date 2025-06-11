package br.com.cdb.bancodigital.seguranca.application.core.service;

import br.com.cdb.bancodigital.seguranca.application.core.domain.Role;
import br.com.cdb.bancodigital.seguranca.application.core.domain.Usuario;
import br.com.cdb.bancodigital.seguranca.application.port.in.SecurityUseCase;
import br.com.cdb.bancodigital.seguranca.utils.ConstantUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SecurityService implements SecurityUseCase {

    public boolean isAdmin(Usuario usuario) {
        log.info(ConstantUtils.INICIO_VERIFICACAO_ADMIN, usuario.getId());
        boolean result = usuario.getRole() == Role.ADMIN;
        log.info(ConstantUtils.RESULTADO_VERIFICACAO_ADMIN, usuario.getId(), result);
        return result;
    }

    public boolean isOwner(Usuario usuario, Cliente cliente) {
        log.info(ConstantUtils.INICIO_VERIFICACAO_OWNER, usuario.getId(), cliente.getId());
        boolean result = cliente.getUsuario().getId().equals(usuario.getId());
        log.info(ConstantUtils.RESULTADO_VERIFICACAO_OWNER, usuario.getId(), cliente.getId(), result);
        return result;
    }

    public void validateAccess(Usuario usuario, Cliente cliente) {
        log.info(ConstantUtils.INICIO_VALIDACAO_ACESSO, usuario.getId(), cliente.getId());
        if (!isAdmin(usuario) && !isOwner(usuario, cliente)) {
            log.warn(ConstantUtils.ACESSO_NEGADO_LOG, usuario.getId(), cliente.getId());
            throw new AccessDeniedException(ConstantUtils.MENSAGEM_ACESSO_NEGADO);
        }
        log.info(ConstantUtils.ACESSO_PERMITIDO_LOG, usuario.getId(), cliente.getId());
    }
}
