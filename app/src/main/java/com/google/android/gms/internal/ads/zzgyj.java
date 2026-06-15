package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgyj extends zzguv {
    final zzgyl zza;
    zzgux zzb = zzb();
    final /* synthetic */ zzgyn zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgyj(zzgyn zzgynVar) {
        this.zzc = zzgynVar;
        this.zza = new zzgyl(zzgynVar, null);
    }

    private final zzgux zzb() {
        zzgyl zzgylVar = this.zza;
        if (zzgylVar.hasNext()) {
            return zzgylVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final byte zza() {
        zzgux zzguxVar = this.zzb;
        if (zzguxVar != null) {
            byte zza = zzguxVar.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
