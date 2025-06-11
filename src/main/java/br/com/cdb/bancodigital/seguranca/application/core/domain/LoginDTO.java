package br.com.cdb.bancodigital.seguranca.application.core.domain;

import br.com.cdb.bancodigital.seguranca.utils.ConstantUtils;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginDTO {
    @NotBlank(message = ConstantUtils.EMAIL_OBRIGATORIO)
    @Email
    private String email;

    @NotBlank(message = ConstantUtils.SENHA_OBRIGATORIA)
    @Size(min = 6)
    private String senha;

}
