import java.util.List;

/**
 * Created by cts1 on 17/3/14.
 */
public class Receipt {

    private List<ItemWithTax> itemWithTaxList;
    private double totalPrice;
    private double totalSalesTax;

    public Receipt(List<ItemWithTax> itemWithTaxList, double totalPrice, double totalSalesTax) {
        this.itemWithTaxList = itemWithTaxList;
        this.totalPrice = totalPrice;
        this.totalSalesTax = totalSalesTax;
    }

    public List<ItemWithTax> getItemWithTaxList() {
        return itemWithTaxList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalSalesTax() {
        return totalSalesTax;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "itemWithTaxList=" + itemWithTaxList +
                ", totalPrice=" + totalPrice +
                ", totalSalesTax=" + totalSalesTax +
                '}';
    }
}
