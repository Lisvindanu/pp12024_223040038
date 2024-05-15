/*
 * Author : Lisvindanu
 */

package Latihan12;

public class Graph {
    private vertex vertexlist[]; // membuat atribut array dari kelas vertex untuk simpul
    private int adjMat[][];//adjaceny matrix
    private int nVerts; // current number of vertices *nb. vertices = simpul

    public Graph(int maxVerts) {
        vertexlist = new vertex[maxVerts];
        //adjaceny matrix
        adjMat = new int[maxVerts] [maxVerts];
        nVerts = 0;
        for (int i = 0; i < maxVerts; i++) {
            for (int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(char lab) {
        vertexlist[nVerts++] = new vertex(lab);
//        System.out.println(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void adjacenyMatrix() {
        //cetak label kolom
        System.out.print("   ");
        for(int i = 0; i < nVerts; i ++) {
            System.out.print(vertexlist[i].getLabel() + " ");
        }
        System.out.println();



        for(int i = 0; i < adjMat.length; i++) {
            System.out.print(vertexlist[i].getLabel() + "  ");
            for (int j = 0; j< adjMat[0].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
