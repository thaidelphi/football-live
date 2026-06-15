package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbqw implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbqy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqw(zzbqy zzbqyVar) {
        this.zza = zzbqyVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Context context;
        zzbqy zzbqyVar = this.zza;
        Intent zzb = zzbqyVar.zzb();
        com.google.android.gms.ads.internal.zzv.zzq();
        context = zzbqyVar.zzb;
        com.google.android.gms.ads.internal.util.zzs.zzT(context, zzb);
    }
}
