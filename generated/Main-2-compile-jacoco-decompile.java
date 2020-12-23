/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.jacoco.agent.rt.internal_f3994fa.Offline
 */
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import org.jacoco.agent.rt.internal_f3994fa.Offline;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class Main {
    public Main() {
        boolean[] arrbl =  /* dynamic constant */ (boolean[])Main.$jacocoInit("$jacocoData", MethodHandles.lookup(), "$jacocoInit", Main.class);
        arrbl[0] = true;
    }

    public static void main(String[] arrstring) {
        int n2;
        boolean[] arrbl =  /* dynamic constant */ (boolean[])Main.$jacocoInit("$jacocoData", MethodHandles.lookup(), "$jacocoInit", Main.class);
        Object object = null;
        arrbl[1] = true;
        System.out.println(object);
        arrbl[2] = true;
        object = new Object();
        arrbl[3] = true;
        System.out.println(object);
        System.out.println(object);
        int n3 = 0;
        arrbl[4] = true;
        while (true) {
            if (n3 >= 10) {
                arrbl[5] = true;
                break;
            }
            ++n3;
            arrbl[6] = true;
        }
        while (arrstring.length > 1) {
            arrbl[7] = true;
            System.out.println(object);
            arrbl[8] = true;
        }
        if (arrstring.length > 0) {
            n2 = 99;
            arrbl[9] = true;
        } else {
            n2 = 999;
            arrbl[10] = true;
        }
        n3 = n2;
        arrbl[11] = true;
        System.out.println("");
        arrbl[12] = true;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrbl[13] = true;
        arrayList.add(5);
        arrbl[14] = true;
        arrayList.add(9);
        arrbl[15] = true;
        arrayList.add(8);
        arrbl[16] = true;
        arrayList.add(1);
        arrbl[17] = true;
        arrayList.forEach(n -> {
            boolean[] arrbl =  /* dynamic constant */ (boolean[])Main.$jacocoInit("$jacocoData", MethodHandles.lookup(), "$jacocoInit", Main.class);
            System.out.println(n);
            arrbl[25] = true;
        });
        arrbl[18] = true;
        arrbl[19] = true;
        arrbl[20] = true;
        arrayList.stream().filter(n -> {
            boolean bl;
            boolean[] arrbl =  /* dynamic constant */ (boolean[])Main.$jacocoInit("$jacocoData", MethodHandles.lookup(), "$jacocoInit", Main.class);
            if (n > 3) {
                bl = arrbl[22] = true;
            } else {
                bl = false;
                arrbl[23] = true;
            }
            arrbl[24] = true;
            return bl;
        }).forEach(n -> {
            boolean[] arrbl =  /* dynamic constant */ (boolean[])Main.$jacocoInit("$jacocoData", MethodHandles.lookup(), "$jacocoInit", Main.class);
            System.out.println(n);
            arrbl[25] = true;
        });
        arrbl[21] = true;
    }

    private static /* synthetic */ boolean[] $jacocoInit(MethodHandles.Lookup lookup, String string, Class class_) {
        return Offline.getProbes((long)-935557473720631820L, (String)"Main", (int)26);
    }
}
