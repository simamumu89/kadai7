package Patient.information.request;

public class InformationCreateRequest {//Postmanからrequestを受け取るコード
    private String address;
    private String insurancecard;

    public InformationCreateRequest(String address, String insurancecard) {
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
