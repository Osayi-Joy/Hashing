package hashTable;

public class Main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(15);
        directChaining.insertHashTable("The");
        directChaining.insertHashTable("Quick");
        directChaining.insertHashTable("Brown");
        directChaining.insertHashTable("Fox");
        directChaining.insertHashTable("Over");
//        directChaining.displayHashTable();
//        directChaining.searchHashTable("Over");
//        directChaining.deleteKeyHashTable("Fox");

        LinearProbing linearProbing = new LinearProbing(13);
        linearProbing.insertInHashTable("The");
        linearProbing.insertInHashTable("Quick");
        linearProbing.insertInHashTable("Brown");
        linearProbing.insertInHashTable("Fox");
        linearProbing.insertInHashTable("Over");
        linearProbing.displayHashTable();
        linearProbing.searchHashTable("Fox");
        linearProbing.deleteKeyHashTable("Over");
        linearProbing.displayHashTable();
    }
}