package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgwl extends zzguo implements RandomAccess, zzgws, zzgye {
    private static final int[] zza;
    private static final zzgwl zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzgwl(iArr, 0, false);
    }

    zzgwl() {
        this(zza, 0, true);
    }

    public static zzgwl zzg() {
        return zzb;
    }

    private static int zzk(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String zzl(int i10) {
        int i11 = this.zzd;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzm(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzl(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        zzdG();
        if (i10 >= 0 && i10 <= (i11 = this.zzd)) {
            int i12 = i10 + 1;
            int[] iArr = this.zzc;
            int length = iArr.length;
            if (i11 < length) {
                System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
            } else {
                int[] iArr2 = new int[zzk(length)];
                System.arraycopy(this.zzc, 0, iArr2, 0, i10);
                System.arraycopy(this.zzc, i10, iArr2, i12, this.zzd - i10);
                this.zzc = iArr2;
            }
            this.zzc[i10] = intValue;
            this.zzd++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzl(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdG();
        byte[] bArr = zzgwx.zzb;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzgwl)) {
            return super.addAll(collection);
        }
        zzgwl zzgwlVar = (zzgwl) collection;
        int i10 = zzgwlVar.zzd;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzd;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.zzc;
            if (i12 > iArr.length) {
                this.zzc = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(zzgwlVar.zzc, 0, this.zzc, this.zzd, zzgwlVar.zzd);
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
        if (obj instanceof zzgwl) {
            zzgwl zzgwlVar = (zzgwl) obj;
            if (this.zzd != zzgwlVar.zzd) {
                return false;
            }
            int[] iArr = zzgwlVar.zzc;
            for (int i10 = 0; i10 < this.zzd; i10++) {
                if (this.zzc[i10] != iArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzm(i10);
        return Integer.valueOf(this.zzc[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzd; i11++) {
            i10 = (i10 * 31) + this.zzc[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.zzd;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.zzc[i11] == intValue) {
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
        zzm(i10);
        int[] iArr = this.zzc;
        int i12 = iArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zzdG();
        if (i11 >= i10) {
            int[] iArr = this.zzc;
            System.arraycopy(iArr, i11, iArr, i10, this.zzd - i11);
            this.zzd -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        return Integer.valueOf(zze(i10, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgws
    public final int zzd(int i10) {
        zzm(i10);
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgws
    public final int zze(int i10, int i11) {
        zzdG();
        zzm(i10);
        int[] iArr = this.zzc;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    /* renamed from: zzh */
    public final zzgws zzf(int i10) {
        if (i10 >= this.zzd) {
            return new zzgwl(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgws
    public final void zzi(int i10) {
        zzdG();
        int i11 = this.zzd;
        int length = this.zzc.length;
        if (i11 == length) {
            int[] iArr = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i12 = this.zzd;
        this.zzd = i12 + 1;
        iArr2[i12] = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(int i10) {
        int length = this.zzc.length;
        if (i10 <= length) {
            return;
        }
        if (length != 0) {
            while (length < i10) {
                length = zzk(length);
            }
            this.zzc = Arrays.copyOf(this.zzc, length);
            return;
        }
        this.zzc = new int[Math.max(i10, 10)];
    }

    private zzgwl(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.zzc = iArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
