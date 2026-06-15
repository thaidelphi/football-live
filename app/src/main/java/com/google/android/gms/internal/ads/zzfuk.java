package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class zzfuk implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzful zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuk(zzful zzfulVar) {
        Iterator it;
        this.zzc = zzfulVar;
        Collection collection = zzfulVar.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuk(zzful zzfulVar, Iterator it) {
        this.zzc = zzfulVar;
        this.zzb = zzfulVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        this.zza.remove();
        zzfuo zzfuoVar = this.zzc.zze;
        i10 = zzfuoVar.zzb;
        zzfuoVar.zzb = i10 - 1;
        this.zzc.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
