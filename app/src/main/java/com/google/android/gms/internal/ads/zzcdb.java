package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.in;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcdb extends zzfk implements zzgm {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgl zze;
    private zzfw zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdb(String str, zzgr zzgrVar, int i10, int i11, long j10, long j11) {
        super(true);
        zzcv.zzc(str);
        this.zzd = str;
        this.zze = new zzgl();
        this.zzb = i10;
        this.zzc = i11;
        this.zzh = new ArrayDeque();
        this.zzq = j10;
        this.zzr = j11;
        if (zzgrVar != null) {
            zzf(zzgrVar);
        }
    }

    private final void zzl() {
        while (!this.zzh.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzh.remove()).disconnect();
            } catch (Exception e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unexpected error while disconnecting", e8);
            }
        }
        this.zzg = null;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws zzgi {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzl;
            long j11 = this.zzm;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.zzn + j11;
            long j13 = i11;
            long j14 = this.zzr;
            long j15 = this.zzp;
            long j16 = j15 + 1;
            if (j12 + j13 + j14 > j16) {
                long j17 = this.zzo;
                if (j15 < j17) {
                    long min = Math.min(j17, Math.max(((this.zzq + j16) - j14) - 1, (-1) + j16 + j13));
                    zzk(j16, min, 2);
                    this.zzp = min;
                    j15 = min;
                }
            }
            int read = this.zzi.read(bArr, i10, (int) Math.min(j13, ((j15 + 1) - this.zzn) - this.zzm));
            if (read != -1) {
                this.zzm += read;
                zzg(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e8) {
            throw new zzgi(e8, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final long zzb(zzfw zzfwVar) throws zzgi {
        this.zzf = zzfwVar;
        this.zzm = 0L;
        long j10 = zzfwVar.zze;
        long j11 = zzfwVar.zzf;
        long min = j11 == -1 ? this.zzq : Math.min(this.zzq, j11);
        this.zzn = j10;
        HttpURLConnection zzk = zzk(j10, (min + j10) - 1, 1);
        this.zzg = zzk;
        String headerField = zzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j12 = zzfwVar.zzf;
                    if (j12 != -1) {
                        this.zzl = j12;
                        this.zzo = Math.max(parseLong, (this.zzn + j12) - 1);
                    } else {
                        this.zzl = parseLong2 - this.zzn;
                        this.zzo = parseLong2 - 1;
                    }
                    this.zzp = parseLong;
                    this.zzj = true;
                    zzj(zzfwVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected Content-Range [" + headerField + b9.i.f16698e);
                }
            }
        }
        throw new zzccz(headerField, zzfwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzd() throws zzgi {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    throw new zzgi(e8, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfk, com.google.android.gms.internal.ads.zzfr
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final HttpURLConnection zzk(long j10, long j11, int i10) throws zzgi {
        String uri = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j10 + "-" + j11);
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod(in.f17848a);
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String uri2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.zzi != null) {
                            inputStream = new SequenceInputStream(this.zzi, inputStream);
                        }
                        this.zzi = inputStream;
                        return httpURLConnection;
                    } catch (IOException e8) {
                        zzl();
                        throw new zzgi(e8, this.zzf, 2000, i10);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                zzl();
                throw new zzcda(this.zzk, headerFields, this.zzf, i10);
            } catch (IOException e10) {
                zzl();
                String valueOf = String.valueOf(uri2);
                throw new zzgi("Unable to connect to ".concat(valueOf), e10, this.zzf, 2000, i10);
            }
        } catch (IOException e11) {
            String valueOf2 = String.valueOf(uri);
            throw new zzgi("Unable to connect to ".concat(valueOf2), e11, this.zzf, 2000, i10);
        }
    }
}
