package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbgz {
    private final com.google.android.gms.ads.formats.zzg zza;
    private final com.google.android.gms.ads.formats.zzf zzb;
    private zzbft zzc;

    public zzbgz(com.google.android.gms.ads.formats.zzg zzgVar, com.google.android.gms.ads.formats.zzf zzfVar) {
        this.zza = zzgVar;
        this.zzb = zzfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzbft zzf(zzbfs zzbfsVar) {
        zzbft zzbftVar = this.zzc;
        if (zzbftVar != null) {
            return zzbftVar;
        }
        zzbft zzbftVar2 = new zzbft(zzbfsVar);
        this.zzc = zzbftVar2;
        return zzbftVar2;
    }

    public final zzbgc zzc() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbgw(this, null);
    }

    public final zzbgf zzd() {
        return new zzbgx(this, null);
    }
}
