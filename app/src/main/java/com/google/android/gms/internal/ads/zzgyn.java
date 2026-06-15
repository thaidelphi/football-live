package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgyn extends zzgvc {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzgvc zzd;
    private final zzgvc zze;
    private final int zzf;
    private final int zzg;

    private zzgyn(zzgvc zzgvcVar, zzgvc zzgvcVar2) {
        this.zzd = zzgvcVar;
        this.zze = zzgvcVar2;
        int zzd = zzgvcVar.zzd();
        this.zzf = zzd;
        this.zzc = zzd + zzgvcVar2.zzd();
        this.zzg = Math.max(zzgvcVar.zzf(), zzgvcVar2.zzf()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgvc zzC(zzgvc zzgvcVar, zzgvc zzgvcVar2) {
        if (zzgvcVar2.zzd() == 0) {
            return zzgvcVar;
        }
        if (zzgvcVar.zzd() == 0) {
            return zzgvcVar2;
        }
        int zzd = zzgvcVar.zzd() + zzgvcVar2.zzd();
        if (zzd < 128) {
            return zzD(zzgvcVar, zzgvcVar2);
        }
        if (zzgvcVar instanceof zzgyn) {
            zzgyn zzgynVar = (zzgyn) zzgvcVar;
            if (zzgynVar.zze.zzd() + zzgvcVar2.zzd() < 128) {
                return new zzgyn(zzgynVar.zzd, zzD(zzgynVar.zze, zzgvcVar2));
            }
            if (zzgynVar.zzd.zzf() > zzgynVar.zze.zzf() && zzgynVar.zzg > zzgvcVar2.zzf()) {
                return new zzgyn(zzgynVar.zzd, new zzgyn(zzgynVar.zze, zzgvcVar2));
            }
        }
        if (zzd >= zzc(Math.max(zzgvcVar.zzf(), zzgvcVar2.zzf()) + 1)) {
            return new zzgyn(zzgvcVar, zzgvcVar2);
        }
        return zzgyk.zza(new zzgyk(null), zzgvcVar, zzgvcVar2);
    }

    private static zzgvc zzD(zzgvc zzgvcVar, zzgvc zzgvcVar2) {
        int zzd = zzgvcVar.zzd();
        int zzd2 = zzgvcVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgvcVar.zzz(bArr, 0, 0, zzd);
        zzgvcVar2.zzz(bArr, 0, zzd, zzd2);
        return new zzguz(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        return i10 >= 47 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final boolean equals(Object obj) {
        boolean zzg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgvc)) {
            return false;
        }
        zzgvc zzgvcVar = (zzgvc) obj;
        if (this.zzc != zzgvcVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgvcVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgyl zzgylVar = new zzgyl(this, null);
        zzguy next = zzgylVar.next();
        zzgyl zzgylVar2 = new zzgyl(zzgvcVar, null);
        zzguy next2 = zzgylVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int zzd = next.zzd() - i10;
            int zzd2 = next2.zzd() - i11;
            int min = Math.min(zzd, zzd2);
            if (i10 == 0) {
                zzg = next.zzg(next2, i11, min);
            } else {
                zzg = next2.zzg(next, i10, min);
            }
            if (!zzg) {
                return false;
            }
            i12 += min;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzgylVar.next();
                i10 = 0;
            } else {
                i10 += min;
            }
            if (min == zzd2) {
                next2 = zzgylVar2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvc, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzgyj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final byte zza(int i10) {
        zzgvc.zzy(i10, this.zzc);
        return zzb(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgvc
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zzb(i10) : this.zze.zzb(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final int zzd() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgvc
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else if (i10 >= i14) {
            this.zze.zze(bArr, i10 - i14, i11, i12);
        } else {
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgvc
    public final int zzf() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgvc
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgvc
    public final int zzi(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzi(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzi(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzi(this.zzd.zzi(i10, i11, i15), 0, i12 - i15);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgvc
    public final int zzj(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzj(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzj(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzj(this.zzd.zzj(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final zzgvc zzk(int i10, int i11) {
        int zzq = zzgvc.zzq(i10, i11, this.zzc);
        if (zzq == 0) {
            return zzgvc.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzk(i10, i11);
        }
        if (i10 >= i12) {
            return this.zze.zzk(i10 - i12, i11 - i12);
        }
        zzgvc zzgvcVar = this.zzd;
        return new zzgyn(zzgvcVar.zzk(i10, zzgvcVar.zzd()), this.zze.zzk(0, i11 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final zzgvi zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        zzgyl zzgylVar = new zzgyl(this, null);
        while (zzgylVar.hasNext()) {
            arrayList.add(zzgylVar.next().zzn());
        }
        int i10 = zzgvi.zze;
        boolean z10 = false;
        int i11 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i11 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z10 |= true;
            } else {
                z10 = byteBuffer.isDirect() ? z10 | true : z10 | true;
            }
        }
        if (z10) {
            return new zzgve(arrayList, i11, true, null);
        }
        return zzgvi.zzG(new zzgxa(arrayList), CodedOutputStream.DEFAULT_BUFFER_SIZE);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    protected final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final ByteBuffer zzn() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgvc
    public final void zzo(zzgut zzgutVar) throws IOException {
        this.zzd.zzo(zzgutVar);
        this.zze.zzo(zzgutVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final boolean zzp() {
        zzgvc zzgvcVar = this.zzd;
        zzgvc zzgvcVar2 = this.zze;
        return zzgvcVar2.zzj(zzgvcVar.zzj(0, 0, this.zzf), 0, zzgvcVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final zzgux zzs() {
        return new zzgyj(this);
    }
}
