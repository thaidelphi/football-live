package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzks extends zzio implements RandomAccess, zzkt {
    public static final zzkt zza;
    private static final zzks zzb;
    private final List zzc;

    static {
        zzks zzksVar = new zzks(10);
        zzb = zzksVar;
        zzksVar.zzb();
        zza = zzksVar;
    }

    public zzks() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjd) {
            return ((zzjd) obj).zzn(zzkm.zzb);
        }
        return zzkm.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzio, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zzbP();
        this.zzc.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzio, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zzbP();
        if (collection instanceof zzkt) {
            collection = ((zzkt) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzio, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbP();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzio, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbP();
        Object remove = this.zzc.remove(i10);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.measurement.zzio, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zzbP();
        return zzj(this.zzc.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final /* bridge */ /* synthetic */ zzkl zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzks(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final zzkt zze() {
        return zzc() ? new zzms(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final Object zzf(int i10) {
        return this.zzc.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjd) {
            zzjd zzjdVar = (zzjd) obj;
            String zzn = zzjdVar.zzn(zzkm.zzb);
            if (zzjdVar.zzi()) {
                this.zzc.set(i10, zzn);
            }
            return zzn;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzkm.zzh(bArr);
        if (zzkm.zzi(bArr)) {
            this.zzc.set(i10, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final void zzi(zzjd zzjdVar) {
        zzbP();
        this.zzc.add(zzjdVar);
        ((AbstractList) this).modCount++;
    }

    public zzks(int i10) {
        this.zzc = new ArrayList(i10);
    }

    private zzks(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzio, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
