import org.jacoco.agent.rt.internal_28bab1d.Offline;

// 
// Decompiled by Procyon v0.5.36
// 

public class Main
{
    private static transient /* synthetic */ boolean[] $jacocoData;
    
    public Main() {
        final boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
    }
    
    public static void main(final String[] array) {
        final boolean[] $jacocoInit = $jacocoInit();
        final Object x = null;
        $jacocoInit[1] = true;
        System.out.println(x);
        $jacocoInit[2] = true;
        final Object x2 = new Object();
        $jacocoInit[3] = true;
        System.out.println(x2);
        System.out.println(x2);
        int i = 0;
        $jacocoInit[4] = true;
        while (i < 10) {
            ++i;
            $jacocoInit[6] = true;
        }
        $jacocoInit[5] = true;
        while (array.length > 1) {
            $jacocoInit[7] = true;
            System.out.println(x2);
            $jacocoInit[8] = true;
        }
        if (array.length > 0) {
            $jacocoInit[9] = true;
        }
        else {
            $jacocoInit[10] = true;
        }
        $jacocoInit[11] = true;
        System.out.println("");
        $jacocoInit[12] = true;
    }
    
    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] $jacocoData;
        if (($jacocoData = Main.$jacocoData) == null) {
            $jacocoData = (Main.$jacocoData = Offline.getProbes(5532109654634685188L, "Main", 13));
        }
        return $jacocoData;
    }
}
