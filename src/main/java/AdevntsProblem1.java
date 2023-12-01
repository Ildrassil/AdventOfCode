import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AdevntsProblem1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File( "/Users/jakobschneider/Desktop/NeueFische/AdventCode/AdventsCalenderTag1_2.txt");
        Scanner sc = new Scanner(file);
        String line = null;
        int sum =  0;

        while (sc.hasNextLine()){
            line = sc.nextLine();
            line = line.replaceAll("zero","ze0ro");
            line = line.replaceAll("null","0");
            line = line.replaceAll("one","o1ne");
            line = line.replaceAll("two","t2wo");
            line = line.replaceAll("three","th3ree");
            line = line.replaceAll("four","fo4ur");
            line = line.replaceAll("five","fi5ve");
            line = line.replaceAll("six","s6ix");
            line = line.replaceAll("seven","se7ven");
            line = line.replaceAll("eight","ei8ght");
            line = line.replaceAll("nine","ni9ne");
            line = line.replaceAll("ten","t10en");
            line = line.replaceAll("\\D+","");
            //System.out.println(Arrays.toString(line.trim().split("")));
            String[] numbers = line.trim().split("");
            sum += Integer.parseInt(numbers[0] + numbers[numbers.length -1]);
            //System.out.println(numbers[0] + "  and " + numbers[numbers.length - 1]);
        }
        System.out.println(sum);
    }

}
