package tasksatu;

public class TestCylinder {
    public static void main(String[] args) {
        // Mendeklarasikan dan mengalokasikan sebuah instance baru dari sebuah silinder
        // dengan warna, radius, dan tinggi default
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());

        // Mendeklarasikan dan mengalokasikan sebuah instance baru dari sebuah silinder
        // dengan menentukan tinggi, dengan warna dan radius default
        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());

        // Mendeklarasikan dan mengalokasikan sebuah instance baru dari sebuah silinder
        // dengan menentukan radius dan tinggi, dengan warna default
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
    }
}
