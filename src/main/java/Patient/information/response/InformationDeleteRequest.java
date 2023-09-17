package Patient.information.response;

public class InformationDeleteRequest {

    private String message;

    public InformationDeleteRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
