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

        m.getMobile();
    }
}
