package org.java.javaInputOutput;

import java.io.*;

public class BufferedReader {
    public static void main(String[] args) {

//        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            bw.write("Hello, World!");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("source.txt");
             FileOutputStream fos = new FileOutputStream("destination.txt")) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileWriter fw = new FileWriter("example.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Appending data");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
