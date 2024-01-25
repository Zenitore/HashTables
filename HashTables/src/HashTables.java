import java.lang.reflect.Array;

public class HashTables {

    String a[];
    //initializes an array of size capacity
    public HashTables(int capacity){
        a = new String[capacity];
        for(int i = 0; i<a.length;i++){
            a[i]=" ";
        }
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        if(a.length<= hashCode(key)){
            grow(hashCode(key));
            if (!a[hashCode(key)].equals(" ")){
                return false;
            }
            else {
                a[hashCode(key)] = value;
                return true;
            }
        }
        else {
            if (!a[hashCode(key)].equals(" ")) {
                return false;
            } else {
                a[hashCode(key)] = value;
                System.out.println(a[hashCode(key)]);
                return true;
            }
        }
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){
        return a[hashCode(key)];
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key){
        int total = 0;
        for (int i = 0; i<key.length(); i++){
            int shrinker = (int)'0';
            int outputNum = (key.charAt(i)-shrinker)%587;
            total+=outputNum;
        }
        return total;
    }
    private void grow(int index){
        String b[] = new String[index];
        for(int i = 0; i<a.length;i++){
            b[i] = a[i];
        }
        a=b;
    }

}
