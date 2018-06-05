package satyendra.test.MySpringBootCrud.response;

import satyendra.test.MySpringBootCrud.domain.Status;

public class ObjectResponse<T> {
    
    private Status status;
    private T response;
    
    public ObjectResponse() {
        super();
    }

    public ObjectResponse(final Status input, final T response) {
        super();
        this.status = input;
        this.response = response;
    }
    
    
    public ObjectResponse(final Status input) {
        super();
        this.status = input;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final void setStatus(final Status status) {
        this.status = status;
    }

    public final T getResponse() {
        return this.response;
    }

    public final void setResponse(final T response) {
        this.response = response;
    }
    
    
}
