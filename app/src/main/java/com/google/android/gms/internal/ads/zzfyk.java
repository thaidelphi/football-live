package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfyk extends FilterInputStream {
    private long zza;
    private long zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyk(InputStream inputStream, long j10) {
        super(inputStream);
        this.zzb = -1L;
        Objects.requireNonNull(inputStream);
        zzfsv.zzf(j10 >= 0, "limit must be non-negative");
        this.zza = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.zzb = this.zza;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.zza == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.zza--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.zzb != -1) {
                ((FilterInputStream) this).in.reset();
                this.zza = this.zzb;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.zza));
        this.zza -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.zza;
        if (j10 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
        if (read != -1) {
            this.zza -= read;
        }
        return read;
    }
}
