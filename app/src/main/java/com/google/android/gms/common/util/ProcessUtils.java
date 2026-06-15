package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ProcessUtils {

    /* renamed from: a  reason: collision with root package name */
    private static String f12746a;

    /* renamed from: b  reason: collision with root package name */
    private static int f12747b;

    private ProcessUtils() {
    }

    @KeepForSdk
    public static String a() {
        BufferedReader bufferedReader;
        if (f12746a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f12746a = Application.getProcessName();
            } else {
                int i10 = f12747b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f12747b = i10;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        String str2 = "/proc/" + i10 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                Preconditions.m(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                IOUtils.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    IOUtils.a(bufferedReader);
                }
                f12746a = str;
            }
        }
        return f12746a;
    }
}
