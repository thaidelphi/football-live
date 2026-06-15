package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.eh;
import com.ironsource.hg;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.t9;
import com.ironsource.u9;
import com.ironsource.v9;
import com.ironsource.va;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n implements l {

    /* renamed from: a  reason: collision with root package name */
    private final hg f20386a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20387b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l.a f20388a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.c f20389b;

        a(l.a aVar, f.c cVar) {
            this.f20388a = aVar;
            this.f20389b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f20388a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", n.this.f20387b);
                this.f20388a.a(new f.a(this.f20389b.f(), jSONObject));
            } catch (JSONException e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v9 f20391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ va f20392b;

        b(v9 v9Var, va vaVar) {
            this.f20391a = v9Var;
            this.f20392b = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20391a.a(eh.e.RewardedVideo, this.f20392b.h(), n.this.f20387b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v9 f20394a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f20395b;

        c(v9 v9Var, JSONObject jSONObject) {
            this.f20394a = v9Var;
            this.f20395b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20394a.d(this.f20395b.optString("demandSourceName"), n.this.f20387b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u9 f20397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ va f20398b;

        d(u9 u9Var, va vaVar) {
            this.f20397a = u9Var;
            this.f20398b = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20397a.a(eh.e.Interstitial, this.f20398b.h(), n.this.f20387b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u9 f20400a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20401b;

        e(u9 u9Var, String str) {
            this.f20400a = u9Var;
            this.f20401b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20400a.c(this.f20401b, n.this.f20387b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u9 f20403a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ va f20404b;

        f(u9 u9Var, va vaVar) {
            this.f20403a = u9Var;
            this.f20404b = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20403a.c(this.f20404b.h(), n.this.f20387b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u9 f20406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f20407b;

        g(u9 u9Var, JSONObject jSONObject) {
            this.f20406a = u9Var;
            this.f20407b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20406a.b(this.f20407b.optString("demandSourceName"), n.this.f20387b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u9 f20409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ va f20410b;

        h(u9 u9Var, va vaVar) {
            this.f20409a = u9Var;
            this.f20410b = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20409a.b(this.f20410b.h(), n.this.f20387b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t9 f20412a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f20413b;

        i(t9 t9Var, Map map) {
            this.f20412a = t9Var;
            this.f20413b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20412a.a((String) this.f20413b.get("demandSourceName"), n.this.f20387b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t9 f20415a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f20416b;

        j(t9 t9Var, JSONObject jSONObject) {
            this.f20415a = t9Var;
            this.f20416b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20415a.a(this.f20416b.optString("demandSourceName"), n.this.f20387b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(String str, hg hgVar) {
        this.f20386a = hgVar;
        this.f20387b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        a(new a(aVar, cVar));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, t9 t9Var) {
        if (t9Var != null) {
            a(new i(t9Var, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, u9 u9Var) {
        if (u9Var != null) {
            a(new h(u9Var, vaVar));
        }
    }

    void a(Runnable runnable) {
        hg hgVar = this.f20386a;
        if (hgVar != null) {
            hgVar.c(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, u9 u9Var) {
        if (u9Var != null) {
            a(new e(u9Var, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, t9 t9Var) {
        if (t9Var != null) {
            t9Var.a(eh.e.Banner, vaVar.h(), this.f20387b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, u9 u9Var) {
        if (u9Var != null) {
            a(new d(u9Var, vaVar));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, v9 v9Var) {
        if (v9Var != null) {
            a(new b(v9Var, vaVar));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, t9 t9Var) {
        if (t9Var != null) {
            a(new j(t9Var, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, u9 u9Var) {
        if (u9Var != null) {
            a(new g(u9Var, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, v9 v9Var) {
        if (v9Var != null) {
            a(new c(v9Var, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(va vaVar) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(va vaVar, Map<String, String> map, u9 u9Var) {
        if (u9Var != null) {
            a(new f(u9Var, vaVar));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void d() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void destroy() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public eh.c g() {
        return eh.c.Native;
    }
}
