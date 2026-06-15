package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.b;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.c9;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdpj implements zzcyz, com.google.android.gms.ads.internal.client.zza, zzcuz, zzcuj {
    private final Context zza;
    private final zzfbh zzb;
    private final zzdqf zzc;
    private final zzfag zzd;
    private final zzezu zze;
    private final zzdzu zzf;
    private final String zzg;
    private Boolean zzh;
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgG)).booleanValue();

    public zzdpj(Context context, zzfbh zzfbhVar, zzdqf zzdqfVar, zzfag zzfagVar, zzezu zzezuVar, zzdzu zzdzuVar, String str) {
        this.zza = context;
        this.zzb = zzfbhVar;
        this.zzc = zzdqfVar;
        this.zzd = zzfagVar;
        this.zze = zzezuVar;
        this.zzf = zzdzuVar;
        this.zzg = str;
    }

    private final zzdqe zzd(String str) {
        zzfaf zzfafVar = this.zzd.zzb;
        zzdqe zza = this.zzc.zza();
        zza.zzd(zzfafVar.zzb);
        zza.zzc(this.zze);
        zza.zzb("action", str);
        zza.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        if (!this.zze.zzt.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzt.get(0));
        }
        if (this.zze.zzb()) {
            zza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza) ? "offline" : b.ONLINE_EXTRAS_KEY);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a()));
            zza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgN)).booleanValue()) {
            boolean z10 = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzf(this.zzd.zza.zza) != 1;
            zza.zzb("scar", String.valueOf(z10));
            if (z10) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzd.zza.zza.zzd;
                zza.zzb("ragent", zzmVar.zzp);
                zza.zzb("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzmVar)));
            }
        }
        return zza;
    }

    private final void zze(zzdqe zzdqeVar) {
        if (this.zze.zzb()) {
            this.zzf.zzd(new zzdzw(com.google.android.gms.ads.internal.zzv.zzC().a(), this.zzd.zzb.zzb.zzb, zzdqeVar.zze(), 2));
            return;
        }
        zzdqeVar.zzj();
    }

    private final boolean zzf() {
        String str;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbB);
                    com.google.android.gms.ads.internal.zzv.zzq();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzs.zzq(this.zza);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z10 = false;
                    if (str2 != null && str != null) {
                        try {
                            z10 = Pattern.matches(str2, str);
                        } catch (RuntimeException e8) {
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzb()) {
            zze(zzd(c9.f16851d));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuj
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzi) {
            zzdqe zzd = zzd("ifts");
            zzd.zzb("reason", "adapter");
            int i10 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i10 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i10 >= 0) {
                zzd.zzb("arec", String.valueOf(i10));
            }
            String zza = this.zzb.zza(str);
            if (zza != null) {
                zzd.zzb("areec", zza);
            }
            zzd.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuj
    public final void zzb() {
        if (this.zzi) {
            zzdqe zzd = zzd("ifts");
            zzd.zzb("reason", "blocked");
            zzd.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuj
    public final void zzc(zzden zzdenVar) {
        if (this.zzi) {
            zzdqe zzd = zzd("ifts");
            zzd.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdenVar.getMessage())) {
                zzd.zzb("msg", zzdenVar.getMessage());
            }
            zzd.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final void zzr() {
        if (zzf() || this.zze.zzb()) {
            zze(zzd("impression"));
        }
    }
}
