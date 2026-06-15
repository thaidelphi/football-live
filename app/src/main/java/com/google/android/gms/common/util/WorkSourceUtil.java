package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.core.content.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class WorkSourceUtil {

    /* renamed from: a  reason: collision with root package name */
    private static final int f12749a = Process.myUid();

    /* renamed from: b  reason: collision with root package name */
    private static final Method f12750b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f12751c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f12752d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f12753e;

    /* renamed from: f  reason: collision with root package name */
    private static final Method f12754f;

    /* renamed from: g  reason: collision with root package name */
    private static final Method f12755g;

    /* renamed from: h  reason: collision with root package name */
    private static final Method f12756h;

    /* renamed from: i  reason: collision with root package name */
    private static final Method f12757i;

    /* renamed from: j  reason: collision with root package name */
    private static Boolean f12758j;

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|2|3|4|(22:54|55|7|8|9|10|11|12|13|(13:46|47|16|(10:41|42|19|(7:36|37|22|(6:28|29|30|31|25|26)|24|25|26)|21|22|(0)|24|25|26)|18|19|(0)|21|22|(0)|24|25|26)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            int r2 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.f12749a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1a
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L1a
            r6[r3] = r7     // Catch: java.lang.Exception -> L1a
            java.lang.reflect.Method r5 = r5.getMethod(r1, r6)     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r5 = r4
        L1b:
            com.google.android.gms.common.util.WorkSourceUtil.f12750b = r5
            boolean r5 = com.google.android.gms.common.util.PlatformVersion.c()
            r6 = 2
            if (r5 == 0) goto L33
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L33
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L33
            r7[r3] = r8     // Catch: java.lang.Exception -> L33
            r7[r2] = r0     // Catch: java.lang.Exception -> L33
            java.lang.reflect.Method r1 = r5.getMethod(r1, r7)     // Catch: java.lang.Exception -> L33
            goto L34
        L33:
            r1 = r4
        L34:
            com.google.android.gms.common.util.WorkSourceUtil.f12751c = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L41
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L41
            goto L42
        L41:
            r1 = r4
        L42:
            com.google.android.gms.common.util.WorkSourceUtil.f12752d = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "get"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L53
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L53
            r7[r3] = r8     // Catch: java.lang.Exception -> L53
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L53
            goto L54
        L53:
            r1 = r4
        L54:
            com.google.android.gms.common.util.WorkSourceUtil.f12753e = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.c()
            if (r1 == 0) goto L6b
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "getName"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L6b
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L6b
            r7[r3] = r8     // Catch: java.lang.Exception -> L6b
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L6b
            goto L6c
        L6b:
            r1 = r4
        L6c:
            com.google.android.gms.common.util.WorkSourceUtil.f12754f = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.j()
            java.lang.String r5 = "WorkSourceUtil"
            if (r1 == 0) goto L87
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r7 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L81
            java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch: java.lang.Exception -> L81
            goto L88
        L81:
            r1 = move-exception
            java.lang.String r7 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r7, r1)
        L87:
            r1 = r4
        L88:
            com.google.android.gms.common.util.WorkSourceUtil.f12755g = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.j()
            if (r1 == 0) goto Lab
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> La5
            java.lang.String r7 = "addNode"
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> La5
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> La5
            r6[r3] = r8     // Catch: java.lang.Exception -> La5
            r6[r2] = r0     // Catch: java.lang.Exception -> La5
            java.lang.reflect.Method r0 = r1.getMethod(r7, r6)     // Catch: java.lang.Exception -> La5
            goto Lac
        La5:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r5, r1, r0)
        Lab:
            r0 = r4
        Lac:
            com.google.android.gms.common.util.WorkSourceUtil.f12756h = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.j()
            if (r0 == 0) goto Lc2
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lc2
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> Lc2
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> Lc3
            goto Lc3
        Lc2:
            r0 = r4
        Lc3:
            com.google.android.gms.common.util.WorkSourceUtil.f12757i = r0
            com.google.android.gms.common.util.WorkSourceUtil.f12758j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void a(WorkSource workSource, int i10, String str) {
        Method method = f12751c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e8) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
                return;
            }
        }
        Method method2 = f12750b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
    }

    @KeepForSdk
    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo c10 = Wrappers.a(context).c(str, 0);
                if (c10 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = c10.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    @KeepForSdk
    public static synchronized boolean c(Context context) {
        synchronized (WorkSourceUtil.class) {
            Boolean bool = f12758j;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            Boolean valueOf = Boolean.valueOf(a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
            f12758j = valueOf;
            return valueOf.booleanValue();
        }
    }
}
