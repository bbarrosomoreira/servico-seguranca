package br.com.cdb.bancodigital.seguranca.config.exception;

import org.springframework.http.HttpStatus;

public class CommunicationException extends ApiException {

    public CommunicationException(String message) {
        super(message, HttpStatus.SERVICE_UNAVAILABLE);
    }
}
