package paulo.dev.springboot_essentials.springboot_essentials.error;

public class CustomErrorType {
    private String errorMessage;

    public CustomErrorType(String errorMensage) {
        this.errorMessage = errorMensage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
