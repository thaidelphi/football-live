package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzgvc implements Iterable<Byte>, Serializable {
    public static final zzgvc zzb = new zzguz(zzgwx.zzb);
    private int zza = 0;

    static {
        int i10 = zzgup.zza;
    }

    private static zzgvc zzc(Iterator it, int i10) {
        if (i10 > 0) {
            if (i10 == 1) {
                return (zzgvc) it.next();
            }
            int i11 = i10 >>> 1;
            zzgvc zzc = zzc(it, i11);
            zzgvc zzc2 = zzc(it, i10 - i11);
            if (Api.BaseClientBuilder.API_PRIORITY_OTHER - zzc.zzd() >= zzc2.zzd()) {
                return zzgyn.zzC(zzc, zzc2);
            }
            int zzd = zzc.zzd();
            int zzd2 = zzc2.zzd();
            throw new IllegalArgumentException("ByteString would be too long: " + zzd + "+" + zzd2);
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
            } else if (i11 < i10) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
            }
        }
        return i13;
    }

    public static zzgva zzt() {
        return new zzgva(128);
    }

    public static zzgvc zzu(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return zzb;
        }
        return zzc(iterable.iterator(), size);
    }

    public static zzgvc zzv(byte[] bArr, int i10, int i11) {
        zzq(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzguz(bArr2);
    }

    public static zzgvc zzw(String str) {
        return new zzguz(str.getBytes(zzgwx.zza));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzy(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 == 0) {
            int zzd = zzd();
            i10 = zzi(zzd, 0, zzd);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zza = i10;
        }
        return i10;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgyy.zza(this) : zzgyy.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final byte[] zzA() {
        int zzd = zzd();
        if (zzd == 0) {
            return zzgwx.zzb;
        }
        byte[] bArr = new byte[zzd];
        zze(bArr, 0, 0, zzd);
        return bArr;
    }

    public abstract byte zza(int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzd();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzf();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean zzh();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzi(int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzj(int i10, int i11, int i12);

    public abstract zzgvc zzk(int i10, int i11);

    public abstract zzgvi zzl();

    protected abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzo(zzgut zzgutVar) throws IOException;

    public abstract boolean zzp();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzr() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs */
    public zzgux iterator() {
        return new zzguu(this);
    }

    public final String zzx() {
        return zzd() == 0 ? "" : zzm(zzgwx.zza);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i10, int i11, int i12) {
        zzq(0, i12, zzd());
        zzq(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }
}
