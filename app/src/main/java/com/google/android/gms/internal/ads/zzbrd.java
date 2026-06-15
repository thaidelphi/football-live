package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbrd implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbre zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrd(zzbre zzbreVar) {
        this.zza = zzbreVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzh("User canceled the download.");
    }
}
