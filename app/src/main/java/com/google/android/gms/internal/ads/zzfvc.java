package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfvc extends AbstractCollection {
    final /* synthetic */ zzfve zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvc(zzfve zzfveVar) {
        this.zza = zzfveVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfve zzfveVar = this.zza;
        Map zzl = zzfveVar.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzfux(zzfveVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
