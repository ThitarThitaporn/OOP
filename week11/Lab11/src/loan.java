public class loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public loan() {
         this.annualInterestRate = 2.5;
         this.numberOfYears = 1;
         this.loanAmount = 1000;
    }

    public loan(double annualInterestRate, int numberOfYears,double loanAmount) {
         this.annualInterestRate = annualInterestRate;
         this.numberOfYears = numberOfYears;
         this.loanAmount = loanAmount;
         loanDate = new java.util.Date();
    }

    public double getMonthlyPayment() {
         double monthlyInterestRate = annualInterestRate / 1200;
         double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
         return monthlyPayment;
    }

    public double getTotalPayment() {
         double totalPayment = getMonthlyPayment() * numberOfYears * 12;
         return totalPayment;
    }

    public java.util.Date getLoanDate() {
         return loanDate;
    }
}