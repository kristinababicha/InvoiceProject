public class TestInvoice {
    public static void main(String[] args) {
        Invoice inv = new Invoice("123", "Screwdriver", 5, 10);
        System.out.println("Part Number: " + inv.getPartNumber());
        System.out.println("Part Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price Per Item: " + inv.getPricePerItem());
        System.out.println("Invoice Amount: " + inv.getInvoiceAmount());
    }


}
