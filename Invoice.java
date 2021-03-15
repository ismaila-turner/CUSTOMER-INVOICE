/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

/**
 *
 * @author Alieu Secka
 */
public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantityItemPurchased;
    private double pricePerItem;
    
   

    
    public double getInvoiceAmount(){
    
        double quantity=this.quantityItemPurchased;
        double price=this.pricePerItem;
        double amount=price*quantity;
        return amount;
        
        
    }
   
    
   
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * @param partNumber the partNumber to set
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * @return the partDescription
     */
    public String getPartDescription() {
        return partDescription;
    }

    /**
     * @param partDescription the partDescription to set
     */
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    /**
     * @return the quantityItemPurchased
     */
    public int getQuantityItemPurchased() {
        return quantityItemPurchased;
    }

    /**
     * @param quantityItemPurchased the quantityItemPurchased to set
     */
    public void setQuantityItemPurchased(int quantityItemPurchased) {
        
        
        this.quantityItemPurchased = quantityItemPurchased;
    }

    /**
     * @return the pricePerItem
     */
    public double getPricePerItem() {
        
        
        return pricePerItem;
    }

    /**
     * @param pricePerItem the pricePerItem to set
     */
    public void setPricePerItem(double pricePerItem) {
        
        if(pricePerItem<0)
            pricePerItem=0;
        this.pricePerItem = pricePerItem;
    }


   
    
    
    
   
}
