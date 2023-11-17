package homework_week_9;

import java.util.ArrayList;

public class Programme_11_CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Red");
        c1.add("Red");
        c1.add("Red");
        c1.add("Red");
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Red");
        c2.add("Red");
        c2.add("Red");
        //Storing the comparison output in ArrayList <String>
        ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1)
            c3.add((c2.contains(e) ? "Yes" : "No"));
        System.out.println(c3);
    }
}
