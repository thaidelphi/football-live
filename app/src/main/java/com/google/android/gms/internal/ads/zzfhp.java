package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfhp {
    private final Context zza;
    private final Executor zzb;
    private final zzgbb zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfhg zze;
    private final zzffq zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhp(Context context, Executor executor, zzgbb zzgbbVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfhg zzfhgVar, zzffq zzffqVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgbbVar;
        this.zzd = zzuVar;
        this.zze = zzfhgVar;
        this.zzf = zzffqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final b6.a zzc(final String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (zzvVar != null) {
            return new zzfhf(zzvVar.zzb(), this.zzd, this.zzc, this.zze).zzd(str);
        }
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfhm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.ads.internal.util.client.zzt zza;
                zza = zzfhp.this.zzd.zza(str);
                return zza;
            }
        });
    }

    public final void zzd(final String str, final com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzffn zzffnVar) {
        if (zzffq.zza() && ((Boolean) zzbdf.zzd.zze()).booleanValue()) {
            zzffc zza = zzffb.zza(this.zza, 14);
            zza.zzi();
            zzgap.zzr(zzc(str, zzvVar), new zzfho(this, zza, zzffnVar), this.zzb);
            return;
        }
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhn
            @Override // java.lang.Runnable
            public final void run() {
                zzfhp.this.zzc(str, zzvVar);
            }
        });
    }

    public final void zze(List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzd((String) it.next(), zzvVar, null);
        }
    }
}
