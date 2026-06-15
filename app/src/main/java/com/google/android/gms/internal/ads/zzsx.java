package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzsx implements zzua {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzui zzc = new zzui();
    private final zzqt zzd = new zzqt();
    private Looper zze;
    private zzbn zzf;
    private zznz zzg;

    @Override // com.google.android.gms.internal.ads.zzua
    public /* synthetic */ zzbn zzM() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zznz zzb() {
        zznz zznzVar = this.zzg;
        zzcv.zzb(zznzVar);
        return zznzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzqt zzc(zzty zztyVar) {
        return this.zzd.zza(0, zztyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzqt zzd(int i10, zzty zztyVar) {
        return this.zzd.zza(0, zztyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzui zze(zzty zztyVar) {
        return this.zzc.zza(0, zztyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzui zzf(int i10, zzty zztyVar) {
        return this.zzc.zza(0, zztyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzg(Handler handler, zzqu zzquVar) {
        this.zzd.zzb(handler, zzquVar);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzh(Handler handler, zzuj zzujVar) {
        this.zzc.zzb(handler, zzujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzi(zztz zztzVar) {
        boolean z10 = !this.zzb.isEmpty();
        this.zzb.remove(zztzVar);
        if (z10 && this.zzb.isEmpty()) {
            zzj();
        }
    }

    protected void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzk(zztz zztzVar) {
        Objects.requireNonNull(this.zze);
        HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zztzVar);
        if (isEmpty) {
            zzl();
        }
    }

    protected void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzm(zztz zztzVar, zzgr zzgrVar, zznz zznzVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z10 = true;
        if (looper != null && looper != myLooper) {
            z10 = false;
        }
        zzcv.zzd(z10);
        this.zzg = zznzVar;
        zzbn zzbnVar = this.zzf;
        this.zza.add(zztzVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zztzVar);
            zzn(zzgrVar);
        } else if (zzbnVar != null) {
            zzk(zztzVar);
            zztzVar.zza(this, zzbnVar);
        }
    }

    protected abstract void zzn(zzgr zzgrVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzo(zzbn zzbnVar) {
        this.zzf = zzbnVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zztz) arrayList.get(i10)).zza(this, zzbnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzp(zztz zztzVar) {
        this.zza.remove(zztzVar);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zztzVar);
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzr(zzqu zzquVar) {
        this.zzd.zzc(zzquVar);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzs(zzuj zzujVar) {
        this.zzc.zzi(zzujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public /* synthetic */ void zzt(zzap zzapVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public /* synthetic */ boolean zzv() {
        return true;
    }
}
