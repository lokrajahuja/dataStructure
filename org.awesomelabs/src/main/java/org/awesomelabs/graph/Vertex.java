package org.awesomelabs.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
	
	private int id;
	
	private T data;
	
	private List<Edge<T>> edges = new ArrayList<>();
	
	private List<Vertex<T>> adjacentVertices = new ArrayList<>();
	

	public Vertex(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<Edge<T>> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge<T>> edges) {
		this.edges = edges;
	}

	public List<Vertex<T>> getAdjacentVertices() {
		return adjacentVertices;
	}

	public void setAdjacentVertices(List<Vertex<T>> adjacentVertices) {
		this.adjacentVertices = adjacentVertices;
	}
	
	public void addAdjacentVertex(Edge<T> edge,Vertex<T> vertex){
		edges.add(edge);
		adjacentVertices.add(vertex);
	}
	
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
