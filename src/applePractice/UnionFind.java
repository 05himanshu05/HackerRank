package applePractice;

public class UnionFind {

    int[] parent;
    int[] rank;
    int count;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        count = n;

        for (int i = 0; i < n; i++) parent[i] = i;
    }

    public int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]); // path compression
        return parent[x];
    }

    public void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if (pa != pb) {
            if (rank[pa] > rank[pb]) parent[pb] = pa;
            else if (rank[pa] < rank[pb]) parent[pa] = pb;
            else {
                parent[pb] = pa;
                rank[pa]++;
            }
            count--;
        }
    }
}
