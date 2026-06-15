package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzxo {
    public final zzbo zza;
    public final int[] zzb;

    public zzxo(zzbo zzboVar, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzdn.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzboVar;
        this.zzb = iArr;
    }
}
