package androidx.coordinatorlayout.widget;

import androidx.collection.h;
import androidx.core.util.f;
import androidx.core.util.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: DirectedAcyclicGraph.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<ArrayList<T>> f2427a = new g(10);

    /* renamed from: b  reason: collision with root package name */
    private final h<T, ArrayList<T>> f2428b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<T> f2429c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<T> f2430d = new HashSet<>();

    private void e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (!hashSet.contains(t10)) {
            hashSet.add(t10);
            ArrayList<T> arrayList2 = this.f2428b.get(t10);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(t10);
            arrayList.add(t10);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    private ArrayList<T> f() {
        ArrayList<T> b10 = this.f2427a.b();
        return b10 == null ? new ArrayList<>() : b10;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2427a.a(arrayList);
    }

    public void a(T t10, T t11) {
        if (this.f2428b.containsKey(t10) && this.f2428b.containsKey(t11)) {
            ArrayList<T> arrayList = this.f2428b.get(t10);
            if (arrayList == null) {
                arrayList = f();
                this.f2428b.put(t10, arrayList);
            }
            arrayList.add(t11);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void b(T t10) {
        if (this.f2428b.containsKey(t10)) {
            return;
        }
        this.f2428b.put(t10, null);
    }

    public void c() {
        int size = this.f2428b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> m7 = this.f2428b.m(i10);
            if (m7 != null) {
                k(m7);
            }
        }
        this.f2428b.clear();
    }

    public boolean d(T t10) {
        return this.f2428b.containsKey(t10);
    }

    public List g(T t10) {
        return this.f2428b.get(t10);
    }

    public List<T> h(T t10) {
        int size = this.f2428b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> m7 = this.f2428b.m(i10);
            if (m7 != null && m7.contains(t10)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2428b.i(i10));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f2429c.clear();
        this.f2430d.clear();
        int size = this.f2428b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f2428b.i(i10), this.f2429c, this.f2430d);
        }
        return this.f2429c;
    }

    public boolean j(T t10) {
        int size = this.f2428b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> m7 = this.f2428b.m(i10);
            if (m7 != null && m7.contains(t10)) {
                return true;
            }
        }
        return false;
    }
}
