package ua.ithillet.lesson2.part2;

public class Cat extends Animals {

    public Cat() {
        super();
    }

    @Override
    public void run(int distance, String name) {
        if (distance < 200) {
            super.run(distance, name);
        }
    }
}
