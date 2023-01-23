package ua.ithillet.lesson2.part3;

public class Main {
    public static void main(String[] args) {

        Square sqr = new Square(5);
        Triangle trgl = new Triangle(4, 6);
        Circle crcl = new Circle(5.55);

        double[] figures = new double[3];
        figures[0] = sqr.getArea();
        figures[1] = trgl.getArea();
        figures[2] = crcl.getArea();
        double sumArea = 0;
        for (int i = 0; i < figures.length; i++) {
            sumArea = sumArea + figures[i];
        }
        System.out.println("Area of all shapes = " + sumArea);
    }
}