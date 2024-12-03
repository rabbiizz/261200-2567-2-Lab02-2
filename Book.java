public class Book {
    String title;
    String author;
    Double price;
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String title,String author,Double price){
        this.title = title;
        this.author = author;
        this.price = price;
        // TODO: Complete the rest of this constructor.
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);

        // TODO: Complete the rest of this method.
    }
    public void updatePrice(double newPrice) {
        price = newPrice;
    }
    public void applyDiscount(double discountPercentage) {
        if(discountPercentage < 0.00 || discountPercentage > 100.00){
            System.out.println("Error : Discount percentage is not correct.");
            return;
        }
        double discountAmount = price * (discountPercentage/100);
        double newPrice = price - discountAmount;
        updatePrice(newPrice);
        System.out.printf("A discount of %.2f%% has been applied. The new price is $%.2f.\n", discountPercentage, newPrice);
    }
}
