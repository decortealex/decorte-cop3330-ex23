/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */

import java.util.Scanner;

public class App {
    public static void troubleShootCar(Scanner input) {
        String answerBuf;

        System.out.print("Is the car silent when you turn the key? ");
        if(input.nextLine().equalsIgnoreCase("y")) {

            System.out.print("Are the battery terminals corroded? ");
            if(input.nextLine().equalsIgnoreCase("y")) {

                System.out.println("Clean terminals and try starting again.");

            } else {

                System.out.println("Replace cables and try again.");

            }
        } else {
            System.out.print("Does the car make a slicking noise? ");
            if(input.nextLine().equalsIgnoreCase("y")) {

                System.out.println("Replace the battery.");

            } else {

                System.out.print("Does the car crank up but fail to start? ");
                if(input.nextLine().equalsIgnoreCase("y")) {

                    System.out.println("Check spark plug connections.");

                } else {

                    System.out.print("Does the engine start then die? ");
                    if(input.nextLine().equalsIgnoreCase("y")) {

                        System.out.print("Does your car have fuel injection? ");
                        if(input.nextLine().equalsIgnoreCase("y")) {

                            System.out.println("Get it in for service");
                        } else {

                            System.out.println("Check to ensure the choke is opening and closing.");
                        }

                    } else {
                        System.out.println("This should not be possible. just scrap your car at this point");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        troubleShootCar(in);
    }
}
