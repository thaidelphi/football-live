package com.iab.omid.library.startio.internal;

import android.content.Context;
import com.iab.omid.library.startio.internal.d;
import java.util.Date;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a implements d.a {

    /* renamed from: f  reason: collision with root package name */
    private static a f15972f = new a(new d());

    /* renamed from: a  reason: collision with root package name */
    protected com.iab.omid.library.startio.utils.f f15973a = new com.iab.omid.library.startio.utils.f();

    /* renamed from: b  reason: collision with root package name */
    private Date f15974b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15975c;

    /* renamed from: d  reason: collision with root package name */
    private d f15976d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15977e;

    private a(d dVar) {
        this.f15976d = dVar;
    }

    public static a a() {
        return f15972f;
    }

    private void c() {
        if (!this.f15975c || this.f15974b == null) {
            return;
        }
        for (com.iab.omid.library.startio.adsession.a aVar : c.c().a()) {
            aVar.getAdSessionStatePublisher().a(b());
        }
    }

    public void a(Context context) {
        if (this.f15975c) {
            return;
        }
        this.f15976d.a(context);
        this.f15976d.a(this);
        this.f15976d.e();
        this.f15977e = this.f15976d.c();
        this.f15975c = true;
    }

    @Override // com.iab.omid.library.startio.internal.d.a
    public void a(boolean z10) {
        if (!this.f15977e && z10) {
            d();
        }
        this.f15977e = z10;
    }

    public Date b() {
        Date date = this.f15974b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a10 = this.f15973a.a();
        Date date = this.f15974b;
        if (date == null || a10.after(date)) {
            this.f15974b = a10;
            c();
        }
    }
}
