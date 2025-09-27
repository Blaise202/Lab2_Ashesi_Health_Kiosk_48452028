import java.util.Scanner;

public class HealthKiosk{
  public static void main(String[] args){
    // Task 1
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please Select the service code: P/L/T/C: ");
    char service_code = scanner.next().charAt(0);
    switch(service_code.toUpperCase()){
      case 'P':
        System.out.println("Go To: Pharmacy Desk");
        break;
      case 'L':
        System.out.println("Go To: Lab Desk");
        break;
      case 'T':
        System.out.println("Go To: Triage Desk");
        break;
      case 'C':
        System.out.println("Go To: Counseling Desk");
        break;
      default:
        System.out.println("Invalid Service Code");
    }
  }
}