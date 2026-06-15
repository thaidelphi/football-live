package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfyx extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyx(int[] iArr, int i10, int i11) {
        this.zza = iArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzfyy.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfyx) {
            zzfyx zzfyxVar = (zzfyx) obj;
            int i10 = this.zzc - this.zzb;
            if (zzfyxVar.zzc - zzfyxVar.zzb == i10) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (this.zza[this.zzb + i11] != zzfyxVar.zza[zzfyxVar.zzb + i11]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzfsv.zza(i10, this.zzc - this.zzb, "index");
        return Integer.valueOf(this.zza[this.zzb + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.zzb; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + this.zza[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int zza;
        if (!(obj instanceof Integer) || (zza = zzfyy.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc)) < 0) {
            return -1;
        }
        return zza - this.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int intValue = ((Integer) obj).intValue();
            int i10 = this.zzb;
            int i11 = this.zzc - 1;
            while (true) {
                if (i11 < i10) {
                    i11 = -1;
                    break;
                } else if (iArr[i11] == intValue) {
                    break;
                } else {
                    i11--;
                }
            }
            if (i11 >= 0) {
                return i11 - this.zzb;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        zzfsv.zza(i10, this.zzc - this.zzb, "index");
        int[] iArr = this.zza;
        int i11 = this.zzb + i10;
        int i12 = iArr[i11];
        Objects.requireNonNull(num);
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        zzfsv.zzk(i10, i11, this.zzc - this.zzb);
        if (i10 == i11) {
            return Collections.emptyList();
        }
        int[] iArr = this.zza;
        int i12 = this.zzb;
        return new zzfyx(iArr, i12 + i10, i11 + i12);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.zzc - this.zzb) * 5);
        sb.append('[');
        sb.append(this.zza[this.zzb]);
        int i10 = this.zzb;
        while (true) {
            i10++;
            if (i10 < this.zzc) {
                sb.append(", ");
                sb.append(this.zza[i10]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
