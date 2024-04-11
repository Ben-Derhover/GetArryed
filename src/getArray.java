import java.util.*;


public class getArray {



    public static void main(String[] args) {

        int minlocation = 0;

        Random rnd =new Random();

        Scanner in = new Scanner(System.in);

        int [] dataPoints =  new int [100];

        //make the array
        for(int i =0; i < dataPoints.length; i++){
            dataPoints[i] = rnd.nextInt(100)+1;
        }
        for(int i = 0; i < dataPoints.length; i ++){
            System.out.print(dataPoints[i]+ " | ");
        }

        //test the methods

        double avg = getAverage(dataPoints);

        System.out.println("avg is " + avg);

        int min = findMin(dataPoints);
        System.out.println("the min number is " + min);
        int max = findMax(dataPoints);
        System.out.println("the max number is " + max);
        int count = 0;
        count = (safeInput.getRangedInt(in,"pick a number 1-100" ,0,100));
       int sum = sum(dataPoints);
        System.out.println("your number was found at " + occuranceScan(dataPoints,count) + "times");
        System.out.println("the total of all numbers is " + sum );
        boolean isFound = contains(dataPoints,safeInput.getRangedInt(in,"enter a number ", 0,100));
        if (isFound){
            System.out.println("Your number was found");
        }
        else{
            System.out.println("Number not found");
        }

    }

    public static boolean contains(int values[], int target){
       boolean found = false;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {

                found = true;

            }
        }

        return found;

    }

    public static int findMin(int values[]){

        int minlocation = 0;
        int min = values[0];

        for (int i = 0; i < values.length; i++){

            if (values[i]< min){
                min = values[i];
                System.out.println(min);
            }

        }

        return min;

    }

    public static int occuranceScan(int values[], int target){
    int count = 0;


        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                count = count + 1;


            }
        }
        //System.out.println("your number was found at " + count);



        return count;
    }
    public static int sum(int values[]){
        int sum = 0;

        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }



        return sum;
    }

    public static int findMax(int values[]){

        int maxlocation = 0;
        int max = values[0];

        for (int i = 0; i < values.length; i++){

            if (values[i] > max){
                max = values[i];
                maxlocation = i;
                System.out.println(max);
            }

        }

        return max;

    }





    public static double getAverage(int values[]){
        double avg = 0;
        double sum = 0;



        for(int i = 0; i < values.length; i ++){
            System.out.print(values[i] + " | ");
            sum = sum + values[i];
        }

        avg= sum/ values.length;

        System.out.println("the avg is " + avg);


        return avg;
    }



}
