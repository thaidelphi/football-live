package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import java.util.Iterator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfxy extends zzfwa {
    final transient Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxy(Object obj) {
        Objects.requireNonNull(obj);
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfvq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, com.google.android.gms.internal.ads.zzfvq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfwe(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zza.toString();
        return b9.i.f16696d + obj + b9.i.f16698e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfvq
    public final int zza(Object[] objArr, int i10) {
        objArr[i10] = this.zza;
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, com.google.android.gms.internal.ads.zzfvq
    public final zzfvv zzd() {
        return zzfvv.zzo(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, com.google.android.gms.internal.ads.zzfvq
    public final zzfyb zze() {
        return new zzfwe(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfvq
    public final boolean zzf() {
        return false;
    }
}
