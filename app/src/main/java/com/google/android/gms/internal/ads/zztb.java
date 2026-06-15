package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zztb implements zzvs {
    public final zzvs zza;
    final /* synthetic */ zztc zzb;
    private boolean zzc;

    public zztb(zztc zztcVar, zzvs zzvsVar) {
        this.zzb = zztcVar;
        this.zza = zzvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final int zza(zzjv zzjvVar, zzha zzhaVar, int i10) {
        zztc zztcVar = this.zzb;
        if (zztcVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhaVar.zzc(4);
            return -4;
        }
        long zzb = zztcVar.zzb();
        int zza = this.zza.zza(zzjvVar, zzhaVar, i10);
        if (zza != -5) {
            long j10 = this.zzb.zzb;
            if (j10 == Long.MIN_VALUE || ((zza != -4 || zzhaVar.zze < j10) && !(zza == -3 && zzb == Long.MIN_VALUE && !zzhaVar.zzd))) {
                return zza;
            }
            zzhaVar.zzb();
            zzhaVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        zzz zzzVar = zzjvVar.zza;
        Objects.requireNonNull(zzzVar);
        int i11 = zzzVar.zzH;
        if (i11 == 0) {
            if (zzzVar.zzI != 0) {
                i11 = 0;
            }
            return -5;
        }
        int i12 = this.zzb.zzb == Long.MIN_VALUE ? zzzVar.zzI : 0;
        zzx zzb2 = zzzVar.zzb();
        zzb2.zzI(i11);
        zzb2.zzJ(i12);
        zzjvVar.zza = zzb2.zzaj();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final int zzb(long j10) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j10);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
