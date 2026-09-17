package com.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimmsMst {

    private PrimmsMst(){}

    public static List<Edge> findMst(List<Node> nodes, Node newNode, List<Edge> mst){
        List<Edge> totalEdgesAccessible = new ArrayList<>();
        int totalVisited = 1;
        newNode = nodes.get(0);
        newNode.visited = true;
        totalEdgesAccessible.addAll(newNode.edgeList);
        while(totalVisited<nodes.size()){

            Collections.sort(totalEdgesAccessible);

            boolean noNewEdge = true;
            for (int i = 0; i < totalEdgesAccessible.size(); i++) {
                if (!totalEdgesAccessible.get(i).dest.visited){
                    newNode = totalEdgesAccessible.get(i).dest;
                    mst.add(totalEdgesAccessible.get(i));
                    totalEdgesAccessible.remove(i);

                    newNode.visited = true;
                    totalVisited++;
                    
                    noNewEdge = false;
                    break;
                }
            }
            if (noNewEdge){
                break;
            }
            totalEdgesAccessible.addAll(newNode.edgeList);
        }
        return mst;   
    }
}
