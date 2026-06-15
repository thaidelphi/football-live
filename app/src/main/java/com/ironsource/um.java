package com.ironsource;

import android.app.Activity;
import com.ironsource.b9;
import com.ironsource.rh;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.vm;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class um implements vm {

    /* renamed from: a  reason: collision with root package name */
    private final String f21051a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ironsource.sdk.controller.e f21052b;

    /* renamed from: c  reason: collision with root package name */
    private final ii f21053c;

    /* renamed from: d  reason: collision with root package name */
    private final b3 f21054d;

    /* renamed from: e  reason: collision with root package name */
    private final String f21055e;

    /* renamed from: f  reason: collision with root package name */
    private vm.a f21056f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21057a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final String f21058b = "nativeAd.load";

        /* renamed from: c  reason: collision with root package name */
        public static final String f21059c = "nativeAd.loadReport";

        /* renamed from: d  reason: collision with root package name */
        public static final String f21060d = "nativeAd.register";

        /* renamed from: e  reason: collision with root package name */
        public static final String f21061e = "nativeAd.click";

        /* renamed from: f  reason: collision with root package name */
        public static final String f21062f = "nativeAd.privacyClick";

        /* renamed from: g  reason: collision with root package name */
        public static final String f21063g = "nativeAd.visibilityChanged";

        /* renamed from: h  reason: collision with root package name */
        public static final String f21064h = "nativeAd.destroy";

        private a() {
        }
    }

    public um(String id, com.ironsource.sdk.controller.e controllerManager, ii imageLoader, b3 adViewManagement) {
        kotlin.jvm.internal.n.f(id, "id");
        kotlin.jvm.internal.n.f(controllerManager, "controllerManager");
        kotlin.jvm.internal.n.f(imageLoader, "imageLoader");
        kotlin.jvm.internal.n.f(adViewManagement, "adViewManagement");
        this.f21051a = id;
        this.f21052b = controllerManager;
        this.f21053c = imageLoader;
        this.f21054d = adViewManagement;
        this.f21055e = um.class.getSimpleName();
        controllerManager.a(id, c());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ um(java.lang.String r2, com.ironsource.sdk.controller.e r3, com.ironsource.ii r4, com.ironsource.b3 r5, int r6, kotlin.jvm.internal.h r7) {
        /*
            r1 = this;
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            com.ironsource.hi r4 = new com.ironsource.hi
            r7 = 1
            r0 = 0
            r4.<init>(r0, r7, r0)
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L18
            com.ironsource.bh r5 = com.ironsource.bh.a()
            java.lang.String r6 = "getInstance()"
            kotlin.jvm.internal.n.e(r5, r6)
        L18:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.um.<init>(java.lang.String, com.ironsource.sdk.controller.e, com.ironsource.ii, com.ironsource.b3, int, kotlin.jvm.internal.h):void");
    }

    private final void a(Activity activity, f.a aVar) {
        if (aVar.d() == null) {
            vm.a a10 = a();
            if (a10 != null) {
                a10.a("failed to load native ad: missing params");
            }
        } else if (aVar.d().optBoolean("success", false)) {
            rh.b a11 = new rh.a(this.f21053c, this.f21054d).a(activity, aVar.d());
            a(a11, a11.a().h());
        } else {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            vm.a a12 = a();
            if (a12 != null) {
                kotlin.jvm.internal.n.e(reason, "reason");
                a12.a(reason);
            }
        }
    }

    private final void a(om omVar) {
        if (omVar.f() == null) {
            Logger.i(this.f21055e, "failed to handle click on native ad: missing params");
        } else if (omVar.f().optBoolean("success", false)) {
            vm.a a10 = a();
            if (a10 != null) {
                a10.c();
            }
        } else {
            String optString = omVar.f().optString("reason", "unexpected error");
            String str = this.f21055e;
            Logger.i(str, "failed to handle click on native ad: " + optString);
        }
    }

    private final void a(rh.b bVar, final rh rhVar) {
        this.f21052b.a(new f.c(this.f21051a, "nativeAd.loadReport." + this.f21051a, bVar.b()), new l.a() { // from class: com.ironsource.s10
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                um.a(um.this, rhVar, aVar);
            }
        });
    }

    private final void a(rh rhVar, f.a aVar) {
        if (aVar.d() == null) {
            vm.a a10 = a();
            if (a10 != null) {
                a10.a("failed to load native ad: missing report params");
            }
        } else if (aVar.d().optBoolean("success", false)) {
            vm.a a11 = a();
            if (a11 != null) {
                a11.a(rhVar);
            }
        } else {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            vm.a a12 = a();
            if (a12 != null) {
                kotlin.jvm.internal.n.e(reason, "reason");
                a12.a(reason);
            }
        }
    }

    private final void a(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f21055e, "failed to handle click on native ad: missing params");
        } else if (aVar.d().optBoolean("success", false)) {
            vm.a a10 = a();
            if (a10 != null) {
                a10.c();
            }
        } else {
            String optString = aVar.d().optString("reason", "unexpected error");
            String str = this.f21055e;
            Logger.i(str, "failed to handle click on native ad: " + optString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(um this$0, Activity activity, f.a it) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(activity, "$activity");
        kotlin.jvm.internal.n.f(it, "it");
        this$0.a(activity, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(um this$0, om msg) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(msg, "msg");
        if (kotlin.jvm.internal.n.a(msg.e(), a.f21061e)) {
            this$0.a(msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(um this$0, rh adData, f.a it) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adData, "$adData");
        kotlin.jvm.internal.n.f(it, "it");
        this$0.a(adData, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(um this$0, f.a it) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(it, "it");
        this$0.a(it);
    }

    private final void b(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f21055e, "failed to handle show on native ad: missing params");
        } else if (aVar.d().optBoolean("success", false)) {
            vm.a a10 = a();
            if (a10 != null) {
                a10.a();
            }
        } else {
            String optString = aVar.d().optString("reason", "unexpected error");
            String str = this.f21055e;
            Logger.i(str, "failed to handle show on native ad: " + optString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(um this$0, f.a it) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(it, "it");
        this$0.b(it);
    }

    private final l.b c() {
        return new l.b() { // from class: com.ironsource.t10
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(om omVar) {
                um.a(um.this, omVar);
            }
        };
    }

    private final JSONObject d() {
        JSONObject put = new JSONObject().put(f.b.f20343g, a.f21061e).put("sdkCallback", b9.g.U);
        kotlin.jvm.internal.n.e(put, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return put;
    }

    @Override // com.ironsource.vm
    public vm.a a() {
        return this.f21056f;
    }

    @Override // com.ironsource.vm
    public void a(final Activity activity, JSONObject loadParams) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(loadParams, "loadParams");
        this.f21052b.a(activity);
        this.f21052b.a(new f.c(this.f21051a, a.f21058b, loadParams), new l.a() { // from class: com.ironsource.r10
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                um.a(um.this, activity, aVar);
            }
        });
    }

    @Override // com.ironsource.vm
    public void a(qv viewVisibilityParams) {
        kotlin.jvm.internal.n.f(viewVisibilityParams, "viewVisibilityParams");
        this.f21052b.a(new f.c(this.f21051a, a.f21063g, viewVisibilityParams.g()), new l.a() { // from class: com.ironsource.p10
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                um.b(um.this, aVar);
            }
        });
    }

    @Override // com.ironsource.vm
    public void a(uh viewHolder) {
        kotlin.jvm.internal.n.f(viewHolder, "viewHolder");
        JSONObject params = new JSONObject().put("assetViews", viewHolder.t()).put("adViewClickCommand", d());
        String str = this.f21051a;
        kotlin.jvm.internal.n.e(params, "params");
        this.f21052b.a(new f.c(str, a.f21060d, params), (l.a) null);
    }

    @Override // com.ironsource.vm
    public void a(vm.a aVar) {
        this.f21056f = aVar;
    }

    @Override // com.ironsource.vm
    public void a(JSONObject clickParams) {
        kotlin.jvm.internal.n.f(clickParams, "clickParams");
        this.f21052b.a(new f.c(this.f21051a, a.f21061e, clickParams), new l.a() { // from class: com.ironsource.q10
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                um.a(um.this, aVar);
            }
        });
    }

    @Override // com.ironsource.vm
    public void b() {
        this.f21052b.a(new f.c(this.f21051a, a.f21062f, new JSONObject()), (l.a) null);
    }

    @Override // com.ironsource.vm
    public void destroy() {
        this.f21052b.a(new f.c(this.f21051a, a.f21064h, new JSONObject()), (l.a) null);
    }
}
