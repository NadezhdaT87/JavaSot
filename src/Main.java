//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int refill = 1100;

        int percent;
        if (refill > 1000) {
            percent = refill/100;
        } else {
            percent = 0;
        }

        int amount = balance + refill + percent;

        System.out.println("Итоговый счет" + amount);

    }
}