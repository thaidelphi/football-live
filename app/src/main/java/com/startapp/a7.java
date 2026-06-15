package com.startapp;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a7 {

    /* renamed from: a  reason: collision with root package name */
    public static y6 f21763a;

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.a7.a(android.content.Context):boolean");
    }

    public static boolean b() {
        Process process;
        try {
            process = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", AndroidStaticDeviceInfoDataSource.BINARY_SU});
        } catch (Throwable unused) {
            process = null;
        }
        try {
            boolean z10 = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null;
            process.destroy();
            return z10;
        } catch (Throwable unused2) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    public static boolean a() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (new File(strArr[i10]).exists()) {
                return true;
            }
        }
        return false;
    }
}
