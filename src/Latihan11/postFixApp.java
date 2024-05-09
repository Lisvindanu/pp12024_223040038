/*
 * Author : Lisvindanu
 */

package Latihan11;

import java.io.IOException;
import java.util.Scanner;

public class postFixApp {
    public static void main(String[] args) throws IOException {
        String input;
        int output;

        while(true) { // selama belum mencapai kondisi break, maka user akan diminta untuk melakukan input postfix
            System.out.println("Enter postfix : ");
            System.out.flush(); // dilakukan untuk membersihkan buffer (agar tidak terjadi error ketika menekan enter
            input = getString(); // memanggil fungsi getString yang didalamnya terdapat scanner untuk melakukan
            //input dari keyboard dan mengembalikan string
            if(input.equals("")) break;

            ParsePost aParser = new ParsePost(input); //Membuat objek baru dari kelas ParsePost dengan input sebagai argumen.
            // Objek ini akan digunakan untuk mem-parsing (menganalisis dan mengubah) ekspresi postfix.
            output = aParser.doParse();//emanggil metode doParse() pada objek aParser untuk melakukan parsing pada
            // ekspresi postfix dan menghitung hasilnya. Hasil ini kemudian disimpan dalam variabel output.
            System.out.println("Hasil operasi : " + output); // mencetak ke output
        }
    }

    public static String getString() throws IOException  {// membuat objek untuk membaca dan mengembalikan string input pengguna
        Scanner scanner = new Scanner(System.in); // Membuat objek baru dari kelas Scanner untuk membaca input
        String s = scanner.nextLine(); // Membaca baris berikutnya dari input pengguna
        return s; // mengembalikan nilai string
    }
}
