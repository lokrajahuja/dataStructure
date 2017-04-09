package org.awesomelabs.graph;

public class Edge<T> {
	
	private boolean isDirected = false;
	
	private int weight;
	
	private Vertex<T> vertex1;
	
	private Vertex<T> vertex2;

	public Edge(boolean isDirected, int weight, Vertex<T> vertex1, Vertex<T> vertex2) {
		super();
		this.isDirected = isDirected;
		this.weight = weight;
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
	}

	public Edge(Vertex<T> vertex1, Vertex<T> vertex2) {
		super();
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
	}
	
	public Edge(int weight, Vertex<T> vertex1, Vertex<T> vertex2) {
		super();
		this.weight = weight;
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
	}



	public boolean isDirected() {
		return isDirected;
	}

	public void setDirected(boolean isDirected) {
		this.isDirected = isDirected;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Vertex<T> getVertex1() {
		return vertex1;
	}

	public void setVertex1(Vertex<T> vertex1) {
		this.vertex1 = vertex1;
	}

	public Vertex<T> getVertex2() {
		return vertex2;
	}

	public void setVertex2(Vertex<T> vertex2) {
		this.vertex2 = vertex2;
	}
	
}
