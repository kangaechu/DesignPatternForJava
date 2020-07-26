package strategy.ex10_4;

public class Main {
    public static void main(String[] args) {
        String[] data = {"Dumpty", "Bowman", "Carroll", "Elfand", "Alice"};
        SortAndPrint sap = new SortAndPrint(data, new BubbleSorter());
        sap.execute();
    }
}
