package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba su nombre: ");

        String name = scanner.nextLine();
        sayHello(name);
    }

    private static void sayHello(String name) {
        System.out.println( "Hello World! " + name );
    }
}
