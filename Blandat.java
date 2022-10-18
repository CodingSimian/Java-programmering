package Vecka1;
import java.util.Locale;
import java.util.Scanner;
public class Blandat {
    //Inga properties, kmr endast ha metoder här som jag senare använder i min main

    //constructors

    //Methods

    public static void MinutKonversion(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //går att använda andra locales men US
        //Funkar bra eftersom dem använder sig av . ist för , när dem vill skriva 1 och en halv tex.
        //oxå märk att denna kod visar ett error meddelande om man har en annan placeholder i
        //Printf statementet än .2f .
        System.out.println("Hur många minuter har du?");
        double minuter = scanner.nextDouble();
        //Metoden ska omvandla det till år och dagar.

        double years = Math.floor(minuter/(60*24*365));
        double days = (years >= 1) ? minuter/(60*24*365) : minuter/(60*24);
        System.out.printf("Du har alltså %d år och %.1f dagar",(int) years, days);
    }

    public static void brushing(){
        int numberOfCleanTeeth = 0;
        do{
            numberOfCleanTeeth++;
            System.out.printf("Aw man I LOVE cleaning tooth numbere %d in my mouth! \n", numberOfCleanTeeth);
        }while(numberOfCleanTeeth !=32);
    }


    public static void gissning(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gissa vilken siffra");


        for(int i = 0; i<3; i++){
            double x = Math.random() * 100;
            long y = Math.round(x);
            int user_input = scanner.nextInt();
            if (user_input == y) {
                System.out.println("Grattis du är bäst");
                break;
            } else {
                System.out.println("Nu är du ute och cyklar");
                System.out.println("Det var " + String.valueOf(y));
                String svar = (i == 2) ? "Inga mer chanser" : "Gissa igen";
                System.out.println(svar);
            }

        }
    }


    public static double kgToLbs(double kg){
        double lbs = kg * 2.204;

        return lbs;
    }

    public static double biggestNumber(double a, double b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static double areaOf(double base, double height){
        double area = base*height;
        return area;
    }

    public static double circumferenceOf(double base, double height){
        double circ= (base*2) + (height*2);
        return circ;
    }

    public static int flipper(int userNumber){
        String userNumberString = String.valueOf(userNumber);
        String newUserString = "";

        for(int i=userNumberString.length()-1;i>-1;i--){ //Denna kod tar integers och konverterar det till en sträng.
            //Den strängen blir sedan omvandlad bakifrån med en for loop
            //Den sträng blir omgjord till en integer.
            //Denna metod returnerar den integern.
            newUserString += userNumberString.charAt(i);
        }
        int reversedNumber= Integer.valueOf(newUserString);
        return reversedNumber;
    }
}
