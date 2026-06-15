package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.kk  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1945kk implements DR {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C05576e> A00;

    public C1945kk(C05576e c05576e) {
        this.A00 = new WeakReference<>(c05576e);
    }

    private void A00(C05576e c05576e) {
        C0830Hl A07 = c05576e.A07();
        if (A07 != null && c05576e.A04() != null) {
            c05576e.A04().bringChildToFront(A07);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DR
    public void A3u(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        C05576e c05576e = this.A00.get();
        if (c05576e != null && c05576e.A04() != null) {
            c05576e.A04().addView(view, i10, layoutParams);
            A00(c05576e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DR
    public void A3v(View view, RelativeLayout.LayoutParams layoutParams) {
        C05576e c05576e = this.A00.get();
        if (c05576e != null && c05576e.A04() != null) {
            c05576e.A04().addView(view, layoutParams);
            A00(c05576e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DR
    public void A4Z(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DR
    public void A4a(String str, C9I c9i) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, c9i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DR
    public void AAd(String str, C04652n c04652n) {
        if (this.A00.get() != null) {
            WeakReference<C05576e> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c04652n);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DR
    public void ACY(int i10) {
        C05576e activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i10);
        }
    }
}
