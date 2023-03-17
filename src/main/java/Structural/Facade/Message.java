package Structural.Facade;

public class Message {
    private Row row;

    public Message(Row row) {
        this.row = row;
    }

    public String makeName(){
        return "Name : \"" + row.getName() + "\"";
    }

    public String makeBirthday(){
        return "Birth : \"" + row.getBirth() + "\"";
    }

    public String makeEmail(){
        return "Email : \"" + row.getEmail() + "\"";
    }
}
