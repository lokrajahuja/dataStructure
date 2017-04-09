package org.awesomelabs.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {

	private List<Edge<T>> allEdges;
	
	private Map<Integer, Vertex<T>> allVertex;
	
	private boolean isDirected;

	public List<Edge<T>> getAllEdges() {
		return allEdges;
	}

	public void setAllEdges(List<Edge<T>> allEdges) {
		this.allEdges = allEdges;
	}

	public Collection<Vertex<T>> getAllVertex() {
		return allVertex.values();
	}

	public void setAllVertex(Map<Integer, Vertex<T>> allVertex) {
		this.allVertex = allVertex;
	}

	public boolean isDirected() {
		return isDirected;
	}

	public void setDirected(boolean isDirected) {
		this.isDirected = isDirected;
	}
	
	public Graph(boolean isDirected) {
		super();
		allEdges = new ArrayList<>();
		allVertex = new HashMap<Integer, Vertex<T>>();
		this.isDirected = isDirected;
	}

	public void addEdge(int id1, int id2){
		addEdge(id1, id2, 0);
	}

	private void addEdge(int id1, int id2, int weight) {
		Vertex<T> v1 = null;
		if(allVertex.containsKey(id1)){
			v1 = allVertex.get(id1);
		}
		else{
			v1 = new Vertex<T>(id1);
			allVertex.put(id1, v1);
		}
		
		Vertex<T> v2 = null;
		if(allVertex.containsKey(id2)){
			v2 = allVertex.get(id2);
		}
		else{
			v2 = new Vertex<T>(id2);
			allVertex.put(id2, v2);
		}
		
		Edge<T> edge = new Edge<>(weight, v1, v2);
		allEdges.add(edge);
		v1.addAdjacentVertex(edge, v2);
		if(!isDirected){
			v2.addAdjacentVertex(edge, v1);
		}
	}
	
}
