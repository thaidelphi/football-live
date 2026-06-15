package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.ironsource.b9;
import com.ironsource.da;
import com.ironsource.fe;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzfkg {
    private final String zza;
    private zzfli zzb;
    private long zzc;
    private int zzd;

    public zzfkg(String str) {
        zzb();
        this.zza = str;
        this.zzb = new zzfli(null);
    }

    public final WebView zza() {
        return (WebView) this.zzb.get();
    }

    public final void zzb() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(String str, long j10) {
        if (j10 < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfjx.zza().zzh(zza(), this.zza, str);
    }

    public final void zze() {
        zzfjx.zza().zzc(zza(), this.zza);
    }

    public final void zzf(zzfiw zzfiwVar) {
        zzfjx.zza().zzd(zza(), this.zza, zzfiwVar.zzb());
    }

    public final void zzg(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfkm.zze(jSONObject, da.a.f16995d, Long.valueOf(date.getTime()));
        zzfjx.zza().zzf(zza(), jSONObject);
    }

    public final void zzh(String str, long j10) {
        if (j10 >= this.zzc) {
            this.zzd = 2;
            zzfjx.zza().zzh(zza(), this.zza, str);
        }
    }

    public void zzi(zzfiz zzfizVar, zzfix zzfixVar) {
        zzj(zzfizVar, zzfixVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj(zzfiz zzfizVar, zzfix zzfixVar, JSONObject jSONObject) {
        String zzh = zzfizVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfkm.zze(jSONObject2, "environment", "app");
        zzfkm.zze(jSONObject2, "adSessionType", zzfixVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfkm.zze(jSONObject3, "deviceType", str + "; " + str2);
        zzfkm.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfkm.zze(jSONObject3, fe.E, b9.f16509d);
        zzfkm.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfkm.zze(jSONObject2, "deviceCategory", zzfkl.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfkm.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfkm.zze(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, zzfixVar.zze().zzb());
        zzfkm.zze(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, zzfixVar.zze().zzc());
        zzfkm.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfkm.zze(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfkm.zze(jSONObject5, "appId", zzfjv.zzb().zza().getApplicationContext().getPackageName());
        zzfkm.zze(jSONObject2, "app", jSONObject5);
        if (zzfixVar.zzf() != null) {
            zzfkm.zze(jSONObject2, "contentUrl", zzfixVar.zzf());
        }
        if (zzfixVar.zzg() != null) {
            zzfkm.zze(jSONObject2, "customReferenceData", zzfixVar.zzg());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfixVar.zzh().iterator();
        if (!it.hasNext()) {
            zzfjx.zza().zzj(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            zzfjj zzfjjVar = (zzfjj) it.next();
            throw null;
        }
    }

    public final void zzk(boolean z10) {
        if (zzp()) {
            zzfjx.zza().zzi(zza(), this.zza, true != z10 ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzl(float f10) {
        zzfjx.zza().zze(zza(), this.zza, f10);
    }

    public final void zzm(boolean z10) {
        if (zzp()) {
            zzfjx.zza().zzg(zza(), this.zza, true != z10 ? "unlocked" : "locked");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzn(WebView webView) {
        this.zzb = new zzfli(webView);
    }

    public void zzo() {
    }

    public final boolean zzp() {
        return this.zzb.get() != 0;
    }
}
