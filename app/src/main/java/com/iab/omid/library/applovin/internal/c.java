package com.iab.omid.library.applovin.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static c f15714c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f15715a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f15716b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f15714c;
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f15716b);
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.f15715a.add(aVar);
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f15715a);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d10 = d();
        this.f15715a.remove(aVar);
        this.f15716b.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d10 = d();
        this.f15716b.add(aVar);
        if (d10) {
            return;
        }
        i.c().d();
    }

    public boolean d() {
        return this.f15716b.size() > 0;
    }
}
