/**
 * Created by cts1 on 17/3/14.
 */
public class Item {

    private String itemName;
    private double itemPrice;
    private ItemType itemType;
    private GoodsCategory goodsCategory;

    public Item(String itemName, double itemPrice, ItemType itemType,GoodsCategory goodsCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemType = itemType;
        this.goodsCategory = goodsCategory;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public GoodsCategory getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(GoodsCategory goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemType=" + itemType +
                ", goodsCategory=" + goodsCategory +
                '}';
    }
}
