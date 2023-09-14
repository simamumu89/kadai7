package Patient.information;

public class Response {

    private int id;
    private String name;

    private int age;

    private String sex;

    private String profession;

    public Response(int id, String name, int age, String sex, String profession) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
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
        return sex;
    }

    public String getProfession() {
        return profession;
    }
}
