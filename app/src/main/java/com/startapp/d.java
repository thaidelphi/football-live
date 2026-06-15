package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f21860a;

    /* renamed from: b  reason: collision with root package name */
    public final t4<AdvertisingIdResolver> f21861b;

    /* renamed from: c  reason: collision with root package name */
    public final j2<AdDebuggerMetadata> f21862c;

    public d(Context context, t4 t4Var, com.startapp.sdk.components.e0 e0Var) {
        this.f21860a = context;
        this.f21861b = t4Var;
        this.f21862c = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            com.startapp.j2<com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata> r0 = r5.f21862c
            java.lang.Object r0 = r0.call()
            com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata r0 = (com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata) r0
            if (r0 == 0) goto L22
            boolean r0 = r0.b()
            if (r0 == 0) goto L22
            com.startapp.l3 r0 = new com.startapp.l3
            com.startapp.m3 r1 = com.startapp.m3.f22274d
            r0.<init>(r1)
            java.lang.String r1 = "adDebugInfo"
            r0.f22228d = r1
            r0.f22229e = r6
            r0.f22231g = r7
            r0.a()
        L22:
            r0 = 0
            if (r6 != 0) goto L33
            if (r7 != 0) goto L33
            android.content.Context r6 = r5.f21860a
            java.lang.String r7 = "Ad debug info not available"
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r0)
            r6.show()
            goto L8b
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Ad debug info"
            r1.<init>(r2)
            java.lang.String r3 = "\n"
            r1.append(r3)
            if (r6 == 0) goto L4a
            java.lang.String r4 = "url: "
            r1.append(r4)
            r1.append(r6)
            goto L4c
        L4a:
            java.lang.String r3 = ""
        L4c:
            if (r7 == 0) goto L59
            r1.append(r3)
            java.lang.String r6 = "d: "
            r1.append(r6)
            r1.append(r7)
        L59:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 11
            if (r6 < r7) goto L76
            android.content.Context r6 = r5.f21860a     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = "clipboard"
            java.lang.Object r6 = r6.getSystemService(r7)     // Catch: java.lang.Throwable -> L76
            boolean r7 = r6 instanceof android.content.ClipboardManager     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L76
            android.content.ClipboardManager r6 = (android.content.ClipboardManager) r6     // Catch: java.lang.Throwable -> L76
            android.content.ClipData r7 = android.content.ClipData.newPlainText(r2, r1)     // Catch: java.lang.Throwable -> L76
            r6.setPrimaryClip(r7)     // Catch: java.lang.Throwable -> L76
            r6 = 1
            goto L77
        L76:
            r6 = r0
        L77:
            android.content.Context r7 = r5.f21860a     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L7e
            java.lang.String r6 = " copied to clipboard"
            goto L80
        L7e:
            java.lang.String r6 = " printed to logcat"
        L80:
            java.lang.String r6 = r2.concat(r6)     // Catch: java.lang.Throwable -> L8b
            android.widget.Toast r6 = android.widget.Toast.makeText(r7, r6, r0)     // Catch: java.lang.Throwable -> L8b
            r6.show()     // Catch: java.lang.Throwable -> L8b
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.d.a(java.lang.String, java.lang.String):void");
    }
}
