package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.ironsource.b9;
import com.ironsource.da;
import com.ironsource.in;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzl {

    /* renamed from: c  reason: collision with root package name */
    private static boolean f11382c = false;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f11383d = false;
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a  reason: collision with root package name */
    private final List f11386a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f11381b = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final Clock f11384e = DefaultClock.d();

    /* renamed from: f  reason: collision with root package name */
    private static final Set f11385f = new HashSet(Arrays.asList(new String[0]));

    public zzl() {
        throw null;
    }

    public zzl(String str) {
        List asList;
        if (!zzk()) {
            asList = new ArrayList();
        } else {
            asList = Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
        }
        this.f11386a = asList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        h(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name(b9.h.E0).value(Base64Utils.a(bArr));
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(int i10, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i10);
        jsonWriter.endObject();
        h(jsonWriter, map);
        jsonWriter.endObject();
    }

    private static synchronized void c(String str) {
        synchronized (zzl.class) {
            zzo.zzi("GMA Debug BEGIN");
            int i10 = 0;
            while (i10 < str.length()) {
                int i11 = i10 + 4000;
                zzo.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i10, Math.min(i11, str.length())))));
                i10 = i11;
            }
            zzo.zzi("GMA Debug FINISH");
        }
    }

    private final void d(String str, zzk zzkVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(da.a.f16995d).value(f11384e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.f11386a) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            zzkVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e8) {
            zzo.zzh("unable to log", e8);
        }
        c(stringWriter.toString());
    }

    private final void e(final String str) {
        d("onNetworkRequestError", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzi
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                int i10 = zzl.zza;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void f(final String str, final String str2, final Map map, final byte[] bArr) {
        d("onNetworkRequest", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzg
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                zzl.a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void g(final Map map, final int i10) {
        d("onNetworkResponse", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzj
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                zzl.b(i10, map, jsonWriter);
            }
        });
    }

    private static void h(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f11385f.contains(str)) {
                if (entry.getValue() instanceof List) {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name(b9.h.X).value(str2);
                        jsonWriter.endObject();
                    }
                } else if (entry.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name(b9.h.X).value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    zzo.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    public static void zzi() {
        synchronized (f11381b) {
            f11382c = false;
            f11383d = false;
            zzo.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z10) {
        synchronized (f11381b) {
            f11382c = true;
            f11383d = z10;
        }
    }

    public static boolean zzk() {
        boolean z10;
        synchronized (f11381b) {
            z10 = false;
            if (f11382c && f11383d) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean zzl() {
        boolean z10;
        synchronized (f11381b) {
            z10 = f11382c;
        }
        return z10;
    }

    public final void zzc(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (zzk()) {
            f(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zzd(String str, String str2, Map map, byte[] bArr) {
        if (zzk()) {
            f(str, in.f17848a, map, bArr);
        }
    }

    public final void zze(HttpURLConnection httpURLConnection, int i10) {
        if (zzk()) {
            String str = null;
            g(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i10);
            if (i10 < 200 || i10 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e8) {
                    zzo.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e8.getMessage())));
                }
                e(str);
            }
        }
    }

    public final void zzf(Map map, int i10) {
        if (zzk()) {
            g(map, i10);
            if (i10 < 200 || i10 >= 300) {
                e(null);
            }
        }
    }

    public final void zzg(String str) {
        if (zzk() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(final byte[] bArr) {
        d("onNetworkResponseBody", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                int i10 = zzl.zza;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String a10 = Base64Utils.a(bArr2);
                if (length < 10000) {
                    jsonWriter.name(b9.h.E0).value(a10);
                } else {
                    String zzg = zzf.zzg(a10);
                    if (zzg != null) {
                        jsonWriter.name("bodydigest").value(zzg);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
