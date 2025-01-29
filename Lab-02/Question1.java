package lab2.com;

public class Question1 {

    public static void main(String[] args){
        int[] numbers = {15, 3, 25, 8, 30};
        int max = 0;

        for(int num: numbers){

            if (num > max){
                max = num;
            }
        }

        System.out.println("The maximum value in the array is: " + max);
    }

}
