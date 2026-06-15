package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzec implements zzdg {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzec(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzea zzeaVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzeaVar);
            }
        }
    }

    private static zzea zzm() {
        zzea zzeaVar;
        List list = zza;
        synchronized (list) {
            zzeaVar = list.isEmpty() ? new zzea(null) : (zzea) list.remove(list.size() - 1);
        }
        return zzeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final zzdf zzb(int i10) {
        Handler handler = this.zzb;
        zzea zzm = zzm();
        zzm.zzb(handler.obtainMessage(i10), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final zzdf zzc(int i10, Object obj) {
        Handler handler = this.zzb;
        zzea zzm = zzm();
        zzm.zzb(handler.obtainMessage(i10, obj), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final zzdf zzd(int i10, int i11, int i12) {
        Handler handler = this.zzb;
        zzea zzm = zzm();
        zzm.zzb(handler.obtainMessage(1, i11, i12), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final void zzf(int i10) {
        this.zzb.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzg(int i10) {
        return this.zzb.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzi(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzj(int i10, long j10) {
        return this.zzb.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzk(zzdf zzdfVar) {
        return ((zzea) zzdfVar).zzc(this.zzb);
    }
}
