package com.google.android.gms.internal.ads;

import com.ironsource.in;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzapq extends zzapd {
    public zzapq() {
        throw null;
    }

    public zzapq(zzapp zzappVar, SSLSocketFactory sSLSocketFactory) {
    }

    static List zzb(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : (List) entry.getValue()) {
                    arrayList.add(new zzaoh((String) entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzapd
    public final zzapn zza(zzaop zzaopVar, Map map) throws IOException, zzanx {
        String zzk = zzaopVar.zzk();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzaopVar.zzl());
        URL url = new URL(zzk);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzb = zzaopVar.zzb();
        httpURLConnection.setConnectTimeout(zzb);
        httpURLConnection.setReadTimeout(zzb);
        boolean z10 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        HttpRequest.DEFAULT_SCHEME.equals(url.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (zzaopVar.zza() != 0) {
                httpURLConnection.setRequestMethod(in.f17849b);
                byte[] zzx = zzaopVar.zzx();
                if (zzx != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(zzx);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod(in.f17848a);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                zzaopVar.zza();
                if ((responseCode < 100 || responseCode >= 200) && responseCode != 204 && responseCode != 304) {
                    try {
                        return new zzapn(responseCode, zzb(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzapo(httpURLConnection));
                    } catch (Throwable th) {
                        th = th;
                        z10 = true;
                        if (!z10) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                zzapn zzapnVar = new zzapn(responseCode, zzb(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return zzapnVar;
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
