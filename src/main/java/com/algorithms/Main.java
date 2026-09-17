package com.algorithms;

public class Main {
    

    private Main(){}

    public static void createEdge(Node src, Node dest, int weight){
        src.edgeList.add(new Edge(dest, weight));
        dest.edgeList.add(new Edge(src, weight));
    }
}
