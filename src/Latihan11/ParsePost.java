/*
 * Author : Lisvindanu
 */

package Latihan11;

public class ParsePost {
    private MyStack stack;
    public  String input;

    public ParsePost(String input) {
        super();
        this.input = input;
    }

    public int doParse() {
        stack = new MyStack(20);
        char ch;
        int i;
        int bill1, bill2, hasilOps;
        for (i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            stack.displayStack("" + ch + " ");

            if (ch >= '0' && ch <= '9') {
                stack.push((int) (ch - '0'));
            } else {
                bill2 = stack.pop();
                bill1 = stack.pop();
                switch (ch) {
                    case '+': hasilOps = bill1 + bill2;
                    break;
                    case '-': hasilOps = bill2 - bill1;
                    break;
                    case '*': hasilOps = bill1 * bill2;
                    break;
                    case '/' : hasilOps = bill2 / bill1;
                    break;
                    default: hasilOps = 0;
                }
                stack.push(hasilOps);
            }
        }
        hasilOps =stack.pop();
        return hasilOps;
    }

}
