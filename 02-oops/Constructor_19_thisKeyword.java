// WAP to show the use of this Keyword in java.

class Box {
    int length;
    int height;
    int width;

    Box(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public float getVolume() {
        return height * width * length;
    }
}

public class Constructor_19_thisKeyword {
    public static void main(String[] args) {
        Box b1 = new Box(10, 5, 2);

        System.out.println(b1.getVolume());
    }
}
