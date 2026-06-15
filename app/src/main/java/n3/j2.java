package n3;

import android.os.Bundle;
import n3.h;
/* compiled from: PercentageRating.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j2 extends w2 {

    /* renamed from: c  reason: collision with root package name */
    public static final h.a<j2> f28097c = new h.a() { // from class: n3.i2
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            j2 e8;
            e8 = j2.e(bundle);
            return e8;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final float f28098b;

    public j2() {
        this.f28098b = -1.0f;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j2 e(Bundle bundle) {
        a5.a.a(bundle.getInt(c(0), -1) == 1);
        float f10 = bundle.getFloat(c(1), -1.0f);
        return f10 == -1.0f ? new j2() : new j2(f10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof j2) && this.f28098b == ((j2) obj).f28098b;
    }

    public int hashCode() {
        return x5.f.b(Float.valueOf(this.f28098b));
    }

    public j2(float f10) {
        a5.a.b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f28098b = f10;
    }
}
