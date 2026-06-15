package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.xn;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdss implements zzcui, zzcxc, zzcvx {
    private final zzdte zza;
    private final String zzb;
    private final String zzc;
    private zzcty zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdsr zze = zzdsr.AD_REQUESTED;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdss(zzdte zzdteVar, zzfap zzfapVar, String str) {
        this.zza = zzdteVar;
        this.zzc = str;
        this.zzb = zzfapVar.zzf;
    }

    private static JSONObject zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zzh(zzeVar2));
        return jSONObject;
    }

    private final JSONObject zzi(zzcty zzctyVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzctyVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzctyVar.zzc());
        jSONObject.put("responseId", zzctyVar.zzi());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjh)).booleanValue()) {
            String zzd = zzctyVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                String valueOf = String.valueOf(zzd);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Bidding data: ".concat(valueOf));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjk)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzv zzvVar : zzctyVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.zza);
            jSONObject2.put("latencyMillis", zzvVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzji)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzbb.zzb().zzj(zzvVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.zzc;
            jSONObject2.put(xn.a.f21422g, zzeVar == null ? null : zzh(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zza(zzcpl zzcplVar) {
        if (this.zza.zzq()) {
            this.zzf = zzcplVar.zzl();
            this.zze = zzdsr.AD_LOADED;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjo)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzezu.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjo)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject.put("shown", this.zzn);
            }
        }
        zzcty zzctyVar = this.zzf;
        JSONObject jSONObject2 = null;
        if (zzctyVar != null) {
            jSONObject2 = zzi(zzctyVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzcty zzctyVar2 = (zzcty) iBinder;
                jSONObject2 = zzi(zzctyVar2);
                if (zzctyVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdl(zzbud zzbudVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjo)).booleanValue() || !this.zza.zzq()) {
            return;
        }
        this.zza.zzf(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdm(zzfag zzfagVar) {
        if (this.zza.zzq()) {
            if (!zzfagVar.zzb.zza.isEmpty()) {
                this.zzd = ((zzezu) zzfagVar.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(zzfagVar.zzb.zzb.zzl)) {
                this.zzh = zzfagVar.zzb.zzb.zzl;
            }
            if (!TextUtils.isEmpty(zzfagVar.zzb.zzb.zzm)) {
                this.zzi = zzfagVar.zzb.zzb.zzm;
            }
            if (zzfagVar.zzb.zzb.zzp.length() > 0) {
                this.zzl = zzfagVar.zzb.zzb.zzp;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjk)).booleanValue()) {
                if (!this.zza.zzs()) {
                    this.zzo = true;
                    return;
                }
                if (!TextUtils.isEmpty(zzfagVar.zzb.zzb.zzn)) {
                    this.zzj = zzfagVar.zzb.zzb.zzn;
                }
                if (zzfagVar.zzb.zzb.zzo.length() > 0) {
                    this.zzk = zzfagVar.zzb.zzb.zzo;
                }
                zzdte zzdteVar = this.zza;
                JSONObject jSONObject = this.zzk;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzdteVar.zzk(length);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcui
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza.zzq()) {
            this.zze = zzdsr.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjo)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        return this.zze != zzdsr.AD_REQUESTED;
    }
}
