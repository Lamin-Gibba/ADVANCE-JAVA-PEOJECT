import java.io.File;
import java.text.DecimalFormat;
import java.util.*;

/*
 * Just like what I saw you before regarding the currency conversion...
 * I have made some adjustment but still now I have no clue about how to work..
 *in the CFA currency if you can help me with that please....and please I really need your comment.
 */

/**
 *
 * @author muhammad
 */
public class currencyconverter {
    public static void main(String arg[]){
        double amount,dollar,pound,euro,dallasi,yen;
        int code = 0,toCode=0;
        DecimalFormat f = new DecimalFormat("##.##");

        Scanner src = new Scanner(System.in);
        Map<Integer, String> currencyList = new HashMap<>();
        currencyList.put(1,"D");
        currencyList.put(2,"USD");
        currencyList.put(3,"P");
        currencyList.put(4,"E");
        currencyList.put(5,"Y");


        System.out.println("hi Welcome to the currency converter!");
        System.out.println("which currency You want to Convert From ? ");
        System.out.println("1:Dallasi \t2:Dollar \t3:Pound \n4:Euro \t5:Yen");
        code = src.nextInt();

        String sourceCurrency = currencyList.get(code);
        System.out.println(sourceCurrency);

        System.out.println("Which Currency do you want to convert to: 1:Dallasi \t2:Dollar \t3:Pound \n4:Euro \t5:Yen");
        toCode = src.nextInt();
        String destinationCurrency="";
      if(currencyList.containsKey(toCode)){
           destinationCurrency = currencyList.get(toCode);
      }

        File sd = new File("..");


      String key = sourceCurrency+"To"+destinationCurrency;
      System.out.println(key);

        Map<String,Double> currencyHandle= new HashMap<String, Double>();
        currencyHandle.put("PToD",61.34);
        currencyHandle.put("USDToD",52.67);
        currencyHandle.put("EToD",58.6);
        currencyHandle.put("USDToE",3.0);
        currencyHandle.put("PToUSD",1.34);
        currencyHandle.put("PToE",2.5);
        currencyHandle.put("DToP",1/currencyHandle.get("PToD"));

        currencyHandle.put("DToUSD",1/currencyHandle.get("USDToD"));
        currencyHandle.put("USDToP",1/currencyHandle.get("PToUSD"));

        currencyHandle.put("EToUSD",1/currencyHandle.get("USDToE"));
        currencyHandle.put("EToP",1/currencyHandle.get("PToE"));
        currencyHandle.put("DToE",1/currencyHandle.get("EToD"));
        System.out.println("How much Money you want to convert ?");
        amount = src.nextDouble();
        double actualFigure = currencyHandle.get(key)*amount;

        System.out.println("Thank you. "+amount + " is equavalent to "+actualFigure);




//        currencyHandle





        if (code == 1){
            dollar = amount/51;
            System.out.println("Your " + amount + " Dallasi is: " + f.format(dollar) + " Dollar");

            pound = amount/62;
            System.out.println("Your " + amount + " Dallasi is: " + f.format(pound) + " Pound");

            euro = amount/57;
            System.out.println("Your " + amount + " Dallasi is: " + f.format(euro) + " Euro");

            yen = amount/0.56;
            System.out.println("Your " + amount + " Dallasi is: " + f.format(yen) + "Yen");

        }else if (code == 2){
            dallasi = amount*51;
            System.out.println("Your " + amount + " Dollar is: " + f.format(dallasi) + " Dallasi");

            pound = amount*0.78;
            System.out.println("Your " + amount + " Dollar is: " + f.format(pound) + " Pound");

            euro = amount*0.87;
            System.out.println("Your" + amount + " Dollar is: " + f.format(euro) + " Euro");

            yen = amount*111.087;
            System.out.println("Your " + amount + " Dollar is: " + f.format(yen) + " Yen");

        }else if (code == 3){
            dallasi = amount*62;
            System.out.println("Your " + amount + " Pound is: " + f.format(dallasi) + " Dollar");

            dollar = amount*1.26;
            System.out.println("Your " + amount + " Pound is: " + f.format(dollar) + " Dollar");

            euro = amount*2.10;
            System.out.println("Your " + amount + " Pound is: " + f.format(euro) + " Euro");

            yen = amount*140.93;
            System.out.println("Your " + amount + " Pound is: " + f.format(yen) + " Yen");
        }else if (code == 4){
            dallasi = amount*57;
            System.out.println("Your " + amount + " Euro is: " + f.format(dallasi) + " Dollar");

            pound = amount*0.90;
            System.out.println("Your " + amount + " Euro is: " + f.format(pound) + " Pound");

            dollar = amount*1.14;
            System.out.println("Your " + amount + " Euro is: " + f.format(dollar) + " Dollar");

            yen = amount*127.32;
            System.out.println("Your " + amount + " Euro is: " + f.format(yen) + " Yen");
        }else if (code == 5){
            dallasi = amount*88;
            System.out.println("Your " + amount + " Yen is: " + f.format(dallasi) + " Dallasi");

            pound = amount*0.007;
            System.out.println("Your " + amount + " Yen is: " + f.format(pound) + " Pound");

            euro = amount*0.007;
            System.out.println("Your " + amount + " Dollar is: " + f.format(euro) + " Euro");

            dollar = amount*0.008;
            System.out.println("Your " + amount + " Dollar is: " + f.format(dollar) + " Dollar");
        }
        else{
            System.out.println("Invalid Input");
        }

        System.out.println("Thank You for accepting our services");
    }

}
