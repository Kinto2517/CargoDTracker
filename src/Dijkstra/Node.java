package Dijkstra;

import sample.MapsXY;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {

    private String name;
    private boolean selected = false;

    private MapsXY mapxy;

    private List<Node> shortestPath = new LinkedList<>();

    private Integer distance = Integer.MAX_VALUE;

    Map<Node, Integer> adjacentNodes = new HashMap<>();

    public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }

    public Node(String name,MapsXY mapxy) {
        this.name = name;
        this.mapxy = mapxy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    public MapsXY getMapxy() {
        return mapxy;
    }

    public void setLatLng(MapsXY mapxy) {
        this.mapxy = mapxy;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", latitude=" + mapxy.getLatitude() +
                ", longitude=" + mapxy.getLongitude() +
                '}';
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}