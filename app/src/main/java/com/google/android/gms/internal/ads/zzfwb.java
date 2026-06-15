package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfwb {
    public static Object zza(Iterable iterable, Object obj) {
        zzfyb it = ((zzfxr) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static boolean zzb(Iterable iterable, zzfsw zzfswVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            Objects.requireNonNull(zzfswVar);
            return zzd((List) iterable, zzfswVar);
        }
        Iterator it = iterable.iterator();
        Objects.requireNonNull(zzfswVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (zzfswVar.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    private static void zzc(List list, zzfsw zzfswVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzfswVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            list.remove(i11);
        }
    }

    private static boolean zzd(List list, zzfsw zzfswVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzfswVar.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzfswVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzfswVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }
}
