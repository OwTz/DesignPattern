package one.digitalinnovation.gof.handler;

public class BusinessException extends RuntimeException implements ErrorLog{

    private String messageError;

    public BusinessException(String message){
        super();
        messageError = message;
        insertLog(getMessageError());
    }
    @Override
    public void insertLog(String messageError) {
        // ação para iniciar a log
    }

    public String getMessageError() {
        return messageError;
    }
}
