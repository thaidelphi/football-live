package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.i0  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1779i0 extends BY {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DG A01;

    public C1779i0(DG dg, DialogInterface dialogInterface) {
        this.A01 = dg;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        JR jr;
        JR jr2;
        C1899k0 c1899k0;
        Map<? extends String, ? extends String> A02;
        jr = this.A01.A01.A02;
        if (jr != null) {
            jr2 = this.A01.A01.A02;
            c1899k0 = this.A01.A01.A00;
            String A03 = BE.A03(c1899k0);
            C0876Jf c0876Jf = new C0876Jf();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            jr2.AG5(A03, c0876Jf.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
