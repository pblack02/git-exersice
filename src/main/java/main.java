import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something!");
        String userInput = sc.nextLine();
        System.out.println("You've entered " + userInput);
        System.out.println("Is your string a number ?: " + StringUtils.isNumeric(userInput));
        System.out.println("Flipped case:" + StringUtils.swapCase(userInput));
        System.out.println("Revered case:" + StringUtils.reverse(userInput));



    }
}
