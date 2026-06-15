package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdkd {
    private final Executor zza;
    private final zzdjy zzb;

    public zzdkd(Executor executor, zzdjy zzdjyVar) {
        this.zza = executor;
        this.zzb = zzdjyVar;
    }

    public final b6.a zza(JSONObject jSONObject, String str) {
        b6.a zzh;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgap.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                zzh = zzgap.zzh(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zzh = zzgap.zzh(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        zzh = zzgap.zzh(new zzdkc(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzh = zzgap.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdka
                            @Override // com.google.android.gms.internal.ads.zzfsk
                            public final Object apply(Object obj) {
                                return new zzdkc(optString, (zzbel) obj);
                            }
                        }, this.zza);
                    } else {
                        zzh = zzgap.zzh(null);
                    }
                }
            }
            arrayList.add(zzh);
        }
        return zzgap.zzm(zzgap.zzd(arrayList), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdkb
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdkc zzdkcVar : (List) obj) {
                    if (zzdkcVar != null) {
                        arrayList2.add(zzdkcVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
