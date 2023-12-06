public class Purchase implements Comparable<Purchase>{
    private String nameProduct;
    private Euro price;
    private int numberOfPurchasedUnits;
    private double discountPercent;
    private WeekDay weekDay;

    public Purchase() {
    }

    public Purchase(String nameProduct, Euro price, int numberOfPurchasedUnits, double discountPercent, WeekDay weekDay) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.numberOfPurchasedUnits = numberOfPurchasedUnits;
        this.discountPercent = discountPercent;
        this.weekDay = weekDay;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Euro getPrice() {
        return price;
    }

    public void setPrice(Euro price) {
        this.price = price;
    }

    public int getNumberOfPurchasedUnits() {
        return numberOfPurchasedUnits;
    }

    public void setNumberOfPurchasedUnits(int numberOfPurchasedUnits) {
        this.numberOfPurchasedUnits = numberOfPurchasedUnits;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }
    public Euro getCost(){
        return new Euro(price.getCents() * numberOfPurchasedUnits * (100 - getDiscountPercent()) / 100);
    }

    @Override
    public String toString() {
        return "Purchase " +
                 nameProduct +
                ";" + price +
                ";" + numberOfPurchasedUnits +
                ";" + discountPercent +
                ";" + weekDay;
    }

    @Override
    public int compareTo(Purchase o) {
        return this.getNumberOfPurchasedUnits() - o.getNumberOfPurchasedUnits();
    }
}
