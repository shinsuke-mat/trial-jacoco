// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Main.java

import java.io.PrintStream;
import org.jacoco.agent.rt.internal_1f53a7b.Offline;

public class Main
{

    public Main()
    {
        boolean aflag[] = $jacocoInit();
        super();
        aflag[0] = true;
    }

    public static void main(String args[])
    {
        boolean aflag[] = $jacocoInit();
        Object o = null;
        aflag[1] = true;
        System.out.println(o);
        aflag[2] = true;
        o = new Object();
        aflag[3] = true;
        System.out.println(o);
        System.out.println(o);
        aflag[4] = true;
    }

    private static boolean[] $jacocoInit()
    {
        return $jacocoData == null && ($jacocoData = Offline.getProbes(0xf2010fff726d0e84L, "Main", 5)) == null ? $jacocoData : $jacocoData;
    }

    private static transient boolean $jacocoData[];
}
