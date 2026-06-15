package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class GM implements View.OnClickListener {
    public final /* synthetic */ C1652fu A00;

    public GM(C1652fu c1652fu) {
        this.A00 = c1652fu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        AbstractC04471v abstractC04471v;
        AbstractC2058md abstractC2058md;
        Handler handler;
        Runnable runnable;
        AbstractC2058md abstractC2058md2;
        if (BQ.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0P;
            if (!z10) {
                this.A00.A0Q = true;
                C1652fu c1652fu = this.A00;
                abstractC04471v = this.A00.A0g;
                c1652fu.A0f(((N9) abstractC04471v).A0G().toString());
                abstractC2058md = this.A00.A0G;
                if (abstractC2058md.A0a() >= 0) {
                    handler = this.A00.A09;
                    runnable = this.A00.A0n;
                    abstractC2058md2 = this.A00.A0G;
                    handler.postDelayed(runnable, abstractC2058md2.A0a());
                }
            }
            C1652fu c1652fu2 = this.A00;
            z11 = this.A00.A0P;
            c1652fu2.A0i(z11 ? false : true);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
