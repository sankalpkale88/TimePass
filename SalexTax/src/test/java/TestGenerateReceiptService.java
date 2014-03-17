import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cts1 on 17/3/14.
 */
public class TestGenerateReceiptService extends TestCase {

    
    @Test
    public void testGenerateReceipt(){

        List<Item> itemList = new ArrayList<Item>();

        Item item1 = new Item("book",12.49,ItemType.BOOKS,GoodsCategory.NON_IMPORTED);
        Item item2 = new Item("cd",14.99,ItemType.OTHERS,GoodsCategory.NON_IMPORTED);
        Item item3 = new Item("chocolate",0.85,ItemType.FOOD,GoodsCategory.NON_IMPORTED);

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        Receipt receipt = new ReceiptGeneratorService().generateReceipt(itemList);

        System.out.println(receipt);

        Assert.assertEquals(1.50,receipt.getTotalSalesTax());
        Assert.assertEquals(29.83,receipt.getTotalPrice());

    }


    @Test
    public void testGenerateReceiptWithImportedGoods(){

        List<Item> itemList = new ArrayList<Item>();

        Item item1 = new Item("perfume",27.99,ItemType.OTHERS,GoodsCategory.IMPORTED);
        Item item2 = new Item("perfume",18.99,ItemType.OTHERS,GoodsCategory.NON_IMPORTED);
        Item item3 = new Item("headache pill",9.75,ItemType.MEDICAL,GoodsCategory.NON_IMPORTED);
        Item item4 = new Item("chocolates",11.25,ItemType.FOOD,GoodsCategory.IMPORTED);


        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);

        Receipt receipt = new ReceiptGeneratorService().generateReceipt(itemList);

        System.out.println(receipt);

        Assert.assertEquals(6.66,receipt.getTotalSalesTax());
        Assert.assertEquals(74.64,receipt.getTotalPrice());


    }
}
