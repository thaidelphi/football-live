package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfte implements zzftj {
    final /* synthetic */ zzfsi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfte(zzfsi zzfsiVar) {
        this.zza = zzfsiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftj
    public final /* bridge */ /* synthetic */ Iterator zza(zzftk zzftkVar, CharSequence charSequence) {
        return new zzftd(this, zzftkVar, charSequence, this.zza.zza(charSequence));
    }
}
