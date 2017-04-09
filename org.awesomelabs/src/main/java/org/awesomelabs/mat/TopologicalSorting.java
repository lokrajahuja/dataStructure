package org.awesomelabs.mat;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

import org.awesomelabs.graph.Graph;
import org.awesomelabs.graph.Vertex;

public class TopologicalSorting<T> {
	
	
	public static void main(String[] args) {
		Graph<Integer> graph = new Graph<>(true);
		 graph.addEdge(1, 3);
	        graph.addEdge(1, 2);
	        graph.addEdge(3, 4);
	        graph.addEdge(5, 6);
	        graph.addEdge(6, 3);
	        graph.addEdge(3, 8);
	        graph.addEdge(8, 11);
		TopologicalSorting<Integer> topologicalSorting = new TopologicalSorting<>();
		Deque<Vertex<Integer>> result = topologicalSorting.topSort(graph);
		while(!result.isEmpty()){
			System.out.println(result.poll().getId());
		}
	}

	private Deque<Vertex<T>> topSort(Graph<T> graph) {
		Deque<Vertex<T>> stack = new ArrayDeque<>();
		Set<Vertex<T>> visited = new HashSet<>();
		for(Vertex<T> vertex : graph.getAllVertex()){
			if(visited.contains(vertex))
				continue;
			topSortUtils(vertex, stack, visited);
		}
		return stack;
	}

	private void topSortUtils(Vertex<T> vertex, Deque<Vertex<T>> stack, Set<Vertex<T>> visited) {
		visited.add(vertex);
		for(Vertex<T> childVertex : vertex.getAdjacentVertices()){
			if(visited.contains(childVertex))
				continue;
			topSortUtils(childVertex, stack, visited);
		}
		stack.offerFirst(vertex);
	}
	

}
