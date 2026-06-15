package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import com.iab.omid.library.ironsrc.internal.d;
import java.util.Date;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a implements d.a {

    /* renamed from: f  reason: collision with root package name */
    private static a f15836f = new a(new d());

    /* renamed from: a  reason: collision with root package name */
    protected com.iab.omid.library.ironsrc.utils.f f15837a = new com.iab.omid.library.ironsrc.utils.f();

    /* renamed from: b  reason: collision with root package name */
    private Date f15838b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15839c;

    /* renamed from: d  reason: collision with root package name */
    private d f15840d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15841e;

    private a(d dVar) {
        this.f15840d = dVar;
    }

    public static a a() {
        return f15836f;
    }

    private void c() {
        if (!this.f15839c || this.f15838b == null) {
            return;
        }
        for (com.iab.omid.library.ironsrc.adsession.a aVar : c.c().a()) {
            aVar.getAdSessionStatePublisher().a(b());
        }
    }

    public void a(Context context) {
        if (this.f15839c) {
            return;
        }
        this.f15840d.a(context);
        this.f15840d.a(this);
        this.f15840d.e();
        this.f15841e = this.f15840d.c();
        this.f15839c = true;
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        if (!this.f15841e && z10) {
            d();
        }
        this.f15841e = z10;
    }

    public Date b() {
        Date date = this.f15838b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a10 = this.f15837a.a();
        Date date = this.f15838b;
        if (date == null || a10.after(date)) {
            this.f15838b = a10;
            c();
        }
    }
}
