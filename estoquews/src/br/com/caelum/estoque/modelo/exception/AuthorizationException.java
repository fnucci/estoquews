package br.com.caelum.estoque.modelo.exception;

import java.util.Date;

import javax.xml.ws.WebFault;

@WebFault(name="AuthorizationFault", messageName="AuthorizationFault")
public class AuthorizationException extends Exception {

    private static final long serialVersionUID = 1L;

    public AuthorizationException(String msg) {
        super(msg);
    }
    
    public InfoFault getFaultInfo() {
        return new InfoFault("Token invalido" , new Date());
    }
}


