import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int account = 200;
        int transfer = 1500;
        int bonus = 0;
        if (transfer > 1000) {
            bonus = transfer / 100;

        }
        account = account + transfer + bonus;
        System.out.println("На счету: " + account);
        System.out.println("Бонусных рублей: " + bonus);
        ;
    }
}