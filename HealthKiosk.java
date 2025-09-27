import java.util.Scanner;

public class HealthKiosk{
  public static void main(String[] args){

    // Task 1

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please Select the service code: P/L/T/C: ");
    char service_code = scanner.next().charAt(0);
    service_code = Character.toUpperCase(service_code);
    switch(service_code){
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

    // Task 2

    service_code = Character.toUpperCase(service_code);
    if(service_code == 'T'){
      System.out.print("Please Enter the health metrics; [1: BMI, 2: Dosage round-up, 3: simple trig helper]: ");
      int metrics = scanner.nextInt();
      if(metrics == 1){
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 10.0) / 10.0;
        System.out.print("BMI: " + bmi + " ");
        if(bmi < 18.5){
          System.out.println("Category: Underweight");
        } else if(bmi < 24.9){
          System.out.println("Category: Normal");
        } else if(bmi < 29.9){
          System.out.println("Category: Overweight");
        } else {
          System.out.println("Category: Obese");
        }
      }else if(metrics == 2){
        System.out.print("Please Enter the dosage (mg): ");
        double dosage = scanner.nextDouble();
        int pharmacy_limit = 250;
        double tablets = Math.ceil(dosage / pharmacy_limit);
        System.out.println("You are getting: " + (int)tablets + " tablet(s)");
      }else if(metrics == 3){
        System.out.print("Please Enter the angle (degrees): ");
        double angle = scanner.nextDouble();
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        sine = Math.round(sine * 1000.0) / 1000.0;
        cosine = Math.round(cosine * 1000.0) / 1000.0;
        System.out.printf("Sin: "+ sine +" Cos: " + cosine);
      }
    }
  }
}