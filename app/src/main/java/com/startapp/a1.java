package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap f21748a = new ConcurrentHashMap();

    public static boolean a(Context context, String str) {
        if (!str.endsWith(".png")) {
            str = str.concat(".png");
        }
        if (!f21748a.containsKey(str)) {
            if (!new File(context.getFilesDir().getPath() + "/" + str).exists()) {
                return false;
            }
        }
        return true;
    }

    public static Bitmap b(Context context, String str) {
        FileInputStream fileInputStream;
        ConcurrentHashMap concurrentHashMap = f21748a;
        Bitmap bitmap = (Bitmap) concurrentHashMap.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(context.getFilesDir().getPath() + "/" + str);
        } catch (Exception unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
            decodeStream.setDensity(context.getResources() != null ? context.getResources().getDisplayMetrics().densityDpi : 160);
            concurrentHashMap.put(str, decodeStream);
            o9.a(fileInputStream);
            return decodeStream;
        } catch (Exception unused2) {
            o9.a(fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            o9.a(fileInputStream2);
            throw th;
        }
    }
}
