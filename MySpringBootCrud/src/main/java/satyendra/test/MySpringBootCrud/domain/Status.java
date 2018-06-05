package satyendra.test.MySpringBootCrud.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Status implements Serializable {
    
    private static final long serialVersionUID = 289814840945439520L;
    
    private String responseStatus;
    private List<Error> errors;
    
    public Status() {
        super();
    }
    
    public Status(final String status) {
        this(status, new ArrayList<>());
    }

    public Status(final String status, final List<Error> errors) {
        this.responseStatus = status;
        this.errors = errors;
    }

    public final String getResponseStatus() {
        return this.responseStatus;
    }

    public final void setResponseStatus(final String status) {
        this.responseStatus = status;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public final void setErrors(final List<Error> errors) {
        this.errors = errors;
    }
    
}
