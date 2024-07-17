import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //Using Arrays
        System.out.println("..................................");
        System.out.println("................Using Array Concept..................");
        System.out.println("..................................");
        ArrayConcept arrConnec = new ArrayConcept();
        System.out.print("Enter the number of vertices: ");
        int verticesCount = Integer.parseInt(bufferedReader.readLine().trim());
        arrConnec.quickFind(verticesCount);
        System.out.print("Enter the number of unions to perform: ");
        int unionCount = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=0; i<unionCount; i++) {
            List<Integer> vertices = Arrays.stream(bufferedReader.readLine().trim().split(" ")).map(Integer::parseInt).toList();
            arrConnec.union(vertices.get(0), vertices.get(1));
        }
        System.out.println("..................................");
        System.out.print("Enter the number of connection check to perform: ");
        int connectionCheckCount = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=0; i<connectionCheckCount; i++) {
            List<Integer> vertices = Arrays.stream(bufferedReader.readLine().trim().split(" ")).map(Integer::parseInt).toList();
            arrConnec.connected(vertices.get(0), vertices.get(1));
        }
        System.out.println("..................................");


        //Using Trees
        System.out.println("..................................");
        System.out.println("................Using Tree Concept..................");
        System.out.println("..................................");
        TreeConcept treeConnec = new TreeConcept();
        System.out.print("Enter the number of vertices: ");
        verticesCount = Integer.parseInt(bufferedReader.readLine().trim());
        treeConnec.quickFind(verticesCount);
        System.out.print("Enter the number of unions to perform: ");
        unionCount = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=0; i<unionCount; i++) {
            List<Integer> vertices = Arrays.stream(bufferedReader.readLine().trim().split(" ")).map(Integer::parseInt).toList();
            treeConnec.union(vertices.get(0), vertices.get(1));
        }
        System.out.println("..................................");
        System.out.print("Enter the number of connection check to perform: ");
        connectionCheckCount = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=0; i<connectionCheckCount; i++) {
            List<Integer> vertices = Arrays.stream(bufferedReader.readLine().trim().split(" ")).map(Integer::parseInt).toList();
            treeConnec.connected(vertices.get(0), vertices.get(1));
        }
        System.out.println("..................................");
        bufferedReader.close();
    }
}