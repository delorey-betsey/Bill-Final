package byui.cit260.youGotNoCake.model;

import java.io.Serializable;

public class PartySupplies implements Serializable{
    //class-instance variables
    private String itemWhoopie;
    private String itemSpumoni;
    private String itemGrimReaper;
    private String itemPlasticFork;
    private String[] partySuppliesArray;

    public PartySupplies() {
        itemWhoopie     = "Whoopie Cushion";
        itemSpumoni     = "Spumoni";
        itemGrimReaper  = "Grim Reaper";
        itemPlasticFork = "Plastic Fork";
        partySuppliesArray = new String[]{this.itemGrimReaper,this.itemPlasticFork,this.itemSpumoni,this.itemWhoopie};
    }

    public String[] getPartySuppliesArray() {
        return partySuppliesArray;
    }

    public String getItemWhoopie() {
        return itemWhoopie;
    }

    public void setItemWhoopie(String itemWhoopie) {
        this.itemWhoopie = itemWhoopie;
    }

    public String getItemSpumoni() {
        return itemSpumoni;
    }

    public void setItemSpumoni(String itemSpumoni) {
        this.itemSpumoni = itemSpumoni;
    }

    public String getItemGrimReaper() {
        return itemGrimReaper;
    }

    public void setItemGrimReaper(String itemGrimReaper) {
        this.itemGrimReaper = itemGrimReaper;
    }

    public String getItemPlasticFork() {
        return itemPlasticFork;
    }

    public void setItemPlasticFork(String itemPlasticFork) {
        this.itemPlasticFork = itemPlasticFork;
    }
}
