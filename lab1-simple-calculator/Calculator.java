package Calculator;

import java.util.Scanner;

import java.util.Stack;
/*
    Implement Calculor with a stack of doubles
    Works only with a stack 2 items deep
    Further enchancements would allow for a deeper stack

    Use
    enter a #.  (y)
    enter another # (x)
    enter either op ( operator + , - . * l / ( plus ,minus , multiply . divide)
    answer results will be y op x

    x


 */


public class Calculator {


    public void Calculator(){


    }

    public void input (){

        Scanner scan = new Scanner(System.in);
        Stack <Double> stacker;

        double total=0;
        String v,op;
        double x,y=0.0;

        stacker = new Stack<>();

        do{
            System.out.println("> ");
            v = scan.nextLine( );
            System.out.println( v );
            switch(v){
                case "+":
                    x = stacker.pop();              // take a value off stack
                    y = stacker.pop();              // take another one (higher in stack)
                    total = x+y;                    // do the operation
                    stacker.push( x+y);        // push back onto stack (x,y no longer on stack)
                    System.out.println(">" + total );

                    break;

                case "-":
                    x = stacker.pop();
                    y = stacker.pop();
                    total = y-x;                      // order matters

                    stacker.push( total );
                    System.out.println(">" + total );

                    break;

                case "*":
                    x = stacker.pop();
                    y = stacker.pop();
                    total = y*x;
                    stacker.push( total );
                    System.out.println(">" + total );


                    break;
                case "/":
                    x = stacker.pop();
                    y = stacker.pop();
                    total = y/x;                            // order matters
                    stacker.push( total );
                    System.out.println(">" + total );

                    break;

                case "q":;
                    System.out.println(" "  );
                    System.out.println("total = " + total );
                    System.out.println("" + total );

                    break;

                case "s":
                    System.out.println("show Stack" + stacker.peek() );
                    System.out.println("stacker " + stacker);

                    break;
                default: // push number onto stack
                    x = Double.parseDouble(  v );


                    stacker.push( x );
                    System.out.println("> " + x);


            }

        }while( !(v.startsWith("q")) );

    }
}



