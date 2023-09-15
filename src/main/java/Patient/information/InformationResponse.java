package Patient.information;

public class InformationResponse {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String profession;

    public InformationResponse(int id, String name, int age, String gender, String profession) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getProfession() {
        return profession;
    }
}
