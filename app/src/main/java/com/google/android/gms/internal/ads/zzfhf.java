package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.ironsource.b9;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfhf {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final zzgbb zzc;
    private final zzfhg zzd;

    public zzfhf(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzgbb zzgbbVar, zzfhg zzfhgVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzgbbVar;
        this.zzd = zzfhgVar;
    }

    public static /* synthetic */ b6.a zzc(zzfhf zzfhfVar, int i10, long j10, String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return zzgap.zzh(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = zzfhfVar.zza;
        long zzb = zzxVar.zzb();
        if (i10 != 1) {
            zzb = (long) (zzxVar.zza() * j10);
        }
        return zzfhfVar.zze(str, zzb, i10 + 1);
    }

    private final b6.a zze(final String str, final long j10, final int i10) {
        final String str2;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i10 > zzxVar.zzc()) {
            zzfhg zzfhgVar = this.zzd;
            if (zzfhgVar != null && zzxVar.zzd()) {
                zzfhgVar.zza(str, "", 2);
                return zzgap.zzh(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
            }
            return zzgap.zzh(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziy)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i10));
            str2 = String.valueOf(clearQuery.build()) + b9.i.f16694c + encodedQuery;
        } else {
            str2 = str;
        }
        zzfzw zzfzwVar = new zzfzw() { // from class: com.google.android.gms.internal.ads.zzfhe
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzfhf.zzc(zzfhf.this, i10, j10, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        if (j10 == 0) {
            return zzgap.zzn(this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfhd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    com.google.android.gms.ads.internal.util.client.zzt zza;
                    zza = zzfhf.this.zzb.zza(str2);
                    return zza;
                }
            }), zzfzwVar, this.zzc);
        }
        return zzgap.zzn(this.zzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfhc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.ads.internal.util.client.zzt zza;
                zza = zzfhf.this.zzb.zza(str2);
                return zza;
            }
        }, j10, TimeUnit.MILLISECONDS), zzfzwVar, this.zzc);
    }

    public final b6.a zzd(String str) {
        try {
            return zze(str, 0L, 1);
        } catch (NullPointerException | RejectedExecutionException unused) {
            return zzgap.zzh(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
        }
    }
}
