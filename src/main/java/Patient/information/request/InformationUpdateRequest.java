package Patient.information.request;

public class InformationUpdateRequest {

    private String address;
    private String insurancecard;

    public InformationUpdateRequest(String address, String insurancecard) {
        this.address = address;
        this.insurancecard = insurancecard;
    }

    public String getAddress() {
        return address;
    }

    public String getInsurancecard() {
        return insurancecard;
    }
}
