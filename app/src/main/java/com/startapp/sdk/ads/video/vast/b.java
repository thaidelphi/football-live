package com.startapp.sdk.ads.video.vast;

import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.o9;
import com.startapp.p7;
import com.startapp.q9;
import com.startapp.s9;
import com.startapp.sdk.ads.video.vast.VASTResource;
import com.startapp.sdk.omsdk.VerificationDetails;
import com.startapp.u9;
import com.startapp.v9;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final List<String> f22866i = Arrays.asList("video/mp4", "video/3gpp");

    /* renamed from: a  reason: collision with root package name */
    public final int f22867a;

    /* renamed from: b  reason: collision with root package name */
    public final float f22868b;

    /* renamed from: c  reason: collision with root package name */
    public a f22869c;

    /* renamed from: d  reason: collision with root package name */
    public VASTErrorCodes f22870d;

    /* renamed from: e  reason: collision with root package name */
    public int f22871e;

    /* renamed from: f  reason: collision with root package name */
    public int f22872f = 10;

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f22873g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public final String f22874h;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
    }

    public b(DisplayMetrics displayMetrics, String str) {
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        float f10 = displayMetrics.density;
        f10 = f10 <= 0.0f ? 1.0f : f10;
        float f11 = i10;
        this.f22868b = f11 / i11;
        this.f22867a = (int) (f11 / f10);
        this.f22874h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x024e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.List, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.startapp.q9 a(java.lang.String r25, java.util.ArrayList r26, com.startapp.r9 r27) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.vast.b.a(java.lang.String, java.util.ArrayList, com.startapp.r9):com.startapp.q9");
    }

    public final String a(String str) throws IOException {
        Throwable th;
        HttpURLConnection httpURLConnection;
        int i10 = this.f22871e;
        BufferedInputStream bufferedInputStream = null;
        if (i10 >= this.f22872f) {
            return null;
        }
        this.f22871e = i10 + 1;
        try {
            httpURLConnection = p7.a(str, this.f22874h);
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpURLConnection.getInputStream());
                try {
                    String next = new Scanner(bufferedInputStream2).useDelimiter("\\A").next();
                    o9.a(bufferedInputStream2);
                    httpURLConnection.disconnect();
                    return next;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    o9.a(bufferedInputStream);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    public static void a(u9 u9Var, q9 q9Var) {
        int i10;
        u9 a10;
        Integer num;
        u9Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = u9Var.d("start").iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            String b10 = ((u9) it.next()).b();
            if (!TextUtils.isEmpty(b10)) {
                arrayList.add(new v9(b10, 0));
            }
        }
        Iterator it2 = u9Var.d("progress").iterator();
        while (it2.hasNext()) {
            u9 u9Var2 = (u9) it2.next();
            String a11 = u9Var2.a("offset");
            if (!TextUtils.isEmpty(a11)) {
                String trim = a11.trim();
                if (v9.f23479c.matcher(trim).matches()) {
                    String b11 = u9Var2.b();
                    Integer a12 = v9.a(trim);
                    if (a12 != null && a12.intValue() >= 0 && !TextUtils.isEmpty(b11)) {
                        arrayList.add(new v9(b11, a12));
                    }
                }
            }
        }
        Iterator it3 = u9Var.d("creativeView").iterator();
        while (it3.hasNext()) {
            String b12 = ((u9) it3.next()).b();
            if (!TextUtils.isEmpty(b12)) {
                arrayList.add(new v9(b12, 0));
            }
        }
        q9Var.f22423c.addAll(arrayList);
        Collections.sort(q9Var.f22423c);
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = u9Var.d("firstQuartile").iterator();
        while (it4.hasNext()) {
            String b13 = ((u9) it4.next()).b();
            if (!TextUtils.isEmpty(b13)) {
                arrayList2.add(new v9(b13, Float.valueOf(0.25f)));
            }
        }
        Iterator it5 = u9Var.d("midpoint").iterator();
        while (it5.hasNext()) {
            String b14 = ((u9) it5.next()).b();
            if (!TextUtils.isEmpty(b14)) {
                arrayList2.add(new v9(b14, Float.valueOf(0.5f)));
            }
        }
        Iterator it6 = u9Var.d("thirdQuartile").iterator();
        while (it6.hasNext()) {
            String b15 = ((u9) it6.next()).b();
            if (!TextUtils.isEmpty(b15)) {
                arrayList2.add(new v9(b15, Float.valueOf(0.75f)));
            }
        }
        Iterator it7 = u9Var.d("progress").iterator();
        while (it7.hasNext()) {
            u9 u9Var3 = (u9) it7.next();
            String a13 = u9Var3.a("offset");
            if (!TextUtils.isEmpty(a13)) {
                String trim2 = a13.trim();
                if (v9.f23480d.matcher(trim2).matches()) {
                    String b16 = u9Var3.b();
                    try {
                        float parseFloat = Float.parseFloat(trim2.replace("%", "")) / 100.0f;
                        if (parseFloat >= 0.0f && !TextUtils.isEmpty(b16)) {
                            arrayList2.add(new v9(b16, Float.valueOf(parseFloat)));
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        q9Var.f22424d.addAll(arrayList2);
        Collections.sort(q9Var.f22424d);
        q9Var.f22425e.addAll(u9Var.e("pause"));
        q9Var.f22426f.addAll(u9Var.e("resume"));
        q9Var.f22427g.addAll(u9Var.e("complete"));
        ArrayList e8 = u9Var.e("close");
        e8.addAll(u9Var.e("closeLinear"));
        q9Var.f22428h.addAll(e8);
        q9Var.f22431k.addAll(u9Var.e("skip"));
        ArrayList arrayList3 = new ArrayList();
        s9 s9Var = null;
        Iterator it8 = u9Var.a("ClickTracking", "VideoClicks", null, null).iterator();
        while (it8.hasNext()) {
            String b17 = ((u9) it8.next()).b();
            if (!TextUtils.isEmpty(b17)) {
                arrayList3.add(b17);
            }
        }
        q9Var.f22432l.addAll(arrayList3);
        q9Var.f22429i.addAll(u9Var.e("mute"));
        q9Var.f22430j.addAll(u9Var.e("unmute"));
        if (q9Var.f22433m == null) {
            String a14 = u9Var.a("skipoffset");
            if (a14 == null || TextUtils.isEmpty(a14.trim()) || !v9.f23479c.matcher(a14).matches() || (num = v9.a(a14)) == null || num.intValue() < 0) {
                num = null;
            }
            q9Var.f22433m = num;
        }
        if (q9Var.f22434n == null) {
            ArrayList a15 = u9Var.a("Icon", "Icons", null, null);
            VASTResource.Type[] values = VASTResource.Type.values();
            int length = values.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                VASTResource.Type type = values[i10];
                if (type != VASTResource.Type.IFRAME_RESOURCE && type != VASTResource.Type.HTML_RESOURCE) {
                    Iterator it9 = a15.iterator();
                    while (it9.hasNext()) {
                        u9 u9Var4 = (u9) it9.next();
                        Integer b18 = u9Var4.b("assetWidth");
                        if (b18 == null) {
                            b18 = u9Var4.b("width");
                        }
                        Integer b19 = u9Var4.b("assetHeight");
                        if (b19 == null) {
                            b19 = u9Var4.b("height");
                        }
                        if (b18 != null && b18.intValue() > 0 && b18.intValue() <= 300 && b19 != null && b19.intValue() > 0 && b19.intValue() <= 300 && VASTResource.a(u9Var4, type, b18.intValue(), b19.intValue()) != null) {
                            b18.intValue();
                            b19.intValue();
                            String a16 = u9Var4.a("offset");
                            Integer a17 = (a16 == null || !v9.f23479c.matcher(a16).matches()) ? null : v9.a(a16);
                            String a18 = u9Var4.a(IronSourceConstants.EVENTS_DURATION);
                            if (a18 != null && v9.f23479c.matcher(a18).matches()) {
                                v9.a(a18);
                            }
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it10 = u9Var4.a("IconClickTracking", "IconClicks", null, null).iterator();
                            while (it10.hasNext()) {
                                String b20 = ((u9) it10.next()).b();
                                if (!TextUtils.isEmpty(b20)) {
                                    arrayList4.add(b20);
                                }
                            }
                            u9 a19 = u9Var4.a("IconClicks", null);
                            if (a19 != null && (a10 = a19.a("IconClickThrough", null)) != null) {
                                a10.b();
                            }
                            u9Var4.c("IconViewTracking");
                            s9Var = new s9(a17);
                        }
                    }
                    continue;
                }
                i10++;
            }
            q9Var.f22434n = s9Var;
        }
    }

    public final void a(VASTErrorCodes vASTErrorCodes, ArrayList arrayList) {
        this.f22870d = vASTErrorCodes;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        a aVar = this.f22869c;
        if (aVar != null) {
            com.startapp.sdk.ads.video.b.a(com.startapp.sdk.ads.video.b.this, vASTErrorCodes, arrayList2);
        }
    }

    public final HashSet a(ArrayList arrayList) {
        VASTResource.Type[] values;
        HashSet hashSet = new HashSet();
        for (VASTResource.Type type : VASTResource.Type.values()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u9 u9Var = (u9) it.next();
                Integer b10 = u9Var.b("assetWidth");
                if (b10 == null) {
                    b10 = u9Var.b("width");
                }
                Integer b11 = u9Var.b("assetHeight");
                if (b11 == null) {
                    b11 = u9Var.b("height");
                }
                if (b10 != null && b10.intValue() >= 300 && b11 != null && b11.intValue() >= 250) {
                    int intValue = b10.intValue();
                    int intValue2 = b11.intValue();
                    Point point = new Point(intValue, intValue2);
                    int i10 = this.f22867a;
                    float f10 = i10;
                    int i11 = (int) (f10 / this.f22868b);
                    if (intValue > i10 || intValue2 > i11) {
                        if (type == VASTResource.Type.HTML_RESOURCE) {
                            point.x = Math.min(i10, intValue);
                            point.y = Math.min(i11, intValue2);
                        } else {
                            float f11 = intValue;
                            float f12 = f11 / f10;
                            float f13 = intValue2;
                            float f14 = f13 / i11;
                            if (f12 > f14) {
                                point.x = i10;
                                point.y = (int) (f13 / f12);
                            } else {
                                point.x = (int) (f11 / f14);
                                point.y = i11;
                            }
                        }
                    }
                    VASTResource a10 = VASTResource.a(u9Var, type, point.x, point.y);
                    if (a10 != null) {
                        int i12 = point.x;
                        int i13 = point.y;
                        String f15 = u9Var.f("CompanionClickThrough");
                        ArrayList c10 = u9Var.c("CompanionClickTracking");
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = u9Var.d("creativeView").iterator();
                        while (it2.hasNext()) {
                            String b12 = ((u9) it2.next()).b();
                            if (!TextUtils.isEmpty(b12)) {
                                arrayList2.add(b12);
                            }
                        }
                        hashSet.add(new com.startapp.sdk.ads.video.vast.a(i12, i13, a10, f15, c10, arrayList2));
                    }
                }
            }
        }
        return hashSet;
    }

    public static ArrayList a(u9 u9Var) {
        String f10;
        String f11;
        ArrayList a10 = u9Var.a("Verification", "AdVerifications", null, null);
        Iterator it = u9Var.a("Extension", "Extensions", "type", Collections.singletonList("AdVerifications")).iterator();
        while (it.hasNext()) {
            a10.addAll(((u9) it.next()).a("Verification", "AdVerifications", null, null));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = a10.iterator();
        while (it2.hasNext()) {
            u9 u9Var2 = (u9) it2.next();
            String a11 = u9Var2.a("vendor");
            if (a11 != null && (f10 = u9Var2.f("JavaScriptResource")) != null && (f11 = u9Var2.f("VerificationParameters")) != null) {
                u9 a12 = u9Var2.a("JavaScriptResource", "apiFramework");
                String a13 = a12 == null ? null : a12.a("apiFramework");
                if (a13 != null && a13.equalsIgnoreCase("omid")) {
                    arrayList.add(new VerificationDetails(a11, f10, f11));
                }
            }
        }
        return arrayList;
    }
}
