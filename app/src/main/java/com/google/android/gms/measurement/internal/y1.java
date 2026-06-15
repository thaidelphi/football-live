package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class y1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final URL f13251a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13252b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzih f13253c;

    /* renamed from: d  reason: collision with root package name */
    private final zzfw f13254d;

    public y1(zzih zzihVar, String str, URL url, byte[] bArr, Map map, zzfw zzfwVar, byte[] bArr2) {
        this.f13253c = zzihVar;
        Preconditions.g(str);
        Preconditions.m(url);
        Preconditions.m(zzfwVar);
        this.f13251a = url;
        this.f13254d = zzfwVar;
        this.f13252b = str;
    }

    private final void b(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.f13253c.f13220a.zzaz().u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzif
            @Override // java.lang.Runnable
            public final void run() {
                y1.this.a(i10, exc, bArr, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i10, Exception exc, byte[] bArr, Map map) {
        zzfw zzfwVar = this.f13254d;
        zzfwVar.f13552a.c(this.f13252b, i10, exc, bArr, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.measurement.internal.y1] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.zzih r0 = r10.f13253c
            r0.b()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.zzih r2 = r10.f13253c     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            java.net.URL r3 = r10.f13251a     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            if (r4 == 0) goto L7c
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            com.google.android.gms.measurement.internal.zzfy r4 = r2.f13220a     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r4.u()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            com.google.android.gms.measurement.internal.zzfy r2 = r2.f13220a     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r2.u()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L64
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L64
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L62
        L4a:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L62
            if (r8 <= 0) goto L54
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L62
            goto L4a
        L54:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L62
            r6.close()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r3.disconnect()
            r10.b(r2, r1, r0, r4)
            return
        L62:
            r0 = move-exception
            goto L66
        L64:
            r0 = move-exception
            r6 = r1
        L66:
            if (r6 == 0) goto L6b
            r6.close()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
        L6b:
            throw r0     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
        L6c:
            r0 = move-exception
            goto L8a
        L6e:
            r0 = move-exception
            goto L99
        L70:
            r0 = move-exception
            r4 = r1
            goto L8a
        L73:
            r0 = move-exception
            r4 = r1
            goto L99
        L76:
            r2 = move-exception
            r4 = r1
            goto L87
        L79:
            r2 = move-exception
            r4 = r1
            goto L96
        L7c:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
            throw r2     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L93
        L84:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L87:
            r9 = r2
            r2 = r0
            r0 = r9
        L8a:
            if (r3 == 0) goto L8f
            r3.disconnect()
        L8f:
            r10.b(r2, r1, r1, r4)
            throw r0
        L93:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L96:
            r9 = r2
            r2 = r0
            r0 = r9
        L99:
            if (r3 == 0) goto L9e
            r3.disconnect()
        L9e:
            r10.b(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y1.run():void");
    }
}
