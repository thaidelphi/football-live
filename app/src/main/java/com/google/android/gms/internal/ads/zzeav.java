package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeav implements zzeaw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzebb zzc(String str, String str2, String str3, zzeax zzeaxVar, String str4, WebView webView, String str5, String str6, zzeay zzeayVar) {
        zzfji zza = zzfji.zza("Google", str2);
        zzfjh zzp = zzp("javascript");
        zzfja zzn = zzn(zzeaxVar.toString());
        zzfjh zzfjhVar = zzfjh.NONE;
        if (zzp == zzfjhVar) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzn == null) {
            String valueOf = String.valueOf(zzeaxVar);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid html session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        } else {
            zzfjh zzp2 = zzp(str4);
            if (zzn == zzfja.VIDEO && zzp2 == zzfjhVar) {
                String valueOf2 = String.valueOf(str4);
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2));
                return null;
            }
            zzfix zzb = zzfix.zzb(zza, webView, str5, "");
            return new zzebb(zzfiv.zza(zzfiw.zza(zzn, zzo(zzeayVar.toString()), zzp, zzp2, true), zzb), zzb);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzebb zzd(String str, String str2, String str3, String str4, zzeax zzeaxVar, WebView webView, String str5, String str6, zzeay zzeayVar) {
        zzfji zza = zzfji.zza(str, str2);
        zzfjh zzp = zzp("javascript");
        zzfjh zzp2 = zzp(str4);
        zzfja zzn = zzn(zzeaxVar.toString());
        zzfjh zzfjhVar = zzfjh.NONE;
        if (zzp == zzfjhVar) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzn == null) {
            String valueOf = String.valueOf(zzeaxVar);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid js session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        } else if (zzn == zzfja.VIDEO && zzp2 == zzfjhVar) {
            String valueOf2 = String.valueOf(str4);
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2));
            return null;
        } else {
            zzfix zzc = zzfix.zzc(zza, webView, str5, "");
            return new zzebb(zzfiv.zza(zzfiw.zza(zzn, zzo(zzeayVar.toString()), zzp, zzp2, true), zzc), zzc);
        }
    }

    private static zzfja zzn(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (str.equals("video")) {
                c10 = 2;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return null;
                }
                return zzfja.VIDEO;
            }
            return zzfja.NATIVE_DISPLAY;
        }
        return zzfja.HTML_DISPLAY;
    }

    private static zzfjd zzo(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return zzfjd.UNSPECIFIED;
                }
                return zzfjd.ONE_PIXEL;
            }
            return zzfjd.DEFINED_BY_JAVASCRIPT;
        }
        return zzfjd.BEGIN_TO_RENDER;
    }

    private static zzfjh zzp(String str) {
        if (IronSourceConstants.EVENTS_NATIVE.equals(str)) {
            return zzfjh.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfjh.JAVASCRIPT;
        }
        return zzfjh.NONE;
    }

    private static final Object zzq(zzeau zzeauVar) {
        try {
            return zzeauVar.zza();
        } catch (RuntimeException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e8, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e8, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final zzebb zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzeay zzeayVar, final zzeax zzeaxVar, final String str5) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfg)).booleanValue() && zzfit.zzb()) {
            return (zzebb) zzq(new zzeau("Google", str, "javascript", zzeaxVar, str4, webView, str5, "", zzeayVar) { // from class: com.google.android.gms.internal.ads.zzeak
                public final /* synthetic */ String zzb;
                public final /* synthetic */ zzeax zzd;
                public final /* synthetic */ String zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzeay zzi;
                public final /* synthetic */ String zza = "Google";
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzb = str;
                    this.zzd = zzeaxVar;
                    this.zze = str4;
                    this.zzf = webView;
                    this.zzg = str5;
                    this.zzi = zzeayVar;
                }

                @Override // com.google.android.gms.internal.ads.zzeau
                public final Object zza() {
                    return zzeav.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final zzebb zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzeay zzeayVar, final zzeax zzeaxVar, final String str6) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfg)).booleanValue() && zzfit.zzb()) {
            return (zzebb) zzq(new zzeau(str5, str, "javascript", str4, zzeaxVar, webView, str6, "", zzeayVar) { // from class: com.google.android.gms.internal.ads.zzean
                public final /* synthetic */ String zza;
                public final /* synthetic */ String zzb;
                public final /* synthetic */ String zzd;
                public final /* synthetic */ zzeax zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzeay zzi;
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzd = str4;
                    this.zze = zzeaxVar;
                    this.zzf = webView;
                    this.zzg = str6;
                    this.zzi = zzeayVar;
                }

                @Override // com.google.android.gms.internal.ads.zzeau
                public final Object zza() {
                    return zzeav.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final zzfjg zze(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z10) {
        return (zzfjg) zzq(new zzeau(webView, true) { // from class: com.google.android.gms.internal.ads.zzeas
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeau
            public final Object zza() {
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
                int i10 = versionInfoParcel2.buddyApkVersion;
                int i11 = versionInfoParcel2.clientJarVersion;
                return zzfjg.zzb(zzfji.zza("Google", i10 + "." + i11), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final String zzf(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfg)).booleanValue()) {
            return (String) zzq(new zzeau() { // from class: com.google.android.gms.internal.ads.zzeaq
                @Override // com.google.android.gms.internal.ads.zzeau
                public final Object zza() {
                    return "a.1.5.2-google_20241009";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final void zzg(final zzfiv zzfivVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaj
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfg)).booleanValue() && zzfit.zzb()) {
                    zzfiv.this.zzb(view, zzfjc.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final void zzh(final zzfjg zzfjgVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeap
            @Override // java.lang.Runnable
            public final void run() {
                zzfjg.this.zzf(view, zzfjc.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final void zzi(final zzfiv zzfivVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeat
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfg)).booleanValue() && zzfit.zzb()) {
                    zzfiv.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final void zzj(final zzfiv zzfivVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeal
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfg)).booleanValue() && zzfit.zzb()) {
                    zzfiv.this.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final void zzk(final zzfiv zzfivVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfg)).booleanValue() && zzfit.zzb()) {
            Objects.requireNonNull(zzfivVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeam
                @Override // java.lang.Runnable
                public final void run() {
                    zzfiv.this.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final boolean zzl(final Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfg)).booleanValue()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) zzq(new zzeau() { // from class: com.google.android.gms.internal.ads.zzeao
            @Override // com.google.android.gms.internal.ads.zzeau
            public final Object zza() {
                if (zzfit.zzb()) {
                    return Boolean.TRUE;
                }
                zzfit.zza(context);
                return Boolean.valueOf(zzfit.zzb());
            }
        });
        return bool != null && bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final void zzm(final zzfjg zzfjgVar, final zzceh zzcehVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzear
            @Override // java.lang.Runnable
            public final void run() {
                zzfjg.this.zzg(zzcehVar);
            }
        });
    }
}
