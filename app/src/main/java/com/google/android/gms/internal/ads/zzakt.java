package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzakt {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaks
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((zzakt) obj).zzb.zzb, ((zzakt) obj2).zzb.zzb);
            return compare;
        }
    };
    private final zzaku zzb;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzakt(zzaku zzakuVar, int i10, zzakx zzakxVar) {
        this.zzb = zzakuVar;
        this.zzc = i10;
    }
}
