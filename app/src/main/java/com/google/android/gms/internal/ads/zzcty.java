package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcty extends com.google.android.gms.ads.internal.client.zzdw {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzebl zzh;
    private final Bundle zzi;

    public zzcty(zzezu zzezuVar, String str, zzebl zzeblVar, zzezx zzezxVar, String str2) {
        String str3 = null;
        this.zzb = zzezuVar == null ? null : zzezuVar.zzab;
        this.zzc = str2;
        this.zzd = zzezxVar == null ? null : zzezxVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzezuVar != null) {
            try {
                str3 = zzezuVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str3 != null ? str3 : str;
        this.zze = zzeblVar.zzc();
        this.zzh = zzeblVar;
        this.zzf = com.google.android.gms.ads.internal.zzv.zzC().a() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgF)).booleanValue() || zzezxVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzezxVar.zzk;
        }
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjh)).booleanValue() || zzezxVar == null || TextUtils.isEmpty(zzezxVar.zzi)) ? "" : zzezxVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final com.google.android.gms.ads.internal.client.zzv zzf() {
        zzebl zzeblVar = this.zzh;
        if (zzeblVar != null) {
            return zzeblVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
