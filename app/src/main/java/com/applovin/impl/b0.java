package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b0 extends z {

    /* renamed from: f  reason: collision with root package name */
    private final String f6665f;

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f6666g;

    /* renamed from: h  reason: collision with root package name */
    private final List f6667h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f6668i;

    /* renamed from: j  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f6669j;

    /* renamed from: k  reason: collision with root package name */
    private final a f6670k;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(Uri uri);
    }

    public b0(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar, a aVar) {
        this(str, bVar, bVar.Y(), true, jVar, aVar);
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f9801e.get() || (aVar = this.f6670k) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public Boolean call() {
        if (this.f9801e.get()) {
            return Boolean.FALSE;
        }
        String a10 = this.f6669j.A().a(a(), this.f6665f, this.f6666g.getCachePrefix(), this.f6667h, this.f6668i, this.f6669j.A().a(this.f6665f, this.f6666g));
        if (TextUtils.isEmpty(a10)) {
            a((Uri) null);
            return Boolean.FALSE;
        } else if (this.f9801e.get()) {
            return Boolean.FALSE;
        } else {
            File a11 = this.f6669j.A().a(a10, a());
            if (a11 == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f9799c;
                    String str = this.f9798b;
                    nVar.b(str, "Unable to retrieve File for cached filename = " + a10);
                }
                a((Uri) null);
                return Boolean.FALSE;
            } else if (this.f9801e.get()) {
                return Boolean.FALSE;
            } else {
                Uri fromFile = Uri.fromFile(a11);
                if (fromFile == null) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f9799c.b(this.f9798b, "Unable to extract Uri from file");
                    }
                    a((Uri) null);
                    return Boolean.FALSE;
                } else if (this.f9801e.get()) {
                    return Boolean.FALSE;
                } else {
                    a(fromFile);
                    return Boolean.TRUE;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f6665f.equals(((b0) obj).f6665f);
    }

    public int hashCode() {
        String str = this.f6665f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public b0(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z10, com.applovin.impl.sdk.j jVar, a aVar) {
        super("AsyncTaskCacheResource", jVar);
        this.f6665f = str;
        this.f6666g = bVar;
        this.f6667h = list;
        this.f6668i = z10;
        this.f6669j = jVar;
        this.f6670k = aVar;
    }
}
