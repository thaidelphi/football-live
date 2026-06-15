package n3;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import n3.h;
/* compiled from: PlaybackParameters.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o2 implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final o2 f28260d = new o2(1.0f);

    /* renamed from: e  reason: collision with root package name */
    public static final h.a<o2> f28261e = new h.a() { // from class: n3.n2
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            o2 d10;
            d10 = o2.d(bundle);
            return d10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final float f28262a;

    /* renamed from: b  reason: collision with root package name */
    public final float f28263b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28264c;

    public o2(float f10) {
        this(f10, 1.0f);
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o2 d(Bundle bundle) {
        return new o2(bundle.getFloat(c(0), 1.0f), bundle.getFloat(c(1), 1.0f));
    }

    public long b(long j10) {
        return j10 * this.f28264c;
    }

    public o2 e(float f10) {
        return new o2(f10, this.f28263b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o2.class != obj.getClass()) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.f28262a == o2Var.f28262a && this.f28263b == o2Var.f28263b;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.f28262a)) * 31) + Float.floatToRawIntBits(this.f28263b);
    }

    public String toString() {
        return a5.p0.B("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f28262a), Float.valueOf(this.f28263b));
    }

    public o2(float f10, float f11) {
        a5.a.a(f10 > 0.0f);
        a5.a.a(f11 > 0.0f);
        this.f28262a = f10;
        this.f28263b = f11;
        this.f28264c = Math.round(f10 * 1000.0f);
    }
}
