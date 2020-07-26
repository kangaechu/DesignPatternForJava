package strategy.ex10_4;

public class SelectionSorter implements Sorter {
    @Override
    public void sort(Comparable[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i].compareTo(data[j]) > 0) {
                    Comparable passingplace = data[i];
                    data[i] = data[j];
                    data[j] = passingplace;
                }
            }

        }
    }
}
