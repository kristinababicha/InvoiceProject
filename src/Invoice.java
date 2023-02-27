public class Invoice {
    //declaring our attributes as private, to make changes outside the class in the future
    private String partNumber;
    private String partDescription;
    private int quantity;
    private int pricePerItem;

    //creating class to print invoice in the future
    public Invoice(String partNumber, String partDescription, int quantity, int pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        //quantity and price  cannot be negative number, will check this with test and will add if-else loop
        if (quantity <= 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
        if (pricePerItem <= 0) {
            this.pricePerItem = 0;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }
// setters and getters for our attributes
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(int pricePerItem) {
        if (pricePerItem <= 0) {
            this.pricePerItem = 0;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public int getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}
