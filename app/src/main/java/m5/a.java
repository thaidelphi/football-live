package m5;

import android.content.Context;
import android.graphics.Color;
import r5.b;
/* compiled from: ElevationOverlayProvider.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a {

    /* renamed from: f  reason: collision with root package name */
    private static final int f27751f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f27752a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27753b;

    /* renamed from: c  reason: collision with root package name */
    private final int f27754c;

    /* renamed from: d  reason: collision with root package name */
    private final int f27755d;

    /* renamed from: e  reason: collision with root package name */
    private final float f27756e;

    public a(Context context) {
        this(b.b(context, d5.b.f23985o, false), j5.a.b(context, d5.b.f23984n, 0), j5.a.b(context, d5.b.f23983m, 0), j5.a.b(context, d5.b.f23981k, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i10) {
        return androidx.core.graphics.a.j(i10, 255) == this.f27755d;
    }

    public float a(float f10) {
        float f11 = this.f27756e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float a10 = a(f10);
        int alpha = Color.alpha(i10);
        int h10 = j5.a.h(androidx.core.graphics.a.j(i10, 255), this.f27753b, a10);
        if (a10 > 0.0f && (i11 = this.f27754c) != 0) {
            h10 = j5.a.g(h10, androidx.core.graphics.a.j(i11, f27751f));
        }
        return androidx.core.graphics.a.j(h10, alpha);
    }

    public int c(int i10, float f10) {
        return (this.f27752a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f27752a;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f27752a = z10;
        this.f27753b = i10;
        this.f27754c = i11;
        this.f27755d = i12;
        this.f27756e = f10;
    }
}
