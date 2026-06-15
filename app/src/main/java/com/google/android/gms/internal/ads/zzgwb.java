package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgwb extends zzguo implements RandomAccess, zzgwr, zzgye {
    private static final float[] zza;
    private static final zzgwb zzb;
    private float[] zzc;
    private int zzd;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        zzb = new zzgwb(fArr, 0, false);
    }

    zzgwb() {
        this(zza, 0, true);
    }

    public static zzgwb zze() {
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
        float floatValue = ((Float) obj).floatValue();
        zzdG();
        if (i10 >= 0 && i10 <= (i11 = this.zzd)) {
            int i12 = i10 + 1;
            float[] fArr = this.zzc;
            int length = fArr.length;
            if (i11 < length) {
                System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
            } else {
                float[] fArr2 = new float[zzj(length)];
                System.arraycopy(this.zzc, 0, fArr2, 0, i10);
                System.arraycopy(this.zzc, i10, fArr2, i12, this.zzd - i10);
                this.zzc = fArr2;
            }
            this.zzc[i10] = floatValue;
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
        if (!(collection instanceof zzgwb)) {
            return super.addAll(collection);
        }
        zzgwb zzgwbVar = (zzgwb) collection;
        int i10 = zzgwbVar.zzd;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzd;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.zzc;
            if (i12 > fArr.length) {
                this.zzc = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(zzgwbVar.zzc, 0, this.zzc, this.zzd, zzgwbVar.zzd);
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
        if (obj instanceof zzgwb) {
            zzgwb zzgwbVar = (zzgwb) obj;
            if (this.zzd != zzgwbVar.zzd) {
                return false;
            }
            float[] fArr = zzgwbVar.zzc;
            for (int i10 = 0; i10 < this.zzd; i10++) {
                if (Float.floatToIntBits(this.zzc[i10]) != Float.floatToIntBits(fArr[i10])) {
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
        return Float.valueOf(this.zzc[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzd; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.zzc[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i10 = this.zzd;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.zzc[i11] == floatValue) {
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
        float[] fArr = this.zzc;
        float f10 = fArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zzdG();
        if (i11 >= i10) {
            float[] fArr = this.zzc;
            System.arraycopy(fArr, i11, fArr, i10, this.zzd - i11);
            this.zzd -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzdG();
        zzl(i10);
        float[] fArr = this.zzc;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final float zzd(int i10) {
        zzl(i10);
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    /* renamed from: zzg */
    public final zzgwr zzf(int i10) {
        if (i10 >= this.zzd) {
            return new zzgwb(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(float f10) {
        zzdG();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            float[] fArr = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr, 0, this.zzd);
            this.zzc = fArr;
        }
        float[] fArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        fArr2[i11] = f10;
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
        this.zzc = new float[Math.max(i10, 10)];
    }

    private zzgwb(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.zzc = fArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }
}
