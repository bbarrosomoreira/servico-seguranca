package br.com.cdb.bancodigital.seguranca.application.core.domain;

public record UsuarioResponse(String email, Role role) {

    public UsuarioResponse(Usuario usuario) {
        this(usuario.getEmail(), usuario.getRole());
    }
}
