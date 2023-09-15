package Patient.information.response;

public class InformationDeleteRequest {

    private String address;
    private String insurancecard;

    public InformationDeleteRequest(String address, String insurancecard) {
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
