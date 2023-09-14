package Patient.information;

public class infromationResponse {
    private int id;
    private String name;
    private int age;
    private String Country;
    private String profession;

    public infromationResponse(int id, String name, int age, String Country, String profession) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.Country = Country;
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

    public String getSex() {
        return Country;
    }

    public String getProfession() {
        return profession;
    }
}
