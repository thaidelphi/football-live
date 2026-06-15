package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.b9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfy implements zzfr {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzfr zzc;
    private zzfr zzd;
    private zzfr zze;
    private zzfr zzf;
    private zzfr zzg;
    private zzfr zzh;
    private zzfr zzi;
    private zzfr zzj;
    private zzfr zzk;

    public zzfy(Context context, zzfr zzfrVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzfrVar;
    }

    private final zzfr zzg() {
        if (this.zze == null) {
            zzfj zzfjVar = new zzfj(this.zza);
            this.zze = zzfjVar;
            zzh(zzfjVar);
        }
        return this.zze;
    }

    private final void zzh(zzfr zzfrVar) {
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzfrVar.zzf((zzgr) this.zzb.get(i10));
        }
    }

    private static final void zzi(zzfr zzfrVar, zzgr zzgrVar) {
        if (zzfrVar != null) {
            zzfrVar.zzf(zzgrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        zzfr zzfrVar = this.zzk;
        Objects.requireNonNull(zzfrVar);
        return zzfrVar.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final long zzb(zzfw zzfwVar) throws IOException {
        zzfr zzfrVar;
        zzcv.zzf(this.zzk == null);
        String scheme = zzfwVar.zza.getScheme();
        Uri uri = zzfwVar.zza;
        int i10 = zzeh.zza;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !b9.h.f16640b.equals(scheme2)) {
            if ("asset".equals(scheme)) {
                this.zzk = zzg();
            } else if ("content".equals(scheme)) {
                if (this.zzf == null) {
                    zzfo zzfoVar = new zzfo(this.zza);
                    this.zzf = zzfoVar;
                    zzh(zzfoVar);
                }
                this.zzk = this.zzf;
            } else if ("rtmp".equals(scheme)) {
                if (this.zzg == null) {
                    try {
                        zzfr zzfrVar2 = (zzfr) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.zzg = zzfrVar2;
                        zzh(zzfrVar2);
                    } catch (ClassNotFoundException unused) {
                        zzdn.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e8) {
                        throw new RuntimeException("Error instantiating RTMP extension", e8);
                    }
                    if (this.zzg == null) {
                        this.zzg = this.zzc;
                    }
                }
                this.zzk = this.zzg;
            } else if ("udp".equals(scheme)) {
                if (this.zzh == null) {
                    zzgt zzgtVar = new zzgt(2000);
                    this.zzh = zzgtVar;
                    zzh(zzgtVar);
                }
                this.zzk = this.zzh;
            } else if ("data".equals(scheme)) {
                if (this.zzi == null) {
                    zzfp zzfpVar = new zzfp();
                    this.zzi = zzfpVar;
                    zzh(zzfpVar);
                }
                this.zzk = this.zzi;
            } else {
                if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    zzfrVar = this.zzc;
                } else {
                    if (this.zzj == null) {
                        zzgp zzgpVar = new zzgp(this.zza);
                        this.zzj = zzgpVar;
                        zzh(zzgpVar);
                    }
                    zzfrVar = this.zzj;
                }
                this.zzk = zzfrVar;
            }
        } else {
            String path = zzfwVar.zza.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.zzk = zzg();
            } else {
                if (this.zzd == null) {
                    zzgg zzggVar = new zzgg();
                    this.zzd = zzggVar;
                    zzh(zzggVar);
                }
                this.zzk = this.zzd;
            }
        }
        return this.zzk.zzb(zzfwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final Uri zzc() {
        zzfr zzfrVar = this.zzk;
        if (zzfrVar == null) {
            return null;
        }
        return zzfrVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzd() throws IOException {
        zzfr zzfrVar = this.zzk;
        if (zzfrVar != null) {
            try {
                zzfrVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final Map zze() {
        zzfr zzfrVar = this.zzk;
        return zzfrVar == null ? Collections.emptyMap() : zzfrVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzf(zzgr zzgrVar) {
        Objects.requireNonNull(zzgrVar);
        this.zzc.zzf(zzgrVar);
        this.zzb.add(zzgrVar);
        zzi(this.zzd, zzgrVar);
        zzi(this.zze, zzgrVar);
        zzi(this.zzf, zzgrVar);
        zzi(this.zzg, zzgrVar);
        zzi(this.zzh, zzgrVar);
        zzi(this.zzi, zzgrVar);
        zzi(this.zzj, zzgrVar);
    }
}
