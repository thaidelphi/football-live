package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfoz extends zzfon {
    private zzftn<Integer> zza;
    private zzftn<Integer> zzb;
    private zzfoy zzc;
    private HttpURLConnection zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoz() {
        this(new zzftn() { // from class: com.google.android.gms.internal.ads.zzfop
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return zzfoz.zzf();
            }
        }, new zzftn() { // from class: com.google.android.gms.internal.ads.zzfoq
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return zzfoz.zzg();
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoz(zzftn<Integer> zzftnVar, zzftn<Integer> zzftnVar2, zzfoy zzfoyVar) {
        this.zza = zzftnVar;
        this.zzb = zzftnVar2;
        this.zzc = zzfoyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ URLConnection zzp(URL url) throws IOException {
        int i10 = zzfoi.zzb;
        return url.openConnection();
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfoo.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfoo.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfoy zzfoyVar = this.zzc;
        Objects.requireNonNull(zzfoyVar);
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfoyVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfoy zzfoyVar, final int i10, final int i11) throws IOException {
        this.zza = new zzftn() { // from class: com.google.android.gms.internal.ads.zzfor
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        };
        this.zzb = new zzftn() { // from class: com.google.android.gms.internal.ads.zzfos
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i11);
                return valueOf;
            }
        };
        this.zzc = zzfoyVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i10, final int i11) throws IOException {
        this.zza = new zzftn() { // from class: com.google.android.gms.internal.ads.zzfot
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        };
        this.zzb = new zzftn() { // from class: com.google.android.gms.internal.ads.zzfou
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i11);
                return valueOf;
            }
        };
        this.zzc = new zzfoy() { // from class: com.google.android.gms.internal.ads.zzfov
            @Override // com.google.android.gms.internal.ads.zzfoy
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i10) throws IOException {
        this.zza = new zzftn() { // from class: com.google.android.gms.internal.ads.zzfow
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        };
        this.zzc = new zzfoy() { // from class: com.google.android.gms.internal.ads.zzfox
            @Override // com.google.android.gms.internal.ads.zzfoy
            public final URLConnection zza() {
                return zzfoz.zzp(url);
            }
        };
        return zzm();
    }
}
