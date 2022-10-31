package calculate;

public class Calculator {

public static void addition(int a, int b){
    int result = (a+b);
    System.out.println(result);
}

public static void substraction(int a, int b){
    int result = (a-b);
    System.out.println(result);

}
public static void division(double a, double b){
    double result = (a/b);
}
public static void multiplication(int a, int b){
    int result = (a*b);
}

  public static void calculateResult(int a, int b, char c){
      switch (c) {
          case '+':
              addition(a,b);
              break;
          case '-':
              substraction(a, b);
              break;
          case '*':
              multiplication(a, b);
              break;
          case '/':
              division(a, b);
              break;
      }
  }



}
