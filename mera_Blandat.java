package Vecka2;
import Vecka1.Blandat;
import Vecka1.arrayFlipper;

import java.math.*; //.* importerar allt som finns i det java packetet.
import java.util.*;

public class mera_Blandat {
    //properties

    //constructors

    //methods

    public static int diceThrown(){
        double x = (Math.random() *(7-1)) + 1;
        int points = (int) x;
        return points; //inte jätterandom ändå, fick typ aldrig upp 6
    }

    public static int numberOfWords(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv din mening");
        String someSentence = scanner.nextLine();
    String[] words = someSentence.split(" ");
    int amount=words.length;
    return amount;
    }

    public static String backwardSpelling(String someWord){
        char[] theWordArray = someWord.toCharArray();
        String backwardsWord = "";
        int counter = 0;
        for(int i = theWordArray.length -1 ; i>-1; i--){
            backwardsWord += String.valueOf(theWordArray[i]);
            counter++;
        }

        return backwardsWord;
    }

    public static String backwardSpellingPalindrom(String someWord){

        char[] theWordArray = someWord.toCharArray();
        String backwardsWord = "";
        int counter = 0;
        for(int i = theWordArray.length -1 ; i>-1; i--){ //Samma som förra metoden fast med ett undantag om man lägger
            //In ett palindrom. För något skäl funkar endast .equals() och itne == när man jämför strängarna här
            backwardsWord += String.valueOf(theWordArray[i]);
            counter++;
        }
        if(backwardsWord.toLowerCase().equals(someWord.toLowerCase())){
            System.out.println("Du hade ett palindrom");
            return someWord;
        }
        else {
            return backwardsWord;
        }
    }
    public static void checkingSomeNumber(){
        Blandat blandat = new Blandat();
        Scanner scanner = new Scanner(System.in); //Detta är lösningen på vecka 1, uppgift 1, på utökade uppgifter.
        System.out.println("Skriv in 1 nummer");
        double userInputFirst = scanner.nextDouble();
        System.out.println("Skriv in ett till nummer, för skojs skull");
        double userInputSecond = scanner.nextDouble();
        double result = blandat.biggestNumber(userInputSecond,userInputFirst);

        System.out.println("Det största nummret var " + String.valueOf(result) + " Grattis!");


    }

    public static void weightConversion(){
        Blandat blandat = new Blandat();
        double nyaVikten = blandat.kgToLbs(300);
        System.out.println("Shit du har fan " + nyaVikten + " lbs!");
    }

    public static void sizeOfRectangel(){
        Blandat blandat = new Blandat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv hur lång din rektangel är i meter");
        double base = scanner.nextDouble(); //Lösning till uppgiften om att ha ngt som returnerar arean och omkretsen
        //av en rektangel.
        System.out.println("Skriv nu hur hög din rektangel är i meter");
        double height = scanner.nextDouble();
        System.out.println("Arean av din rektangel är " + blandat.areaOf(base,height) +"m^2 och din omkrets är " +
                blandat.circumferenceOf(base,height) +"m");


    }

    public static void flipperExample(){
        Blandat blandat = new Blandat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a cool integer");
        int userNumberInput=scanner.nextInt(); //Kod som använder sig av min flipper metod. en metod som vänder bakochfram på dina siffror som skickas in.
        int daNumber= blandat.flipper(userNumberInput);
        System.out.println("You wrote " + userNumberInput +" And that number reversed is: " + daNumber);
    }

    public static void flippingFreakingArrays(){
        int[] mySpecialIntArray = arrayFlipper.setUpIntArray();
        int[] flippedIntArray = arrayFlipper.flipIntArray(mySpecialIntArray);
        System.out.println("Du skrev in " + Arrays.toString(mySpecialIntArray) + " OCH OMVÄNT BLEV DET: " + Arrays.toString(flippedIntArray));
    }

    public static Integer[] selectionSort(Integer[] someIntArray){

        for(int b=0; b< someIntArray.length;b++){ //Denna for loop bestämmer ett "referenstal" alltså det talet
            //som du jämför resten av arrayen med.

            for(int i=b; i<someIntArray.length;i++){ //Denna loop utgår från b's index så att loopen blir
                //successivt kortare så att man undviker infinity loops och endast jämför med en krympande array.

                if(someIntArray[b] > someIntArray[i]){

                    int placeholder = someIntArray[b]; //eftersom denna kod tar ett värde i arrayen och jämför det
                    //med alla värden så är det mera som att denna kod tar ett värde ur arrayen, och låter det
                    //hoppa längre in i listan TILLS det når ett tal som det är mindre än.

                    //På så sätt kan man börja med hur högt tal som helst. OCH hur lågt tal som helst.
                    //Talen kommer sortera sig ändå
                    someIntArray[b] = someIntArray[i];
                    someIntArray[i] = placeholder;
                }
                //Denna kod funkar endast om du importerar lite java g

            }

        }
        return someIntArray;
    }

