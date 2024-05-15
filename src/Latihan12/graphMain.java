/*
 * Author : Lisvindanu
 */

package Latihan12;

public class graphMain {
    public static void main(String[] args) {
//        Graph graph = new Graph(5);
//
//        graph.addVertex('A'); // 0 (start for dfs)
//        graph.addVertex('B'); // 1
//        graph.addVertex('C'); // 2
//        graph.addVertex('D'); // 3
//        graph.addVertex('E'); // 4
//
//        // menambahkan edge
//        graph.addEdge(0, 1);
//        graph.addEdge(1, 2);
//        graph.addEdge(0, 3);
//        graph.addEdge(3, 4);
//        graph.adjacenyMatrix();
//        System.out.println();

        Graph graph1 = new Graph(4);

        graph1.addVertex('A'); // 0
        graph1.addVertex('B'); // 1
        graph1.addVertex('C'); // 2
        graph1.addVertex('D'); // 3

        graph1.addEdge(0,1);
        graph1.addEdge(0,2);
        graph1.addEdge(0,3);
        graph1.addEdge(1,3);
        graph1.adjacenyMatrix();
//        System.out.println();
    }
}
