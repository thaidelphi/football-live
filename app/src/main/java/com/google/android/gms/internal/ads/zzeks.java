package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeks implements zzerw {
    private final zzgba zza;
    private final zzdnv zzb;
    private final zzdsj zzc;
    private final zzeku zzd;

    public zzeks(zzgba zzgbaVar, zzdnv zzdnvVar, zzdsj zzdsjVar, zzeku zzekuVar) {
        this.zza = zzgbaVar;
        this.zzb = zzdnvVar;
        this.zzc = zzdsjVar;
        this.zzd = zzekuVar;
    }

    public static /* synthetic */ zzekt zzc(zzeks zzeksVar) {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbz)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfbn zzc = zzeksVar.zzb.zzc(str, new JSONObject());
                zzc.zzC();
                boolean zzt = zzeksVar.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlA)).booleanValue() || zzt) {
                    try {
                        zzbqr zzf = zzc.zzf();
                        if (zzf != null) {
                            bundle2.putString("sdk_version", zzf.toString());
                        }
                    } catch (zzfaw unused) {
                    }
                }
                try {
                    zzbqr zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfaw unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfaw unused3) {
            }
        }
        zzekt zzektVar = new zzekt(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlA)).booleanValue()) {
            zzeksVar.zzd.zzb(zzektVar);
        }
        return zzektVar;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        zzbbd zzbbdVar = zzbbm.zzlA;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue() && this.zzd.zza() != null) {
            zzekt zza = this.zzd.zza();
            Objects.requireNonNull(zza);
            return zzgap.zzh(zza);
        }
        if (!zzftm.zzd((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbz)) && (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue() || (!this.zzd.zzd() && this.zzc.zzt()))) {
            this.zzd.zzc(true);
            return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzekr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeks.zzc(zzeks.this);
                }
            });
        }
        return zzgap.zzh(new zzekt(new Bundle()));
    }
}
