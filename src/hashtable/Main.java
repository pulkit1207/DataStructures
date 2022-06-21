package hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 1000);
        myHashTable.set("bolts", 2000);
        myHashTable.set("lumber", 1500);
        myHashTable.set("tiles", 800);
        myHashTable.set("screws", 500);
        myHashTable.printHashTable();
        System.out.println();

        System.out.println(myHashTable.get("screws"));
        System.out.println();

        System.out.println(myHashTable.keys());
    }
}
