public class OrderApp {
        static double computeTotalWithVat(double unitPrice, int quantity) {
            return unitPrice * quantity + unitPrice * quantity * 0.2;
}

    public static void main(String[] args) {
        String firstCustomerName= "Alice";
        double firstUnitPrice = 10;
        int firstQuantity = 2;
        double firstTotalWithVat = computeTotalWithVat(firstUnitPrice, firstQuantity);
        String secondCustomerName = "Bob";
        double secondUnitPrice = 15;
        int secondQuantity = 1;
        double secondTotalWithVat = computeTotalWithVat(secondUnitPrice, secondQuantity);
        System.out.println("Client : " + firstCustomerName);
        System.out.println("Prix HT : " + firstUnitPrice);
        System.out.println("Quantité : " + firstQuantity);
        System.out.println("Total TTC : " + firstTotalWithVat);
        System.out.println("------------------------");
        System.out.println("Client : " + secondCustomerName);
        System.out.println("Prix HT : " + secondUnitPrice);
        System.out.println("Quantité : " + secondQuantity);
        System.out.println("Total TTC : " + secondTotalWithVat);
        System.out.println("Prix HT : " + secondUnitPrice);
        System.out.println("Quantité : " + secondQuantity);
        System.out.println("Total TTC : " + secondTotalWithVat);
        System.out.println("------------------------");
        if (firstTotalWithVat + secondTotalWithVat > 30) {
            System.out.println("Réduction !");
 }      else {
            if (firstTotalWithVat + secondTotalWithVat > 20) {
                System.out.println("Petite réduction !");
 } 
        else {
            System.out.println("Pas de réduction.");
        }
    }
}



}


