package ru.sapteh.utils;//import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Random;
import java.util.Random;
import java.util.Scanner;
//import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        game();
    }
      public static void game() {
          Scanner scanner = new Scanner(System.in);
          System.out.println("введите знак операции '/','+','-','*'");
          String input = scanner.nextLine();
          System.out.println("введите первое число");
          int a = scanner.nextInt();
          System.out.println("введите второе число");
          int b = scanner.nextInt();
          if (input.equals("/")){
              int res = a / b;
              System.out.println("результат деления: "+ res);
          }else if (input.equals("+")){
              int res = a + b;
              System.out.println("результат сложения " +res);
          }else if(input.equals("-")){
              int res = a - b;
              System.out.println("результат сложения "+ res);
          }else if (input.equals("*")){
              int res = a * b;
              System.out.println("результат умножения "+ res);

          }
      }
}





