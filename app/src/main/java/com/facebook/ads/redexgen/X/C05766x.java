package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import com.facebook.ads.AudienceNetworkActivity;
/* renamed from: com.facebook.ads.redexgen.X.6x  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05766x {
    public final AudienceNetworkActivity A00;
    public final C1900k1 A01;

    public C05766x(C1900k1 c1900k1, AudienceNetworkActivity audienceNetworkActivity) {
        this.A01 = c1900k1;
        this.A00 = audienceNetworkActivity;
    }

    private int A00() {
        Rect rect = new Rect();
        Window window = this.A00.getWindow();
        if (window == null) {
            return 2;
        }
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.top < 200 && rect.left < 200) {
            return 1;
        }
        return 0;
    }

    public final void A01() {
        if ((this.A01.A0H().A01() || C06419m.A1x(this.A01)) && Build.VERSION.SDK_INT >= 24) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.6w
                @Override // java.lang.Runnable
                public final void run() {
                    C05766x.this.A02();
                }
            }, 1000L);
        }
    }

    public final /* synthetic */ void A02() {
        if (this.A00.isInMultiWindowMode()) {
            this.A01.A0F().ABQ(A00());
        }
    }
}
