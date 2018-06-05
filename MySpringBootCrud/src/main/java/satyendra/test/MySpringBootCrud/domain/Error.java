package satyendra.test.MySpringBootCrud.domain;

import java.io.Serializable;

public class Error implements Serializable {

    private static final long serialVersionUID = -8505421964927705292L;
    
    private String identifier;
    private String message;
    
    public Error() {
        super();
    }

    public Error(final String message) {
        this(null, message);
    }

    public Error(final String identifier, final String message) {
        this.identifier = identifier;
        this.message = message;        
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final void setIdentifier(final String identifier) {
        this.identifier = identifier;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(final String message) {
        this.message = message;
    }
}
