package b5;

import android.os.Bundle;
import n3.h;
/* compiled from: VideoSize.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a0 implements n3.h {

    /* renamed from: e  reason: collision with root package name */
    public static final a0 f5095e = new a0(0, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final h.a<a0> f5096f = new h.a() { // from class: b5.z
        @Override // n3.h.a
        public final n3.h a(Bundle bundle) {
            a0 c10;
            c10 = a0.c(bundle);
            return c10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f5097a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5098b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5099c;

    /* renamed from: d  reason: collision with root package name */
    public final float f5100d;

    public a0(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a0 c(Bundle bundle) {
        return new a0(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0), bundle.getFloat(b(3), 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return this.f5097a == a0Var.f5097a && this.f5098b == a0Var.f5098b && this.f5099c == a0Var.f5099c && this.f5100d == a0Var.f5100d;
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f5097a) * 31) + this.f5098b) * 31) + this.f5099c) * 31) + Float.floatToRawIntBits(this.f5100d);
    }

    public a0(int i10, int i11, int i12, float f10) {
        this.f5097a = i10;
        this.f5098b = i11;
        this.f5099c = i12;
        this.f5100d = f10;
    }
}
