package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzdd extends zzdb {

    /* renamed from: a  reason: collision with root package name */
    private final MuteThisAdListener f11214a;

    public zzdd(MuteThisAdListener muteThisAdListener) {
        this.f11214a = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdc
    public final void zze() {
        this.f11214a.onAdMuted();
    }
}
