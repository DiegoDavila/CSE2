//Diego Davila
//hw02-Arithmetic
//Purpose: Calculate the total cost of items bought at Walmart
//including the PA sales tax of 6%


//Class:
public class Arithmetic{
    
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
        
        //Changing total prices to two decimal places:
        double roundSocksPrice$=Math.round(100*totalSocksPrice$)/100.00;
        double roundGlassesPrice$=Math.round(100*totalGlassesPrice$)/100.00;
        double roundEnvelopesPrice$=Math.round(100*totalEnvelopesPrice$)/100.00;
        double roundTotalPrice$=Math.round(100*totalPrice$)/100.00;
        
        //Changing prices plus tax to two decimal places:
        double roundSocksPriceTax$=Math.round(100*socksWithTax$)/100.00;
        double roundGlassesPriceTax$=Math.round(100*glassesWithTax$)/100.00;
        double roundEnvelopesPriceTax$=Math.round(100*envelopesWithTax$)/100.00;
        double roundTotalPriceTax$=Math.round(100*totalPriceWithTax$)/100.00;
     
        //Ticket Print:
        
    
        System.out.println("Item: Pair of Socks Price: $" + (sockCost$) + " Quantity: " + (nSocks) + " Subtotal: $" + (roundSocksPrice$) + " Total: $" + (roundSocksPriceTax$));
        System.out.println("Item: Drinking Glass Price: $" + (glassCost$) + " Quantity: " + (nGlasses) + " Subtotal: $" + (roundGlassesPrice$) + " Total: $" + (roundGlassesPriceTax$));
        System.out.println("Item: Box of Envelopes Price: $" + (envelopeCost$) + " Quantity: " + (nEnvelopes) + " Subtotal: $" + (roundEnvelopesPrice$) + " Total: $" + (roundEnvelopesPriceTax$));
        System.out.println("This transaction Subtotal: $" + (roundTotalPrice$) + " Total of transaction: $" + (roundTotalPriceTax$));
        
        
        //A simpler method to round to two decimal places would be to add
        //import java.text.DecimalFormat;
        //Before declaring class then
        //Decimal Format x = new DecimalFormat("###.00#);
        //inside class and main method and then 
        // x.format(number or variable)
        
    } //end of main method
} //end of class