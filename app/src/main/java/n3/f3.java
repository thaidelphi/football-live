package n3;

import android.os.Bundle;
import n3.h;
/* compiled from: StarRating.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f3 extends w2 {

    /* renamed from: d  reason: collision with root package name */
    public static final h.a<f3> f27958d = new h.a() { // from class: n3.e3
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            f3 e8;
            e8 = f3.e(bundle);
            return e8;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final int f27959b;

    /* renamed from: c  reason: collision with root package name */
    private final float f27960c;

    public f3(int i10) {
        a5.a.b(i10 > 0, "maxStars must be a positive integer");
        this.f27959b = i10;
        this.f27960c = -1.0f;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f3 e(Bundle bundle) {
        a5.a.a(bundle.getInt(c(0), -1) == 2);
        int i10 = bundle.getInt(c(1), 5);
        float f10 = bundle.getFloat(c(2), -1.0f);
        if (f10 == -1.0f) {
            return new f3(i10);
        }
        return new f3(i10, f10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f3) {
            f3 f3Var = (f3) obj;
            return this.f27959b == f3Var.f27959b && this.f27960c == f3Var.f27960c;
        }
        return false;
    }

    public int hashCode() {
        return x5.f.b(Integer.valueOf(this.f27959b), Float.valueOf(this.f27960c));
    }

    public f3(int i10, float f10) {
        boolean z10 = true;
        a5.a.b(i10 > 0, "maxStars must be a positive integer");
        a5.a.b((f10 < 0.0f || f10 > ((float) i10)) ? false : z10, "starRating is out of range [0, maxStars]");
        this.f27959b = i10;
        this.f27960c = f10;
    }
}
