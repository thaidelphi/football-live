package n3;

import android.os.Bundle;
import n3.h;
/* compiled from: ThumbRating.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j3 extends w2 {

    /* renamed from: d  reason: collision with root package name */
    public static final h.a<j3> f28099d = new h.a() { // from class: n3.i3
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            j3 e8;
            e8 = j3.e(bundle);
            return e8;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final boolean f28100b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f28101c;

    public j3() {
        this.f28100b = false;
        this.f28101c = false;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j3 e(Bundle bundle) {
        a5.a.a(bundle.getInt(c(0), -1) == 3);
        if (bundle.getBoolean(c(1), false)) {
            return new j3(bundle.getBoolean(c(2), false));
        }
        return new j3();
    }

    public boolean equals(Object obj) {
        if (obj instanceof j3) {
            j3 j3Var = (j3) obj;
            return this.f28101c == j3Var.f28101c && this.f28100b == j3Var.f28100b;
        }
        return false;
    }

    public int hashCode() {
        return x5.f.b(Boolean.valueOf(this.f28100b), Boolean.valueOf(this.f28101c));
    }

    public j3(boolean z10) {
        this.f28100b = true;
        this.f28101c = z10;
    }
}
