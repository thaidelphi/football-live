package com.startapp.sdk.common;

import android.net.Uri;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SDKException extends Exception {
    private static final long serialVersionUID = 1203685012128929267L;
    private String method;
    private boolean retry;
    private int statusCode;
    private Uri uri;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SDKException(java.lang.String r5, android.net.Uri r6, int r7, boolean r8, java.io.IOException r9) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r1 = 32
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ""
            if (r7 == 0) goto L23
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ", status "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            goto L24
        L23:
            r2 = r1
        L24:
            r0.append(r2)
            if (r8 == 0) goto L2b
            java.lang.String r1 = ", retry"
        L2b:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r9)
            r4.method = r5
            r4.uri = r6
            r4.statusCode = r7
            r4.retry = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.common.SDKException.<init>(java.lang.String, android.net.Uri, int, boolean, java.io.IOException):void");
    }

    public final int a() {
        return this.statusCode;
    }

    public final Uri b() {
        return this.uri;
    }

    public SDKException() {
    }

    public SDKException(String str, Exception exc) {
        super(str, exc);
    }
}
