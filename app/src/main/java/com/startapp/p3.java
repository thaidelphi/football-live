package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p3 {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f22377a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f22378b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f22379c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f22380d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f22381e;

    /* renamed from: f  reason: collision with root package name */
    public final long f22382f;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList f22383a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f22384b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList f22385c;

        /* renamed from: d  reason: collision with root package name */
        public String f22386d;

        public final ArrayList a() {
            return this.f22384b;
        }

        public final ArrayList b() {
            return this.f22385c;
        }

        public final ArrayList c() {
            return this.f22383a;
        }

        public final String d() {
            return this.f22386d;
        }

        public final a a(String... strArr) {
            ArrayList arrayList = this.f22385c;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f22385c = arrayList;
            }
            for (String str : strArr) {
                if (str != null) {
                    arrayList.add(str);
                }
            }
            return this;
        }
    }

    public p3(a aVar) {
        this.f22377a = o9.a(aVar.c());
        this.f22378b = o9.a(aVar.a());
        this.f22379c = o9.a((List) null);
        this.f22380d = o9.a((List) null);
        this.f22381e = o9.a(aVar.b());
        this.f22382f = Math.max(0L, o9.c(aVar.d()));
    }

    public static List<p3> a(List<AnalyticsCategoryFilterConfig> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        for (AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig : list) {
            if (analyticsCategoryFilterConfig != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList(list.size());
                }
                arrayList.add(new p3(analyticsCategoryFilterConfig));
            }
        }
        return arrayList != null ? o9.a(arrayList) : arrayList;
    }

    public p3(AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig) {
        this.f22377a = o9.a(analyticsCategoryFilterConfig.e());
        this.f22378b = o9.a(analyticsCategoryFilterConfig.b());
        this.f22379c = o9.a(analyticsCategoryFilterConfig.d());
        this.f22380d = o9.a(analyticsCategoryFilterConfig.a());
        this.f22381e = o9.a(analyticsCategoryFilterConfig.c());
        this.f22382f = Math.max(0L, o9.c(analyticsCategoryFilterConfig.f()));
    }
}
