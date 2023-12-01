import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.nio.*;


public class Tag5Vormittag {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File( "/Users/jakobschneider/Desktop/NeueFische/AdventCode/AdventCalender_Day1_input.txt");
        Scanner sc = new Scanner(file);
        String line = null;
        int sum =  0;

        while (sc.hasNextLine()){
            line = sc.nextLine();
            line = line.replaceAll("one","1");
            line = line.replaceAll("two","2");
            line = line.replaceAll("three","3");
            line = line.replaceAll("four","4");
            line = line.replaceAll("five","5");
            line = line.replaceAll("six","6");
            line = line.replaceAll("seven","7");
            line = line.replaceAll("eight","8");
            line = line.replaceAll("nine","9");
            line = line.replaceAll("\\D+","");
            //System.out.println(Arrays.toString(line.trim().split("")));
            String[] numbers = line.trim().split("");
            sum += Integer.parseInt(numbers[0] + numbers[numbers.length -1]);
            //System.out.println(numbers[0] + "  and " + numbers[numbers.length - 1]);
        }
        System.out.println(sum);
    }

}
