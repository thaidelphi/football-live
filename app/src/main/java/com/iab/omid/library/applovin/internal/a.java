package com.iab.omid.library.applovin.internal;

import android.content.Context;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a implements d.a {

    /* renamed from: f  reason: collision with root package name */
    private static a f15707f = new a(new d());

    /* renamed from: a  reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f15708a = new com.iab.omid.library.applovin.utils.f();

    /* renamed from: b  reason: collision with root package name */
    private Date f15709b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15710c;

    /* renamed from: d  reason: collision with root package name */
    private d f15711d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15712e;

    private a(d dVar) {
        this.f15711d = dVar;
    }

    public static a a() {
        return f15707f;
    }

    private void c() {
        if (!this.f15710c || this.f15709b == null) {
            return;
        }
        for (com.iab.omid.library.applovin.adsession.a aVar : c.c().a()) {
            aVar.getAdSessionStatePublisher().a(b());
        }
    }

    public void a(Context context) {
        if (this.f15710c) {
            return;
        }
        this.f15711d.a(context);
        this.f15711d.a(this);
        this.f15711d.e();
        this.f15712e = this.f15711d.c();
        this.f15710c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (!this.f15712e && z10) {
            d();
        }
        this.f15712e = z10;
    }

    public Date b() {
        Date date = this.f15709b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a10 = this.f15708a.a();
        Date date = this.f15709b;
        if (date == null || a10.after(date)) {
            this.f15709b = a10;
            c();
        }
    }
}
