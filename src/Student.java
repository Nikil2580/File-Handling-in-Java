public class Student {
    private String name;
    private int roll;
    private int age;
    private String gender;
    private final String password = "@12345";
    private String phone = "9876543210";

    public String getPhone(String pass) {
        if(password.equals(pass)) return phone;
        else return "Incorrect Password";
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
