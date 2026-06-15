package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
/* renamed from: com.facebook.ads.redexgen.X.la  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1993la implements InterfaceC04893l {
    public final SharedPreferences.Editor A00;

    public C1993la(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C1993la A00(String str, long j10) {
        this.A00.putLong(str, j10);
        return this;
    }

    public final C1993la A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
