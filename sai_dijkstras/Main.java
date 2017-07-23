package sai_dijkstras;

public class Main {
	public static void main(String[] args) {
	    Edge[] edges = {
	    		new Edge(0, 1, 4), new Edge(0, 3, 8), new Edge(1, 2, 3),
	    	      new Edge(2, 3, 4), new Edge(3, 4, 7)
	    };
	    Graph g = new Graph(edges);
	    g.calculateShortestDistances();
	    g.printResult(); // let's try it !
	  }
}
