package HashTable;

public class MyHashMapMain {

    public static void main(String[] args) {

        String sentence = "Paranoid are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations" ;
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split( " ");
        for (String word : words) {
            Integer value =  myHashMap.get(word);
            if(value == null) {
                value =1;
            }
            else {
                value = value + 1;
            }
            myHashMap.add(word, value);

        }
        myHashMap.remove("avoidable");
        System.out.println(myHashMap);
        int frequency = myHashMap.get("paranoid");
        System.out.println("Frequency of paranoid is: "+frequency);


    }
}
