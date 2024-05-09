/*
 * Author : Lisvindanu
 */

package Latihan11;

public class ParsePost {

    //mendeklarasikan variabel stack dan input dari tipe MyStack dan String
    private MyStack stack;
    public  String input;


//membuat konstruktor yang menginisialisasi variabel input dengan nilai argumen input
    public ParsePost(String input) {
        super();
        this.input = input;
    }

    //membuat method untuk melakukan parsing ekspresi postfix
    public int doParse() {
        stack = new MyStack(20); // membuat objek stak baru dengan kapasitas 20
        // deklarasi variable char, i dan variable untuk menyimpan dua bilandan dan hasil operasi
        char ch; // menampung nilai karakter yang akan digunakan sebagai operator
        int i;
        int bill1, bill2, hasilOps;
        for (i = 0; i < input.length(); i++) { // loop untuk setiap karakter yang di input
            ch = input.charAt(i); // mengambil karakter pada posisi i
            stack.displayStack("" + ch + " "); // menampilkan stack saat ini

            if (ch >= '0' && ch <= '9') {// jika karakter yang di inputkan angka maka akan mengubah karakter menjadi angka dan memasukkannya kedalam stack
                stack.push((int) (ch - '0'));
            } else {
                //jika karakter = operator maka akan melakukan operasi berdasarkan operator dan melakukan operasi matematika sesuai dengan operator yang digunakan
                switch (ch) {
                    case '*':
                    case '/':
                        bill2 = stack.pop();
                        bill1 = stack.pop();
                        if(ch == '*') {
                            hasilOps = bill1 * bill2;
                        } else {
                            hasilOps = bill1 / bill2;
                        }
                        stack.push(hasilOps); // memasukkan hasil operasi ke stack
                        break;
                    case '+':
                    case '-':
                        bill2 = stack.pop();
                        bill1 = stack.pop();
                        if (ch == '+') {
                            hasilOps = bill1 + bill2;
                        } else {
                            hasilOps = bill1 - bill2;
                        }
                        stack.push(hasilOps);// memasukkan hasil operasi ke stack
                        break;
                    default:
                        System.out.println("Invalid operator " + ch);
                        return -1; // mengembalikan nilai -1 jika operator tidak valid
                }
            }
        }
        hasilOps =stack.pop(); // mengambil hasil akhir operasi dari stack
        return hasilOps; // mengembalikan hasil akhir operasi
    }

}
