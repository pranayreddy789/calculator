import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Test;
public class calculator {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      case '+':
       Add(number1,number2);
        break;

      case '-':
       Subtract(number1,number2);
        break;

      case '*':
       Multiply(number1,number2);
        break;

      case '/':
       divide(number1,number2);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
public double Add(double n1,double n2){
return (n1+n2);
}
public double Subtract(double n1,double n2){
return (n1-n2);
}
public double Multiply(double n1,double n2){
return (n1*n2);
}
public double divide(double n1,double n2){
return (n1/n2);
}
@Test
public void addTest(){
assertEquals(5.0,Add(2.0,3.0));
}
public void subtractTest(){
assertEquals(1.0,subtract(3.0,2.0));
}
public void multiplyTest(){
assertEquals(4.0,Add(2.0,2.0));
}
public void divideTest(){
assertEquals(2.0,Add(6.0,3.0));
}

}
