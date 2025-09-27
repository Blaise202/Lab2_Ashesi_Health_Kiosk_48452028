import java.util.Scanner;
public class HealthKiosk{
  public static void main(String[] args){
    Scanner scanner = Scanner(Syestem.in);
    System.out.println("Welcome to our program!");
    String letter = scanner.nextLine();
    switch(letter){
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Pass");
        break;
      default:
        System.out.println("fail");
        break;
    }
  }
}