package hashTable;

import java.util.ArrayList;

public class QuadraticProving {
    String [] hashTable;
    int usedCellNumber;
    QuadraticProving(int size){
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCIIHashFunction(String word, int M) {
        char ch[];
        ch = word.toCharArray();
        int i, sum;
        for (sum=0,i=0; i < word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    //Returns LoadFactor of HashTable
    public double getLoadFactor(){
        return usedCellNumber  *  1.0 / hashTable.length;
    }

    public void  rehashKeys(String word){
        ArrayList<String> data = new ArrayList<>();
        for(String s: hashTable){
            if(s != null){
                data.add(s);
            }
            data.add(word);
            hashTable  = new String[hashTable.length * 2];
            for(String str: data){
                //Inserting data into hashTable
                insertInHashTable(str);
            }
        }
    }

    public void insertInHashTable(String word){
        double loadFactor = getLoadFactor();
        if(loadFactor >= 0.75){
            rehashKeys(word);
        } else {
            int index = modASCIIHashFunction(word, hashTable.length);
            int counter = 0;
            for(int i = index; i < index + hashTable.length; i++){
                int newIndex = (index + (counter*counter)) % hashTable.length;
                if(hashTable[newIndex] == null){
                    hashTable[newIndex] = word;
                    System.out.println(word + " has been inserted successfully");
                    break;
                } else{
                    System.out.println(newIndex + " is already ocuppied. Trying the next one...");
                }
                counter++;
            }
        }
    }

    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("\nHashTable does not exists");
            return;
        } else {
            System.out.println("\n----------HashTable----------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + ", key:" + hashTable[i]);
            }
        }
    }


}
