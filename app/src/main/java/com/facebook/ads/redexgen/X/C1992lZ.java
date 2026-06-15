package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
/* renamed from: com.facebook.ads.redexgen.X.lZ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1992lZ implements InterfaceC04903m {
    public final SharedPreferences A00;

    public C1992lZ(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04903m
    public final C1993la A68() {
        return new C1993la(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04903m
    public final long A8G(String str, long j10) {
        return this.A00.getLong(str, j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04903m
    public final String A94(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
