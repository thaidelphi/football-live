package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.b9;
import com.ironsource.c9;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdjy {
    private final Context zza;
    private final zzdjf zzb;
    private final zzauc zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbak zzf;
    private final Executor zzg;
    private final zzben zzh;
    private final zzdkq zzi;
    private final zzdnf zzj;
    private final ScheduledExecutorService zzk;
    private final zzdma zzl;
    private final zzdqf zzm;
    private final zzfhp zzn;
    private final zzdzu zzo;
    private final zzeaf zzp;
    private final zzfat zzq;

    public zzdjy(Context context, zzdjf zzdjfVar, zzauc zzaucVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbak zzbakVar, Executor executor, zzfap zzfapVar, zzdkq zzdkqVar, zzdnf zzdnfVar, ScheduledExecutorService scheduledExecutorService, zzdqf zzdqfVar, zzfhp zzfhpVar, zzdzu zzdzuVar, zzdma zzdmaVar, zzeaf zzeafVar, zzfat zzfatVar) {
        this.zza = context;
        this.zzb = zzdjfVar;
        this.zzc = zzaucVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbakVar;
        this.zzg = executor;
        this.zzh = zzfapVar.zzi;
        this.zzi = zzdkqVar;
        this.zzj = zzdnfVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdqfVar;
        this.zzn = zzfhpVar;
        this.zzo = zzdzuVar;
        this.zzl = zzdmaVar;
        this.zzp = zzeafVar;
        this.zzq = zzfatVar;
    }

    public static /* synthetic */ zzbei zza(zzdjy zzdjyVar, JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString(b9.h.K0);
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbei(optString, list, zzq, zzq2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, zzdjyVar.zzh.zze, optBoolean);
    }

    public static /* synthetic */ b6.a zzb(zzdjy zzdjyVar, com.google.android.gms.ads.internal.client.zzr zzrVar, zzezu zzezuVar, zzezx zzezxVar, String str, String str2, Object obj) {
        zzcdq zza = zzdjyVar.zzj.zza(zzrVar, zzezuVar, zzezxVar);
        final zzbyt zza2 = zzbyt.zza(zza);
        zzdlx zzb = zzdjyVar.zzl.zzb();
        zza.zzN().zzV(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(zzdjyVar.zza, null, null), null, null, zzdjyVar.zzo, zzdjyVar.zzn, zzdjyVar.zzm, null, zzb, null, null, null, null);
        zza.zzag("/getNativeAdViewSignals", zzbin.zzs);
        zza.zzag("/getNativeClickMeta", zzbin.zzt);
        zza.zzN().zzF(true);
        zza.zzN().zzC(new zzcfg() { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // com.google.android.gms.internal.ads.zzcfg
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzbyt zzbytVar = zzbyt.this;
                if (z10) {
                    zzbytVar.zzb();
                    return;
                }
                zzbytVar.zzd(new zzeez(1, "Image Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zza.zzae(str, str2, null);
        return zza2;
    }

    public static /* synthetic */ b6.a zzc(zzdjy zzdjyVar, String str, Object obj) {
        com.google.android.gms.ads.internal.zzv.zzA();
        com.google.android.gms.ads.internal.zza zzaVar = zzdjyVar.zze;
        zzbak zzbakVar = zzdjyVar.zzf;
        Context context = zzdjyVar.zza;
        zzcfk zza = zzcfk.zza();
        zzeaf zzeafVar = zzdjyVar.zzp;
        zzfat zzfatVar = zzdjyVar.zzq;
        zzcdq zza2 = zzced.zza(context, zza, "native-omid", false, false, zzdjyVar.zzc, null, zzdjyVar.zzd, null, null, zzaVar, zzbakVar, null, null, zzeafVar, zzfatVar);
        final zzbyt zza3 = zzbyt.zza(zza2);
        zza2.zzN().zzC(new zzcfg() { // from class: com.google.android.gms.internal.ads.zzdjl
            @Override // com.google.android.gms.internal.ads.zzcfg
            public final void zza(boolean z10, int i10, String str2, String str3) {
                zzbyt.this.zzb();
            }
        });
        zza2.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        return zza3;
    }

    public static final com.google.android.gms.ads.internal.client.zzew zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfvv.zzn();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                com.google.android.gms.ads.internal.client.zzew zzr = zzr(optJSONArray.optJSONObject(i10));
                if (zzr != null) {
                    arrayList.add(zzr);
                }
            }
            return zzfvv.zzl(arrayList);
        }
        return zzfvv.zzn();
    }

    private final com.google.android.gms.ads.internal.client.zzr zzk(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzc();
            }
            i10 = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i10, i11));
    }

    private static b6.a zzl(b6.a aVar, Object obj) {
        return zzgap.zzf(aVar, Exception.class, new zzfzw(null) { // from class: com.google.android.gms.internal.ads.zzdjt
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj2);
                return zzgap.zzh(null);
            }
        }, zzbyp.zzg);
    }

    private static b6.a zzm(boolean z10, final b6.a aVar, Object obj) {
        if (z10) {
            return zzgap.zzn(aVar, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdju
                @Override // com.google.android.gms.internal.ads.zzfzw
                public final b6.a zza(Object obj2) {
                    return obj2 != null ? b6.a.this : zzgap.zzg(new zzeez(1, "Retrieve required value in native ad response failed."));
                }
            }, zzbyp.zzg);
        }
        return zzl(aVar, null);
    }

    private final b6.a zzn(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return zzgap.zzh(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzgap.zzh(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z10) {
            return zzgap.zzh(new zzbel(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgap.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdjm
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return new zzbel(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final b6.a zzo(JSONArray jSONArray, boolean z10, boolean z11) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = z11 ? jSONArray.length() : 1;
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(zzn(jSONArray.optJSONObject(i10), z10));
            }
            return zzgap.zzm(zzgap.zzd(arrayList), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdjr
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    ArrayList arrayList2 = new ArrayList();
                    for (zzbel zzbelVar : (List) obj) {
                        if (zzbelVar != null) {
                            arrayList2.add(zzbelVar);
                        }
                    }
                    return arrayList2;
                }
            }, this.zzg);
        }
        return zzgap.zzh(Collections.emptyList());
    }

    private final b6.a zzp(JSONObject jSONObject, zzezu zzezuVar, zzezx zzezxVar) {
        final b6.a zze = this.zzi.zze(jSONObject.optString("base_url"), jSONObject.optString("html"), zzezuVar, zzezxVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgap.zzn(zze, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdjo
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                zzcdq zzcdqVar = (zzcdq) obj;
                if (zzcdqVar != null && zzcdqVar.zzq() != null) {
                    return b6.a.this;
                }
                throw new zzeez(1, "Retrieve video view in html5 ad response failed.");
            }
        }, zzbyp.zzg);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzew zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzew(optString, optString2);
    }

    public final b6.a zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject(c9.f16850c);
        if (optJSONObject == null) {
            return zzgap.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzgap.zzm(zzo(optJSONArray, false, true), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return zzdjy.zza(zzdjy.this, optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final b6.a zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final b6.a zzf(JSONObject jSONObject, String str) {
        zzben zzbenVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbenVar.zzb, zzbenVar.zzd);
    }

    public final b6.a zzg(JSONObject jSONObject, String str, final zzezu zzezuVar, final zzezx zzezxVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjV)).booleanValue()) {
            return zzgap.zzh(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return zzgap.zzh(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString("html");
            final com.google.android.gms.ads.internal.client.zzr zzk = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
            if (TextUtils.isEmpty(optString2)) {
                return zzgap.zzh(null);
            }
            final b6.a zzn = zzgap.zzn(zzgap.zzh(null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdjp
                @Override // com.google.android.gms.internal.ads.zzfzw
                public final b6.a zza(Object obj) {
                    return zzdjy.zzb(zzdjy.this, zzk, zzezuVar, zzezxVar, optString, optString2, obj);
                }
            }, zzbyp.zzf);
            return zzgap.zzn(zzn, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdjq
                @Override // com.google.android.gms.internal.ads.zzfzw
                public final b6.a zza(Object obj) {
                    if (((zzcdq) obj) != null) {
                        return b6.a.this;
                    }
                    throw new zzeez(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzbyp.zzg);
        }
        return zzgap.zzh(null);
    }

    public final b6.a zzh(JSONObject jSONObject, zzezu zzezuVar, zzezx zzezxVar) {
        b6.a zzd;
        JSONObject zzh = com.google.android.gms.ads.internal.util.zzbs.zzh(jSONObject, "html_containers", "instream");
        if (zzh == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzgap.zzh(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z10 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjU)).booleanValue() && optJSONObject.has("html")) {
                z10 = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Required field 'vast_xml' or 'html' is missing");
                    return zzgap.zzh(null);
                }
            } else if (!z10) {
                zzd = this.zzi.zzd(optJSONObject);
                zzbbd zzbbdVar = zzbbm.zzdT;
                return zzl(zzgap.zzo(zzd, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zzd = zzp(optJSONObject, zzezuVar, zzezxVar);
            zzbbd zzbbdVar2 = zzbbm.zzdT;
            return zzl(zzgap.zzo(zzd, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar2)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzp(zzh, zzezuVar, zzezxVar);
    }
}
