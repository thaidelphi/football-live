package com.ironsource;

import android.util.Log;
import com.ironsource.j9;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class l9 implements jf {

    /* renamed from: a  reason: collision with root package name */
    private final i9 f18168a;

    /* renamed from: b  reason: collision with root package name */
    private final t8.l<nh, Object> f18169b;

    /* renamed from: c  reason: collision with root package name */
    private final of f18170c;

    /* renamed from: d  reason: collision with root package name */
    private final q9 f18171d;

    /* renamed from: e  reason: collision with root package name */
    private final String f18172e;

    /* renamed from: f  reason: collision with root package name */
    private nh f18173f;

    /* renamed from: g  reason: collision with root package name */
    private long f18174g;

    /* renamed from: h  reason: collision with root package name */
    private final ep f18175h;

    /* renamed from: i  reason: collision with root package name */
    private String f18176i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.l implements t8.l<i8.o<? extends nh>, i8.w> {
        a(Object obj) {
            super(1, obj, l9.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((l9) this.receiver).b(obj);
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ i8.w invoke(i8.o<? extends nh> oVar) {
            a(oVar.i());
            return i8.w.f26638a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class b extends kotlin.jvm.internal.l implements t8.l<i8.o<? extends JSONObject>, i8.w> {
        b(Object obj) {
            super(1, obj, l9.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((l9) this.receiver).a(obj);
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ i8.w invoke(i8.o<? extends JSONObject> oVar) {
            a(oVar.i());
            return i8.w.f26638a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l9(i9 config, t8.l<? super nh, ? extends Object> onFinish, of downloadManager, q9 currentTimeProvider) {
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(onFinish, "onFinish");
        kotlin.jvm.internal.n.f(downloadManager, "downloadManager");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f18168a = config;
        this.f18169b = onFinish;
        this.f18170c = downloadManager;
        this.f18171d = currentTimeProvider;
        this.f18172e = l9.class.getSimpleName();
        this.f18173f = new nh(config.b(), "mobileController_0.html");
        this.f18174g = currentTimeProvider.a();
        this.f18175h = new ep(config.c());
        this.f18176i = "";
    }

    private final k9 a(String str) {
        return new k9(new mv(this.f18175h, str), this.f18168a.b() + "/mobileController_" + str + ".html", this.f18170c, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) {
        k9 a10;
        if (i8.o.f(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null || kotlin.jvm.internal.n.a(jSONObject.optString("htmlBuildNumber"), "")) {
            a10 = a("0");
        } else {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            kotlin.jvm.internal.n.e(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.f18176i = string;
            a10 = a(string);
            if (a10.h()) {
                nh j10 = a10.j();
                this.f18173f = j10;
                this.f18169b.invoke(j10);
                return;
            }
        }
        a10.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj) {
        if (i8.o.g(obj)) {
            nh nhVar = (nh) (i8.o.f(obj) ? null : obj);
            if (!kotlin.jvm.internal.n.a(nhVar != null ? nhVar.getAbsolutePath() : null, this.f18173f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f18173f);
                    kotlin.jvm.internal.n.c(nhVar);
                    r8.m.l(nhVar, this.f18173f, true, 0, 4, null);
                } catch (Exception e8) {
                    o9.d().a(e8);
                    Log.e(this.f18172e, "Unable to copy downloaded mobileController.html to cache folder: " + e8.getMessage());
                }
                kotlin.jvm.internal.n.c(nhVar);
                this.f18173f = nhVar;
            }
            new j9.b(this.f18168a.d(), this.f18174g, this.f18171d).a();
        } else {
            new j9.a(this.f18168a.d()).a();
        }
        t8.l<nh, Object> lVar = this.f18169b;
        if (i8.o.f(obj)) {
            obj = null;
        }
        lVar.invoke(obj);
    }

    @Override // com.ironsource.jf
    public void a() {
        this.f18174g = this.f18171d.a();
        d dVar = new d(this.f18175h);
        new c(dVar, this.f18168a.b() + "/temp", this.f18170c, new b(this)).l();
    }

    @Override // com.ironsource.jf
    public boolean a(nh file) {
        kotlin.jvm.internal.n.f(file, "file");
        String name = file.getName();
        kotlin.jvm.internal.n.e(name, "file.name");
        return new b9.e("mobileController(_\\d+)?\\.html").a(name);
    }

    @Override // com.ironsource.jf
    public nh b() {
        return this.f18173f;
    }

    public final q9 c() {
        return this.f18171d;
    }

    public final t8.l<nh, Object> d() {
        return this.f18169b;
    }
}
