package Daalab;
import java.util.*;

public class DFS
{

    int V;


    LinkedList<Integer> adjList[];


    DFS(int v)
    {
        V = v;
        adjList = new LinkedList[v];
        for (int i=0; i<v; ++i)
        {
            adjList[i] = new LinkedList();
        }
    }


    void addEdgesToGraph(int v, int u)
    {
        adjList[v].add(u);
    }

    void DFTraversal(int v,int visited[])
    {
        visited[v] = 1;
        System.out.print(v + " ");
        Iterator<Integer> i = adjList[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (visited[n]==0)
                DFTraversal(n, visited);
        }
    }

    void DFSearch(int v)
    {

        int visited[] = new int[V];
        DFTraversal(v, visited);
        for (int i=1;i<V;i++)
        {
            if(visited[i]==0)
            {
                DFTraversal(i, visited);
            }
        }
    }
    public static void main(String args[])
    {
        DFS obj = new DFS(10);

        obj.addEdgesToGraph(1,2);
        obj.addEdgesToGraph(1,4);
        obj.addEdgesToGraph(2,5);
        obj.addEdgesToGraph(2,6);
        obj.addEdgesToGraph(4,7);
        obj.addEdgesToGraph(4,8);
        obj.addEdgesToGraph(3,9);
        obj.addEdgesToGraph(3,4);
        obj.addEdgesToGraph(4,3);

        obj.DFSearch(1);
    }
}