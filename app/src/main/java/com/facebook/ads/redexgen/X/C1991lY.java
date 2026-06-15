package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
/* renamed from: com.facebook.ads.redexgen.X.lY  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1991lY implements InterfaceC04973t {
    public Drawable A00;
    public final /* synthetic */ AbstractC04963s A01;

    public C1991lY(AbstractC04963s abstractC04963s) {
        this.A01 = abstractC04963s;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04973t
    public final Drawable A74() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04973t
    public final AbstractC04963s A75() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04973t
    public final boolean A8g() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04973t
    public final boolean A9H() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04973t
    public final void AIQ(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04973t
    public final void AIr(int i10, int i11, int i12, int i13) {
        this.A01.A05.set(i10, i11, i12, i13);
        super/*android.widget.FrameLayout*/.setPadding(this.A01.A04.left + i10, this.A01.A04.top + i11, this.A01.A04.right + i12, this.A01.A04.bottom + i13);
    }
}
