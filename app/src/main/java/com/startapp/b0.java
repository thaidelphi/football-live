package com.startapp;

import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import java.util.ArrayList;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b0 {
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(android.content.Context r16, java.util.List r17, int r18, java.util.HashSet r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.b0.a(android.content.Context, java.util.List, int, java.util.HashSet, boolean):java.util.ArrayList");
    }

    public static ArrayList a(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[0];
        String a10 = o9.a(str, "@tracking@", "@tracking@");
        if (a10 != null) {
            strArr = a10.split(",");
        }
        String[] strArr2 = new String[0];
        String a11 = o9.a(str, "@appPresencePackage@", "@appPresencePackage@");
        if (a11 != null) {
            strArr2 = a11.split(",");
        }
        String[] strArr3 = new String[0];
        String a12 = o9.a(str, "@minAppVersion@", "@minAppVersion@");
        if (a12 != null) {
            strArr3 = a12.split(",");
        }
        int i11 = 0;
        while (i11 < strArr2.length) {
            arrayList.add(new AppPresenceDetails(i10, strArr3.length > i11 ? Integer.valueOf(strArr3[i11]).intValue() : 0, strArr.length > i11 ? strArr[i11] : null, strArr2[i11]));
            i11++;
        }
        while (i11 < strArr.length) {
            arrayList.add(new AppPresenceDetails(i10, strArr3.length > i11 ? Integer.valueOf(strArr3[i11]).intValue() : 0, strArr[i11], ""));
            i11++;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean a(android.content.Context r9, java.util.ArrayList r10, int r11, java.util.HashSet r12, java.util.ArrayList r13) {
        /*
            java.util.Iterator r10 = r10.iterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L9c
            java.lang.Object r2 = r10.next()
            com.startapp.sdk.adsbase.apppresence.AppPresenceDetails r2 = (com.startapp.sdk.adsbase.apppresence.AppPresenceDetails) r2
            java.lang.String r3 = r2.b()
            java.lang.String r4 = "!"
            boolean r3 = r3.startsWith(r4)
            r4 = 1
            if (r3 == 0) goto L28
            java.lang.String r5 = r2.b()
            java.lang.String r5 = r5.substring(r4)
            goto L2c
        L28:
            java.lang.String r5 = r2.b()
        L2c:
            int r6 = r2.a()
            int r7 = com.startapp.y.f23556a
            android.content.pm.PackageManager r7 = r9.getPackageManager()     // Catch: java.lang.Exception -> L42
            r8 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r5 = r7.getPackageInfo(r5, r8)     // Catch: java.lang.Exception -> L42
            int r5 = r5.versionCode     // Catch: java.lang.Exception -> L42
            if (r5 < r6) goto L42
            r5 = r4
            goto L43
        L42:
            r5 = r0
        L43:
            if (r3 != 0) goto L47
            if (r5 != 0) goto L4b
        L47:
            if (r3 == 0) goto L4d
            if (r5 != 0) goto L4d
        L4b:
            r6 = r4
            goto L4e
        L4d:
            r6 = r0
        L4e:
            if (r6 == 0) goto L97
            r2.a(r5)
            if (r11 != 0) goto L57
            r1 = r4
            goto L58
        L57:
            r1 = r0
        L58:
            if (r1 == 0) goto L64
            if (r3 != 0) goto L64
            java.lang.String r3 = r2.b()
            r12.add(r3)
            goto L97
        L64:
            if (r1 != 0) goto L97
            java.lang.String r3 = r2.c()
            if (r3 == 0) goto L97
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r2.c()
            r3.append(r4)
            java.lang.String r4 = "&isShown="
            r3.append(r4)
            boolean r4 = r2.e()
            r3.append(r4)
            java.lang.String r4 = "&appPresence="
            r3.append(r4)
            boolean r4 = r2.d()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.a(r3)
        L97:
            r13.add(r2)
            goto L6
        L9c:
            if (r1 == 0) goto Lb1
            r9 = r0
        L9f:
            int r10 = r13.size()
            if (r9 >= r10) goto Lb1
            java.lang.Object r10 = r13.get(r9)
            com.startapp.sdk.adsbase.apppresence.AppPresenceDetails r10 = (com.startapp.sdk.adsbase.apppresence.AppPresenceDetails) r10
            r10.b(r0)
            int r9 = r9 + 1
            goto L9f
        Lb1:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.b0.a(android.content.Context, java.util.ArrayList, int, java.util.HashSet, java.util.ArrayList):java.lang.Boolean");
    }
}
