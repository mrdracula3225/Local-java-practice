package Advanced;

class Cylinder{
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

public class Practice_01 {
    public static void main(String[] args) {
        // problem 1
        Cylinder cs = new Cylinder();
        cs.setRadius(23);
        cs.setHeight(24);
        System.out.println(cs.getHeight());
        System.out.println(cs.getRadius());

    }
}
}
