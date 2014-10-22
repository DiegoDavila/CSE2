//Diego Davila
//hw02-Arithmetic
//Purpose: Calculate the total cost of items bought at Walmart
//including the PA sales tax of 6%

import java.text.DecimalFormat; //Used for rounding 

//Class:
public class ArithmeticMethod2{
    
    //Main method:
    public static void main(String[] args) {
        
        int nSocks=3; //Number of pairs of socks
        double sockCost$=2.58; //Cost per pair of socks
        
        int nGlasses=6; //Number of drinking glasses 
        double glassCost$=2.29; //Cost per glass
        
        int nEnvelopes=1; //Number of boxes of envelopes
        double envelopeCost$=3.25; //Cost per box of envelopes
        
        double taxPercent=0.06; //PA tax percent added to total
        
        //Variable names for total prices for each item:
        
        double totalSocksPrice$; //Total cost of socks
        double totalGlassesPrice$; //Total cost of glasses
        double totalEnvelopesPrice$; //Total cost of envelopes
        double totalPrice$; //Total price of purchase
        
        //Variable names total price plus tax:
        
        double socksWithTax$; //Socks cost plus tax
        double glassesWithTax$; //Glasses cost plus tax
        double envelopesWithTax$; //Envelopes cost plus tax
        double totalPriceWithTax$; //Total price plus tax
        
        //Total prices:
        totalSocksPrice$=nSocks*sockCost$;
        totalGlassesPrice$=nGlasses*glassCost$;
        totalEnvelopesPrice$=nEnvelopes*envelopeCost$;
        totalPrice$=totalSocksPrice$+totalGlassesPrice$+totalEnvelopesPrice$;
        
        //Total prices plus tax:
        socksWithTax$=totalSocksPrice$+(totalSocksPrice$*taxPercent);
        glassesWithTax$=totalGlassesPrice$+(totalGlassesPrice$*taxPercent);
        envelopesWithTax$=totalEnvelopesPrice$+(totalEnvelopesPrice$*taxPercent);
        totalPriceWithTax$=totalPrice$+(totalPrice$*taxPercent);
        
        //To round to two decimal places: 
        
        DecimalFormat d = new DecimalFormat("###.00");
     
        //Ticket Print:
        
    
        System.out.println("Item: Pair of Socks Price: $" + (sockCost$) + " Quantity: " + (nSocks) + " Subtotal: $" + d.format(totalSocksPrice$) + " Total: $" + d.format(socksWithTax$));
        System.out.println("Item: Drinking Glass Price: $" + (glassCost$) + " Quantity: " + (nGlasses) + " Subtotal: $" + d.format(totalGlassesPrice$) + " Total: $" + d.format(glassesWithTax$));
        System.out.println("Item: Box of Envelopes Price: $" + (envelopeCost$) + " Quantity: " + (nEnvelopes) + " Subtotal: $" + d.format(totalEnvelopesPrice$) + " Total: $" + d.format(envelopesWithTax$));
        System.out.println("This transaction Subtotal: $" + d.format(totalPrice$) + " Total of transaction: $" + d.format(totalPriceWithTax$));
        
        
    } //end of main method
} //end of class