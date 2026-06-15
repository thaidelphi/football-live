package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzamy {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzamy(int i10, String str, int i11, List list, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = i11;
        this.zzd = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i10 = this.zzc;
        if (i10 != 2) {
            if (i10 != 3) {
                return 0;
            }
            return AdRequest.MAX_CONTENT_URL_LENGTH;
        }
        return com.ironsource.mediationsdk.metadata.a.f18931n;
    }
}
