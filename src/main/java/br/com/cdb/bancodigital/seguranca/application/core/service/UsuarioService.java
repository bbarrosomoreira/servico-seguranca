package br.com.cdb.bancodigital.seguranca.application.core.service;

import br.com.cdb.bancodigital.seguranca.application.port.in.UsuarioUseCase;
import br.com.cdb.bancodigital.seguranca.application.port.out.UsuarioRepository;
import br.com.cdb.bancodigital.seguranca.utils.ConstantUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class UsuarioService implements UsuarioUseCase {

    private final UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return usuarioRepository.findByEmail(email);
    }

    // DELETE | Deletar usuário
    public void deleteUsuario(Long usuarioId) {
        // adicionar verificação de vínculo com cliente
        log.info(ConstantUtils.INICIO_DELETE_USUARIO, usuarioId);
        usuarioRepository.delete(usuarioId);
        log.info(ConstantUtils.SUCESSO_DELETE_USUARIO, usuarioId);
    }
}
