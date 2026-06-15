package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzful extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzful zzc;
    final Collection zzd;
    final /* synthetic */ zzfuo zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzful(zzfuo zzfuoVar, Object obj, Collection collection, zzful zzfulVar) {
        this.zze = zzfuoVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfulVar;
        this.zzd = zzfulVar == null ? null : zzfulVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzfuo zzfuoVar = this.zze;
            i10 = zzfuoVar.zzb;
            zzfuoVar.zzb = i10 + 1;
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfuo zzfuoVar = this.zze;
            i10 = zzfuoVar.zzb;
            zzfuoVar.zzb = i10 + (size2 - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i10;
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzfuo zzfuoVar = this.zze;
        i10 = zzfuoVar.zzb;
        zzfuoVar.zzb = i10 - size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzfuk(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfuo zzfuoVar = this.zze;
            i10 = zzfuoVar.zzb;
            zzfuoVar.zzb = i10 - 1;
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzfuo zzfuoVar = this.zze;
            int i11 = size2 - size;
            i10 = zzfuoVar.zzb;
            zzfuoVar.zzb = i10 + i11;
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzfuo zzfuoVar = this.zze;
            int i11 = size2 - size;
            i10 = zzfuoVar.zzb;
            zzfuoVar.zzb = i10 + i11;
            zzc();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        Map map;
        zzful zzfulVar = this.zzc;
        if (zzfulVar != null) {
            zzfulVar.zza();
            return;
        }
        zzfuo zzfuoVar = this.zze;
        Object obj = this.zza;
        map = zzfuoVar.zza;
        map.put(obj, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        zzful zzfulVar = this.zzc;
        if (zzfulVar != null) {
            zzfulVar.zzb();
            zzful zzfulVar2 = this.zzc;
            if (zzfulVar2.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        } else if (this.zzb.isEmpty()) {
            zzfuo zzfuoVar = this.zze;
            Object obj = this.zza;
            map = zzfuoVar.zza;
            Collection collection = (Collection) map.get(obj);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        Map map;
        zzful zzfulVar = this.zzc;
        if (zzfulVar != null) {
            zzfulVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzfuo zzfuoVar = this.zze;
            Object obj = this.zza;
            map = zzfuoVar.zza;
            map.remove(obj);
        }
    }
}
