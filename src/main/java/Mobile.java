public class Mobile {
    private String name;
    private String color;
    private String brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void call(String message){
        System.out.println("Message : " + message);
    }

    public void setMobile(){
        System.out.println("name: "+ getName() + ", color: "+ getColor() + ", brand: " +getBrand());
    }
}