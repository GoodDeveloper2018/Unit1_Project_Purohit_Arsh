// TipCalculator.java
public class TipCalculator {
    private double totalBill;
    private double tipPercentage;
    private int numberOfPeople;

    // Constructor
    public TipCalculator(double totalBill, double tipPercentage, int numberOfPeople) {
        this.totalBill = totalBill;
        this.tipPercentage = tipPercentage;
        this.numberOfPeople = numberOfPeople;
    }

    // Method to calculate total bill including tip
    public double calculateTotalBill() {
        return totalBill + (totalBill * tipPercentage / 100);
    }

    // Method to calculate per person tip
    public double calculatePerPersonTip() {
        return (totalBill * tipPercentage / 100) / numberOfPeople;
    }

    // Method to calculate per person total
    public double calculatePerPersonTotal() {
        return calculateTotalBill() / numberOfPeople;
    }
}
