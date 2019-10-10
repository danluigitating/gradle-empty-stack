public class App {

    public static void main(String[] args) {
        iPhone iPhone= new iPhone();
        iPhone.call("Calling from iPhone");

        Andriod andriod= new Andriod();
        andriod.call("Calling from Android");

        Mobile m = new Mobile();
        m.call("Calling from Mobile");

        m.setName("Apple");
        m.setBrand("iOS");
        m.setColor("Blue");

        m.setMobile();

        Person p= new Person();
        p.call(andriod, "Person Hello World");
        p.call(iPhone, "Person Hello World");

        p.call(andriod, "hell");
        p.call(iPhone, "hello");

        IPhoneRobot robot= new IPhoneRobot();
        robot.call(iPhone, "HELLO");
        //robot.call(andriod, "HELLO");

    }
}
