package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.c9;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdjj {
    private final zzgba zza;
    private final zzdjy zzb;
    private final zzdkd zzc;

    public zzdjj(zzgba zzgbaVar, zzdjy zzdjyVar, zzdkd zzdkdVar) {
        this.zza = zzgbaVar;
        this.zzb = zzdjyVar;
        this.zzc = zzdkdVar;
    }

    public static /* synthetic */ zzdgr zza(zzdjj zzdjjVar, b6.a aVar, b6.a aVar2, b6.a aVar3, b6.a aVar4, b6.a aVar5, JSONObject jSONObject, b6.a aVar6, b6.a aVar7, b6.a aVar8, b6.a aVar9, b6.a aVar10) {
        zzdgr zzdgrVar = (zzdgr) aVar.get();
        zzdgrVar.zzP((List) aVar2.get());
        zzdgrVar.zzM((zzbey) aVar3.get());
        zzdgrVar.zzQ((zzbey) aVar4.get());
        zzdgrVar.zzJ((zzber) aVar5.get());
        zzdgrVar.zzS(zzdjy.zzj(jSONObject));
        zzdgrVar.zzL(zzdjy.zzi(jSONObject));
        zzcdq zzcdqVar = (zzcdq) aVar6.get();
        if (zzcdqVar != null) {
            zzdgrVar.zzad(zzcdqVar);
            zzdgrVar.zzac(zzcdqVar.zzF());
            zzdgrVar.zzab(zzcdqVar.zzq());
        }
        zzdgrVar.zzd().putAll((Bundle) aVar7.get());
        zzcdq zzcdqVar2 = (zzcdq) aVar8.get();
        if (zzcdqVar2 != null) {
            zzdgrVar.zzO(zzcdqVar2);
            zzdgrVar.zzae(zzcdqVar2.zzF());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfn)).booleanValue() && !zzc(jSONObject)) {
            zzdgrVar.zzU(aVar9);
            zzdgrVar.zzX(new zzbyu());
        } else {
            zzcdq zzcdqVar3 = (zzcdq) aVar9.get();
            if (zzcdqVar3 != null) {
                zzdgrVar.zzT(zzcdqVar3);
            }
        }
        for (zzdkc zzdkcVar : (List) aVar10.get()) {
            if (zzdkcVar.zza != 1) {
                zzdgrVar.zzN(zzdkcVar.zzb, zzdkcVar.zzd);
            } else {
                zzdgrVar.zzZ(zzdkcVar.zzb, zzdkcVar.zzc);
            }
        }
        return zzdgrVar;
    }

    private static final boolean zzc(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final b6.a zzb(final zzfag zzfagVar, final zzezu zzezuVar, final JSONObject jSONObject) {
        final zzbyu zzh;
        b6.a zzn;
        JSONArray optJSONArray;
        final b6.a zzb = this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdjh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdgr zzdgrVar = new zzdgr();
                JSONObject jSONObject2 = jSONObject;
                zzdgrVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdgrVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                String optString = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                zzfag zzfagVar2 = zzfagVar;
                zzdgrVar.zzV(optString);
                zzfap zzfapVar = zzfagVar2.zza.zza;
                if (zzfapVar.zzg.contains(Integer.toString(zzdgrVar.zzc()))) {
                    if (zzdgrVar.zzc() == 3) {
                        if (zzdgrVar.zzA() != null) {
                            if (!zzfapVar.zzh.contains(zzdgrVar.zzA())) {
                                throw new zzeez(1, "Unexpected custom template id in the response.");
                            }
                        } else {
                            throw new zzeez(1, "No custom template id for custom template ad response.");
                        }
                    }
                    zzezu zzezuVar2 = zzezuVar;
                    zzdgrVar.zzY(jSONObject2.optDouble("rating", -1.0d));
                    String optString2 = jSONObject2.optString("headline", null);
                    if (zzezuVar2.zzM) {
                        com.google.android.gms.ads.internal.zzv.zzq();
                        optString2 = com.google.android.gms.ads.internal.util.zzs.zzz() + " : " + optString2;
                    }
                    zzdgrVar.zzZ("headline", optString2);
                    zzdgrVar.zzZ(b9.h.E0, jSONObject2.optString(b9.h.E0, null));
                    zzdgrVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                    zzdgrVar.zzZ(b9.h.U, jSONObject2.optString(b9.h.U, null));
                    zzdgrVar.zzZ("price", jSONObject2.optString("price", null));
                    zzdgrVar.zzZ(b9.h.F0, jSONObject2.optString(b9.h.F0, null));
                    return zzdgrVar;
                }
                throw new zzeez(1, "Invalid template ID: " + zzdgrVar.zzc());
            }
        });
        final b6.a zzf = this.zzb.zzf(jSONObject, "images");
        zzezx zzezxVar = zzfagVar.zzb.zzb;
        zzdjy zzdjyVar = this.zzb;
        final b6.a zzg = zzdjyVar.zzg(jSONObject, "images", zzezuVar, zzezxVar);
        final b6.a zze = zzdjyVar.zze(jSONObject, "secondary_image");
        final b6.a zze2 = zzdjyVar.zze(jSONObject, "app_icon");
        final b6.a zzd = zzdjyVar.zzd(jSONObject, c9.f16850c);
        final b6.a zzh2 = this.zzb.zzh(jSONObject, zzezuVar, zzfagVar.zzb.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmP)).booleanValue() && jSONObject.has("video")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject.has("flags") && (optJSONArray = optJSONObject.optJSONArray("flags")) != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= optJSONArray.length()) {
                        break;
                    }
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i10);
                    if (optJSONObject2 == null || !optJSONObject2.optString(b9.h.W).equals("afma_video_player_type")) {
                        i10++;
                    } else {
                        try {
                            if (Integer.parseInt(optJSONObject2.optString(b9.h.X)) == 3) {
                                zzdjy zzdjyVar2 = this.zzb;
                                zzbyu zzbyuVar = new zzbyu();
                                zzgap.zzr(zzh2, new zzdjx(zzdjyVar2, zzbyuVar), zzbyp.zzf);
                                zzh = zzbyuVar;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        zzh = zzgap.zzh(new Bundle());
        final b6.a zza = this.zzc.zza(jSONObject, "custom_assets");
        final zzdjy zzdjyVar3 = this.zzb;
        if (!jSONObject.optBoolean("enable_omid")) {
            zzn = zzgap.zzh(null);
        } else {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject3 == null) {
                zzn = zzgap.zzh(null);
            } else {
                final String optString = optJSONObject3.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzgap.zzh(null);
                } else {
                    zzn = zzgap.zzn(zzgap.zzh(null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdjn
                        @Override // com.google.android.gms.internal.ads.zzfzw
                        public final b6.a zza(Object obj) {
                            return zzdjy.zzc(zzdjy.this, optString, obj);
                        }
                    }, zzbyp.zzf);
                }
            }
        }
        final b6.a aVar = zzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh2);
        arrayList.add(zzh);
        arrayList.add(zza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfn)).booleanValue() || zzc(jSONObject)) {
            arrayList.add(aVar);
        }
        return zzgap.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdji
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdjj.zza(zzdjj.this, zzb, zzf, zze2, zze, zzd, jSONObject, zzh2, zzh, zzg, aVar, zza);
            }
        }, this.zza);
    }
}
