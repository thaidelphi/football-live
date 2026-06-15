package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzftc implements zzftj {
    final /* synthetic */ zzfsg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftc(zzfsg zzfsgVar) {
        this.zza = zzfsgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftj
    public final /* bridge */ /* synthetic */ Iterator zza(zzftk zzftkVar, CharSequence charSequence) {
        return new zzftb(this, zzftkVar, charSequence, this.zza);
    }
}
