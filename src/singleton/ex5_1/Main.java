package singleton.ex5_1;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(TicketMaker.getInstance().getNextTicketNumber());

        }
    }
}
