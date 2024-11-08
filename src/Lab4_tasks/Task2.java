package Lab4_tasks;

class Table implements Runnable{
    private String[] data;
    private String[] columnNames;

    public Table(String[] columnNames, String[] data) {
        this.columnNames = columnNames;
        this.data = data;
    }

    @Override
    public void run() {
        for (String column: columnNames) {
            System.out.printf("| %-17s  |", column);
        }
        System.out.println("\n______________________");
        for (String item: data) {
            System.out.printf("| %-17s  |\n", item);
        }
        System.out.println();
    }
}

public class Task2 {

    public static void main(String[] args) {

        String[] rollNumbers = {
                "2022F-BSE-115", "2022F-CSE-115", "2022F-BSE-100"
        };

        String[] dateOfBirth = {
                "02 feb 2000", "05 sep 1998", "03 oct 2006"
        };

        String[] rollNumheaders = {
                "Roll Number"
        };

        String[] dobHeaders = {
                "Date Of Birth"
        };

        Thread thread1 = new Thread(new Table(rollNumheaders, rollNumbers));
        Thread thread2 = new Thread(new Table(dobHeaders, dateOfBirth));

        thread1.start();
        thread2.start();
    }

}
