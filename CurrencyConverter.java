import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        displayCurrencies();
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose the base currency (1/2/3): ");
        int baseCurrency = sc.nextInt();
        System.out.print("Choose the target currency (1/2/3): ");
        int targetCurrency = sc.nextInt();
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();

        
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        
        double convertedAmount = amount * exchangeRate;

        
        displayResult(convertedAmount, targetCurrency);
    }

    
    private static void displayCurrencies() {
        System.out.println("1. Rupee");
        System.out.println("2. Dollar");
        System.out.println("3. Euro");
    }

    
    private static double getExchangeRate(int baseCurrency, int targetCurrency) {
        
        double[][] exchangeRates = {
                {1.0, 0.014, 0.012}, 
                {71.4, 1.0, 0.85},   
                {88.9, 1.18, 1.0}    
        };
        return exchangeRates[baseCurrency - 1][targetCurrency - 1];
    }

    
    private static void displayResult(double convertedAmount, int targetCurrency) {
        String currencySymbol;
        switch (targetCurrency) {
            case 1:
                currencySymbol = "₹"; 
                break;
            case 2:
                currencySymbol = "$"; 
                break;
            case 3:
                currencySymbol = "€"; 
                break;
            default:
                currencySymbol = ""; 
        }
        System.out.println("Converted Amount: " + currencySymbol + convertedAmount);
    }
}