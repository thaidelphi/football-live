package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import com.iab.omid.library.unity3d.internal.d;
import java.util.Date;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a implements d.a {

    /* renamed from: f  reason: collision with root package name */
    private static a f16100f = new a(new d());

    /* renamed from: a  reason: collision with root package name */
    protected com.iab.omid.library.unity3d.utils.f f16101a = new com.iab.omid.library.unity3d.utils.f();

    /* renamed from: b  reason: collision with root package name */
    private Date f16102b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16103c;

    /* renamed from: d  reason: collision with root package name */
    private d f16104d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16105e;

    private a(d dVar) {
        this.f16104d = dVar;
    }

    public static a a() {
        return f16100f;
    }

    private void c() {
        if (!this.f16103c || this.f16102b == null) {
            return;
        }
        for (com.iab.omid.library.unity3d.adsession.a aVar : c.c().a()) {
            aVar.getAdSessionStatePublisher().a(b());
        }
    }

    public void a(Context context) {
        if (this.f16103c) {
            return;
        }
        this.f16104d.a(context);
        this.f16104d.a(this);
        this.f16104d.e();
        this.f16105e = this.f16104d.c();
        this.f16103c = true;
    }

    @Override // com.iab.omid.library.unity3d.internal.d.a
    public void a(boolean z10) {
        if (!this.f16105e && z10) {
            d();
        }
        this.f16105e = z10;
    }

    public Date b() {
        Date date = this.f16102b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a10 = this.f16101a.a();
        Date date = this.f16102b;
        if (date == null || a10.after(date)) {
            this.f16102b = a10;
            c();
        }
    }
}
