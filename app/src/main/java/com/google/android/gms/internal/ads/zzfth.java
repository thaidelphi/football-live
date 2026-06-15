package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfth implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzftk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfth(zzftk zzftkVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzftkVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfsn.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
