package Structural.Facade;

public class Row {
    private String name;
    private String birth;
    private String email;

    public Row(String name, String birth, String email) {
        this.name = name;
        this.birth = birth;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getEmail() {
        return email;
    }
}
