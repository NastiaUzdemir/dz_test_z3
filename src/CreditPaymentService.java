public class CreditPaymentService {
    public double calculate(double loanAmount, double interestRate, int loanPeriod) {
        // Расчет ежемесячного процентного платежа
        double interPaymentMonth = interestRate / 12 / 100;

        // Расчет числителя формулы для ежемесячного платежа
        double num = Math.pow(1 + interPaymentMonth, loanPeriod) * interPaymentMonth;

        // Расчет знаменателя формулы для ежемесячного платежа
        double denom = Math.pow(1 + interPaymentMonth, loanPeriod) - 1;

        // Расчет ежемесячного платежа
        double monthlyPayment = loanAmount * (num / denom);

        return monthlyPayment;
    }
}