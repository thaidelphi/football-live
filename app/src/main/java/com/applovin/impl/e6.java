package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.n0;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.sdk.AppLovinErrorCodes;
import com.ironsource.in;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class e6 extends z4 implements n0.e {

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f6881g;

    /* renamed from: h  reason: collision with root package name */
    private final n0.e f6882h;

    /* renamed from: i  reason: collision with root package name */
    private u5.b f6883i;

    /* renamed from: j  reason: collision with root package name */
    private o4 f6884j;

    /* renamed from: k  reason: collision with root package name */
    private o4 f6885k;

    /* renamed from: l  reason: collision with root package name */
    protected n0.b f6886l;

    public e6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
        this(aVar, jVar, false);
    }

    public abstract void a(String str, int i10, String str2, Object obj);

    public abstract void a(String str, Object obj, int i10);

    @Override // java.lang.Runnable
    public void run() {
        n0 t10 = b().t();
        if (!b().v0() && !b().s0()) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f6881g.f(), -22, null, null);
        } else if (StringUtils.isValidString(this.f6881g.f()) && this.f6881g.f().length() >= 4) {
            if (TextUtils.isEmpty(this.f6881g.h())) {
                this.f6881g.b(this.f6881g.b() != null ? in.f17849b : in.f17848a);
            }
            t10.a(this.f6881g, this.f6886l, this.f6882h);
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.b(this.f9828b, "Task has an invalid or null request endpoint.");
            }
            a(this.f6881g.f(), AppLovinErrorCodes.INVALID_URL, null, null);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements n0.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f6887a;

        a(com.applovin.impl.sdk.j jVar) {
            this.f6887a = jVar;
        }

        @Override // com.applovin.impl.n0.e
        public void a(String str, Object obj, int i10) {
            e6.this.f6881g.a(0);
            e6.this.a(str, obj, i10);
        }

        @Override // com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, Object obj) {
            long millis;
            boolean z10 = false;
            boolean z11 = i10 < 200 || i10 >= 500;
            boolean z12 = i10 == 429;
            boolean z13 = i10 != -1009 || e6.this.f6881g.q();
            boolean z14 = (i10 == -900 || i10 == -1000) ? false : true;
            if (z13 && z14 && (z11 || z12 || e6.this.f6881g.p())) {
                String a10 = e6.this.f6881g.a();
                if (e6.this.f6881g.j() <= 0) {
                    if (a10 != null && a10.equals(e6.this.f6881g.f())) {
                        e6 e6Var = e6.this;
                        e6Var.a(e6Var.f6885k);
                    } else {
                        e6 e6Var2 = e6.this;
                        e6Var2.a(e6Var2.f6884j);
                    }
                    e6 e6Var3 = e6.this;
                    e6Var3.a(e6Var3.f6881g.f(), i10, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.n nVar = e6.this.f9829c;
                if (com.applovin.impl.sdk.n.a()) {
                    e6 e6Var4 = e6.this;
                    e6Var4.f9829c.k(e6Var4.f9828b, "Unable to send request due to server failure (code " + i10 + "). " + e6.this.f6881g.j() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(e6.this.f6881g.k()) + " seconds...");
                }
                int j10 = e6.this.f6881g.j() - 1;
                e6.this.f6881g.a(j10);
                if (j10 == 0) {
                    e6 e6Var5 = e6.this;
                    e6Var5.a(e6Var5.f6884j);
                    if (StringUtils.isValidString(a10) && a10.length() >= 4) {
                        com.applovin.impl.sdk.n nVar2 = e6.this.f9829c;
                        if (com.applovin.impl.sdk.n.a()) {
                            e6 e6Var6 = e6.this;
                            e6Var6.f9829c.d(e6Var6.f9828b, "Switching to backup endpoint " + a10);
                        }
                        e6.this.f6881g.a(a10);
                        z10 = true;
                    }
                }
                if (((Boolean) this.f6887a.a(o4.f8126h3)).booleanValue() && z10) {
                    millis = 0;
                } else {
                    millis = e6.this.f6881g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, e6.this.f6881g.c())) : e6.this.f6881g.k();
                }
                u5 i02 = this.f6887a.i0();
                e6 e6Var7 = e6.this;
                i02.a(e6Var7, e6Var7.f6883i, millis);
                return;
            }
            e6 e6Var8 = e6.this;
            e6Var8.a(e6Var8.f6881g.f(), i10, str2, obj);
        }
    }

    public e6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, boolean z10) {
        super("TaskRepeatRequest", jVar, z10);
        this.f6883i = u5.b.OTHER;
        this.f6884j = null;
        this.f6885k = null;
        if (aVar != null) {
            a(aVar.f());
            this.f6881g = aVar;
            this.f6886l = new n0.b();
            this.f6882h = new a(jVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    public void b(o4 o4Var) {
        this.f6885k = o4Var;
    }

    public void c(o4 o4Var) {
        this.f6884j = o4Var;
    }

    public void a(u5.b bVar) {
        this.f6883i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(o4 o4Var) {
        if (o4Var != null) {
            b().g0().a(o4Var, o4Var.a());
        }
    }
}
