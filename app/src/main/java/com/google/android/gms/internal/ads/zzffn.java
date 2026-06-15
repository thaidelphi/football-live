package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzffn implements Runnable {
    private final zzffq zzb;
    private String zzc;
    private String zze;
    private zzfaf zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzffs zzd = zzffs.SCAR_REQUEST_TYPE_UNSPECIFIED;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffn(zzffq zzffqVar) {
        this.zzb = zzffqVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzffn zza(zzffc zzffcVar) {
        if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzffcVar.zzj();
            list.add(zzffcVar);
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            this.zzh = zzbyp.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziJ)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzffn zzb(String str) {
        if (((Boolean) zzbdf.zzc.zze()).booleanValue() && zzffm.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzffn zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzffn zzd(ArrayList arrayList) {
        if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    if (!arrayList.contains(IronSourceConstants.EVENTS_NATIVE) && !arrayList.contains(AdFormat.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.zzi = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                this.zzi = 6;
                            }
                        }
                        this.zzi = 5;
                    }
                    this.zzi = 8;
                }
                this.zzi = 4;
            }
            this.zzi = 3;
        }
        return this;
    }

    public final synchronized zzffn zze(String str) {
        if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized zzffn zzf(Bundle bundle) {
        if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(bundle);
        }
        return this;
    }

    public final synchronized zzffn zzg(zzfaf zzfafVar) {
        if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
            this.zzf = zzfafVar;
        }
        return this;
    }

    public final synchronized void zzh() {
        if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            for (zzffc zzffcVar : this.zza) {
                int i10 = this.zzi;
                if (i10 != 2) {
                    zzffcVar.zzn(i10);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzffcVar.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zze) && !zzffcVar.zzl()) {
                    zzffcVar.zzd(this.zze);
                }
                zzfaf zzfafVar = this.zzf;
                if (zzfafVar != null) {
                    zzffcVar.zzb(zzfafVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                    if (zzeVar != null) {
                        zzffcVar.zza(zzeVar);
                    }
                }
                zzffcVar.zzf(this.zzd);
                this.zzb.zzc(zzffcVar.zzm());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzffn zzi(int i10) {
        if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
            this.zzi = i10;
        }
        return this;
    }
}
