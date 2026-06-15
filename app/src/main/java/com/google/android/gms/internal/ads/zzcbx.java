package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzcbx implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcbx(zzcal zzcalVar) {
        Context context = zzcalVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzv.zzq().zzc(context, zzcalVar.zzm().afmaVersion);
        this.zzc = new WeakReference(zzcalVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zze(zzcbx zzcbxVar, String str, Map map) {
        zzcal zzcalVar = (zzcal) zzcbxVar.zzc.get();
        if (zzcalVar != null) {
            zzcalVar.zzd("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcbw(this, str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh(String str, String str2, int i10) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcbu(this, str, str2, i10));
    }

    public final void zzj(String str, String str2, long j10) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcbv(this, str, str2, j10));
    }

    public final void zzn(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcbt(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    public final void zzo(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcbs(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzp(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzq(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzr(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzs(int i10) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcbp zzcbpVar) {
        return zzt(str);
    }
}
