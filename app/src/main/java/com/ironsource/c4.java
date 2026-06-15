package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c4 {
    public static int a(Activity activity) {
        return activity.getRequestedOrientation();
    }

    static PackageInfo a(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(g(context), 0);
    }

    public static String a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && !TextUtils.isEmpty(str)) {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            }
        } catch (Exception e8) {
            o9.d().a(e8);
        }
        return null;
    }

    public static JSONObject a(Context context, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), CodedOutputStream.DEFAULT_BUFFER_SIZE);
            int i10 = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    jSONObject.put(strArr[i10], (packageInfo.requestedPermissionsFlags[i10] & 2) != 0 ? "Granted" : "Rejected");
                    i10++;
                }
            } else {
                List asList = Arrays.asList(packageInfo.requestedPermissions);
                while (i10 < jSONArray.length()) {
                    String string = jSONArray.getString(i10);
                    int indexOf = asList.indexOf(string);
                    if (indexOf != -1) {
                        jSONObject.put(string, (packageInfo.requestedPermissionsFlags[indexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObject.put(string, "notFoundInManifest");
                    }
                    i10++;
                }
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return jSONObject;
    }

    public static boolean a() {
        return true;
    }

    public static String b(Context context) {
        try {
            return a(context).versionName;
        } catch (PackageManager.NameNotFoundException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return "";
        }
    }

    public static String b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e8) {
            o9.d().a(e8);
            return "";
        }
    }

    public static String c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getPath();
        }
        return null;
    }

    public static boolean c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static long d(Context context) {
        try {
            return a(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return -1L;
        }
    }

    public static boolean d(Context context, String str) {
        boolean z10 = false;
        int i10 = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), CodedOutputStream.DEFAULT_BUFFER_SIZE);
            if (packageInfo.requestedPermissions != null) {
                boolean z11 = false;
                while (true) {
                    try {
                        String[] strArr = packageInfo.requestedPermissions;
                        if (i10 >= strArr.length || z11) {
                            break;
                        }
                        z11 = str.equals(strArr[i10]);
                        i10++;
                    } catch (Exception e8) {
                        e = e8;
                        z10 = z11;
                        o9.d().a(e);
                        IronLog.INTERNAL.error(e.toString());
                        return z10;
                    }
                }
                return z11;
            }
            return false;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public static String e(Context context) {
        String str;
        try {
            str = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            o9.d().a(th);
            str = null;
        }
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public static long f(Context context) {
        try {
            return a(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return -1L;
        }
    }

    public static String g(Context context) {
        return context.getPackageName();
    }
}
