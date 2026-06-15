package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.n6  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2087n6 implements InterfaceC0799Gg {
    public final /* synthetic */ N5 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Gg
    public final void AAc() {
        C0969Mx c0969Mx;
        M5 m52;
        c0969Mx = this.A00.A03;
        String A00 = c0969Mx.A1e().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        C2 c22 = new C2();
        m52 = this.A00.A04;
        C2.A0M(c22, m52, C5.A00(A00), this.A00.A7E());
    }

    public C2087n6(N5 n52) {
        this.A00 = n52;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Gg
    public final void AD1(LI li) {
        new Handler(Looper.getMainLooper()).postDelayed(new C2088n7(this, li), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Gg
    public final void ADH() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Gg
    public final void AFK(View view, MotionEvent motionEvent) {
    }
}
