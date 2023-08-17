
public class Service {
    public int calc(int income, int expenses, int threshold) {
        int count_of_hol_month = 0;
//        int month = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {
            if (money < threshold) {
                System.out.println("Month " + (i + 1) + ". Money: " + money +
                        ". Work. Income: +" + income + ". Expenses: -" + expenses + ".");
                money += income;
                money -= expenses;
            } else {
                count_of_hol_month++;
                System.out.println("Month " + (i + 1) + ". Money: " + money +
                        ". Rest. Expenses: -" + expenses + ". More expenses: -" + (money - expenses) / 3 + ".");
                money -= expenses;
                money /= 3;
            }

        }

        return count_of_hol_month;
    }

}
