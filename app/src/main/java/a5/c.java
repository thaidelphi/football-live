package a5;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;
import n3.h;
import y5.q;
/* compiled from: BundleableUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {
    private c() {
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) p0.j(c.class.getClassLoader()));
        }
    }

    public static <T extends n3.h> y5.q<T> b(h.a<T> aVar, List<Bundle> list) {
        q.a j10 = y5.q.j();
        for (int i10 = 0; i10 < list.size(); i10++) {
            j10.a(aVar.a((Bundle) a.e(list.get(i10))));
        }
        return j10.h();
    }

    public static <T extends n3.h> SparseArray<T> c(h.a<T> aVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), aVar.a(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }
}
