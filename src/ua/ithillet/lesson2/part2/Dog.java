package ua.ithillet.lesson2.part2;

public class Dog extends Animals {

    public Dog() {
        super();
    }

    @Override
    public void run(int distance, String name) {
        if (distance < 500) {
            super.run(distance, name);
        }
    }

    @Override
    public void swim(int distance, String name) {
        if (distance < 10) {
            super.swim(distance, name);
        }
    }
}
