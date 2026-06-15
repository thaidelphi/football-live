package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfaf {
    public final List zza;
    public final zzezx zzb;
    public final List zzc;
    public final zzbud zzd;

    zzfaf(JsonReader jsonReader, zzbud zzbudVar) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        Bundle bundle;
        Bundle bundle2;
        this.zzd = zzbudVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue() && zzbudVar != null && (bundle2 = zzbudVar.zzm) != null) {
            bundle2.putLong(zzdpn.SERVER_RESPONSE_PARSE_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzezx zzezxVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzezu(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzezxVar = new zzezx(jsonReader);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcl)).booleanValue() && zzbudVar != null && (bundle = zzbudVar.zzm) != null) {
                            bundle.putLong(zzdpn.NORMALIZATION_AD_RESPONSE_START.zza(), zzezxVar.zzs);
                            zzbudVar.zzm.putLong(zzdpn.NORMALIZATION_AD_RESPONSE_END.zza(), zzezxVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzfae(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzezxVar == null ? new zzezx(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : zzezxVar;
    }

    public static zzfaf zza(Reader reader, zzbud zzbudVar) throws zzezy {
        try {
            try {
                return new zzfaf(new JsonReader(reader), zzbudVar);
            } finally {
                IOUtils.a(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e8) {
            throw new zzezy("unable to parse ServerResponse", e8);
        }
    }
}
