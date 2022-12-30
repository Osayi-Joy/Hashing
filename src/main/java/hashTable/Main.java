package hashTable;

public class Main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(15);
        directChaining.insertHashTable("The");
        directChaining.insertHashTable("Quick");
        directChaining.insertHashTable("Brown");
        directChaining.insertHashTable("Fox");
        directChaining.insertHashTable("Over");
        directChaining.displayHashTable();
        directChaining.searchHashTable("Over");
        directChaining.deleteKeyHashTable("Fox");

    }
}