package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzezx {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzezw zzj;
    public final Bundle zzk;
    public final String zzl;
    public final String zzm;
    public final String zzn;
    public final JSONObject zzo;
    public final JSONObject zzp;
    public final String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzezx(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        int i10 = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        zzezw zzezwVar = null;
        long j10 = -1;
        long j11 = -1;
        long j12 = 0;
        int i11 = -1;
        int i12 = 1;
        int i13 = 0;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                emptyList = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i11 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z10 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i13 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j12 = jsonReader.nextLong();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzij)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzezwVar = new zzezw(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str = jsonReader.nextString();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkp)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str7 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgF)).booleanValue()) {
                            try {
                                try {
                                    Bundle zza = com.google.android.gms.ads.internal.util.zzbs.zza(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                                    if (zza != null) {
                                        bundle = zza;
                                    }
                                } catch (IllegalStateException unused) {
                                    jsonReader.skipValue();
                                }
                            } catch (IOException | JSONException unused2) {
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjj)).booleanValue()) {
                            str5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjj)).booleanValue()) {
                            str2 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        zzbbd zzbbdVar = zzbbm.zzjk;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str6 = jsonReader.nextString();
                        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                        } else if (Objects.equals(nextName, "max_parallel_renderers")) {
                            i12 = Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjr)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                            } else {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcl)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                    try {
                                        Bundle zza2 = com.google.android.gms.ads.internal.util.zzbs.zza(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                                        if (zza2 != null) {
                                            j11 = zza(zza2.getDouble("start_time"));
                                            j10 = zza(zza2.getDouble("end_time"));
                                        }
                                    } catch (IllegalStateException unused3) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                        }
                    }
                }
            }
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i10;
        if (((Boolean) zzbds.zzc.zze()).booleanValue()) {
            this.zzd = -1;
        } else {
            zzbcw zzbcwVar = zzbda.zza;
            if (((Long) zzbcwVar.zze()).longValue() > -1) {
                this.zzd = ((Long) zzbcwVar.zze()).intValue();
            } else {
                this.zzd = i11;
            }
        }
        this.zzb = str3;
        this.zze = str4;
        this.zzf = i13;
        this.zzg = j12;
        this.zzj = zzezwVar;
        this.zzh = z10;
        this.zzi = str;
        this.zzk = bundle;
        this.zzl = str2;
        this.zzm = str5;
        this.zzn = str6;
        this.zzo = jSONObject;
        this.zzp = jSONObject2;
        this.zzq = str7;
        zzbcw zzbcwVar2 = zzbdq.zza;
        this.zzr = ((Long) zzbcwVar2.zze()).longValue() > 0 ? ((Long) zzbcwVar2.zze()).intValue() : i12;
        this.zzs = j11;
        this.zzt = j10;
    }

    private static final long zza(double d10) {
        if (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d10;
    }
}
