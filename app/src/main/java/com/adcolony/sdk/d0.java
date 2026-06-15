package com.adcolony.sdk;

import java.net.URL;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class d0 {

    /* renamed from: a  reason: collision with root package name */
    private URL f5973a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(URL url) {
        this.f5973a = url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = r6.f5973a     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L70
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L70
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L70
            java.lang.String r3 = "POST"
            r2.setRequestMethod(r3)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L67
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r4 = "gzip"
            r2.setRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L67
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json"
            r2.setRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L67
            r3 = 1
            r2.setDoInput(r3)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L67
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L67
            java.io.OutputStream r5 = r2.getOutputStream()     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L67
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L67
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L5f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L5f
            java.nio.charset.Charset r0 = com.adcolony.sdk.h.f6025a     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b
            byte[] r7 = r7.getBytes(r0)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b
            r5.write(r7)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b
            r5.close()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b
            int r7 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L56
            r4.close()
            java.io.InputStream r0 = r2.getInputStream()
            if (r0 == 0) goto L4f
            java.io.InputStream r0 = r2.getInputStream()
            r0.close()
        L4f:
            r2.disconnect()
            return r7
        L53:
            r7 = move-exception
            r1 = r3
            goto L76
        L56:
            r7 = move-exception
            r1 = r3
            goto L6a
        L59:
            r7 = move-exception
            goto L76
        L5b:
            r7 = move-exception
            goto L6a
        L5d:
            r7 = move-exception
            goto L77
        L5f:
            r7 = move-exception
            r5 = r0
            goto L6a
        L62:
            r7 = move-exception
            r4 = r0
            r5 = r4
            r0 = r2
            goto L75
        L67:
            r7 = move-exception
            r4 = r0
            r5 = r4
        L6a:
            r0 = r2
            goto L73
        L6c:
            r7 = move-exception
            r4 = r0
            r5 = r4
            goto L75
        L70:
            r7 = move-exception
            r4 = r0
            r5 = r4
        L73:
            throw r7     // Catch: java.lang.Throwable -> L74
        L74:
            r7 = move-exception
        L75:
            r2 = r0
        L76:
            r0 = r5
        L77:
            if (r0 == 0) goto L7e
            if (r1 != 0) goto L7e
            r0.close()
        L7e:
            if (r4 == 0) goto L83
            r4.close()
        L83:
            if (r2 == 0) goto L95
            java.io.InputStream r0 = r2.getInputStream()
            if (r0 == 0) goto L92
            java.io.InputStream r0 = r2.getInputStream()
            r0.close()
        L92:
            r2.disconnect()
        L95:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.d0.a(java.lang.String):int");
    }
}
