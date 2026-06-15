package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfud implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfue zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfud(zzfue zzfueVar, Iterator it) {
        this.zzb = it;
        this.zzc = zzfueVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        zzfsv.zzm(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfuo zzfuoVar = this.zzc.zza;
        i10 = zzfuoVar.zzb;
        zzfuoVar.zzb = i10 - collection.size();
        collection.clear();
        this.zza = null;
    }
}
