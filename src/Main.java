public class Main {
    public static void main(String[] args) {

        // Задача 1
        int[] payments1 = {35000, 37000, 40000, 45000, 50000};
        int totalPay1 = 0;
        for (int payment : payments1) {
            totalPay1 += payment;
        }
        System.out.println("Сумма трат за месяц составила " + totalPay1 + " рублей");

        // Задача 2
        int[] payments2 = {154207, 43187, 100000, 524000, 50247};
        int minPay = Integer.MAX_VALUE;
        int maxPay = Integer.MIN_VALUE;
        for (int payment : payments2) {
            if (payment < minPay) {
                minPay = payment;
            }
            if (maxPay < payment) {
                maxPay = payment;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPay + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxPay + " рублей");

        // Задача 3
        double[] payments3 = {37348, 45743, 32681, 51240, 59741};
        double totalPay3 = 0;
        for (double payment : payments3) {
            totalPay3 += payment;
        }
        double averagePay = totalPay3 / payments3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePay + " рублей");

        // Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}