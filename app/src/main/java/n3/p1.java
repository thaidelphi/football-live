package n3;

import android.os.Bundle;
import n3.h;
/* compiled from: HeartRating.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p1 extends w2 {

    /* renamed from: d  reason: collision with root package name */
    public static final h.a<p1> f28270d = new h.a() { // from class: n3.o1
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            p1 e8;
            e8 = p1.e(bundle);
            return e8;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final boolean f28271b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f28272c;

    public p1() {
        this.f28271b = false;
        this.f28272c = false;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p1 e(Bundle bundle) {
        a5.a.a(bundle.getInt(c(0), -1) == 0);
        if (bundle.getBoolean(c(1), false)) {
            return new p1(bundle.getBoolean(c(2), false));
        }
        return new p1();
    }

    public boolean equals(Object obj) {
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            return this.f28272c == p1Var.f28272c && this.f28271b == p1Var.f28271b;
        }
        return false;
    }

    public int hashCode() {
        return x5.f.b(Boolean.valueOf(this.f28271b), Boolean.valueOf(this.f28272c));
    }

    public p1(boolean z10) {
        this.f28271b = true;
        this.f28272c = z10;
    }
}
