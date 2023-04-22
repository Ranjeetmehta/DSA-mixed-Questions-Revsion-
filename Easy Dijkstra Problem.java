https://course.acciojob.com/idle?question=5d8035f8-c8b0-4ceb-9057-90204aafb3f0




import java.util.*;

class Node {
    int v, wt;
    Node(int v, int wt) {
        this.v = v;
        this.wt = wt;
    }
}

class Graph {
    ArrayList<ArrayList<Node>> g = new ArrayList<>();
    Graph(int n) {
        for(int i=0; i<n; i++){
            g.add(new ArrayList<>());
        }
    }
    void addNode(int u, int v, int wt) {
        g.get(u).add(new Node(v, wt));
    }

    void findPath(int start, int end) {
        int n = g.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {
            public int compare(Node node1, Node node2) {
                return node1.wt - node2.wt;
            }
        });
        pq.offer(new Node(start, 0));
        while(!pq.isEmpty()) {
            Node cur = pq.poll();
            int u = cur.v;
            int d = cur.wt;
            if(u == end) {
                break;
            }
            if(d > dist[u]) {
                continue;
            }
            for(Node nxt : g.get(u)) {
                int v = nxt.v;
                int w = nxt.wt;
                if(dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                    pq.offer(new Node(v, dist[v]));
                }
            }
        }
        if(dist[end] == Integer.MAX_VALUE) {
            System.out.println("NO");
        } else {
            System.out.println(dist[end]);
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        Graph g = new Graph(n);
        for(int i=0; i < m; i++){
            int u = input.nextInt(), v = input.nextInt();
            int wt = input.nextInt();
            g.addNode(u-1, v-1, wt);
        }
        int start = input.nextInt() - 1, end = input.nextInt() - 1;
        g.findPath(start, end);
    }
}
