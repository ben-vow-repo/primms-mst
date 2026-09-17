package com.algorithms;

public class Edge implements Comparable<Edge> {
    public Node dest;
    public int weight;

    public Edge(Node dest, int weight){
        this.dest = dest;
        this.weight = weight;
    }
    @Override
    public int compareTo(Edge other){
        return Integer.compare(this.weight, other.weight);
    }
}
