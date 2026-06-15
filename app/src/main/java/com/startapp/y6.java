package com.startapp;

import android.content.Context;
import android.content.pm.PackageManager;
import com.ironsource.b9;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class y6 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23618a;

    public y6(Context context) {
        this.f23618a = context;
    }

    public static boolean a(String str) {
        String[] strArr = z6.f23673c;
        boolean z10 = false;
        for (int i10 = 0; i10 < 14; i10++) {
            if (new File(strArr[i10], str).exists()) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean b() {
        String[] strArr = new String[0];
        try {
            strArr = new Scanner(Runtime.getRuntime().exec("mount").getInputStream()).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e8) {
            e8.printStackTrace();
        }
        boolean z10 = false;
        for (String str : strArr) {
            String[] split = str.split(" ");
            if (split.length >= 4) {
                String str2 = split[1];
                String str3 = split[3];
                String[] strArr2 = z6.f23674d;
                for (int i10 = 0; i10 < 7; i10++) {
                    if (str2.equalsIgnoreCase(strArr2[i10])) {
                        String[] split2 = str3.split(",");
                        int length = split2.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                break;
                            } else if (split2[i11].equalsIgnoreCase("rw")) {
                                z10 = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }

    public static boolean c() {
        Process process;
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", AndroidStaticDeviceInfoDataSource.BINARY_SU});
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

    public final boolean a(ArrayList arrayList) {
        PackageManager packageManager = this.f23618a.getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            try {
                packageManager.getPackageInfo((String) it.next(), 0);
                z10 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z10;
    }

    public static boolean a() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        String[] strArr = new String[0];
        try {
            strArr = new Scanner(Runtime.getRuntime().exec("getprop").getInputStream()).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e8) {
            e8.printStackTrace();
        }
        boolean z10 = false;
        for (String str : strArr) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    if (str.contains(b9.i.f16696d + ((String) hashMap.get(str2)) + b9.i.f16698e)) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }
}
