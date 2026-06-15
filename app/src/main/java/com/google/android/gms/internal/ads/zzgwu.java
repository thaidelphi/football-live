package com.google.android.gms.internal.ads;

import java.util.AbstractList;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgwu extends AbstractList {
    private final zzgws zza;
    private final zzgwt zzb;

    public zzgwu(zzgws zzgwsVar, zzgwt zzgwtVar) {
        this.zza = zzgwsVar;
        this.zzb = zzgwtVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.zzb.zzb(this.zza.zzd(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
