public class TreeConcept {

    int[] id;

    public void quickFind(int size) {

        id = new int[size];
        for(int i=0; i<size; i++) {
            id[i] = i;
        }
    }

    public int root(int p) {

        while(id[p]!=p) p=id[p];
        return p;
    }

    public void union(int p, int q) {

        id[root(p)] = id[root(q)];
    }

    public void connected(int p, int q) {

        if(root(p) == root(q)) System.out.println("Connected");
        else System.out.println("Not connected");
    }
}
