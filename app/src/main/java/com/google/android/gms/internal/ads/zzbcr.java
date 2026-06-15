package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.f;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.ironsource.xn;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbcr {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzo zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzf zzc;
    private final zzdqk zzd;
    private Runnable zze;
    private zzbco zzf;
    private f zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbcr(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar, com.google.android.gms.ads.nonagon.signalgeneration.zzf zzfVar, zzdqk zzdqkVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzoVar;
        this.zzc = zzfVar;
        this.zzd = zzdqkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzjM)).booleanValue() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbco r0 = r5.zzf
            if (r0 != 0) goto Lc
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r0)
            return
        Lc:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.String r0 = r5.zzh
            if (r0 == 0) goto L72
            androidx.browser.customtabs.f r0 = r5.zzg
            if (r0 == 0) goto L72
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza
            if (r0 == 0) goto L72
            long r0 = r5.zzi
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2c
            goto L3b
        L2c:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()
            long r0 = r0.b()
            long r2 = r5.zzi
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L3b
            goto L4d
        L3b:
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zzjM
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L72
        L4d:
            androidx.browser.customtabs.f r0 = r5.zzg
            java.lang.String r1 = r5.zzh
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.i(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza
            java.lang.Runnable r1 = r5.zze
            com.google.android.gms.internal.ads.zzbbd r2 = com.google.android.gms.internal.ads.zzbbm.zzjN
            com.google.android.gms.internal.ads.zzbbk r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L72:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcr.zzj():void");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjP));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error fetching the PACT active eids JSON: ", e8);
        }
    }

    public final f zzb() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject zzc(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put(xn.a.f21422g, str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbdr.zzc.zze()).booleanValue() ? ((Long) zzbdr.zzf.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbdr.zza.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zza());
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject zzd(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbdr.zzc.zze()).booleanValue() ? ((Long) zzbdr.zzf.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbdr.zza.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zza());
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf() {
        this.zzi = com.google.android.gms.ads.internal.zzv.zzC().b() + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjL)).intValue();
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcp
                @Override // java.lang.Runnable
                public final void run() {
                    zzbcr.this.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(Context context, c cVar, String str, b bVar) {
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Origin parameter is empty or null");
            }
            if (cVar != null) {
                this.zzl = context;
                this.zzh = str;
                zzbco zzbcoVar = new zzbco(this, bVar, this.zzd);
                this.zzf = zzbcoVar;
                f e8 = cVar.e(zzbcoVar);
                this.zzg = e8;
                if (e8 == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("CustomTabsClient failed to create new session.");
                }
                com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(this.zzd, null, "pact_action", new Pair("pe", "pact_init"));
                return;
            }
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        throw new IllegalArgumentException("App Context parameter is null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(String str) {
        try {
            f fVar = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbdr.zza.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.zza());
            }
            fVar.h(jSONObject.toString(), null);
            zzbcq zzbcqVar = new zzbcq(this, str);
            if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
                this.zzb.zzg(this.zzg, zzbcqVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzl, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbcqVar);
        } catch (JSONException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating JSON: ", e8);
        }
    }

    public final void zzi(long j10) {
        this.zzj = j10;
    }
}
