import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AdevntsProblem1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File( "/Users/jakobschneider/Desktop/NeueFische/AdventCode/AdventCalender_Day1_input.txt");
        Scanner sc = new Scanner(file);
        String line = null;
        int sum =  0;

        while (sc.hasNextLine()){
            line = sc.nextLine();
            line = line.replaceAll("zero","0");
            line = line.replaceAll("null","0");
            line = line.replaceAll("one","1");
            line = line.replaceAll("two","2");
            line = line.replaceAll("three","3");
            line = line.replaceAll("four","4");
            line = line.replaceAll("five","5");
            line = line.replaceAll("six","6");
            line = line.replaceAll("seven","7");
            line = line.replaceAll("eight","8");
            line = line.replaceAll("nine","9");
            line = line.replaceAll("ten","10");
            line = line.replaceAll("twenty","20");
            line = line.replaceAll("thirty","30");
            line = line.replaceAll("fourty","40");
            line = line.replaceAll("fivtey","50");
            line = line.replaceAll("sixty","60");
            line = line.replaceAll("seventy","70");
            line = line.replaceAll("eighty","80");
            line = line.replaceAll("ninety","90");
            line = line.replaceAll("\\D+","");
            //System.out.println(Arrays.toString(line.trim().split("")));
            String[] numbers = line.trim().split("");
            sum += Integer.parseInt(numbers[0] + numbers[numbers.length -1]);
            //System.out.println(numbers[0] + "  and " + numbers[numbers.length - 1]);
        }
        System.out.println(sum);
    }

}
