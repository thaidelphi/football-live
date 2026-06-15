package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzelh implements zzerw {
    private final Executor zza;
    private final zzbyf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzelh(Executor executor, zzbyf zzbyfVar) {
        this.zza = executor;
        this.zzb = zzbyfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcX)).booleanValue()) {
            return zzgap.zzh(new zzeli(null));
        }
        return zzgap.zzm(this.zzb.zzk(), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzelg
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new zzeli(arrayList);
            }
        }, this.zza);
    }
}
