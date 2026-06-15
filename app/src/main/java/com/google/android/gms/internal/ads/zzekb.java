package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzekb implements zzerw {
    private final zzgba zza;
    private final zzfap zzb;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekb(zzgba zzgbaVar, zzfap zzfapVar, zzfbe zzfbeVar, int i10) {
        this.zza = zzgbaVar;
        this.zzb = zzfapVar;
        this.zzc = i10;
    }

    public static /* synthetic */ zzekc zzc(zzekb zzekbVar) {
        boolean equals;
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgS)).booleanValue()) {
            zzfap zzfapVar = zzekbVar.zzb;
            if (zzekbVar.zzc != 2) {
                String zzc = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfapVar.zzd);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgT)).booleanValue()) {
                    equals = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgU)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(zzc));
                } else {
                    equals = Objects.equals(zzc, "requester_type_2");
                }
                if (equals) {
                    str = zzfbe.zza();
                }
            }
        }
        return new zzekc(str);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzekb.zzc(zzekb.this);
            }
        });
    }
}
