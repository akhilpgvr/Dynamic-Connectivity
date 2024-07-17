public class ArrayConcept {

    int[] id = new int[10];

    public void quickFind(int size) {

        //creating an array of given size
        for(int i=0; i<size; i++) {
            id[i] = i;
        }
    }

    public void connected(int p, int q) {

        //checking all values are
        if(id[p] == id[q]) System.out.println("Connected");
        else System.out.println("Not Connected");
    }

    public void union(int p, int q) {

        int pId = id[p];
        int qId = id[q];
        for(int i=0; i<id.length; i++) {
            if(id[i] == pId) id[i] = qId; //changing all pid values to qid
        }
    }
}
