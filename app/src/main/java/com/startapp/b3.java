package com.startapp;

import com.ironsource.in;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b3 {

    /* renamed from: a  reason: collision with root package name */
    public final t4<AdvertisingIdResolver> f21787a;

    /* renamed from: b  reason: collision with root package name */
    public final j2<String> f21788b;

    /* renamed from: c  reason: collision with root package name */
    public final t4<e5> f21789c;

    /* renamed from: d  reason: collision with root package name */
    public final t4<d6> f21790d;

    /* renamed from: e  reason: collision with root package name */
    public final j2<c3> f21791e;

    public b3(t4 t4Var, com.startapp.sdk.components.i iVar, t4 t4Var2, t4 t4Var3, com.startapp.sdk.components.l lVar) {
        this.f21787a = t4Var;
        this.f21788b = iVar;
        this.f21789c = t4Var2;
        this.f21790d = t4Var3;
        this.f21791e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r8, java.util.HashMap r9, com.startapp.d3 r10) throws com.startapp.sdk.common.SDKException {
        /*
            r0 = 0
            r1 = 0
            java.net.HttpURLConnection r9 = a(r8, r9, r10)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            byte[] r2 = r10.f21869a     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            int r2 = r2.length     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            if (r2 <= 0) goto L29
            java.io.OutputStream r2 = r9.getOutputStream()     // Catch: java.lang.Throwable -> L1f
            byte[] r10 = r10.f21869a     // Catch: java.lang.Throwable -> L1d
            r2.write(r10)     // Catch: java.lang.Throwable -> L1d
            r2.flush()     // Catch: java.lang.Throwable -> L1d
            int r10 = com.startapp.y.f23556a     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            r2.close()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L55
            goto L29
        L1d:
            r10 = move-exception
            goto L21
        L1f:
            r10 = move-exception
            r2 = r0
        L21:
            int r3 = com.startapp.y.f23556a     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            if (r2 == 0) goto L28
            r2.close()     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L55
        L28:
            throw r10     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
        L29:
            int r1 = r9.getResponseCode()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            r10 = 200(0xc8, float:2.8E-43)
            if (r1 != r10) goto L39
            java.lang.String r8 = a(r9)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            r9.disconnect()
            return r8
        L39:
            android.net.Uri r10 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            android.net.Uri$Builder r10 = r10.buildUpon()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            android.net.Uri$Builder r10 = r10.query(r0)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            com.startapp.sdk.common.SDKException r10 = new com.startapp.sdk.common.SDKException     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            java.lang.String r3 = "POST"
            r6 = 0
            r7 = 0
            r2 = r10
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            throw r10     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
        L55:
            r8 = move-exception
            r0 = r9
            goto L7b
        L58:
            r10 = move-exception
            r6 = r10
            goto L60
        L5b:
            r8 = move-exception
            goto L7b
        L5d:
            r10 = move-exception
            r6 = r10
            r9 = r0
        L60:
            r4 = r1
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L55
            android.net.Uri$Builder r8 = r8.buildUpon()     // Catch: java.lang.Throwable -> L55
            android.net.Uri$Builder r8 = r8.query(r0)     // Catch: java.lang.Throwable -> L55
            android.net.Uri r3 = r8.build()     // Catch: java.lang.Throwable -> L55
            com.startapp.sdk.common.SDKException r8 = new com.startapp.sdk.common.SDKException     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = "POST"
            r5 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L55
            throw r8     // Catch: java.lang.Throwable -> L55
        L7b:
            if (r0 == 0) goto L80
            r0.disconnect()
        L80:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.b3.b(java.lang.String, java.util.HashMap, com.startapp.d3):java.lang.String");
    }

    public final boolean a(int i10) {
        c3 call = this.f21791e.call();
        if (call == null) {
            call = c3.f21822d;
        }
        return call.f21825c.a(i10);
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        c3 call = this.f21791e.call();
        if (call == null) {
            call = c3.f21822d;
        }
        if (!call.f21824b) {
            String str = null;
            try {
                str = URLEncoder.encode(this.f21787a.a().a().f22479a, "UTF-8");
            } catch (Throwable th) {
                if (a(64)) {
                    l3.a(th);
                }
            }
            hashMap.put("device-id", str);
        }
        try {
            hashMap.put("Accept-Language", this.f21789c.a().b().f21877c);
        } catch (Throwable th2) {
            if (a(128)) {
                l3.a(th2);
            }
        }
        try {
            String call2 = this.f21788b.call();
            if (call2 != null) {
                hashMap.put("User-Agent", call2);
            }
        } catch (Throwable th3) {
            if (a(256)) {
                l3.a(th3);
            }
        }
        return hashMap;
    }

    public static HttpURLConnection a(String str, HashMap hashMap, d3 d3Var) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
        w1.a(httpURLConnection, str);
        httpURLConnection.setReadTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        httpURLConnection.setConnectTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        if (d3Var != null) {
            httpURLConnection.setRequestMethod(in.f17849b);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(d3Var.f21869a.length);
            httpURLConnection.setRequestProperty("Content-Type", d3Var.f21870b);
            String str2 = d3Var.f21871c;
            if (str2 != null) {
                httpURLConnection.setRequestProperty("Content-Encoding", str2);
            }
        } else {
            httpURLConnection.setRequestMethod(in.f17848a);
            httpURLConnection.setRequestProperty("Accept", "application/json;text/html;text/plain");
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str3 != null && str4 != null) {
                httpURLConnection.setRequestProperty(str3, str4);
            }
        }
        return httpURLConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.startapp.e3 a(java.util.HashMap r9, java.lang.String r10) throws com.startapp.sdk.common.SDKException {
        /*
            r0 = 0
            r1 = 0
            java.net.HttpURLConnection r9 = a(r10, r9, r0)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51
            int r1 = r9.getResponseCode()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L2e
            com.startapp.w1.b(r9, r10)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            com.startapp.e3 r2 = new com.startapp.e3     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r2.<init>()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r2.f21902a = r10     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            java.lang.String r3 = r9.getContentType()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r2.f21904c = r3     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            java.util.Map r3 = r9.getHeaderFields()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r2.f21905d = r3     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            java.lang.String r3 = a(r9)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r2.f21903b = r3     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r9.disconnect()
            return r2
        L2e:
            android.net.Uri r2 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            android.net.Uri$Builder r2 = r2.query(r0)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            android.net.Uri r4 = r2.build()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            com.startapp.sdk.common.SDKException r8 = new com.startapp.sdk.common.SDKException     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            java.lang.String r3 = "GET"
            r6 = 1
            r7 = 0
            r2 = r8
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            throw r8     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
        L4a:
            r10 = move-exception
            r0 = r9
            goto L6f
        L4d:
            r2 = move-exception
            goto L53
        L4f:
            r10 = move-exception
            goto L6f
        L51:
            r2 = move-exception
            r9 = r0
        L53:
            r4 = r1
            r6 = r2
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L4a
            android.net.Uri$Builder r10 = r10.buildUpon()     // Catch: java.lang.Throwable -> L4a
            android.net.Uri$Builder r10 = r10.query(r0)     // Catch: java.lang.Throwable -> L4a
            android.net.Uri r3 = r10.build()     // Catch: java.lang.Throwable -> L4a
            com.startapp.sdk.common.SDKException r10 = new com.startapp.sdk.common.SDKException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = "GET"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4a
            throw r10     // Catch: java.lang.Throwable -> L4a
        L6f:
            if (r0 == 0) goto L74
            r0.disconnect()
        L74:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.b3.a(java.util.HashMap, java.lang.String):com.startapp.e3");
    }

    public static String a(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = httpURLConnection.getInputStream();
            if (inputStream2 != null) {
                try {
                    StringWriter stringWriter = new StringWriter();
                    char[] cArr = new char[1024];
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream2) : inputStream2, "UTF-8"));
                    while (true) {
                        int read = bufferedReader.read(cArr);
                        if (read == -1) {
                            break;
                        }
                        stringWriter.write(cArr, 0, read);
                    }
                    String obj = stringWriter.toString();
                    int i10 = y.f23556a;
                    try {
                        inputStream2.close();
                    } catch (Exception unused) {
                    }
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                    int i11 = y.f23556a;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            }
            int i12 = y.f23556a;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Exception unused3) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
