/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] arrstring) {
        int n2;
        Object object = null;
        System.out.println(object);
        object = new Object();
        System.out.println(object);
        System.out.println(object);
        for (n2 = 0; n2 < 10; ++n2) {
        }
        while (arrstring.length > 1) {
            System.out.println(object);
        }
        n2 = arrstring.length > 0 ? 99 : 999;
        System.out.println("");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.forEach(n -> System.out.println(n));
        arrayList.stream().filter(n -> n > 3).forEach(n -> System.out.println(n));
    }
}
