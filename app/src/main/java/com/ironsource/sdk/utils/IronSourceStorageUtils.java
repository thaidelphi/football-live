package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mm;
import com.ironsource.nf;
import com.ironsource.nh;
import com.ironsource.o9;
import com.ironsource.rt;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class IronSourceStorageUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final String f20636a = "supersonicads";

    /* renamed from: b  reason: collision with root package name */
    private static rt f20637b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f20638c = false;

    private static void a(Context context) {
        rt rtVar = f20637b;
        if (rtVar != null && rtVar.b()) {
            deleteCacheDirectories(context);
        }
        rt rtVar2 = f20637b;
        if (rtVar2 == null || !rtVar2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static boolean a() {
        rt rtVar;
        return Build.VERSION.SDK_INT > 29 && (rtVar = f20637b) != null && rtVar.a();
    }

    private static File b(Context context) {
        nf f10 = mm.S().f();
        rt rtVar = f20637b;
        return (rtVar == null || !rtVar.d()) ? f10.u(context) : f10.e(context);
    }

    private static File b(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(f20636a);
        sb.append(str);
        return new File(sb.toString());
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        Object c10;
        String name;
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    c10 = c(file2);
                } catch (JSONException e8) {
                    o9.d().a(e8);
                    IronLog.INTERNAL.error(e8.toString());
                }
                if (c10 instanceof JSONArray) {
                    name = "files";
                } else if (c10 instanceof JSONObject) {
                    name = file2.getName();
                }
                jSONObject.put(name, c(file2));
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(nh nhVar, JSONObject jSONObject) throws Exception {
        String name;
        JSONObject buildFilesMapOfDirectory;
        if (nhVar == null || !nhVar.isDirectory()) {
            return new JSONObject();
        }
        File[] listFiles = nhVar.listFiles();
        if (listFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : listFiles) {
            nh nhVar2 = new nh(file.getPath());
            if (nhVar2.isFile()) {
                name = nhVar2.getName();
                buildFilesMapOfDirectory = nhVar2.a();
                if (jSONObject.has(name)) {
                    buildFilesMapOfDirectory = SDKUtils.mergeJSONObjects(buildFilesMapOfDirectory, jSONObject.getJSONObject(name));
                }
            } else if (nhVar2.isDirectory()) {
                name = nhVar2.getName();
                buildFilesMapOfDirectory = buildFilesMapOfDirectory(nhVar2, jSONObject);
            }
            jSONObject2.put(name, buildFilesMapOfDirectory);
        }
        return jSONObject2;
    }

    private static File c(Context context) {
        nf f10 = mm.S().f();
        rt rtVar = f20637b;
        return (rtVar == null || !rtVar.d()) ? f10.x(context) : f10.k(context);
    }

    private static Object c(File file) {
        File[] listFiles;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        return jSONObject;
    }

    public static void deleteCacheDirectories(Context context) {
        nf f10 = mm.S().f();
        a(f10.e(context));
        a(f10.k(context));
    }

    public static synchronized boolean deleteFile(nh nhVar) {
        synchronized (IronSourceStorageUtils.class) {
            if (nhVar.exists()) {
                return nhVar.delete();
            }
            return false;
        }
    }

    public static void deleteFilesDirectories(Context context) {
        nf f10 = mm.S().f();
        a(f10.u(context));
        a(f10.x(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        boolean z10;
        synchronized (IronSourceStorageUtils.class) {
            File file = new File(str);
            if (deleteFolderContentRecursive(file)) {
                z10 = file.delete();
            }
        }
        return z10;
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] listFiles = file.listFiles();
        boolean z10 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z10 &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        rt rtVar = f20637b;
        if (rtVar == null || !rtVar.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (canonicalPath2.startsWith(canonicalPath)) {
                return;
            }
            throw new Exception(b9.c.f16576u + canonicalPath2);
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject buildFilesMap = buildFilesMap(str, str2);
        try {
            buildFilesMap.put("path", str2);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return buildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File b10;
        if (a() && SDKUtils.isExternalStorageAvailable() && (b10 = b(context)) != null && b10.canWrite()) {
            f20638c = true;
            return b10.getPath();
        }
        return c(context).getPath();
    }

    public static ArrayList<nh> getFilesInFolderRecursive(nh nhVar) {
        if (nhVar == null || !nhVar.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<nh> arrayList = new ArrayList<>();
        File[] listFiles = nhVar.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                nh nhVar2 = new nh(file.getPath());
                if (nhVar2.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(nhVar2));
                }
                if (nhVar2.isFile()) {
                    arrayList.add(nhVar2);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File b10 = b(new File(getDiskCacheDirPath(context)));
        if (!b10.exists()) {
            b10.mkdir();
        }
        return b10.getPath();
    }

    public static long getTotalSizeOfDir(nh nhVar) {
        long totalSizeOfDir;
        long j10 = 0;
        if (nhVar != null && nhVar.isDirectory()) {
            File[] listFiles = nhVar.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file : listFiles) {
                nh nhVar2 = new nh(file.getPath());
                if (nhVar2.isFile()) {
                    totalSizeOfDir = nhVar2.length();
                } else if (nhVar2.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(nhVar2);
                }
                j10 += totalSizeOfDir;
            }
        }
        return j10;
    }

    public static void initializeCacheDirectory(Context context, rt rtVar) {
        f20637b = rtVar;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return f20638c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(nh nhVar) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(nhVar));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i10 = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    return i10;
                }
                fileOutputStream.write(bArr2, 0, read);
                i10 += read;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }
}
