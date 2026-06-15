package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzfun extends zzful implements List {
    final /* synthetic */ zzfuo zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfun(zzfuo zzfuoVar, Object obj, List list, zzful zzfulVar) {
        super(zzfuoVar, obj, list, zzfulVar);
        this.zzf = zzfuoVar;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i10, obj);
        zzfuo zzfuoVar = this.zzf;
        i11 = zzfuoVar.zzb;
        zzfuoVar.zzb = i11 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        int i11;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i10, collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfuo zzfuoVar = this.zzf;
            i11 = zzfuoVar.zzb;
            zzfuoVar.zzb = i11 + (size2 - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzb();
        return ((List) this.zzb).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzfum(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        zzb();
        Object remove = ((List) this.zzb).remove(i10);
        zzfuo zzfuoVar = this.zzf;
        i11 = zzfuoVar.zzb;
        zzfuoVar.zzb = i11 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.zzb).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        List subList = ((List) this.zzb).subList(i10, i11);
        zzful zzfulVar = this.zzc;
        if (zzfulVar == null) {
            zzfulVar = this;
        }
        return this.zzf.zzh(this.zza, subList, zzfulVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new zzfum(this, i10);
    }
}
