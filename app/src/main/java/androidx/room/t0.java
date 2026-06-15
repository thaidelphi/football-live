package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: RoomSQLiteQuery.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t0 implements v0.j, v0.i {

    /* renamed from: i  reason: collision with root package name */
    static final TreeMap<Integer, t0> f4283i = new TreeMap<>();

    /* renamed from: a  reason: collision with root package name */
    private volatile String f4284a;

    /* renamed from: b  reason: collision with root package name */
    final long[] f4285b;

    /* renamed from: c  reason: collision with root package name */
    final double[] f4286c;

    /* renamed from: d  reason: collision with root package name */
    final String[] f4287d;

    /* renamed from: e  reason: collision with root package name */
    final byte[][] f4288e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f4289f;

    /* renamed from: g  reason: collision with root package name */
    final int f4290g;

    /* renamed from: h  reason: collision with root package name */
    int f4291h;

    private t0(int i10) {
        this.f4290g = i10;
        int i11 = i10 + 1;
        this.f4289f = new int[i11];
        this.f4285b = new long[i11];
        this.f4286c = new double[i11];
        this.f4287d = new String[i11];
        this.f4288e = new byte[i11];
    }

    public static t0 f(String str, int i10) {
        TreeMap<Integer, t0> treeMap = f4283i;
        synchronized (treeMap) {
            Map.Entry<Integer, t0> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                t0 value = ceilingEntry.getValue();
                value.j(str, i10);
                return value;
            }
            t0 t0Var = new t0(i10);
            t0Var.j(str, i10);
            return t0Var;
        }
    }

    private static void k() {
        TreeMap<Integer, t0> treeMap = f4283i;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i10 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i10;
        }
    }

    @Override // v0.j
    public String a() {
        return this.f4284a;
    }

    @Override // v0.j
    public void b(v0.i iVar) {
        for (int i10 = 1; i10 <= this.f4291h; i10++) {
            int i11 = this.f4289f[i10];
            if (i11 == 1) {
                iVar.v0(i10);
            } else if (i11 == 2) {
                iVar.m0(i10, this.f4285b[i10]);
            } else if (i11 == 3) {
                iVar.p(i10, this.f4286c[i10]);
            } else if (i11 == 4) {
                iVar.d0(i10, this.f4287d[i10]);
            } else if (i11 == 5) {
                iVar.p0(i10, this.f4288e[i10]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // v0.i
    public void d0(int i10, String str) {
        this.f4289f[i10] = 4;
        this.f4287d[i10] = str;
    }

    void j(String str, int i10) {
        this.f4284a = str;
        this.f4291h = i10;
    }

    @Override // v0.i
    public void m0(int i10, long j10) {
        this.f4289f[i10] = 2;
        this.f4285b[i10] = j10;
    }

    @Override // v0.i
    public void p(int i10, double d10) {
        this.f4289f[i10] = 3;
        this.f4286c[i10] = d10;
    }

    @Override // v0.i
    public void p0(int i10, byte[] bArr) {
        this.f4289f[i10] = 5;
        this.f4288e[i10] = bArr;
    }

    public void t() {
        TreeMap<Integer, t0> treeMap = f4283i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f4290g), this);
            k();
        }
    }

    @Override // v0.i
    public void v0(int i10) {
        this.f4289f[i10] = 1;
    }
}
