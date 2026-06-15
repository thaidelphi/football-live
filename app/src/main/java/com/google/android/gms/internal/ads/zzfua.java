package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfua implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzfub zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfua(zzfub zzfubVar) {
        this.zzc = zzfubVar;
        this.zza = zzfubVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        zzfsv.zzm(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfuo zzfuoVar = this.zzc.zzb;
        i10 = zzfuoVar.zzb;
        zzfuoVar.zzb = i10 - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
