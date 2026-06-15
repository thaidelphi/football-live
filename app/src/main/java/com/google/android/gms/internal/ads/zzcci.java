package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcci extends zzfk implements zzgm {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzgl zzg;
    private zzfw zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcci(String str, zzgr zzgrVar, int i10, int i11, int i12) {
        super(true);
        this.zzc = new zzcch(this);
        this.zzr = new HashSet();
        zzcv.zzc(str);
        this.zzf = str;
        this.zzg = new zzgl();
        this.zzd = i10;
        this.zze = i11;
        this.zzq = i12;
        if (zzgrVar != null) {
            zzf(zzgrVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unexpected error while disconnecting", e8);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws zzgi {
        try {
            if (this.zzo != this.zzm) {
                byte[] bArr2 = (byte[]) zzb.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
                }
                while (true) {
                    long j10 = this.zzo;
                    long j11 = this.zzm;
                    if (j10 != j11) {
                        int read = this.zzj.read(bArr2, 0, (int) Math.min(j11 - j10, bArr2.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzo += read;
                            zzg(read);
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        zzb.set(bArr2);
                        break;
                    }
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.zzn;
            if (j12 != -1) {
                long j13 = j12 - this.zzp;
                if (j13 != 0) {
                    i11 = (int) Math.min(i11, j13);
                }
                return -1;
            }
            int read2 = this.zzj.read(bArr, i10, i11);
            if (read2 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += read2;
            zzg(read2);
            return read2;
        } catch (IOException e8) {
            throw new zzgi(e8, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
        if (r2 == 0) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[Catch: IOException -> 0x0296, TryCatch #2 {IOException -> 0x0296, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:93:0x023b, B:95:0x0246, B:97:0x0257, B:100:0x0260, B:101:0x026f, B:103:0x0277, B:104:0x027e, B:105:0x027f, B:106:0x0295), top: B:114:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0246 A[Catch: IOException -> 0x0296, TryCatch #2 {IOException -> 0x0296, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:93:0x023b, B:95:0x0246, B:97:0x0257, B:100:0x0260, B:101:0x026f, B:103:0x0277, B:104:0x027e, B:105:0x027f, B:106:0x0295), top: B:114:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzfr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzfw r21) throws com.google.android.gms.internal.ads.zzgi {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcci.zzb(com.google.android.gms.internal.ads.zzfw):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzd() throws zzgi {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                int i10 = zzeh.zza;
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    throw new zzgi(e8, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfk, com.google.android.gms.internal.ads.zzfr
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzm(int i10) {
        this.zzq = i10;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e8) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to update receive buffer size.", e8);
                }
            }
        }
    }
}
