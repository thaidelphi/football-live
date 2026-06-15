package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfxk extends zzfwa {
    private final transient zzfvy zza;
    private final transient zzfvv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxk(zzfvy zzfvyVar, zzfvv zzfvvVar) {
        this.zza = zzfvyVar;
        this.zzb = zzfvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, com.google.android.gms.internal.ads.zzfvq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfvq
    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, com.google.android.gms.internal.ads.zzfvq
    public final zzfvv zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, com.google.android.gms.internal.ads.zzfvq
    public final zzfyb zze() {
        return this.zzb.listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfvq
    public final boolean zzf() {
        return true;
    }
}
