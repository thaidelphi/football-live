package v3;

import a5.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: Atom.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f31748a;

    /* compiled from: Atom.java */
    /* renamed from: v3.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class C0367a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final long f31749b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f31750c;

        /* renamed from: d  reason: collision with root package name */
        public final List<C0367a> f31751d;

        public C0367a(int i10, long j10) {
            super(i10);
            this.f31749b = j10;
            this.f31750c = new ArrayList();
            this.f31751d = new ArrayList();
        }

        public void d(C0367a c0367a) {
            this.f31751d.add(c0367a);
        }

        public void e(b bVar) {
            this.f31750c.add(bVar);
        }

        public C0367a f(int i10) {
            int size = this.f31751d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0367a c0367a = this.f31751d.get(i11);
                if (c0367a.f31748a == i10) {
                    return c0367a;
                }
            }
            return null;
        }

        public b g(int i10) {
            int size = this.f31750c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f31750c.get(i11);
                if (bVar.f31748a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // v3.a
        public String toString() {
            return a.a(this.f31748a) + " leaves: " + Arrays.toString(this.f31750c.toArray()) + " containers: " + Arrays.toString(this.f31751d.toArray());
        }
    }

    /* compiled from: Atom.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final c0 f31752b;

        public b(int i10, c0 c0Var) {
            super(i10);
            this.f31752b = c0Var;
        }
    }

    public a(int i10) {
        this.f31748a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f31748a);
    }
}
