package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.b9;
import com.ironsource.ls;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdvv {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcfq zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfap zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzffn zzi;
    private final zzdpz zzj;
    private final Object zzk = new Object();
    private final zzbul zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvv(zzcfq zzcfqVar, Context context, VersionInfoParcel versionInfoParcel, zzfap zzfapVar, Executor executor, String str, zzffn zzffnVar, zzdpz zzdpzVar, zzbul zzbulVar, zzdya zzdyaVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = zzcfqVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfapVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzffnVar;
        zzcfqVar.zzx();
        this.zzj = zzdpzVar;
        this.zzl = zzbulVar;
        this.zzg = scheduledExecutorService;
    }

    public static /* synthetic */ String zzc(zzdvv zzdvvVar, zzdxx zzdxxVar) {
        zzdvvVar.zzf(zzdpn.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i10 = 0;
        int i11 = -1;
        while (true) {
            try {
                if (i10 < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgZ)).intValue()) {
                    zzdxy zza2 = new zzdxz(zzdvvVar.zzc, zzdvvVar.zzd.afmaVersion, zzdvvVar.zzl, Binder.getCallingUid()).zza(zzdxxVar);
                    int i12 = zza2.zza;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzha)).booleanValue()) {
                        zzdvvVar.zzj.zzc("fr", String.valueOf(i10));
                    }
                    if (i12 == 200) {
                        zzdvvVar.zzf(zzdpn.RENDERING_ADSTRING_TYPE2_FETCH_END);
                        return zza2.zzc;
                    }
                    i10++;
                    i11 = i12;
                } else {
                    throw new zzeez(1, "Received HTTP error code from ad server: " + i11);
                }
            } catch (Exception e8) {
                throw new zzeez(1, e8.getMessage() == null ? "Fetch failed." : e8.getMessage(), e8);
            }
        }
    }

    private final b6.a zzd(String str, final String str2) {
        String str3;
        b6.a zzh;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return zzgap.zzg(new zzeez(15, "Invalid ad string."));
        }
        zzffc zza2 = zzffb.zza(this.zzc, 11);
        zza2.zzi();
        zzbnf zza3 = com.google.android.gms.ads.internal.zzv.zzg().zza(this.zzc, this.zzd, this.zzb.zzz());
        zzbmz zzbmzVar = zzbnc.zza;
        final zzbmv zza4 = zza3.zza("google.afma.response.normalize", zzbmzVar, zzbmzVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgV)).booleanValue()) {
            try {
                str3 = new JSONObject(str).optString("fetch_url", "");
            } catch (JSONException unused) {
                str3 = "";
            }
            if (!TextUtils.isEmpty(str3)) {
                this.zzj.zzc("sst", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgX);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgW)).booleanValue()) {
                    List zzf = zzftk.zzc(zza).zzf(str3);
                    if (zzf.size() < 2) {
                        zzh = zzgap.zzg(new zzeez(1, "Invalid fetch URL."));
                    } else {
                        str4 = (String) zzf.get(1);
                        com.google.android.gms.ads.internal.zzv.zzq();
                        str3 = Uri.parse(str3).buildUpon().query(null).build().toString();
                    }
                }
                final zzdxx zzdxxVar = new zzdxx(str3, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                zzh = (zzgag) zzgap.zzf((zzgag) zzgap.zzo(zzgag.zzu(zzbyp.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvt
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzdvv.zzc(zzdvv.this, zzdxxVar);
                    }
                })), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgY)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdvu
                    @Override // com.google.android.gms.internal.ads.zzfzw
                    public final b6.a zza(Object obj) {
                        zzeez zzeezVar;
                        Exception exc = (Exception) obj;
                        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                        if (exc instanceof TimeoutException) {
                            zzeezVar = new zzeez(1, "Timed out waiting for ad response.");
                        } else if (exc instanceof zzeez) {
                            zzeezVar = (zzeez) exc;
                        } else {
                            zzeezVar = new zzeez(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                        }
                        return zzgap.zzg(zzeezVar);
                    }
                }, this.zzf);
            } else {
                zzh = zzgap.zzh(str);
                this.zzj.zzc("sst", "1");
            }
        } else {
            zzh = zzgap.zzh(str);
            this.zzj.zzc("sst", "1");
        }
        b6.a zzn = zzgap.zzn(zzgap.zzn(zzgap.zzn(zzh, new zzfzw(this) { // from class: com.google.android.gms.internal.ads.zzdvq
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                String str6 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str7 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put(b9.h.E0, str6);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str7));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put(ls.f18303n, jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzgap.zzh(jSONObject);
                } catch (JSONException e8) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e8.getCause())));
                }
            }
        }, this.zzf), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdvr
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzbmv.this.zzb((JSONObject) obj);
            }
        }, this.zzf), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdvs
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                b6.a zzh2;
                zzh2 = zzgap.zzh(new zzfag(new zzfad(zzdvv.this.zze), zzfaf.zza(new StringReader(((JSONObject) obj).toString()), null)));
                return zzh2;
            }
        }, this.zzf);
        zzffm.zza(zzn, this.zzi, zza2);
        return zzn;
    }

    private final String zze(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e8) {
            String concat = "Failed to update the ad types for rendering. ".concat(e8.toString());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(concat);
            return str;
        }
    }

    private final void zzf(zzdpn zzdpnVar) {
        Bundle zza2 = this.zzj.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzha)).booleanValue()) {
            zza2.putLong(zzdpnVar.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
    }

    private static final String zzg(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
        if (r9.optString("is_gbid").equals(com.ironsource.mediationsdk.metadata.a.f18924g) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fa, code lost:
        if (r5.zzg(r1, r2, r4) == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b8 A[Catch: all -> 0x0210, TryCatch #2 {, blocks: (B:18:0x0051, B:20:0x006f, B:22:0x0077, B:24:0x008e, B:26:0x0096, B:32:0x00d0, B:34:0x00d8, B:36:0x00de, B:40:0x00e7, B:47:0x011d, B:43:0x00f9, B:46:0x0106, B:52:0x0125, B:29:0x00c0, B:53:0x013b, B:60:0x0154, B:63:0x015c, B:67:0x0180, B:69:0x0195, B:73:0x01b8, B:75:0x01cd, B:78:0x01e1, B:80:0x01e7, B:81:0x01f4, B:83:0x01f6, B:86:0x01ff, B:85:0x01fc, B:74:0x01c2, B:70:0x01a8, B:66:0x016a, B:57:0x0144, B:58:0x0149), top: B:111:0x0051, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c2 A[Catch: all -> 0x0210, TryCatch #2 {, blocks: (B:18:0x0051, B:20:0x006f, B:22:0x0077, B:24:0x008e, B:26:0x0096, B:32:0x00d0, B:34:0x00d8, B:36:0x00de, B:40:0x00e7, B:47:0x011d, B:43:0x00f9, B:46:0x0106, B:52:0x0125, B:29:0x00c0, B:53:0x013b, B:60:0x0154, B:63:0x015c, B:67:0x0180, B:69:0x0195, B:73:0x01b8, B:75:0x01cd, B:78:0x01e1, B:80:0x01e7, B:81:0x01f4, B:83:0x01f6, B:86:0x01ff, B:85:0x01fc, B:74:0x01c2, B:70:0x01a8, B:66:0x016a, B:57:0x0144, B:58:0x0149), top: B:111:0x0051, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7 A[Catch: all -> 0x0210, TryCatch #2 {, blocks: (B:18:0x0051, B:20:0x006f, B:22:0x0077, B:24:0x008e, B:26:0x0096, B:32:0x00d0, B:34:0x00d8, B:36:0x00de, B:40:0x00e7, B:47:0x011d, B:43:0x00f9, B:46:0x0106, B:52:0x0125, B:29:0x00c0, B:53:0x013b, B:60:0x0154, B:63:0x015c, B:67:0x0180, B:69:0x0195, B:73:0x01b8, B:75:0x01cd, B:78:0x01e1, B:80:0x01e7, B:81:0x01f4, B:83:0x01f6, B:86:0x01ff, B:85:0x01fc, B:74:0x01c2, B:70:0x01a8, B:66:0x016a, B:57:0x0144, B:58:0x0149), top: B:111:0x0051, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f6 A[Catch: all -> 0x0210, TryCatch #2 {, blocks: (B:18:0x0051, B:20:0x006f, B:22:0x0077, B:24:0x008e, B:26:0x0096, B:32:0x00d0, B:34:0x00d8, B:36:0x00de, B:40:0x00e7, B:47:0x011d, B:43:0x00f9, B:46:0x0106, B:52:0x0125, B:29:0x00c0, B:53:0x013b, B:60:0x0154, B:63:0x015c, B:67:0x0180, B:69:0x0195, B:73:0x01b8, B:75:0x01cd, B:78:0x01e1, B:80:0x01e7, B:81:0x01f4, B:83:0x01f6, B:86:0x01ff, B:85:0x01fc, B:74:0x01c2, B:70:0x01a8, B:66:0x016a, B:57:0x0144, B:58:0x0149), top: B:111:0x0051, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b6.a zzb() {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvv.zzb():b6.a");
    }
}
