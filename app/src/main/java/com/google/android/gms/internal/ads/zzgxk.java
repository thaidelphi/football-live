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
public final class zzgxk extends zzguo implements RandomAccess, zzgwv, zzgye {
    private static final long[] zza;
    private static final zzgxk zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzgxk(jArr, 0, false);
    }

    zzgxk() {
        this(zza, 0, true);
    }

    public static zzgxk zzh() {
        return zzb;
    }

    private static int zzj(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String zzk(int i10) {
        int i11 = this.zzd;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzl(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        zzdG();
        if (i10 >= 0 && i10 <= (i11 = this.zzd)) {
            int i12 = i10 + 1;
            long[] jArr = this.zzc;
            int length = jArr.length;
            if (i11 < length) {
                System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
            } else {
                long[] jArr2 = new long[zzj(length)];
                System.arraycopy(this.zzc, 0, jArr2, 0, i10);
                System.arraycopy(this.zzc, i10, jArr2, i12, this.zzd - i10);
                this.zzc = jArr2;
            }
            this.zzc[i10] = longValue;
            this.zzd++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzk(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdG();
        byte[] bArr = zzgwx.zzb;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzgxk)) {
            return super.addAll(collection);
        }
        zzgxk zzgxkVar = (zzgxk) collection;
        int i10 = zzgxkVar.zzd;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzd;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.zzc;
            if (i12 > jArr.length) {
                this.zzc = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(zzgxkVar.zzc, 0, this.zzc, this.zzd, zzgxkVar.zzd);
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
        if (obj instanceof zzgxk) {
            zzgxk zzgxkVar = (zzgxk) obj;
            if (this.zzd != zzgxkVar.zzd) {
                return false;
            }
            long[] jArr = zzgxkVar.zzc;
            for (int i10 = 0; i10 < this.zzd; i10++) {
                if (this.zzc[i10] != jArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzl(i10);
        return Long.valueOf(this.zzc[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzd; i11++) {
            long j10 = this.zzc[i11];
            byte[] bArr = zzgwx.zzb;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i10 = this.zzd;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.zzc[i11] == longValue) {
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
        zzl(i10);
        long[] jArr = this.zzc;
        long j10 = jArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zzdG();
        if (i11 >= i10) {
            long[] jArr = this.zzc;
            System.arraycopy(jArr, i11, jArr, i10, this.zzd - i11);
            this.zzd -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        return Long.valueOf(zzd(i10, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgwv
    public final long zza(int i10) {
        zzl(i10);
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgwv
    public final long zzd(int i10, long j10) {
        zzdG();
        zzl(i10);
        long[] jArr = this.zzc;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    /* renamed from: zze */
    public final zzgwv zzf(int i10) {
        if (i10 >= this.zzd) {
            return new zzgxk(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgwv
    public final void zzg(long j10) {
        zzdG();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            long[] jArr = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        jArr2[i11] = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(int i10) {
        int length = this.zzc.length;
        if (i10 <= length) {
            return;
        }
        if (length != 0) {
            while (length < i10) {
                length = zzj(length);
            }
            this.zzc = Arrays.copyOf(this.zzc, length);
            return;
        }
        this.zzc = new long[Math.max(i10, 10)];
    }

    private zzgxk(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.zzc = jArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
