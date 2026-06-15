package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfwc extends zzftw {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfsw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwc(Iterator it, zzfsw zzfswVar) {
        this.zza = it;
        this.zzb = zzfswVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftw
    protected final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfsw zzfswVar = this.zzb;
            Object next = it.next();
            if (zzfswVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
