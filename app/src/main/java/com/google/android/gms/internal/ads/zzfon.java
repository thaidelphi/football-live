package com.google.android.gms.internal.ads;

import java.io.Closeable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfon implements Closeable {
    public static zzfoz zza() {
        return new zzfoz();
    }

    public static zzfoz zzb(final int i10, zzfoy zzfoyVar) {
        return new zzfoz(new zzftn() { // from class: com.google.android.gms.internal.ads.zzfol
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        }, new zzftn() { // from class: com.google.android.gms.internal.ads.zzfom
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return zzfon.zze();
            }
        }, zzfoyVar);
    }

    public static zzfoz zzc(zzftn<Integer> zzftnVar, zzftn<Integer> zzftnVar2, zzfoy zzfoyVar) {
        return new zzfoz(zzftnVar, zzftnVar2, zzfoyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
