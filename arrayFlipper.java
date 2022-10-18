package Vecka1;
import Vecka2.ContestContributor;

import java.util.Scanner;

public class arrayFlipper {
    //Properties

    //Constructors

    //Methods
    public static int[] flipIntArray(int[] numberArray){
        int[] emptyNumberArray=numberArray.clone();
        int secondCounter=0;
        for(int i=numberArray.length-1; i>-1;i--){ //i borde vara större än -1, vilket den är tills i når denna loop
            //Med värdet av 0. Då subtraheras den och får värdet -1. Eftersom -1 inte är större än -1 bryts loopen
            //då, och man undviker ett ogiltigt index värde.
            emptyNumberArray[secondCounter] = numberArray[i];
            secondCounter++;
        }
        return emptyNumberArray;
    }

    public static int[] setUpIntArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv 5 integer värden du vill ha i en array, separerade med mellanslag");
        String userArrayStringForm = scanner.nextLine();

        int[] newIntArray=new int[userArrayStringForm.split(" ").length];
        //Denna metod är literally bara här för att ta in värden från användaren och skicka in de värden i form av
        //en int array till flipIntArray(). Den har en del kod eftersom den tar en singulär sträng och gör om den
        //till en char array. Den char arrayen parseas om till en int array.
        for(int i=0;i<userArrayStringForm.split(" ").length;i++){
            newIntArray[i] = Integer.parseInt(userArrayStringForm.split(" ")[i]);
        }
        return newIntArray;
    }


    public static double[] flipDoubletArray(double[] numberArray){
        double[] emptyNumberArray=numberArray.clone();
        int secondCounter=0;
        for(int i=numberArray.length-1; i>-1;i--){ //i borde vara större än -1, vilket den är tills i når denna loop
            //Med värdet av 0. Då subtraheras den och får värdet -1. Eftersom -1 inte är större än -1 bryts loopen
            //då, och man undviker ett ogiltigt index värde.
            emptyNumberArray[secondCounter] = numberArray[i];
            secondCounter++;
        }
        return emptyNumberArray;
    }

    public static String[] flipStringtArray(String[] stringArray){
        String[] emptyStringArray=stringArray.clone();
        int secondCounter=0;
        for(int i=stringArray.length-1; i>-1;i--){ //i borde vara större än -1, vilket den är tills i når denna loop
            //Med värdet av 0. Då subtraheras den och får värdet -1. Eftersom -1 inte är större än -1 bryts loopen
            //då, och man undviker ett ogiltigt index värde.
            emptyStringArray[secondCounter] = stringArray[i];
            secondCounter++;
        }
        return emptyStringArray;
    }


    public static ContestContributor[] flipContestArray(ContestContributor[] contestContributorArray){ //används för pied piers result board
        ContestContributor[] emptyContributorArray=contestContributorArray.clone();
        int secondCounter=0;
        for(int i=contestContributorArray.length-1; i>-1;i--){ //i borde vara större än -1, vilket den är tills i når denna loop
            //Med värdet av 0. Då subtraheras den och får värdet -1. Eftersom -1 inte är större än -1 bryts loopen
            //då, och man undviker ett ogiltigt index värde.
            emptyContributorArray[secondCounter] = contestContributorArray[i];
            secondCounter++;
        }
        return emptyContributorArray;
    }
}
