package satyendra.test.MySpringBootCrud;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import satyendra.test.MySpringBootCrud.constant.Standards;
import satyendra.test.MySpringBootCrud.domain.Error;
import satyendra.test.MySpringBootCrud.domain.Status;
import satyendra.test.MySpringBootCrud.response.ObjectResponse;

@ControllerAdvice
public class CustomExceptionHandler {
    private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler({ MethodArgumentNotValidException.class })
    public final ResponseEntity<Object> handleValidation(final MethodArgumentNotValidException e,
            final WebRequest request) {

        final BindingResult bindingResult = e.getBindingResult();
    final ObjectResponse<String> endpointResponse = new ObjectResponse<>();
      final List<Error> errors = new ArrayList<>();
        if (bindingResult != null && bindingResult.hasFieldErrors()) {
            final List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            fieldErrors.forEach(fieldError -> {
                final Error error = new Error(fieldError.getObjectName(),
                        fieldError.getField() + Standards.SPACE + fieldError.getDefaultMessage());
                errors.add(error);
            });

            final Status status = new Status(Standards.FAILURE, errors);
            endpointResponse.setStatus(status);
        }
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON_UTF8).body(endpointResponse);
    }

    /**
     * This method will provide custom implementation for handling
     * MerchantServiceException subclass EntityNotFoundException which could be
     * thrown during execution of the business logic used by Controller.
     */
//    @ExceptionHandler({ EntityNotFoundException.class })
//    public ResponseEntity<Object> handleException(final EntityNotFoundException problem, final WebRequest request) {
//
//        final ObjectResponse<String> endpointResponse = buildStatus(problem.getIdentifier(), problem.getMessage());
//
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).contentType(MediaType.APPLICATION_JSON_UTF8).body(endpointResponse);
//
//    }
//
//    /**
//     * This method will provide custom implementation for handling
//     * TerminalDisabledException which could be thrown during execution of the business
//     * logic used by Controller.
//     */
//    @ExceptionHandler({ TerminalDisabledException.class })
//    public ResponseEntity<Object> handleException(final TerminalDisabledException problem, final WebRequest request) {
//        LOG.error("TerminalDisabledException error has occurred.", problem);
//
//        final ObjectResponse<String> endpointResponse = buildStatus(problem.getIdentifier(), problem.getMessage());
//
//        return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).contentType(MediaType.APPLICATION_JSON_UTF8).body(endpointResponse);
//    }
//
//    /**
//     * This method will provide custom implementation for handling
//     * MerchantServiceException subclass ConflictException which could be thrown
//     * during execution of the business logic used by Controller.
//     */
//    @ExceptionHandler({ ConflictException.class })
//    public ResponseEntity<Object> handleException(final ConflictException problem, final WebRequest request) {
//
//        final ObjectResponse<String> endpointResponse = buildStatus(problem.getIdentifier(), problem.getMessage());
//
//        return ResponseEntity.status(HttpStatus.CONFLICT).contentType(MediaType.APPLICATION_JSON_UTF8)
//                .body(endpointResponse);
//    }
//
//    /**
//     * This method will provide custom implementation for handling
//     * MerchantServiceException subclass BadRequestException which could be
//     * thrown during execution of the business logic used by Controller.
//     */
//    @ExceptionHandler({ BadRequestException.class })
//    public ResponseEntity<Object> handleException(final BadRequestException problem, final WebRequest request) {
//
//        final ObjectResponse<String> endpointResponse = buildStatus(problem.getIdentifier(), problem.getMessage());
//
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON_UTF8)
//                .body(endpointResponse);
//    }
//
//    /**
//     * This method will provide custom implementation for handling
//     * MerchantServiceException subclass MerchantValidationFailed which could be
//     * thrown during execution of the business logic used by Controller.
//     */
//    @ExceptionHandler({ MerchantValidationFailed.class })
//    public ResponseEntity<Object> handleException(final MerchantValidationFailed problem, final WebRequest request) {
//       
//        final List<Error> errors = new ArrayList<>();
//        final Error error = new Error(problem.getIdentifier(), problem.getMessage());
//        errors.add(error);
//
//        final ObjectResponse<String> endpointResponse = new ObjectResponse<>();
//        endpointResponse.setStatus(new Status(Standards.FAILURE, errors));
//
//        return ResponseEntity.status(HttpStatus.FAILED_DEPENDENCY).contentType(MediaType.APPLICATION_JSON_UTF8).body(endpointResponse);
//    }
//
//    @ExceptionHandler({ HystrixRuntimeException.class })
//    public ResponseEntity<ObjectResponse<?>> handleHystrixRuntimeException(final HystrixRuntimeException e,
//            final WebRequest request) {
//        LOG.error("Microserice communication failure", e);
//
//        final HttpStatus status;
//        final String message;
//        if (e.getCause() == null || !(e.getCause() instanceof FeignException)) {
//            status = HttpStatus.INTERNAL_SERVER_ERROR;
//            message = "Please contact T2 Systems";
//        } else {
//            final FeignException fe = (FeignException) e.getCause();
//            status = HttpStatus.valueOf(fe.status());
//            message = fe.getMessage();
//        }
//
//        final ObjectResponse<String> endpointResponse = new ObjectResponse<>(new Status(Standards.FAILURE));
//        endpointResponse.getStatus().getErrors().add(new Error(message));
//
//        return ResponseEntity.status(status).contentType(MediaType.APPLICATION_JSON_UTF8).body(endpointResponse);
//    }
//
//    private ObjectResponse<String> buildStatus(final String errorCode, final String errorMessage) {
//
//        final ObjectResponse<String> endpointResponse = new ObjectResponse<>();
//        final Status status;
//        final List<Error> errors = new ArrayList<>();
//        final Error error = new Error(errorCode, errorMessage);
//        errors.add(error);
//        status = new Status(Standards.FAILURE, errors);
//        endpointResponse.setStatus(status);
//
//        return endpointResponse;
//    }
}
