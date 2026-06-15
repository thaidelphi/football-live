package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.ironsource.c9;
import com.ironsource.da;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdfn implements zzdgz {
    private com.google.android.gms.ads.internal.client.zzdc zzC;
    private final zzdht zzD;
    private final Context zza;
    private final zzdhc zzb;
    private final JSONObject zzc;
    private final zzdlu zzd;
    private final zzdgr zze;
    private final zzauc zzf;
    private final zzcux zzg;
    private final zzcud zzh;
    private final zzdcc zzi;
    private final zzezu zzj;
    private final VersionInfoParcel zzk;
    private final zzfap zzl;
    private final zzclz zzm;
    private final zzdhx zzn;
    private final Clock zzo;
    private final zzdby zzp;
    private final zzfhp zzq;
    private final zzdnk zzr;
    private final zzffn zzs;
    private final zzeaf zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdfn(Context context, zzdhc zzdhcVar, JSONObject jSONObject, zzdlu zzdluVar, zzdgr zzdgrVar, zzauc zzaucVar, zzcux zzcuxVar, zzcud zzcudVar, zzdcc zzdccVar, zzezu zzezuVar, VersionInfoParcel versionInfoParcel, zzfap zzfapVar, zzclz zzclzVar, zzdhx zzdhxVar, Clock clock, zzdby zzdbyVar, zzfhp zzfhpVar, zzffn zzffnVar, zzeaf zzeafVar, zzdnk zzdnkVar, zzdht zzdhtVar) {
        this.zza = context;
        this.zzb = zzdhcVar;
        this.zzc = jSONObject;
        this.zzd = zzdluVar;
        this.zze = zzdgrVar;
        this.zzf = zzaucVar;
        this.zzg = zzcuxVar;
        this.zzh = zzcudVar;
        this.zzi = zzdccVar;
        this.zzj = zzezuVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzfapVar;
        this.zzm = zzclzVar;
        this.zzn = zzdhxVar;
        this.zzo = clock;
        this.zzp = zzdbyVar;
        this.zzq = zzfhpVar;
        this.zzs = zzffnVar;
        this.zzt = zzeafVar;
        this.zzr = zzdnkVar;
        this.zzD = zzdhtVar;
    }

    private final String zzE(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdF)).booleanValue()) {
            try {
                return this.zzf.zzc().zzh(this.zza, view, null);
            } catch (Exception unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting data.");
                return null;
            }
        }
        return null;
    }

    private final String zzF(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc = this.zze.zzc();
        if (zzc != 1) {
            if (zzc != 2) {
                if (zzc != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    private final boolean zzG(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final boolean zzH() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzI(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10, View view) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdF)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            com.google.android.gms.ads.internal.zzv.zzq();
            DisplayMetrics zzu = com.google.android.gms.ads.internal.util.zzs.zzu((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(context, zzu.widthPixels));
                jSONObject7.put("height", com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(context, zzu.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziA)).booleanValue()) {
                this.zzd.zzl("/clickRecorded", new zzdfk(this, null));
            } else {
                this.zzd.zzl("/logScionEvent", new zzdfj(this, null));
            }
            this.zzd.zzl("/nativeImpression", new zzdfl(this, view, null));
            zzbys.zza(this.zzd.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzu) {
                return true;
            }
            zzezu zzezuVar = this.zzj;
            this.zzu = com.google.android.gms.ads.internal.zzv.zzt().zzn(this.zza, this.zzk.afmaVersion, zzezuVar.zzC.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create impression JSON.", e8);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzA(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final boolean zzB() {
        if (zza() != 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlv)).booleanValue()) {
                return this.zzl.zzi.zzj;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final boolean zzC() {
        return zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final boolean zzD(Bundle bundle) {
        if (!zzG("impression_reporting")) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return zzI(null, null, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlr)).booleanValue() ? zzE(null) : null, com.google.android.gms.ads.internal.client.zzbb.zzb().zzl(bundle, null), false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final int zza() {
        if (this.zzl.zzi != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlv)).booleanValue()) {
                return this.zzl.zzi.zzi;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbv.zzg(context, view);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbv.zzf(view);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbv.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd);
            jSONObject.put("ad_view_signal", zzg);
            jSONObject.put("scroll_view_signal", zzf);
            jSONObject.put("lock_screen_signal", zze);
            return jSONObject;
        } catch (JSONException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create native ad view signals JSON.", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzH()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zze != null) {
                jSONObject.put("nas", zze);
            }
        } catch (JSONException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create native click meta data JSON.", e8);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzh() {
        try {
            com.google.android.gms.ads.internal.client.zzdc zzdcVar = this.zzC;
            if (zzdcVar != null) {
                zzdcVar.zze();
            }
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzi() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzj() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzk(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzdgVar == null) {
                zzdgr zzdgrVar = this.zze;
                if (zzdgrVar.zzk() != null) {
                    this.zzw = true;
                    this.zzq.zzd(zzdgrVar.zzk().zzf(), this.zzj.zzax, this.zzs);
                    zzh();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzd(zzdgVar.zzf(), this.zzj.zzax, this.zzs);
            zzh();
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzl(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view2, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbv.zzg(context, view2);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbv.zzf(view2);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbv.zze(context, view2);
        String zzF = zzF(view, map);
        zzo(true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdM)).booleanValue() ? view2 : view, zzg, zzd, zzf, zze, zzF, com.google.android.gms.ads.internal.util.zzbv.zzc(zzF, context, this.zzz, this.zzy), null, z10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzm(String str) {
        zzo(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzn(Bundle bundle) {
        if (bundle == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Click data is null. No click is reported.");
        } else if (!zzG("click_reporting")) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzo(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzbb.zzb().zzl(bundle, null), false, false);
        }
    }

    protected final void zzo(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) {
        String str2;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z10);
            zzben zzbenVar = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbenVar != null && zzbenVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.zze.zzH().isEmpty() || this.zze.zzk() == null) ? false : true);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put(da.a.f16995d, this.zzo.a());
            if (this.zzx && zzH()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zzd(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception obtaining click signals", e8);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            jSONObject8.put("open_chrome_custom_tab", true);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziE)).booleanValue() && PlatformVersion.l()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziF)).booleanValue() && PlatformVersion.l()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put(c9.f16851d, jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a10 = this.zzo.a();
            jSONObject9.put("time_from_last_touch_down", a10 - this.zzA);
            jSONObject9.put("time_from_last_touch", a10 - this.zzB);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.zzj.zzb()) {
                JSONObject jSONObject10 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzq(string, this.zze);
                }
            }
            zzbys.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create click JSON.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzp(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        JSONObject jSONObject;
        Point point;
        Point point2;
        JSONObject jSONObject2;
        boolean z11 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlv)).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11) {
            if (!this.zzx) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzH()) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbv.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbv.zzg(this.zza, view2);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbv.zzf(view2);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbv.zze(this.zza, view2);
        String zzF = zzF(view, map);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbv.zzc(zzF, this.zza, this.zzz, this.zzy);
        if (z11) {
            try {
                jSONObject = this.zzc;
                point = this.zzz;
                point2 = this.zzy;
                try {
                    jSONObject2 = new JSONObject();
                } catch (Exception e8) {
                    e = e8;
                    jSONObject2 = null;
                }
            } catch (JSONException e10) {
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e10);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e10, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                if (point != null) {
                    jSONObject3.put("x", point.x);
                    jSONObject3.put("y", point.y);
                }
                if (point2 != null) {
                    jSONObject4.put("x", point2.x);
                    jSONObject4.put("y", point2.y);
                }
                jSONObject2.put("start_point", jSONObject3);
                jSONObject2.put("end_point", jSONObject4);
                jSONObject2.put("duration_ms", i10);
            } catch (Exception e11) {
                e = e11;
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while grabbing custom click gesture signals.", e);
                jSONObject.put("custom_click_gesture_signal", jSONObject2);
                zzo(view2, zzg, zzd, zzf, zze, zzF, zzc, null, z10, true);
            }
            jSONObject.put("custom_click_gesture_signal", jSONObject2);
        }
        zzo(view2, zzg, zzd, zzf, zze, zzF, zzc, null, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzq() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzbys.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzr(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzI(com.google.android.gms.ads.internal.util.zzbv.zzg(context, view), com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbv.zzf(view), com.google.android.gms.ads.internal.util.zzbv.zze(context, view), zzE(view), null, com.google.android.gms.ads.internal.util.zzbv.zzh(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzs() {
        zzI(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzt(View view, MotionEvent motionEvent, View view2) {
        this.zzy = com.google.android.gms.ads.internal.util.zzbv.zza(motionEvent, view2);
        long a10 = this.zzo.a();
        this.zzB = a10;
        if (motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
            this.zzA = a10;
            this.zzz = this.zzy;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        obtain.setLocation(point.x, point.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzu(Bundle bundle) {
        if (bundle == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Touch event data is null. No touch event is reported.");
        } else if (!zzG("touch_reporting")) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            int i12 = bundle.getInt("duration_ms");
            this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzv(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdhx zzdhxVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdhxVar);
        view.setClickable(true);
        zzdhxVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzw() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzx(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.zzC = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzy(zzbgp zzbgpVar) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        this.zzn.zzc(zzbgpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzz(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zzi = com.google.android.gms.ads.internal.util.zzbv.zzi(this.zzk.clientJarVersion);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    if (zzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) entry2.getValue()).get();
                if (view3 != null) {
                    if (zzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }
}
