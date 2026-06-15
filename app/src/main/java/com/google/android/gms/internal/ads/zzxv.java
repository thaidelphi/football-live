package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzxv {
    private zzxu zza;
    private zzyd zzb;

    public zzlc zze() {
        throw null;
    }

    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zze zzeVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzxw zzo(zzld[] zzldVarArr, zzwd zzwdVar, zzty zztyVar, zzbn zzbnVar) throws zzhs;

    public abstract void zzp(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzyd zzq() {
        zzyd zzydVar = this.zzb;
        zzcv.zzb(zzydVar);
        return zzydVar;
    }

    public final void zzr(zzxu zzxuVar, zzyd zzydVar) {
        this.zza = zzxuVar;
        this.zzb = zzydVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzs() {
        zzxu zzxuVar = this.zza;
        if (zzxuVar != null) {
            zzxuVar.zzk();
        }
    }
}
