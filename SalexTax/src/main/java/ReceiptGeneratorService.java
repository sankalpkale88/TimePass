import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cts1 on 17/3/14.
 */
public class ReceiptGeneratorService {


    public Receipt generateReceipt(List<Item> itemList){

        List<ItemWithTax> itemWithTaxes = new ArrayList<ItemWithTax>();
        BigDecimal totalPrice = BigDecimal.ZERO;
        BigDecimal totalSalesTax = BigDecimal.ZERO;

        for(Item item: itemList){
            BigDecimal saleTax = BigDecimal.ZERO;
            BigDecimal importedTax = BigDecimal.ZERO;
            BigDecimal bothTax = BigDecimal.ZERO;

            if(isOtherItem(item.getItemType())){
                saleTax = saleTax.add(new BigDecimal((item.getItemPrice() * 10)/100));
                saleTax = saleTax.setScale(2,BigDecimal.ROUND_HALF_UP);
            }

            System.out.println("Tax " + saleTax);

            if(isImportedGood(item.getGoodsCategory())){
                importedTax = importedTax.add(new BigDecimal((item.getItemPrice()*5)/100));
                importedTax = importedTax.setScale(2,BigDecimal.ROUND_HALF_UP);
            }

            System.out.println("Imported Tax" + importedTax);

            bothTax = bothTax.add(saleTax).add(importedTax).setScale(2,BigDecimal.ROUND_HALF_UP);

            totalSalesTax = totalSalesTax.add(bothTax).setScale(2,BigDecimal.ROUND_HALF_UP);

            totalPrice = totalPrice.add(new BigDecimal(item.getItemPrice()));
            totalPrice = totalPrice.add(bothTax).setScale(2,BigDecimal.ROUND_HALF_UP);

            ItemWithTax itemWithTax = new ItemWithTax(item,bothTax.doubleValue());
            itemWithTaxes.add(itemWithTax);
        }

        return new Receipt(itemWithTaxes,totalPrice.doubleValue(),totalSalesTax.doubleValue());
    }


    private boolean isOtherItem(ItemType itemType){
        if(itemType.equals(ItemType.OTHERS)){
            return true;
        }else{
            return false;
        }
    }


    private boolean isImportedGood(GoodsCategory goodsCategory){
        if(goodsCategory.equals(GoodsCategory.IMPORTED)){
            return  true;
        }else{
            return false;
        }
    }
}
