package com.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public List<Node> nodes = new ArrayList<>();

    private Main(){}

    public static void createEdge(Node src, Node dest, int weight){
        src.edgeList.add(new Edge(dest, weight));
        dest.edgeList.add(new Edge(src, weight));
        Collections.sort(src.edgeList);
        Collections.sort(dest.edgeList);
    }

    public static List<Node> createNode(String label, List<Node> nodes){
        nodes.add(new Node(label));
        return nodes;
    }
}
