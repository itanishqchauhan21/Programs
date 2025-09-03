//This Program is to Convert Currency 
import java.util.Scanner;
import java.util.*;
public class Currency {
    public static void main(String[] args )
    {
        Scanner in = new Scanner(System.in);
        float dollar , aed, rupees,convert,amt,rsd,rsaed,dollaraed,aeddollar;
        System.out.print("Enter the value of dollar : ");
        dollar = in.nextFloat();
        System.out.print("Enter the value of aed : ");
        aed=in.nextFloat();
        System.out.print("Enter the value of rupees(with respect to dollar) : ");
        rsd=in.nextFloat();
        System.out.print("Enter the value of rupees(with respect to aed) : ");
        rsaed=in.nextFloat();
        System.out.print("Enter the value of dollar(with respect to aed) : ");
        dollaraed=in.nextFloat();
        System.out.print("Enter the value of aed(with respect to dollar) : ");
        aeddollar=in.nextFloat();
        String convertFrom ,convertTo;
        in.nextLine();
        System.out.print("Enter the currency you want to convert : ");
        convertFrom = in.nextLine();
        System.out.print("Enter the currency you want to convert in : ");
        convertTo = in.nextLine();
        if((convertFrom.equalsIgnoreCase("dollar")) && (convertTo.equalsIgnoreCase("rupees")))
        {
            System.out.print("Enter the amount of dollar you want to convert into rupees : ");
            amt = in.nextFloat();
            convert = amt*dollar;
            System.out.println(amt+" dollar = "+convert+" rupees.");
        }
        else if((convertFrom.equalsIgnoreCase("aed")) && (convertTo.equalsIgnoreCase("rupees")))
        {
            System.out.print("Enter the amount of aed you want to convert into rupees : ");
            amt = in.nextFloat();
            convert = amt*aed;
            System.out.println(amt+" AED = "+convert+" rupees.");
        }
        else if((convertFrom.equalsIgnoreCase("rupees")) && (convertTo.equalsIgnoreCase("dollar")))
        {
            System.out.print("Enter the amount of rupees you want to convert into dollar : ");
            amt = in.nextFloat();
            convert = amt*rsd;
            System.out.println(amt+" rupees = "+convert+" dollar.");
        }
        else if((convertFrom.equalsIgnoreCase("rupees")) && (convertTo.equalsIgnoreCase("aed")))
        {
            System.out.print("Enter the amount of rupees you want to convert into aed : ");
            amt = in.nextFloat();
            convert = amt*rsaed;
            System.out.println(amt+" rupees = "+convert+" aed.");
        }
        else if((convertFrom.equalsIgnoreCase("dollar")) && (convertTo.equalsIgnoreCase("aed")))
        {
            System.out.print("Enter the amount of dollar you want to convert into aed : ");
            amt = in.nextFloat();
            convert = amt*dollaraed;
            System.out.println(amt+" rupees = "+convert+" aed.");
        }
        else if((convertFrom.equalsIgnoreCase("aed")) && (convertTo.equalsIgnoreCase("dollar")))
        {
            System.out.print("Enter the amount of aed you want to convert into dollar : ");
            amt = in.nextFloat();
            convert = amt*aeddollar;
            System.out.println(amt+" aed = "+convert+" dollar.");
        }

        else {
            System.out.println("Wrong Input !");
        }
    }
}