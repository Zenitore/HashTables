import java.util.HashMap;

public class HashTablesDriver {
    public static void main(String[] args) {
        HashTables h = new HashTables(60000000);
        System.out.println(h.put("hi", "hello"));
        System.out.println(h.get("hi"));
    }
}
