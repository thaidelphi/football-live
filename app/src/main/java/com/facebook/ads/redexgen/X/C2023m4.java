package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.AdSettings;
/* renamed from: com.facebook.ads.redexgen.X.m4  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2023m4 implements AnonymousClass90 {
    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final String A6z() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final String A7D() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final C8J A7c(AnonymousClass85 anonymousClass85) {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final String A8M() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final String A96() {
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            return AdSettings.getTestAdType().getAdTypeString();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final boolean AAP() {
        return AdSettings.isMixedAudience();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final boolean AAV() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final Boolean AAZ() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass90
    public final boolean isTestMode(Context context) {
        return AdSettings.isTestMode(context);
    }
}
