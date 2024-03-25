/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw_1.pkg10;
import java.io.*;

/**
 *
 * @author Jginyue B760M
 */
public class Hw_110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Балковский Александр, РИБО-02-22, вариант 2");
        try {
            ReverseStringsToFile program = new ReverseStringsToFile();
            program.start();
        } catch (IOException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
    
}
