package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzgvp extends zzgut {
    private static final Logger zza = Logger.getLogger(zzgvp.class.getName());
    private static final boolean zzb = zzgzh.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgvq zze;

    private zzgvp() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgvp(zzgvo zzgvoVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzA(zzgxv zzgxvVar, zzgyo zzgyoVar) {
        int zzaM = ((zzgul) zzgxvVar).zzaM(zzgyoVar);
        return zzD(zzaM) + zzaM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzB(int i10) {
        return i10 > 4096 ? CodedOutputStream.DEFAULT_BUFFER_SIZE : i10;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzgzm.zze(str);
        } catch (zzgzl unused) {
            length = str.getBytes(zzgwx.zza).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzE(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzy(int i10, zzgxv zzgxvVar, zzgyo zzgyoVar) {
        int zzD = zzD(i10 << 3);
        return zzD + zzD + ((zzgul) zzgxvVar).zzaM(zzgyoVar);
    }

    public static int zzz(zzgxv zzgxvVar) {
        int zzaY = zzgxvVar.zzaY();
        return zzD(zzaY) + zzaY;
    }

    public final void zzF() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzG(String str, zzgzl zzgzlVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzgzlVar);
        byte[] bytes = str.getBytes(zzgwx.zza);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzgvm(e8);
        }
    }

    public abstract void zzK() throws IOException;

    public abstract void zzL(byte b10) throws IOException;

    public abstract void zzM(int i10, boolean z10) throws IOException;

    public abstract void zzN(int i10, zzgvc zzgvcVar) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzgut
    public abstract void zza(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i10, int i11) throws IOException;

    public abstract void zzi(int i10) throws IOException;

    public abstract void zzj(int i10, long j10) throws IOException;

    public abstract void zzk(long j10) throws IOException;

    public abstract void zzl(int i10, int i11) throws IOException;

    public abstract void zzm(int i10) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(int i10, zzgxv zzgxvVar, zzgyo zzgyoVar) throws IOException;

    public abstract void zzo(int i10, zzgxv zzgxvVar) throws IOException;

    public abstract void zzp(int i10, zzgvc zzgvcVar) throws IOException;

    public abstract void zzq(int i10, String str) throws IOException;

    public abstract void zzs(int i10, int i11) throws IOException;

    public abstract void zzt(int i10, int i11) throws IOException;

    public abstract void zzu(int i10) throws IOException;

    public abstract void zzv(int i10, long j10) throws IOException;

    public abstract void zzw(long j10) throws IOException;
}
