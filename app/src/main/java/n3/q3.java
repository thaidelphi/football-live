package n3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n3.h;
import n3.q3;
/* compiled from: Tracks.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q3 implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final q3 f28304b = new q3(y5.q.p());

    /* renamed from: c  reason: collision with root package name */
    public static final h.a<q3> f28305c = new h.a() { // from class: n3.o3
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            q3 f10;
            f10 = q3.f(bundle);
            return f10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final y5.q<a> f28306a;

    /* compiled from: Tracks.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements h {

        /* renamed from: f  reason: collision with root package name */
        public static final h.a<a> f28307f = new h.a() { // from class: n3.p3
            @Override // n3.h.a
            public final h a(Bundle bundle) {
                q3.a k10;
                k10 = q3.a.k(bundle);
                return k10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final int f28308a;

        /* renamed from: b  reason: collision with root package name */
        private final e4.k0 f28309b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f28310c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f28311d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean[] f28312e;

        public a(e4.k0 k0Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = k0Var.f25083a;
            this.f28308a = i10;
            boolean z11 = false;
            a5.a.a(i10 == iArr.length && i10 == zArr.length);
            this.f28309b = k0Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f28310c = z11;
            this.f28311d = (int[]) iArr.clone();
            this.f28312e = (boolean[]) zArr.clone();
        }

        private static String j(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ a k(Bundle bundle) {
            e4.k0 a10 = e4.k0.f25082f.a((Bundle) a5.a.e(bundle.getBundle(j(0))));
            return new a(a10, bundle.getBoolean(j(4), false), (int[]) x5.e.a(bundle.getIntArray(j(1)), new int[a10.f25083a]), (boolean[]) x5.e.a(bundle.getBooleanArray(j(3)), new boolean[a10.f25083a]));
        }

        public e4.k0 b() {
            return this.f28309b;
        }

        public m1 c(int i10) {
            return this.f28309b.b(i10);
        }

        public int d() {
            return this.f28309b.f25085c;
        }

        public boolean e() {
            return this.f28310c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28310c == aVar.f28310c && this.f28309b.equals(aVar.f28309b) && Arrays.equals(this.f28311d, aVar.f28311d) && Arrays.equals(this.f28312e, aVar.f28312e);
        }

        public boolean f() {
            return a6.a.b(this.f28312e, true);
        }

        public boolean g(int i10) {
            return this.f28312e[i10];
        }

        public boolean h(int i10) {
            return i(i10, false);
        }

        public int hashCode() {
            return (((((this.f28309b.hashCode() * 31) + (this.f28310c ? 1 : 0)) * 31) + Arrays.hashCode(this.f28311d)) * 31) + Arrays.hashCode(this.f28312e);
        }

        public boolean i(int i10, boolean z10) {
            int[] iArr = this.f28311d;
            return iArr[i10] == 4 || (z10 && iArr[i10] == 3);
        }
    }

    public q3(List<a> list) {
        this.f28306a = y5.q.l(list);
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ q3 f(Bundle bundle) {
        y5.q b10;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(e(0));
        if (parcelableArrayList == null) {
            b10 = y5.q.p();
        } else {
            b10 = a5.c.b(a.f28307f, parcelableArrayList);
        }
        return new q3(b10);
    }

    public y5.q<a> b() {
        return this.f28306a;
    }

    public boolean c() {
        return this.f28306a.isEmpty();
    }

    public boolean d(int i10) {
        for (int i11 = 0; i11 < this.f28306a.size(); i11++) {
            a aVar = this.f28306a.get(i11);
            if (aVar.f() && aVar.d() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q3.class != obj.getClass()) {
            return false;
        }
        return this.f28306a.equals(((q3) obj).f28306a);
    }

    public int hashCode() {
        return this.f28306a.hashCode();
    }
}
