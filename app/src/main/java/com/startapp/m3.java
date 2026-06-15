package com.startapp;

import com.ironsource.b9;
import com.ironsource.xn;
import com.startapp.n3;
import com.startapp.p3;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m3 {

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f22273c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final m3 f22274d;

    /* renamed from: e  reason: collision with root package name */
    public static final m3 f22275e;

    /* renamed from: f  reason: collision with root package name */
    public static final m3 f22276f;

    /* renamed from: g  reason: collision with root package name */
    public static final m3 f22277g;

    /* renamed from: h  reason: collision with root package name */
    public static final m3 f22278h;

    /* renamed from: i  reason: collision with root package name */
    public static final m3 f22279i;

    /* renamed from: j  reason: collision with root package name */
    public static final m3 f22280j;

    /* renamed from: k  reason: collision with root package name */
    public static final m3 f22281k;

    /* renamed from: l  reason: collision with root package name */
    public static final m3 f22282l;

    /* renamed from: m  reason: collision with root package name */
    public static final m3 f22283m;

    /* renamed from: n  reason: collision with root package name */
    public static final m3 f22284n;

    /* renamed from: o  reason: collision with root package name */
    public static final m3 f22285o;

    /* renamed from: p  reason: collision with root package name */
    public static final m3 f22286p;

    /* renamed from: q  reason: collision with root package name */
    public static final m3 f22287q;

    /* renamed from: a  reason: collision with root package name */
    public final String f22288a;

    /* renamed from: b  reason: collision with root package name */
    public final n3 f22289b;

    static {
        n3.a aVar = new n3.a();
        aVar.f22323b = 23;
        aVar.f22324c = 50;
        aVar.f22325d = true;
        p3.a aVar2 = new p3.a();
        String[] strArr = {MobileAdsBridgeBase.initializeMethodName};
        ArrayList arrayList = aVar2.f22383a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            aVar2.f22383a = arrayList;
        }
        String str = strArr[0];
        if (str != null) {
            arrayList.add(str);
        }
        p3.a a10 = aVar2.a(b9.h.X);
        a10.f22386d = "8h";
        n3.a a11 = aVar.a(new p3(a10));
        p3.a a12 = new p3.a().a(b9.h.X, "details");
        a12.f22386d = "30m";
        n3.a a13 = a11.a(new p3(a12));
        p3.a aVar3 = new p3.a();
        String[] strArr2 = {"CNS.shown", "CNS.closed"};
        ArrayList arrayList2 = aVar3.f22384b;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            aVar3.f22384b = arrayList2;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            String str2 = strArr2[i10];
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        p3.a a14 = aVar3.a(b9.h.X);
        a14.f22386d = "10s";
        n3.a a15 = a13.a(new p3(a14));
        a15.f22326e = "2h";
        a15.f22327f = "2s";
        f22274d = new m3("general", new n3(a15));
        n3.a aVar4 = new n3.a();
        aVar4.f22323b = 17;
        aVar4.f22324c = 20;
        aVar4.f22325d = true;
        p3.a aVar5 = new p3.a();
        String[] strArr3 = {"fake_click"};
        ArrayList arrayList3 = aVar5.f22384b;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            aVar5.f22384b = arrayList3;
        }
        String str3 = strArr3[0];
        if (str3 != null) {
            arrayList3.add(str3);
        }
        p3.a a16 = aVar5.a("appActivity", b9.h.X, "details");
        a16.f22386d = "30m";
        n3.a a17 = aVar4.a(new p3(a16));
        p3.a aVar6 = new p3.a();
        String[] strArr4 = {"fake_click"};
        ArrayList arrayList4 = aVar6.f22384b;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            aVar6.f22384b = arrayList4;
        }
        String str4 = strArr4[0];
        if (str4 != null) {
            arrayList4.add(str4);
        }
        p3.a a18 = aVar6.a("appActivity", b9.h.X);
        a18.f22386d = "10s";
        n3.a a19 = a17.a(new p3(a18));
        a19.f22326e = "4h";
        a19.f22327f = "5s";
        f22275e = new m3(xn.a.f21422g, new n3(a19));
        n3.a aVar7 = new n3.a();
        aVar7.f22322a = 0.0d;
        aVar7.f22323b = 17;
        aVar7.f22324c = 30;
        aVar7.f22325d = true;
        p3.a a20 = new p3.a().a("appActivity", b9.h.X, "details");
        a20.f22386d = "12h";
        n3.a a21 = aVar7.a(new p3(a20));
        p3.a a22 = new p3.a().a("appActivity", b9.h.X);
        a22.f22386d = "1h";
        n3.a a23 = a21.a(new p3(a22));
        a23.f22326e = "1d";
        a23.f22327f = "5s";
        n3 n3Var = new n3(a23);
        f22276f = new m3("exception", n3Var);
        new m3("exception_nt", n3Var);
        n3.a aVar8 = new n3.a();
        aVar8.f22323b = 17;
        aVar8.f22324c = 40;
        aVar8.f22325d = true;
        p3.a a24 = new p3.a().a(b9.h.X, "details");
        a24.f22386d = "1h";
        n3.a a25 = aVar8.a(new p3(a24));
        a25.f22326e = "2d";
        a25.f22327f = "5s";
        f22277g = new m3("exception_fatal", new n3(a25));
        f22278h = new m3("anr", n3Var);
        n3.a aVar9 = new n3.a();
        aVar9.f22322a = 0.0d;
        aVar9.f22323b = 17;
        aVar9.f22324c = 10;
        aVar9.f22325d = false;
        aVar9.f22327f = "10s";
        f22279i = new m3("netdiag", new n3(aVar9));
        n3.a aVar10 = new n3.a();
        aVar10.f22323b = 3071;
        aVar10.f22324c = 90;
        aVar10.f22325d = true;
        p3.a a26 = new p3.a().a("service");
        a26.f22386d = "1m";
        n3.a a27 = aVar10.a(new p3(a26));
        a27.f22326e = "1h";
        f22280j = new m3("periodic", new n3(a27));
        n3.a aVar11 = new n3.a();
        aVar11.f22324c = 90;
        aVar11.f22325d = true;
        aVar11.f22326e = "4h";
        f22281k = new m3("nonimpression", new n3(aVar11));
        n3.a aVar12 = new n3.a();
        aVar12.f22323b = 17;
        aVar12.f22324c = 10;
        aVar12.f22325d = true;
        aVar12.f22326e = "4h";
        f22282l = new m3("impression_responses", new n3(aVar12));
        n3.a aVar13 = new n3.a();
        aVar13.f22322a = 0.0d;
        aVar13.f22323b = 17;
        aVar13.f22324c = 60;
        aVar13.f22325d = true;
        aVar13.f22326e = "1d";
        aVar13.f22327f = "5s";
        f22283m = new m3("success_smart_redirect_hop_info", new n3(aVar13));
        n3.a aVar14 = new n3.a();
        aVar14.f22323b = 17;
        aVar14.f22324c = 70;
        aVar14.f22325d = false;
        new m3("triggeredLink", new n3(aVar14));
        n3.a aVar15 = new n3.a();
        aVar15.f22323b = 23;
        aVar15.f22324c = 80;
        aVar15.f22325d = true;
        aVar15.f22326e = "1d";
        f22284n = new m3("ct", new n3(aVar15));
        n3.a aVar16 = new n3.a();
        aVar16.f22323b = 23;
        aVar16.f22324c = 80;
        aVar16.f22325d = true;
        aVar16.f22326e = "1d";
        f22285o = new m3("lt", new n3(aVar16));
        n3.a aVar17 = new n3.a();
        aVar17.f22323b = 23;
        aVar17.f22324c = 80;
        aVar17.f22325d = true;
        aVar17.f22326e = "1d";
        f22286p = new m3("nir", new n3(aVar17));
        n3.a aVar18 = new n3.a();
        aVar18.f22323b = 19;
        aVar18.f22324c = 10;
        aVar18.f22325d = true;
        aVar18.f22326e = "12h";
        f22287q = new m3("sensors", new n3(aVar18));
    }

    public m3(String str, n3 n3Var) {
        this.f22288a = str;
        this.f22289b = n3Var;
        f22273c.put(str, this);
    }

    public final String a() {
        return this.f22288a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m3.class != obj.getClass()) {
            return false;
        }
        return o9.a(this.f22288a, ((m3) obj).f22288a);
    }

    public final int hashCode() {
        return this.f22288a.hashCode();
    }

    public final String toString() {
        return this.f22288a;
    }
}
