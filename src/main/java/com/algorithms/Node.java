package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public String label;
    public List<Edge> edgeList;
    public Boolean visited;

    public Node(String label){
        this.label = label;
        this.edgeList = new ArrayList<>();
        this.visited = false;
    }
}
