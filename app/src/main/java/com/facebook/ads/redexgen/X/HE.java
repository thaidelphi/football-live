package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class HE implements View.OnClickListener {
    public static String[] A01 = {"iIV4C6PCamFbOwLs9osqMP65CW35qHVZ", "vu8ePLRZods6FhLp1sOjcscbCnKQtV0u", "aj5bYqq1P6NsPozz4AKHPhJxq4tExiSQ", "sREORf6VoPUSDy", "tYmkAFK6aojaVt6XrGIUitMYwL", "t5b15Ic4Fw72vyTqFljisKwND31PO9vi", "k2wG1EEpilyBuA", "DdpD6jZ5PRtvRqlim5b1myDycB"};
    public final /* synthetic */ C0914Kr A00;

    public HE(C0914Kr c0914Kr) {
        this.A00 = c0914Kr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC04471v abstractC04471v;
        boolean z10;
        boolean z11;
        AbstractC04471v abstractC04471v2;
        Handler handler;
        Runnable runnable;
        if (BQ.A02(this)) {
            return;
        }
        try {
            abstractC04471v = this.A00.A0U;
            if (!(abstractC04471v instanceof N9)) {
                return;
            }
            z10 = this.A00.A0K;
            if (A01[5].charAt(19) != 'i') {
                throw new RuntimeException();
            }
            A01[5] = "JfKhMnDlcffILoVNGoui3HCKoOWuag6G";
            if (!z10) {
                this.A00.A0L = true;
                C0914Kr c0914Kr = this.A00;
                abstractC04471v2 = this.A00.A0U;
                c0914Kr.A0f(((N9) abstractC04471v2).A0G().toString());
                if (((AbstractC1603f6) this.A00).A05.A0a() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0k;
                    handler.postDelayed(runnable, ((AbstractC1603f6) this.A00).A05.A0a());
                }
            }
            C0914Kr c0914Kr2 = this.A00;
            z11 = this.A00.A0K;
            c0914Kr2.A0i(z11 ? false : true);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
