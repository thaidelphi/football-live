package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfuo extends zzfur implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfuo(Map map) {
        zzfsv.zze(map.isEmpty());
        this.zza = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzo(zzfuo zzfuoVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfuoVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfuoVar.zzb -= size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Collection zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection zzb(Collection collection) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfur
    final Collection zzf() {
        return new zzfuq(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfur
    public final Iterator zzg() {
        return new zzfty(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zzh(Object obj, List list, zzful zzfulVar) {
        if (list instanceof RandomAccess) {
            return new zzfuh(this, obj, list, zzfulVar);
        }
        return new zzfun(this, obj, list, zzfulVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfur
    Map zzj() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfuf(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfui(this, (SortedMap) map);
        }
        return new zzfub(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfur
    Set zzl() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfug(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfuj(this, (SortedMap) map);
        }
        return new zzfue(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final void zzp() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfur, com.google.android.gms.internal.ads.zzfwt
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.zzb++;
            return true;
        } else {
            return false;
        }
    }
}
