class Graph {
    List<List<int []>> adjlist ;

    public Graph(int n, int[][] edges) {
        adjlist = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            adjlist.add(new ArrayList<>());
        }
        for(int []edge:edges){
            addEdge(edge);
        }
        
    }
    
    public void addEdge(int[] edge) {
        int []edgeArray = {edge[1],edge[2]};
        adjlist.get(edge[0]).add(edgeArray);
        
    }
    
    public int shortestPath(int node1, int node2) {
      
        return dijkstra(node1,node2);
        
    }
    private int dijkstra(int start,int end){
        int n = adjlist.size();
        int [] distances = new int [n];
        Arrays.fill(distances,Integer.MAX_VALUE);
        distances[start]=0;
         PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        priorityQueue.add(new int[]{0, start});

        while (!priorityQueue.isEmpty()) {
            int[] current = priorityQueue.poll();
            int currentNode = current[1], currentCost = current[0];

            // Skip if a shorter path has already been found
            if (currentCost > distances[currentNode])
                continue;

            // If found the target return the cost
            if(currentNode == end)
                return currentCost;

            // Explore neighbors and update distances
            for (int[] edge : adjlist.get(currentNode)) {
                int neighbor = edge[0], edgeLength = edge[1];
                int newRouteCost = edgeLength + distances[currentNode];

                // Update distance if a shorter route is found
                if (distances[neighbor] > newRouteCost) {
                    distances[neighbor] = newRouteCost;
                    priorityQueue.add(new int[]{newRouteCost, neighbor});
                }
            }
    }
     return ((distances[end] == Integer.MAX_VALUE) ? -1 : distances[end]);
    }
}


/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */