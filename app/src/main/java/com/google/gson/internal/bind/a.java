package com.google.gson.internal.bind;

import b7.g;
import b7.l;
import b7.m;
import b7.o;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
/* compiled from: JsonTreeReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a extends h7.a {

    /* renamed from: u  reason: collision with root package name */
    private static final Reader f15208u = new C0197a();

    /* renamed from: v  reason: collision with root package name */
    private static final Object f15209v = new Object();

    /* renamed from: q  reason: collision with root package name */
    private Object[] f15210q;

    /* renamed from: r  reason: collision with root package name */
    private int f15211r;

    /* renamed from: s  reason: collision with root package name */
    private String[] f15212s;

    /* renamed from: t  reason: collision with root package name */
    private int[] f15213t;

    /* compiled from: JsonTreeReader.java */
    /* renamed from: com.google.gson.internal.bind.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class C0197a extends Reader {
        C0197a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            throw new AssertionError();
        }
    }

    private String J() {
        return " at path " + M();
    }

    private void Q0(h7.b bVar) throws IOException {
        if (C0() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + C0() + J());
    }

    private Object R0() {
        return this.f15210q[this.f15211r - 1];
    }

    private Object S0() {
        Object[] objArr = this.f15210q;
        int i10 = this.f15211r - 1;
        this.f15211r = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void U0(Object obj) {
        int i10 = this.f15211r;
        Object[] objArr = this.f15210q;
        if (i10 == objArr.length) {
            Object[] objArr2 = new Object[i10 * 2];
            int[] iArr = new int[i10 * 2];
            String[] strArr = new String[i10 * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f15213t, 0, iArr, 0, this.f15211r);
            System.arraycopy(this.f15212s, 0, strArr, 0, this.f15211r);
            this.f15210q = objArr2;
            this.f15213t = iArr;
            this.f15212s = strArr;
        }
        Object[] objArr3 = this.f15210q;
        int i11 = this.f15211r;
        this.f15211r = i11 + 1;
        objArr3[i11] = obj;
    }

    @Override // h7.a
    public h7.b C0() throws IOException {
        if (this.f15211r == 0) {
            return h7.b.END_DOCUMENT;
        }
        Object R0 = R0();
        if (R0 instanceof Iterator) {
            boolean z10 = this.f15210q[this.f15211r - 2] instanceof m;
            Iterator it = (Iterator) R0;
            if (!it.hasNext()) {
                return z10 ? h7.b.END_OBJECT : h7.b.END_ARRAY;
            } else if (z10) {
                return h7.b.NAME;
            } else {
                U0(it.next());
                return C0();
            }
        } else if (R0 instanceof m) {
            return h7.b.BEGIN_OBJECT;
        } else {
            if (R0 instanceof g) {
                return h7.b.BEGIN_ARRAY;
            }
            if (R0 instanceof o) {
                o oVar = (o) R0;
                if (oVar.s()) {
                    return h7.b.STRING;
                }
                if (oVar.o()) {
                    return h7.b.BOOLEAN;
                }
                if (oVar.q()) {
                    return h7.b.NUMBER;
                }
                throw new AssertionError();
            } else if (R0 instanceof l) {
                return h7.b.NULL;
            } else {
                if (R0 == f15209v) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // h7.a
    public boolean E() throws IOException {
        h7.b C0 = C0();
        return (C0 == h7.b.END_OBJECT || C0 == h7.b.END_ARRAY) ? false : true;
    }

    @Override // h7.a
    public boolean K() throws IOException {
        Q0(h7.b.BOOLEAN);
        boolean h10 = ((o) S0()).h();
        int i10 = this.f15211r;
        if (i10 > 0) {
            int[] iArr = this.f15213t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return h10;
    }

    @Override // h7.a
    public double L() throws IOException {
        h7.b C0 = C0();
        h7.b bVar = h7.b.NUMBER;
        if (C0 != bVar && C0 != h7.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + C0 + J());
        }
        double j10 = ((o) R0()).j();
        if (!F() && (Double.isNaN(j10) || Double.isInfinite(j10))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + j10);
        }
        S0();
        int i10 = this.f15211r;
        if (i10 > 0) {
            int[] iArr = this.f15213t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return j10;
    }

    @Override // h7.a
    public String M() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = 0;
        while (i10 < this.f15211r) {
            Object[] objArr = this.f15210q;
            if (objArr[i10] instanceof g) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f15213t[i10]);
                    sb.append(']');
                }
            } else if (objArr[i10] instanceof m) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f15212s;
                    if (strArr[i10] != null) {
                        sb.append(strArr[i10]);
                    }
                }
            }
            i10++;
        }
        return sb.toString();
    }

    @Override // h7.a
    public void O0() throws IOException {
        if (C0() == h7.b.NAME) {
            S();
            this.f15212s[this.f15211r - 2] = "null";
        } else {
            S0();
            int i10 = this.f15211r;
            if (i10 > 0) {
                this.f15212s[i10 - 1] = "null";
            }
        }
        int i11 = this.f15211r;
        if (i11 > 0) {
            int[] iArr = this.f15213t;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // h7.a
    public int P() throws IOException {
        h7.b C0 = C0();
        h7.b bVar = h7.b.NUMBER;
        if (C0 != bVar && C0 != h7.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + C0 + J());
        }
        int k10 = ((o) R0()).k();
        S0();
        int i10 = this.f15211r;
        if (i10 > 0) {
            int[] iArr = this.f15213t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return k10;
    }

    @Override // h7.a
    public long R() throws IOException {
        h7.b C0 = C0();
        h7.b bVar = h7.b.NUMBER;
        if (C0 != bVar && C0 != h7.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + C0 + J());
        }
        long l10 = ((o) R0()).l();
        S0();
        int i10 = this.f15211r;
        if (i10 > 0) {
            int[] iArr = this.f15213t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return l10;
    }

    @Override // h7.a
    public String S() throws IOException {
        Q0(h7.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) R0()).next();
        String str = (String) entry.getKey();
        this.f15212s[this.f15211r - 1] = str;
        U0(entry.getValue());
        return str;
    }

    public void T0() throws IOException {
        Q0(h7.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) R0()).next();
        U0(entry.getValue());
        U0(new o((String) entry.getKey()));
    }

    @Override // h7.a
    public void a() throws IOException {
        Q0(h7.b.BEGIN_ARRAY);
        U0(((g) R0()).iterator());
        this.f15213t[this.f15211r - 1] = 0;
    }

    @Override // h7.a
    public void b() throws IOException {
        Q0(h7.b.BEGIN_OBJECT);
        U0(((m) R0()).i().iterator());
    }

    @Override // h7.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15210q = new Object[]{f15209v};
        this.f15211r = 1;
    }

    @Override // h7.a
    public void n0() throws IOException {
        Q0(h7.b.NULL);
        S0();
        int i10 = this.f15211r;
        if (i10 > 0) {
            int[] iArr = this.f15213t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // h7.a
    public void t() throws IOException {
        Q0(h7.b.END_ARRAY);
        S0();
        S0();
        int i10 = this.f15211r;
        if (i10 > 0) {
            int[] iArr = this.f15213t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // h7.a
    public String toString() {
        return a.class.getSimpleName();
    }

    @Override // h7.a
    public void w() throws IOException {
        Q0(h7.b.END_OBJECT);
        S0();
        S0();
        int i10 = this.f15211r;
        if (i10 > 0) {
            int[] iArr = this.f15213t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // h7.a
    public String y0() throws IOException {
        h7.b C0 = C0();
        h7.b bVar = h7.b.STRING;
        if (C0 != bVar && C0 != h7.b.NUMBER) {
            throw new IllegalStateException("Expected " + bVar + " but was " + C0 + J());
        }
        String n10 = ((o) S0()).n();
        int i10 = this.f15211r;
        if (i10 > 0) {
            int[] iArr = this.f15213t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return n10;
    }
}
