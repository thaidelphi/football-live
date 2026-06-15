package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzerz {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzffn zzd;
    private final zzdqf zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzerz(Context context, Executor executor, Set set, zzffn zzffnVar, zzdqf zzdqfVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzffnVar;
        this.zze = zzdqfVar;
    }

    public static /* synthetic */ void zzb(zzerz zzerzVar, long j10, zzerw zzerwVar, Bundle bundle) {
        long b10 = com.google.android.gms.ads.internal.zzv.zzC().b() - j10;
        if (((Boolean) zzbdo.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzftm.zzc(zzerwVar.getClass().getCanonicalName()) + " = " + b10);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzco)).booleanValue()) {
                synchronized (zzerzVar) {
                    bundle.putLong("sig" + zzerwVar.zza(), b10);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzci)).booleanValue()) {
            zzdqe zza = zzerzVar.zze.zza();
            zza.zzb("action", "lat_ms");
            zza.zzb("lat_grp", "sig_lat_grp");
            zza.zzb("lat_id", String.valueOf(zzerwVar.zza()));
            zza.zzb("clat_ms", String.valueOf(b10));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcj)).booleanValue()) {
                synchronized (zzerzVar) {
                    zzerzVar.zzg++;
                }
                zza.zzb("seq_num", com.google.android.gms.ads.internal.zzv.zzp().zzh().zzd());
                synchronized (zzerzVar) {
                    if (zzerzVar.zzg == zzerzVar.zzb.size() && zzerzVar.zzf != 0) {
                        zzerzVar.zzg = 0;
                        String valueOf = String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().b() - zzerzVar.zzf);
                        if (zzerwVar.zza() > 39 && zzerwVar.zza() < 52) {
                            zza.zzb("lat_gmssg", valueOf);
                        } else {
                            zza.zzb("lat_clsg", valueOf);
                        }
                    }
                }
            }
            zza.zzk();
        }
    }

    public final b6.a zza(final Object obj, final Bundle bundle, final boolean z10) {
        zzffc zza = zzffb.zza(this.zza, 8);
        zza.zzi();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        zzbbd zzbbdVar = zzbbm.zzlF;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).split(","));
        }
        List list = arrayList2;
        this.zzf = com.google.android.gms.ads.internal.zzv.zzC().b();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue() && bundle != null) {
            long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
            if (obj instanceof zzcth) {
                bundle.putLong(zzdpn.CLIENT_SIGNALS_START.zza(), a10);
            } else {
                bundle.putLong(zzdpn.GMS_SIGNALS_START.zza(), a10);
            }
        }
        for (final zzerw zzerwVar : this.zzb) {
            if (!list.contains(String.valueOf(zzerwVar.zza()))) {
                final long b10 = com.google.android.gms.ads.internal.zzv.zzC().b();
                b6.a zzb = zzerwVar.zzb();
                zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzerx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzerz.zzb(zzerz.this, b10, zzerwVar, bundle2);
                    }
                }, zzbyp.zzg);
                arrayList.add(zzb);
            }
        }
        b6.a zza2 = zzgap.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzery
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzerv zzervVar = (zzerv) ((b6.a) it.next()).get();
                    if (zzervVar != null) {
                        boolean z11 = z10;
                        zzervVar.zzb(obj2);
                        if (z11) {
                            zzervVar.zza(obj2);
                        }
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long a11 = com.google.android.gms.ads.internal.zzv.zzC().a();
                    if (obj2 instanceof zzcth) {
                        bundle3.putLong(zzdpn.CLIENT_SIGNALS_END.zza(), a11);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(zzdpn.GMS_SIGNALS_END.zza(), a11);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzffq.zza()) {
            zzffm.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }
}
