package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfrd extends zzfpw {
    final /* synthetic */ zzfre zza;
    private final zzfrj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrd(zzfre zzfreVar, zzfrj zzfrjVar) {
        this.zza = zzfreVar;
        this.zzb = zzfrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpx
    public final void zzb(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfrh zzc = zzfri.zzc();
        zzc.zzb(i10);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i10 == 8157) {
            this.zza.zzd();
        }
    }
}
