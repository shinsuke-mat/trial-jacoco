// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Main.java

import java.io.PrintStream;
import org.jacoco.agent.rt.internal_28bab1d.Offline;

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
        Object obj = null;
        aflag[1] = true;
        System.out.println(obj);
        aflag[2] = true;
        obj = new Object();
        aflag[3] = true;
        System.out.println(obj);
        System.out.println(obj);
        int i = 0;
        aflag[4] = true;
        do
        {
            if(i >= 10)
            {
                aflag[5] = true;
                break;
            }
            i++;
            aflag[6] = true;
        } while(true);
        while(args.length > 1) 
        {
            aflag[7] = true;
            System.out.println(obj);
            aflag[8] = true;
        }
        aflag[9] = true;
    }

    private static boolean[] $jacocoInit()
    {
        return $jacocoData == null && ($jacocoData = Offline.getProbes(0x71ab4230afb332beL, "Main", 10)) == null ? $jacocoData : $jacocoData;
    }

    private static transient boolean $jacocoData[];
}
