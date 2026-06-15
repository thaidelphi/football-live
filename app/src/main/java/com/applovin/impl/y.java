package com.applovin.impl;

import com.applovin.impl.j5;
import com.applovin.impl.l5;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class y implements l5.b, j5.b {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9639a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9640b;

    /* renamed from: c  reason: collision with root package name */
    private w f9641c;

    /* renamed from: d  reason: collision with root package name */
    private String f9642d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(w wVar, String str);

        void a(b bVar, String str);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public y(com.applovin.impl.sdk.j jVar, a aVar) {
        this.f9639a = jVar;
        this.f9640b = aVar;
    }

    public void a() {
        w wVar = this.f9641c;
        if (wVar != null) {
            this.f9640b.a(wVar, this.f9642d);
            return;
        }
        this.f9639a.i0().a(new l5(this.f9639a, this));
    }

    @Override // com.applovin.impl.l5.b
    public void a(String str) {
        this.f9639a.i0().a(new j5(this.f9639a, str, this));
    }

    @Override // com.applovin.impl.l5.b
    public void a(b bVar) {
        this.f9640b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.j5.b
    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        for (String str3 : str.split("\n")) {
            String trim = str3.split("#")[0].trim();
            if (StringUtils.isValidString(trim)) {
                x xVar = new x(trim, i10);
                if (xVar.h()) {
                    String b10 = xVar.b();
                    List arrayList2 = hashMap.containsKey(b10) ? (List) hashMap.get(b10) : new ArrayList();
                    if (arrayList2 != null) {
                        arrayList2.add(xVar);
                        hashMap.put(b10, arrayList2);
                    }
                } else {
                    arrayList.add(xVar);
                }
            }
            i10++;
        }
        this.f9641c = new w(hashMap, arrayList);
        this.f9642d = str2;
        this.f9639a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f9639a.I().a("AppAdsTxtService", "app-ads.txt fetched: " + this.f9641c);
        }
        this.f9640b.a(this.f9641c, str2);
    }

    @Override // com.applovin.impl.j5.b
    public void a(b bVar, String str) {
        this.f9640b.a(bVar, str);
    }
}
