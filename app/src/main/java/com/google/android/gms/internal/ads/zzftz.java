package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzftz extends zzfwo {
    final /* synthetic */ zzfub zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftz(zzfub zzfubVar) {
        this.zza = zzfubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfuu.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfua(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfwo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            Objects.requireNonNull(entry);
            zzfub zzfubVar = this.zza;
            zzfuo.zzo(zzfubVar.zzb, entry.getKey());
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    final Map zza() {
        return this.zza;
    }
}
