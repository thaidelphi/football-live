package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzakn implements zzajg {
    private final zzdx zza = new zzdx();
    private final zzdx zzb = new zzdx();
    private final zzakm zzc;
    private Inflater zzd;

    public zzakn(List list) {
        zzakm zzakmVar = new zzakm();
        this.zzc = zzakmVar;
        zzakmVar.zzb(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zza(byte[] bArr, int i10, int i11, zzajf zzajfVar, zzda zzdaVar) {
        this.zza.zzJ(bArr, i11 + i10);
        this.zza.zzL(i10);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        if (zzeh.zzN(this.zza, this.zzb, this.zzd)) {
            zzdx zzdxVar = this.zza;
            zzdx zzdxVar2 = this.zzb;
            zzdxVar.zzJ(zzdxVar2.zzN(), zzdxVar2.zze());
        }
        this.zzc.zzd();
        zzdx zzdxVar3 = this.zza;
        int zzb = zzdxVar3.zzb();
        zzcn zzcnVar = null;
        if (zzb >= 2 && zzdxVar3.zzq() == zzb) {
            this.zzc.zzc(this.zza);
            zzcnVar = this.zzc.zza(this.zza);
        }
        zzdaVar.zza(new zzaiy(zzcnVar != null ? zzfvv.zzo(zzcnVar) : zzfvv.zzn(), -9223372036854775807L, 5000000L));
    }
}
