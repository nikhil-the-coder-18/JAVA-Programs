class Car {
    String color;
    Car(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

public class Constructor_17_Color {
    public static void main(String[] args) {
        Car BMW = new Car("Blue");

        System.out.println(BMW.getColor());
    }
}
