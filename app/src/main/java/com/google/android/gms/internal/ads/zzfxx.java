package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfxx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    public static zzfxv zzb(Set set, Set set2) {
        zzfsv.zzc(set, "set1");
        zzfsv.zzc(set2, "set2");
        return new zzfxr(set, set2);
    }

    public static Set zzc(Set set, zzfsw zzfswVar) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof zzfxs) {
                zzfxs zzfxsVar = (zzfxs) set;
                return new zzfxs((Set) zzfxsVar.zza, zzfsz.zza(zzfxsVar.zzb, zzfswVar));
            }
            Objects.requireNonNull(set);
            return new zzfxs(set, zzfswVar);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof zzfxs) {
            zzfxs zzfxsVar2 = (zzfxs) sortedSet;
            return new zzfxt((SortedSet) zzfxsVar2.zza, zzfsz.zza(zzfxsVar2.zzb, zzfswVar));
        }
        Objects.requireNonNull(sortedSet);
        return new zzfxt(sortedSet, zzfswVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zze(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof zzfxd) {
            collection = ((zzfxd) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        return zzf(set, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzf(Set set, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
