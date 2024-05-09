/*
 * Author : Lisvindanu
 */

package Latihan11;

public class MyStack extends AbstractStack {
    public MyStack (int capacity) {
        super(capacity);
    }

    // membuat method untuk menampilkan elemen elemen pada stack, method ini menerima satu argumen
    // yaitu s yang bertipe data string kemudian mencetak semua elemen pada stack dari bawah ke atas

    public void displayStack(String s) {
        System.out.println(s);
        System.out.print("Stack (bottom-->: ");
        for(int i = 0; i < size(); i++) {
            // melakukan looping setiap elemen di stack yang berjalan dari 0 hingga jumlah elemen pada stack
            System.out.print(peekN(i)); // peekN(i) = untuk setiap iterasi, method ini dipanggil dengan i sebagai
            // argumen yang akan me return elemen pada posisi i di stack kemudian mencetak nilai tersebut
            System.out.print(' ');
        }
        System.out.println("");
    }

    //method untuk melihat elemen pada indeks
    public int peekN(int n) {
        return arr[n]; //mengembalikan elemen pada indeks n
    }
}
