package byui.cit260.youGotNoCake.model;

import java.io.Serializable;

public class CakeIngredients implements Serializable{
    //class-instance variables
    private String itemFlour;
    private String itemSugar;
    private String itemButta;
    private String itemBananas;
    private String[] cakeIngredientsArray;

    public CakeIngredients() {
        itemFlour       = "Flour";
        itemSugar       = "Sugar";
        itemButta       = "Butta";
        itemBananas     = "Bananas";
        cakeIngredientsArray = new String[]{this.itemBananas, this.itemButta, this.itemFlour, this.itemSugar};
    }

    public String[] getCakeIngredientsArray() {
        return cakeIngredientsArray;
    }
 
    public String getItemFlour() {
        return itemFlour;
    }

    public void setItemFlour(String itemFlour) {
        this.itemFlour = itemFlour;
    }
    
    public String getItemSugar() {
        return itemSugar;
    }
    
    public void setItemSugar(String itemSugar) {
    this.itemSugar = itemSugar;
    }

    public String getItemButta() {
        return itemButta;
    }
    
    public void setItemButta(String itemButta) {
    this.itemButta = itemButta;
    }

    public String getItemBananas() {
        return itemBananas;
    }
    
    public void setItemBananas(String itemBananas) {
    this.itemBananas = itemBananas;
    }
}
