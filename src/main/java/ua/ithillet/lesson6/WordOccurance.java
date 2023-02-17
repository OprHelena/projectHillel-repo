package ua.ithillet.lesson6;

public class WordOccurance {

    private String name;
    public int countOccurrance;

    public WordOccurance(String name, int countOccurrance) {
        this.name = name;
        this.countOccurrance = countOccurrance;
    }

    @Override
    public String toString() {
        return "{" +
                "name=" + name +
                ", countOccurrance=" + countOccurrance +
                '}';
    }
}
