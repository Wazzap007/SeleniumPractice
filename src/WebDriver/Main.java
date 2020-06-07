package WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;


public class Main {
    private Day1 day1;

    public static void main(String[] args) throws InterruptedException {
        Day1 d1 = new Day1();
        Day3 d3 = new Day3();

        Integer number = 3;

//        Scanner console = new Scanner(System.in);
//        Integer number = console.nextInt();
//        //System.out.pritln(number);

        switch (number){
            case 1: d1.launch();
            case 3: d3.launch();
        }
    }
}
