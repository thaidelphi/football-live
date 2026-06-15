package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.y;
import com.ironsource.in;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j5 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final b f7333g;

    /* renamed from: h  reason: collision with root package name */
    private final String f7334h;

    /* renamed from: i  reason: collision with root package name */
    private String f7335i;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(y.b bVar, String str);

        void a(String str, String str2);
    }

    public j5(com.applovin.impl.sdk.j jVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", jVar);
        this.f7334h = str;
        this.f7333g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f7334h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String join = TextUtils.join(".", arrayList);
        Uri build = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(join).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a a10 = com.applovin.impl.sdk.network.a.a(this.f9827a).c(in.f17848a).b(build.toString()).a(new Uri.Builder().scheme("http").authority(join).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f7335i = build.toString();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str2 = this.f9828b;
            nVar.a(str2, "Looking up app-ads.txt at " + this.f7335i);
        }
        this.f9827a.i0().a(new a(a10, this.f9827a));
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends e6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9829c.b(this.f9828b, "No app-ads.txt found");
                }
                j5.this.f7333g.a(y.b.APPADSTXT_NOT_FOUND, j5.this.f7335i);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Found app-ads.txt");
            }
            j5.this.f7333g.a(str2, j5.this.f7335i);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str4 = this.f9828b;
                nVar.b(str4, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i10);
            }
            j5.this.f7333g.a(y.b.APPADSTXT_NOT_FOUND, j5.this.f7335i);
        }
    }
}
