package Lab10;


public class Question1 {

    public static void main(String[] args) {
        String[] inputList = {"12", "45", "abc", "30", "xyz"};

        System.out.println("\nMuhammad Ali - 24K-3103\n");
        Calculate.calculateAverage(inputList);
    }
}

class Calculate {

    public static void calculateAverage(String[] inputList) {

        if (inputList == null || inputList.length == 0) {
            System.out.println("Error: The list is null or empty.");
            return;
        }

        int sum = 0;
        int count = 0;

        for (String item : inputList) {
            try {
                // convert the string to an integer
                int num = Integer.parseInt(item);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid value: " + item);
            }
        }

        if (count == 0) {
            System.out.println("Error: No valid integers in the list.");
        } else {
            double average = (double) sum / count;
            System.out.println("Average of valid integers: " + average);
        }
    }
}
