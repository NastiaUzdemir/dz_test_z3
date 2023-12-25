public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        // 1
        double loanAmount1 = 1000000;
        double interestRate1 = 9.99;
        int loanPeriod1 = 12;
        double monthlyPayment1 = creditPaymentService.calculate(loanAmount1, interestRate1, loanPeriod1);

        System.out.println("Ежемесячный платеж (1): " + Math.floor(monthlyPayment1));
        System.out.println("Сумма кредита: " + loanAmount1);
        System.out.println("Процентная ставка: " + interestRate1);
        System.out.println("Срок: " + loanPeriod1);
        System.out.println();

        // 2
        double loanAmount2 = 1000000;
        double interestRate2 = 9.99;
        int loanPeriod2 = 24;
        double monthlyPayment2 = creditPaymentService.calculate(loanAmount2, interestRate2, loanPeriod2);

        System.out.println("Ежемесячный платеж (2): " + Math.floor(monthlyPayment2));
        System.out.println("Сумма кредита: " + loanAmount2);
        System.out.println("Процентная ставка: " + interestRate2);
        System.out.println("Срок: " + loanPeriod2);
        System.out.println();

        // 3
        double loanAmount3 = 1000000;
        double interestRate3 = 9.99;
        int loanPeriod3 = 36;
        double monthlyPayment3 = creditPaymentService.calculate(loanAmount3, interestRate3, loanPeriod3);

        System.out.println("Ежемесячный платеж (3): " + Math.floor(monthlyPayment3));
        System.out.println("Сумма кредита: " + loanAmount3);
        System.out.println("Процентная ставка: " + interestRate3);
        System.out.println("Срок: " + loanPeriod3);
    }
}