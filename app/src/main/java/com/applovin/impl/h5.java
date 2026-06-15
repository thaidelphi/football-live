package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h5 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f7145g;

    /* renamed from: h  reason: collision with root package name */
    private final AppLovinPostbackListener f7146h;

    /* renamed from: i  reason: collision with root package name */
    private final u5.b f7147i;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements AppLovinPostbackListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            h5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (h5.this.f7146h != null) {
                h5.this.f7146h.onPostbackSuccess(h5.this.f7145g.f());
            }
        }
    }

    public h5(com.applovin.impl.sdk.network.e eVar, u5.b bVar, com.applovin.impl.sdk.j jVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", jVar);
        if (eVar != null) {
            this.f7145g = eVar;
            this.f7146h = appLovinPostbackListener;
            this.f7147i = bVar;
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f7145g, b());
        bVar.a(this.f7147i);
        b().i0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!StringUtils.isValidString(this.f7145g.f())) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.d(this.f9828b, "Requested URL is not valid; nothing to do...");
            }
            AppLovinPostbackListener appLovinPostbackListener = this.f7146h;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.f7145g.f(), AppLovinErrorCodes.INVALID_URL);
            }
        } else if (this.f7145g.u()) {
            b().p0().a(this.f7145g, new a());
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends e6 {

        /* renamed from: m  reason: collision with root package name */
        final String f7149m;

        b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
            this.f7149m = h5.this.f7145g.f();
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, Object obj, int i10) {
            if (obj instanceof String) {
                for (String str2 : this.f9827a.c(o4.f8195q0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                o0.c(jSONObject, this.f9827a);
                                o0.b(jSONObject, this.f9827a);
                                o0.a(jSONObject, this.f9827a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (h5.this.f7146h != null) {
                h5.this.f7146h.onPostbackSuccess(this.f7149m);
            }
            if (h5.this.f7145g.t()) {
                this.f9827a.q().a(h5.this.f7145g.s(), this.f7149m, i10, obj, null, true);
            }
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, Object obj) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str3 = this.f9828b;
                nVar.b(str3, "Failed to dispatch postback. Error code: " + i10 + " URL: " + this.f7149m);
            }
            if (h5.this.f7146h != null) {
                h5.this.f7146h.onPostbackFailure(this.f7149m, i10);
            }
            if (h5.this.f7145g.t()) {
                this.f9827a.q().a(h5.this.f7145g.s(), this.f7149m, i10, obj, str2, false);
            }
        }
    }
}
