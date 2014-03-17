/**
 * Created by cts1 on 17/3/14.
 */
public class ItemWithTax extends Item {

    private double salesTax;

    public ItemWithTax(Item item, double salesTax) {
        super(item.getItemName(), item.getItemPrice(),item.getItemType(),item.getGoodsCategory());
        this.salesTax = salesTax;
    }

    @Override
    public String toString() {
        return "{itemName=" + getItemName() +
                "itemPrice=" + getItemPrice() +
                "itemType=" + getItemType() +
                "GoodCategory=" + getGoodsCategory() +
                "salesTax=" + salesTax +
                "Price="+ (getItemPrice() + salesTax)+
                '}';
    }
}
