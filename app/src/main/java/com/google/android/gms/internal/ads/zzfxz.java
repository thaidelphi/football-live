package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class zzfxz implements Iterator {
    final Iterator zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxz(Iterator it) {
        Objects.requireNonNull(it);
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.zzb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzb.remove();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zza(Object obj);
}
