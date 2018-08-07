package com.mycompany.test;

public class Calculator{

  public static void main(String[] args){
    itn a = 4;
    int b = 2;
    Systemp.out.println(sum(a,b));
    Systemp.out.println(minus(a,b));
  }

  private static int sum(int a, int b){
    return a+b;
  }

  private static int minus(int a, int b){
    return a-b;
  }
}
