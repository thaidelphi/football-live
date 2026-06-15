package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g2 {
    public static void a(Context context, String str, Serializable serializable) {
        if (str == null) {
            return;
        }
        try {
            File file = new File(b(context, null));
            if (file.exists() || file.mkdirs()) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
                fileOutputStream.close();
            }
        } catch (Throwable th) {
            if (a(4)) {
                l3.a(th);
            }
        }
    }

    public static String b(Context context, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().toString());
        if (str != null) {
            str2 = File.separator + str;
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static Object c(Context context, String str) {
        try {
            File file = new File(b(context, null));
            if (file.exists() && file.isDirectory()) {
                File file2 = new File(file, str);
                if (file2.exists()) {
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    Object readObject = objectInputStream.readObject();
                    objectInputStream.close();
                    fileInputStream.close();
                    return readObject;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (a(2)) {
                l3.a(th);
                return null;
            }
            return null;
        }
    }

    public static ArrayList d(Context context, String str) {
        File file;
        String[] list;
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(a(context, str));
        } catch (Throwable th) {
            if (a(2)) {
                l3.a(th);
            }
        }
        if (file.exists() && file.isDirectory() && (list = file.list()) != null) {
            for (String str2 : list) {
                FileInputStream fileInputStream = new FileInputStream(new File(file, str2));
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                Object readObject = objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                arrayList.add(readObject);
            }
            return arrayList;
        }
        return null;
    }

    public static String a(Context context, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().toString());
        if (str != null) {
            str2 = File.separator + str;
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static void a(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        file.delete();
    }

    public static boolean a(int i10) {
        try {
            AnalyticsConfig analyticsConfig = MetaData.f23158k.analytics;
            if (analyticsConfig != null) {
                return (analyticsConfig.e() & i10) == i10;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