    public static Double[] selectionDoubleSort(Double[] someDoubleArray){

        for(int b=0; b< someDoubleArray.length;b++){ //Denna for loop bestämmer ett "referenstal" alltså det talet
            //som du jämför resten av arrayen med.

            for(int i=b; i<someDoubleArray.length;i++){ //Denna loop utgår från b's index så att loopen blir
                //successivt kortare så att man undviker infinity loops och endast jämför med en krympande array.

                if(someDoubleArray[b] > someDoubleArray[i]){

                    double placeholder = someDoubleArray[b]; //eftersom denna kod tar ett värde i arrayen och jämför det
                    //med alla värden så är det mera som att denna kod tar ett värde ur arrayen, och låter det
                    //hoppa längre in i listan TILLS det når ett tal som det är mindre än.

                    //På så sätt kan man börja med hur högt tal som helst. OCH hur lågt tal som helst.
                    //Talen kommer sortera sig ändå
                    someDoubleArray[b] = someDoubleArray[i];
                    someDoubleArray[i] = placeholder;
                }
                //Denna kod funkar endast om du importerar lite java g

            }

        }
        return someDoubleArray;
    }

    public static void randomLetterGenerator(){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyzåäö".toCharArray();
        String[] rndmAlphabet = new String[100];

        for(int i = 0; i<100;i++){

            double x = Math.random() * (28-0) + 0; //Bestäm Math.random för ett intervall.
            long picker = Math.round(x);
            int q = (int) picker;
            rndmAlphabet[i]=String.valueOf(alphabet[q]); //Måste göra om char arrayen till en String array
            //så att man kan ta den String arrayen och göra om det till en String arraylist.

        }
        //Nu har det slumpats fram 100 bokstäver. För att räkna förekomsten av varje bokstav så görs det lättast
        //med att omvandla rndmAlphabet till arraylista och använda en for loop för att sedan bestämma frekvensen
        //av varje bokstav utifrån den.

        List<String> rndmAlphabetList = Arrays.asList(rndmAlphabet);
        for(char s:alphabet){
            System.out.println(s + " " + Collections.frequency(rndmAlphabetList,String.valueOf(s)));
        }
    }



    public static ContestContributor[] selectionSortContributor(ContestContributor[] someContributorArray){

        for(int b=0; b< someContributorArray.length;b++){

            for(int i=b+1; i<someContributorArray.length;i++){

                if(someContributorArray[b].getContributorScore() > someContributorArray[i].getContributorScore()
                    //OBS OBS eftersom denna kod itererar genom en hel array så får den arrayen inte ha några null värden
                    //Då försöker datorn kolla av ett värde mot ett null värde, och det går ej.
                ){

                    ContestContributor placeholder = someContributorArray[b];

                    someContributorArray[b] = someContributorArray[i];
                    someContributorArray[i] = placeholder;
                }


            }

        }
        return someContributorArray;
    }

    public static void resultBoard(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //använd en bestämd locale för att kunna
        //skriva . eller , när man skriver decimaltal
        ContestContributor[] contestArray = new ContestContributor[4];
        Employee[] employeeArray = new Employee[4];


        for(int i = 0; i<4; i++){
            System.out.println("Vad är namnet på din person?");
            scanner.nextLine();
            employeeArray[i] = new Employee(scanner.nextLine());


            System.out.println("Nu vad är deras Weismann poäng för deras lossless compression?");
            contestArray[i] = new ContestContributor(scanner.nextDouble());

            //Store everything into one singular array with ContestContributor objects.

            contestArray[i].setContributor(employeeArray[i]);

        }

        selectionSortContributor(contestArray); //Sortera arrayen så att oavsett vilken ordning som weissman scoren
        //har blivit inlagda på så kommer talen att gå från lägsta till högsta (vänster till höger)

        ContestContributor[] newContestArray = arrayFlipper.flipContestArray(contestArray);
        //Flippa runt arrayen så att det blir omvänt. från högsta till lägsta (Fallande ordning)

        //print
        System.out.println("1a plats med " + newContestArray[0].getContributorScore() + " poäng " + newContestArray[0].getContributor().getName() + "\n"
                + "2a plats med " + newContestArray[1].getContributorScore() + " poäng " + newContestArray[1].getContributor().getName() + "\n"
                + "3a plats med " + newContestArray[2].getContributorScore() + " poäng " + newContestArray[2].getContributor().getName() + "\n");


    }

}
