package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgus extends zzguo implements RandomAccess, zzgwm, zzgye {
    private static final boolean[] zza;
    private static final zzgus zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        zzb = new zzgus(zArr, 0, false);
    }

    zzgus() {
        this(zza, 0, true);
    }

    public static zzgus zzd() {
        return zzb;
    }

    private static int zzi(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String zzj(int i10) {
        int i11 = this.zzd;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzk(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzj(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzdG();
        if (i10 >= 0 && i10 <= (i11 = this.zzd)) {
            int i12 = i10 + 1;
            boolean[] zArr = this.zzc;
            int length = zArr.length;
            if (i11 < length) {
                System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[zzi(length)];
                System.arraycopy(this.zzc, 0, zArr2, 0, i10);
                System.arraycopy(this.zzc, i10, zArr2, i12, this.zzd - i10);
                this.zzc = zArr2;
            }
            this.zzc[i10] = booleanValue;
            this.zzd++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzj(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdG();
        byte[] bArr = zzgwx.zzb;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzgus)) {
            return super.addAll(collection);
        }
        zzgus zzgusVar = (zzgus) collection;
        int i10 = zzgusVar.zzd;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzd;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.zzc;
            if (i12 > zArr.length) {
                this.zzc = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(zzgusVar.zzc, 0, this.zzc, this.zzd, zzgusVar.zzd);
            this.zzd = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgus) {
            zzgus zzgusVar = (zzgus) obj;
            if (this.zzd != zzgusVar.zzd) {
                return false;
            }
            boolean[] zArr = zzgusVar.zzc;
            for (int i10 = 0; i10 < this.zzd; i10++) {
                if (this.zzc[i10] != zArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzk(i10);
        return Boolean.valueOf(this.zzc[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzd; i11++) {
            i10 = (i10 * 31) + zzgwx.zza(this.zzc[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i10 = this.zzd;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.zzc[i11] == booleanValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        zzdG();
        zzk(i10);
        boolean[] zArr = this.zzc;
        boolean z10 = zArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zzdG();
        if (i11 >= i10) {
            boolean[] zArr = this.zzc;
            System.arraycopy(zArr, i11, zArr, i10, this.zzd - i11);
            this.zzd -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzdG();
        zzk(i10);
        boolean[] zArr = this.zzc;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    /* renamed from: zze */
    public final zzgwm zzf(int i10) {
        if (i10 >= this.zzd) {
            return new zzgus(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(boolean z10) {
        zzdG();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr, 0, this.zzd);
            this.zzc = zArr;
        }
        boolean[] zArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        zArr2[i11] = z10;
    }

    public final boolean zzh(int i10) {
        zzk(i10);
        return this.zzc[i10];
    }

    private zzgus(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.zzc = zArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Boolean) obj).booleanValue());
        return true;
    }
}
