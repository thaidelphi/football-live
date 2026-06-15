package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbqx implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbqy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqx(zzbqy zzbqyVar) {
        this.zza = zzbqyVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzh("Operation denied by user.");
    }
}
