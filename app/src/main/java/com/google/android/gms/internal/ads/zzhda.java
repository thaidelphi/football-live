package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzhda implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhdb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhda(zzhdb zzhdbVar) {
        this.zzb = zzhdbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            zzhdb zzhdbVar = this.zzb;
            int i10 = this.zza;
            this.zza = i10 + 1;
            return zzhdbVar.zza.get(i10);
        }
        zzhdb zzhdbVar2 = this.zzb;
        zzhdbVar2.zza.add(zzhdbVar2.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
