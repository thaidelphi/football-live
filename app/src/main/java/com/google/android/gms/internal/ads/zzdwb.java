package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdwb extends zzbtu {
    private final zzbyu zza;
    private final zzbud zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwb(zzbyu zzbyuVar, zzbud zzbudVar) {
        this.zza = zzbyuVar;
        this.zzb = zzbudVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzdws(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbud zzbudVar) {
        this.zza.zzc(new zzdws(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbudVar));
    }
}
