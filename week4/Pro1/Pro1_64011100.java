package Pro1;
public class Pro1_64011100 {

    public static void main(String[] args) {

        Stock stock1 = new Stock("ORCL", "Oracle Coperation");
        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Symbol: " + stock1.getSymbol() + "\nName: " + stock1.getName());
        System.out.println("Previous Closing Price: " + stock1.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock1.getCurrentPrice());
        System.out.println("Price Change: " + stock1.getChangePercent());

    }
}