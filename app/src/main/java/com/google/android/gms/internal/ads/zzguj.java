package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzguj extends FilterInputStream {
    private int zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzguj(InputStream inputStream, int i10) {
        super(inputStream);
        this.zza = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return Math.min(super.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.zza <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.zza--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        int skip = (int) super.skip(Math.min(j10, this.zza));
        if (skip >= 0) {
            this.zza -= skip;
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zza;
        if (i12 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i10, Math.min(i11, i12));
        if (read >= 0) {
            this.zza -= read;
        }
        return read;
    }
}
