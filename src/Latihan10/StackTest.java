/*
 * Author : Lisvindanu
 */

package Latihan10;

public class StackTest {

    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);
        System.out.println("#Sebelum Push");
        stack.display();
        System.out.println();

        StrukturStack stack1 = new StrukturStack(3);
        System.out.println("Sesudah Push");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.display();
        System.out.println();


        System.out.println("Pengujian pop");
        stack.pop();
        stack.display();
        System.out.println();
        stack.pop();
        stack.display();
        System.out.println();
        stack.pop();
        stack.display();
        System.out.println();
        stack.pop();
        stack.display();

    }
}
