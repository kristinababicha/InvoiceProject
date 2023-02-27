public class TestInvoice {

    //checking  positive scenario
    public static void main(String[] args) {
        Invoice inv1 = new Invoice("001", "Screwdriver", 5, 25);
        System.out.println("Part Number: " + inv1.getPartNumber());
        System.out.println("Part Description: " + inv1.getPartDescription());
        System.out.println("Quantity: " + inv1.getQuantity());
        System.out.println("Price Per Item: " + inv1.getPricePerItem());
        System.out.println("Invoice Amount: " + inv1.getInvoiceAmount());
        System.out.println("-------------------------------------------------------------------");

        Invoice inv2 = new Invoice ("002", "Hammer", 1, 10);
        System.out.println("Part Number: " + inv2.getPartNumber());
        System.out.println("Part Description: " + inv2.getPartDescription());
        System.out.println("Quantity: " + inv2.getQuantity());
        System.out.println("Price Per Item: " + inv2.getPricePerItem());
        System.out.println("Invoice Amount: " + inv2.getInvoiceAmount());
        System.out.println("-------------------------------------------------------------------");

        //checking negative scenario

        Invoice inv3= new Invoice ("003", "Bolt", -1, -10);

        System.out.println("Part Number: " + inv3.getPartNumber());
        System.out.println("Part Description: " + inv2.getPartDescription());
        if (inv3.getQuantity()== 0 ){System.out.println("Quantity: " + inv3.getQuantity());}
        else System.out.println("ERROR");
        System.out.println("Price Per Item: " + inv3.getPricePerItem());
        System.out.println("Invoice Amount: " + inv3.getInvoiceAmount());
        System.out.println("-------------------------------------------------------------------");

    }
}