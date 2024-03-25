/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_1.pkg10;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jginyue B760M
 */
public class ReverseStringsToFile {
     public void start() throws IOException {
         String currentDir = System.getProperty("user.dir");
         System.out.println("Текущая рабочая директория: " + currentDir);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки для записи в файл (для завершения введите 'exit'):");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
                String reversed = new StringBuilder(input).reverse().toString();
                writer.write(reversed);
                writer.newLine();
            }
            System.out.println("Строки успешно записаны в файл.");
        } finally {
            scanner.close();
        }
    }
}
