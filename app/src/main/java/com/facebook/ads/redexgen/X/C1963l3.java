package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.l3  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1963l3 implements C6N {
    public final /* synthetic */ AnonymousClass62 A00;

    public C1963l3(AnonymousClass62 anonymousClass62) {
        this.A00 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.X.C6N
    public final View A77(int i10) {
        return this.A00.A0t(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C6N
    public final int A79(View view) {
        return this.A00.A0n(view) + ((AnonymousClass63) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C6N
    public final int A7A(View view) {
        return this.A00.A0k(view) - ((AnonymousClass63) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C6N
    public final int A8W() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C6N
    public final int A8X() {
        return this.A00.A0e();
    }
}
