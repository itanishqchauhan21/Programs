//This Program is to Convert Currency 
import java.util.Scanner;
import java.util.*;
public class Currency {
    public static void main(String[] args )
    {
       Scanner in = new Scanner(System.in);
       float dollar , aed, rupees,convert,amt,rs;
       System.out.print("Enter the value of dollar : ");
       dollar = in.nextFloat();
       System.out.print("Enter the value of aed : ");
       aed=in.nextFloat();
       System.out.print("Enter the value of rupees : ");
       rs=in.nextFloat();
       String convertFrom ,convertTo;
       System.out.print("Enter the currency you want to convert : ");
       convertFrom = in.nextLine();
       System.out.print("Enter the currency you want to convert in : ");
       convertTo = in.nextLine();
       if(convertFrom=="dollar || Dollar" && convertTo =="Rupees || rupees")
       {
         System.out.print("Enter the amount of dollar you want to convert into rupees : ");
         amt = in.nextFloat();
         convert = amt*dollar;
         System.out.println(amt+" dollar = "+convert+" rupees.");
       }
       else if(convertFrom=="aed || AED" && convertTo =="Rupees || rupees")
       {
         System.out.print("Enter the amount of aed you want to convert into rupees : ");
         amt = in.nextFloat();
         convert = amt*aed;
         System.out.println(amt+" AED = "+convert+" rupees.");
       }
       else if(convertFrom=="rupees || Rupees" && convertTo =="Dollar || dollar")
       {
         System.out.print("Enter the amount of rupees you want to convert into dollar : ");
         amt = in.nextFloat();
         convert = amt*rs;
         System.out.println(amt+" rupees = "+convert+" dollar.");
       }
       else if(convertFrom=="rupees || Rupees" && convertTo =="aed || AED")
       {
         System.out.print("Enter the amount of rupees you want to convert into aed : ");
         amt = in.nextFloat();
         convert = amt*rs;
         System.out.println(amt+" rupees = "+convert+" aed.");
       }
       else {
        System.out.println("Wrong Input !");
       }
    }
}