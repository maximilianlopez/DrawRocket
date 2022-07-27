//*******************************************************************
//
//   File: DrawRocket.java          
//
//   Author: maximilian      
//
//   Class: DrawRocket
// 
//   
//   
//      This program prints scalable ASCII rockets.
//
//*******************************************************************

public class DrawRocket {
    public static void main(String[] args){
        drawRocket(3);
        drawRocket(5);
    }

    //Draws Rocket.
    public static void drawRocket(int size){
        drawTopRocket(size);
        drawBorderRocket(size);
        drawUpCarrotsRocket(size);
        drawDownCarrotsRocket(size);
        drawBorderRocket(size);
        drawDownCarrotsRocket(size);
        drawUpCarrotsRocket(size);
        drawBorderRocket(size);
        drawTopRocket(size);
    }
    
    //Repeat method that helps keep code clean and legible.
    public static void repeat(int times, String p){
         for (int i = 1; i <= times; i++)
         System.out.print(p);
    }
    
    //Draws top and bottom parts of rocket.
    public static void drawTopRocket(int size){
    int topRocketFigure = 2 * size - 1;
       for (int i= 1; i <= topRocketFigure; i++){
        repeat(topRocketFigure-i, " ");
        repeat(i, "/");
        System.out.print("**");
        repeat(i, "\\");
        System.out.print("\n");
       }
    }

    //Draws border/separator piece between parts of the rocket.
    public static void drawBorderRocket(int size){
        System.out.print("+");
        repeat(size * 2, "=*");
        System.out.print("+");
        System.out.print("\n");
    }

    //Draws the "/\" or "upward carrot" halves of the rocket.
    public static void drawUpCarrotsRocket(int size){
        for (int i = 1; i <= size; i++){
            System.out.print("|");
            for (int b = 1; b <= 2; b++){
                repeat(size-i, ".");
                repeat(i, "/\\");
                repeat(size-i, ".");
            }
            System.out.print("|\n");
            }    
    System.out.print("\n");
    }

    //Draws "\/" or "downward carrot" halves of the rocket.
    public static void drawDownCarrotsRocket(int size){
        for (int i = 1; i <= size; i++){
            System.out.print("|");
            for (int b = 1; b <= 2; b++){
            repeat(i-1, ".");
            repeat(size-(i-1), "\\/");
            repeat(i-1, ".");}
            System.out.print("|\n");
        }    
    System.out.print("\n");
    }

} //end of DrawRocket class
