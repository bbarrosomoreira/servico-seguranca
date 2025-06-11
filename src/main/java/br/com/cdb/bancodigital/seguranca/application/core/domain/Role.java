package br.com.cdb.bancodigital.seguranca.application.core.domain;

import br.com.cdb.bancodigital.seguranca.utils.ConstantUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Role {

    ADMIN,
    CLIENTE;

    @JsonCreator
    public static Role fromString(String roleStr) {
        if (roleStr == null) {
            throw new IllegalArgumentException(ConstantUtils.ROLE_NULA);
        }
        return Arrays.stream(Role.values())
                .filter(role -> role.name().equalsIgnoreCase(roleStr))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format(ConstantUtils.ROLE_INVALIDA, roleStr, Arrays.toString(Role.values()))));
    }


}
