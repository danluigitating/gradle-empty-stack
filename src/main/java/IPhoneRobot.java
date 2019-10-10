public class IPhoneRobot {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void call(iPhone iPhone, String message){
        iPhone.call(message);
    }
}
