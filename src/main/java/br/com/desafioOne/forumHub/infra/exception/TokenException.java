package br.com.desafioOne.forumHub.infra.exception;

public class TokenException extends RuntimeException {
    public TokenException(String mensagem) {
        super(mensagem);
    }
}
