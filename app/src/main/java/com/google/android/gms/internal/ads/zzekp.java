package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzekp implements zzerw {
    private final Set zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekp(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zza) {
            arrayList.add(str);
        }
        return zzgap.zzh(new zzekn(arrayList, null));
    }
}
