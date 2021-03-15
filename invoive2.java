/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

import java.util.Scanner;

/**
 *
 * @author Alieu Secka
 */
public class invoive2 {

    
    public static void main (String[]args) {
        
     Invoice invoiceWork = new Invoice();
      
     
     Scanner in = new Scanner(System.in);
     System.out.println("enter your id");
     
     invoiceWork.setPartNumber(in.nextLine());
     invoiceWork.setPartDescription("A First class computer");
     invoiceWork.setPricePerItem(-500.79);
     invoiceWork.setQuantityItemPurchased(9);
  
double totalAmount=invoiceWork.getInvoiceAmount();
        
       
       
        
        
        
        
    System.out.println("PART NUMBER : " +invoiceWork.getPartNumber());
    System.out.println("PART DESCRIPTION :" + invoiceWork.getPartDescription());
    
    System.out.println("PRICE PER ITEM : " +invoiceWork.getPricePerItem());
    System.out.println("QUANTITY ITEM PURCHASED: " + invoiceWork.getQuantityItemPurchased());
    System.out.println("PRICE PER ITEM " +invoiceWork.getPricePerItem()+ "  AND QUANTITY ITEM PURCHASED "+ invoiceWork.getQuantityItemPurchased()+"  YOUR TOTAL AMOUNT IS "+totalAmount);
}
}