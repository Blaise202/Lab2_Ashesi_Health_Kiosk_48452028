import java.util.Scanner;
import java.util.Random;

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
        System.out.println("Sin: "+ sine +" Cos: " + cosine);
      }
    }

    // Task 3

    char randomChar = (char) ('A' + (int)(Math.random() * 26));
    Random rand = new Random();
    int min = 3;
    int max = 9;
    int random1 = rand.nextInt((max - min) + 1) + min;
    int random2 = rand.nextInt((max - min) + 1) + min;
    int random3 = rand.nextInt((max - min) + 1) + min;
    int random4 = rand.nextInt((max - min) + 1) + min;
    String studentID = randomChar + "" + random1 + "" + random2 + "" + random3 + "" + random4;
    System.out.println("String ID = " + studentID);
    if (studentID.length() != 5) {
      System.out.println("Invalid: length must be 5");
    } else if (!Character.isLetter(studentID.charAt(0))) {
      System.out.println("Invalid: first char must be a letter");
    } else if (!(Character.isDigit(studentID.charAt(1)) &&
                  Character.isDigit(studentID.charAt(2)) &&
                  Character.isDigit(studentID.charAt(3)) &&
                  Character.isDigit(studentID.charAt(4)))) {
      System.out.println("Invalid: last 4 must be digits");
    } else {
      System.out.println("ID OK");
    }
  }
}