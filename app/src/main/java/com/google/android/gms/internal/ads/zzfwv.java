package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfwv extends zzfwz {
    final /* synthetic */ Comparator zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwv(Comparator comparator) {
        this.zza = comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfwz
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
