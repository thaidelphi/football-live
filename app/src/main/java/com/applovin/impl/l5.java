package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.y;
import com.ironsource.b9;
import com.ironsource.in;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l5 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final b f7459g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(y.b bVar);

        void a(String str);
    }

    public l5(com.applovin.impl.sdk.j jVar, b bVar) {
        super("TaskFetchDeveloperUri", jVar);
        this.f7459g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String valueOf = String.valueOf(this.f9827a.x().B().get(b9.h.V));
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Looking up developer URI for package name: " + valueOf);
        }
        a.C0138a c10 = com.applovin.impl.sdk.network.a.a(this.f9827a).c(in.f17848a);
        this.f9827a.i0().a(new a(c10.b("https://play.google.com/store/apps/details?id=" + valueOf).a((Object) "").a(false).a(), this.f9827a));
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
                    this.f9829c.b(this.f9828b, "No developer URI found - response from the Play Store is empty");
                }
                l5.this.f7459g.a(y.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9829c.b(this.f9828b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                l5.this.f7459g.a(y.b.INVALID_DEVELOPER_URI);
                return;
            }
            String group = matcher.group();
            if (!URLUtil.isValidUrl(group)) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f9829c;
                    String str3 = this.f9828b;
                    nVar.b(str3, "Developer URI (" + group + ") is not valid");
                }
                l5.this.f7459g.a(y.b.INVALID_DEVELOPER_URI);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9829c;
                String str4 = this.f9828b;
                nVar2.a(str4, "Found developer URI: " + group);
            }
            l5.this.f7459g.a(group);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str4 = this.f9828b;
                nVar.b(str4, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i10);
            }
            l5.this.f7459g.a(y.b.APP_DETAILS_NOT_FOUND);
        }
    }
}
