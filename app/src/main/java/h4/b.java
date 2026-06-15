package h4;

import a5.p0;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import y5.t;
/* compiled from: BaseUrlExclusionList.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Long> f26211a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, Long> f26212b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<List<Pair<String, Integer>>, i4.b> f26213c;

    /* renamed from: d  reason: collision with root package name */
    private final Random f26214d;

    public b() {
        this(new Random());
    }

    private static <T> void b(T t10, long j10, Map<T, Long> map) {
        if (map.containsKey(t10)) {
            j10 = Math.max(j10, ((Long) p0.j(map.get(t10))).longValue());
        }
        map.put(t10, Long.valueOf(j10));
    }

    private List<i4.b> c(List<i4.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.f26211a);
        h(elapsedRealtime, this.f26212b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            i4.b bVar = list.get(i10);
            if (!this.f26211a.containsKey(bVar.f26516b) && !this.f26212b.containsKey(Integer.valueOf(bVar.f26517c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(i4.b bVar, i4.b bVar2) {
        int compare = Integer.compare(bVar.f26517c, bVar2.f26517c);
        return compare != 0 ? compare : bVar.f26516b.compareTo(bVar2.f26516b);
    }

    public static int f(List<i4.b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f26517c));
        }
        return hashSet.size();
    }

    private static <T> void h(long j10, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    private i4.b k(List<i4.b> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += list.get(i11).f26518d;
        }
        int nextInt = this.f26214d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i4.b bVar = list.get(i13);
            i12 += bVar.f26518d;
            if (nextInt < i12) {
                return bVar;
            }
        }
        return (i4.b) t.c(list);
    }

    public void e(i4.b bVar, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f26516b, elapsedRealtime, this.f26211a);
        int i10 = bVar.f26517c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), elapsedRealtime, this.f26212b);
        }
    }

    public int g(List<i4.b> list) {
        HashSet hashSet = new HashSet();
        List<i4.b> c10 = c(list);
        for (int i10 = 0; i10 < c10.size(); i10++) {
            hashSet.add(Integer.valueOf(c10.get(i10).f26517c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f26211a.clear();
        this.f26212b.clear();
        this.f26213c.clear();
    }

    public i4.b j(List<i4.b> list) {
        List<i4.b> c10 = c(list);
        if (c10.size() < 2) {
            return (i4.b) t.b(c10, null);
        }
        Collections.sort(c10, new Comparator() { // from class: h4.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d10;
                d10 = b.d((i4.b) obj, (i4.b) obj2);
                return d10;
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = c10.get(0).f26517c;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            i4.b bVar = c10.get(i11);
            if (i10 != bVar.f26517c) {
                if (arrayList.size() == 1) {
                    return c10.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar.f26516b, Integer.valueOf(bVar.f26518d)));
                i11++;
            }
        }
        i4.b bVar2 = this.f26213c.get(arrayList);
        if (bVar2 == null) {
            i4.b k10 = k(c10.subList(0, arrayList.size()));
            this.f26213c.put(arrayList, k10);
            return k10;
        }
        return bVar2;
    }

    b(Random random) {
        this.f26213c = new HashMap();
        this.f26214d = random;
        this.f26211a = new HashMap();
        this.f26212b = new HashMap();
    }
}
