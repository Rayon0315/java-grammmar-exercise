import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

class Account {
    String date;
    int in;
    int out;
    static int deposit;

    public Account(String date, int in, int out) {
        this.date = date;
        this.in = in;
        this.out = out;
    }

    @Override
    public String toString() {
        deposit += in - out;
        return date + "\t" + in + "\t" + out + "\t" + deposit;
    }
}

public class exercise_2 {
    public static void main(String[] args) {
        System.out.println("存、取款时间\t存入\t支出\t余额");
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("2022-05-06", 2000, 0));
        accounts.add(new Account("2022-05-18", 0, 1000));
        accounts.add(new Account("2022-06-08", 5000, 0));

        Iterator<Account> iter = accounts.iterator();
        while (iter.hasNext()) {
            Account message = iter.next();
            System.out.println(message + "\t");
        }
    }
}