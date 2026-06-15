package com.iab.omid.library.adcolony.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f15584a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.adcolony.adsession.a> f15585b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.adcolony.adsession.a> f15586c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f15584a;
    }

    public void a(com.iab.omid.library.adcolony.adsession.a aVar) {
        this.f15585b.add(aVar);
    }

    public Collection<com.iab.omid.library.adcolony.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f15585b);
    }

    public void b(com.iab.omid.library.adcolony.adsession.a aVar) {
        boolean d10 = d();
        this.f15586c.add(aVar);
        if (d10) {
            return;
        }
        f.a().b();
    }

    public Collection<com.iab.omid.library.adcolony.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f15586c);
    }

    public void c(com.iab.omid.library.adcolony.adsession.a aVar) {
        boolean d10 = d();
        this.f15585b.remove(aVar);
        this.f15586c.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        f.a().c();
    }

    public boolean d() {
        return this.f15586c.size() > 0;
    }
}
