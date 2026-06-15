package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdtp implements com.google.android.gms.ads.internal.overlay.zzr, zzcfg {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzdte zzc;
    private zzcdq zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private com.google.android.gms.ads.internal.client.zzdk zzh;
    private boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtp(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    public static /* synthetic */ void zzh(zzdtp zzdtpVar, String str) {
        JSONObject zze = zzdtpVar.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                zze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        zzdtpVar.zzd.zzb("window.inspectorInfo", zze.toString());
    }

    private final synchronized boolean zzl(com.google.android.gms.ads.internal.client.zzdk zzdkVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector had an internal error.");
            try {
                zzdkVar.zze(zzfbq.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.zzc == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdkVar.zze(zzfbq.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.zze && !this.zzf) {
                if (com.google.android.gms.ads.internal.zzv.zzC().a() >= this.zzg + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziT)).intValue()) {
                    return true;
                }
            }
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzdkVar.zze(zzfbq.zzd(19, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final synchronized void zza(boolean z10, int i10, String str, String str2) {
        if (z10) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector failed to load.");
        try {
            zzbyf zzp = com.google.android.gms.ads.internal.zzv.zzp();
            zzp.zzw(new Exception("Failed to load UI. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.zzh;
            if (zzdkVar != null) {
                zzdkVar.zze(zzfbq.zzd(17, null, null));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        this.zzf = true;
        zzk("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzds(int i10) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.zzh;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcdq zzcdqVar = this.zzd;
        if (zzcdqVar == null || zzcdqVar.zzaE()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzi(zzdte zzdteVar) {
        this.zzc = zzdteVar;
    }

    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzbji zzbjiVar, zzbjb zzbjbVar, zzbip zzbipVar) {
        if (zzl(zzdkVar)) {
            try {
                com.google.android.gms.ads.internal.zzv.zzA();
                zzcdq zza = zzced.zza(this.zza, zzcfk.zza(), "", false, false, null, null, this.zzb, null, null, null, zzbak.zza(), null, null, null, null);
                this.zzd = zza;
                zzcfi zzN = zza.zzN();
                if (zzN == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        zzdkVar.zze(zzfbq.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e8) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = zzdkVar;
                zzN.zzV(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbjiVar, null, new zzbjh(this.zza), zzbjbVar, zzbipVar, null);
                zzN.zzC(this);
                this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziR));
                com.google.android.gms.ads.internal.zzv.zzj();
                com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true, null);
                this.zzg = com.google.android.gms.ads.internal.zzv.zzC().a();
            } catch (zzcec e10) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to obtain a web view for the ad inspector", e10);
                try {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e10, "InspectorUi.openInspector 0");
                    zzdkVar.zze(zzfbq.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e11) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e11, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdto
                @Override // java.lang.Runnable
                public final void run() {
                    zzdtp.zzh(zzdtp.this, str);
                }
            });
        }
    }
}
