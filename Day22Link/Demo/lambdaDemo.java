package Demo;

import java.util.ArrayList;
import java.util.Collection;

public class lambdaDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("aaa");
        c.add("aaba");
        c.add("aada");

        c.forEach((String x)->{
            System.out.println(x);
        });

    }
}
