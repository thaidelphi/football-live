package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzdpn;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbk {

    /* renamed from: a  reason: collision with root package name */
    private long f11771a;

    /* renamed from: b  reason: collision with root package name */
    private long f11772b;
    public final String zza;
    public String zzb;
    public zzbud zzd;
    public Bundle zze;
    public String zzc = null;
    public Bundle zzf = new Bundle();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzbk(JsonReader jsonReader, zzbud zzbudVar) throws IOException {
        Bundle bundle;
        char c10;
        this.f11771a = -1L;
        this.f11772b = -1L;
        this.zzd = zzbudVar;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -995427962:
                    if (nextName.equals("params")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1725551537:
                    if (nextName.equals("end_time")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 == 0) {
                str = jsonReader.nextString();
            } else if (c10 == 1) {
                hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (c10 == 2) {
                this.f11771a = jsonReader.nextLong();
            } else if (c10 != 3) {
                jsonReader.skipValue();
            } else {
                this.f11772b = jsonReader.nextLong();
            }
        }
        this.zza = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzf.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue() || zzbudVar == null || (bundle = zzbudVar.zzm) == null) {
            return;
        }
        bundle.putLong(zzdpn.GET_SIGNALS_SDKCORE_START.zza(), this.f11771a);
        zzbudVar.zzm.putLong(zzdpn.GET_SIGNALS_SDKCORE_END.zza(), this.f11772b);
    }
}
