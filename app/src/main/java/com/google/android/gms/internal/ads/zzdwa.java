package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdwa extends zzbtu {
    final /* synthetic */ zzdwc zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdwa(zzdwc zzdwcVar) {
        this.zza = zzdwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdwc zzdwcVar = this.zza;
        zzdwcVar.zza.zzc(new zzdws(autoCloseInputStream, zzdwcVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbud zzbudVar) {
        this.zza.zza.zzc(new zzdws(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbudVar));
    }
}
