package Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyGraph {

    int size;
    LinkedList<Integer>[]  edgesArray;

    public MyGraph(int size){
        this.size = size;
        edgesArray = new LinkedList[size];
        for(int i = 0; i < size; i++){
            edgesArray[i] = new LinkedList<Integer>();
        }
    }
    public void addEdge(int a, int b){
        if(a < 0 || b < 0 || a >= size || b >= size){
            return;
        }
        edgesArray[a].addFirst(b);
        edgesArray[b].addFirst(a);
    };
    public void BFS(int s){
        boolean[] visited = new boolean[size];
        visited[s] = true;
        LinkedList<Integer> que = new LinkedList<Integer>();
        que.add(s);
        while(!que.isEmpty()){
            s = que.poll();
            System.out.print(s+ " ");
            Iterator<Integer> i = edgesArray[s].listIterator(); // no of edges connected to that node
            while (i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    que.add(n);
                }
            }
        }
    }
    public void DFSUtil(int a , boolean[] visited){
        visited[a] = true;
        System.out.print(a+" ");
        Iterator<Integer> i = edgesArray[a].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if(!visited[n]){
                DFSUtil(n,visited);
            }
        }
    }
    public void DFS(int a){
        boolean[] visited = new boolean[size];
        DFSUtil(a,visited);
        // Call the recursive helper function to print DFS
        // traversal starting from all vertices one by one (unconnected nodes)
        for (int i = 0; i < size; ++i)
            if (visited[i] == false)
                DFSUtil(i, visited);
    }
    public void printGraph(){
        for(int i = 0; i < size; i++){
            System.out.println("\nAdjacency list of vertex " + i);
            System.out.print("head");
            for (int j = 0; j < edgesArray[i].size(); j++) {
                System.out.print(" -> "+edgesArray[i].get(j));
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        MyGraph graph = new MyGraph(6);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
//        graph.addEdge(4,5);
        graph.addEdge(2,4);
        graph.addEdge(1,0);
        graph.printGraph();
        graph.BFS(1);
        System.out.println();
        graph.DFS(5);

    }
}
