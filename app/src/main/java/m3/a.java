package m3;

import android.util.SparseArray;
import java.util.HashMap;
import z2.d;
/* compiled from: PriorityMapping.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f27690a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<d, Integer> f27691b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f27691b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f27691b.put(d.VERY_LOW, 1);
        f27691b.put(d.HIGHEST, 2);
        for (d dVar : f27691b.keySet()) {
            f27690a.append(f27691b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f27691b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f27690a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
