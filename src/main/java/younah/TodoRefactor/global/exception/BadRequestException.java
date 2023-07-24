package younah.TodoRefactor.global.exception;


import younah.TodoRefactor.domain.common.Status;

public class BadRequestException extends ApplicationException {
    public BadRequestException(Status status) {
        super(status);
    }

    public BadRequestException(Status status, String message) {
        super(status, message);
    }

    public BadRequestException(Status status, Throwable cause) {
        super(status, cause);
    }

    public BadRequestException(Status status, String message, Throwable cause) {
        super(status, message, cause);
    }
}
