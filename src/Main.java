import java.util.*;

public class Main {




















    public static double getAverage(int values[]){
        double avg = 0;
        double sum = 0;

        Random rnd =new Random();

        Scanner in = new Scanner(System.in);



        for(int i =0; i < values.length; i++){
            values[i] = rnd.nextInt(100);
        }
        for(int i = 0; i < values.length; i ++){
            System.out.print(values[i] + " | ");
            sum = sum + values[i];
        }

        avg= sum/ values.length;
        System.out.println("the avg is " + avg);


        return avg;
    }







    public static void main(String[] args) {

        int [] dataPoints =  new int [100];

        int sum = 0;

        int avg = 0;

        int count = 0;

        int userInput = 0;

        boolean done = false;

        int min = 0;

        int max = 0;

        int minlocation = 0;

        int maxlocation = 0;

        Random rnd =new Random();

        Scanner in = new Scanner(System.in);

        for(int i =0; i < dataPoints.length; i++){
            dataPoints[i] = rnd.nextInt(100);
        }
        for(int i = 0; i < dataPoints.length; i ++){
            System.out.print(dataPoints[i]+ " | ");
            sum = sum + dataPoints[i];
        }
        avg= sum/ dataPoints.length;

        System.out.println();
        System.out.println("avg is " + avg);
        //userInput= safeInput.getRangedInt(in," put a number between 1 - 100",1, 100);
        min = dataPoints[0];
        max = dataPoints[0];
        for (int i = 0; i < dataPoints.length; i++){

            if (dataPoints[i]> max){
                max = dataPoints[i];
                maxlocation = i;
            }

        }
        for (int i = 0; i < dataPoints.length; i++){

            if (dataPoints[i]< min){
                min = dataPoints[i];
                minlocation = i;
            }

        }
        System.out.println("the min number is " + min + " it was found at " + minlocation);
        System.out.println("the max number is " + max + " it was found at " + maxlocation);



        while (true){

            for(int i = 0; i < dataPoints.length; i ++) {
                System.out.println();
                userInput = safeInput.getInt(in, "put in a number 1-100");
                    if (dataPoints[i] == userInput) {
                        count = i;
                        System.out.println("your number was found at " + count);
                        break;
                    }
                    else {
                        System.out.println("that input is not in the array");
                        }
                }
            break;
        }


        //System.out.println();
       // System.out.println("the total is " + sum);
        //System.out.println();
        //System.out.println("the avg is " + avg);








    }

}