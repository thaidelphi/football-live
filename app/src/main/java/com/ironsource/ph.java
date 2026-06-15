package com.ironsource;

import android.app.Activity;
import com.ironsource.b9;
import com.ironsource.eh;
import com.ironsource.er;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.th;
import com.ironsource.uh;
import com.ironsource.vm;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ph implements th {

    /* renamed from: j  reason: collision with root package name */
    public static final a f19750j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19751a;

    /* renamed from: b  reason: collision with root package name */
    private final vm f19752b;

    /* renamed from: c  reason: collision with root package name */
    private final hh f19753c;

    /* renamed from: d  reason: collision with root package name */
    private rh f19754d;

    /* renamed from: e  reason: collision with root package name */
    private String f19755e;

    /* renamed from: f  reason: collision with root package name */
    private String f19756f;

    /* renamed from: g  reason: collision with root package name */
    private Long f19757g;

    /* renamed from: h  reason: collision with root package name */
    private th.a f19758h;

    /* renamed from: i  reason: collision with root package name */
    private uh f19759i;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final ph a() {
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.n.e(uuid, "randomUUID().toString()");
            com.ironsource.sdk.controller.e controllerManager = IronSourceNetwork.getControllerManager();
            kotlin.jvm.internal.n.e(controllerManager, "controllerManager");
            return new ph(uuid, new um(uuid, controllerManager, null, null, 12, null), new ih());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements vm.a {
        b() {
        }

        @Override // com.ironsource.vm.a
        public void a() {
            th.a a10 = ph.this.a();
            if (a10 != null) {
                a10.onNativeAdShown();
            }
        }

        @Override // com.ironsource.vm.a
        public void a(rh adData) {
            kotlin.jvm.internal.n.f(adData, "adData");
            ph.this.f19754d = adData;
            hh hhVar = ph.this.f19753c;
            er.a loadAdSuccess = er.f17304l;
            kotlin.jvm.internal.n.e(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> a10 = ph.this.c().a();
            kotlin.jvm.internal.n.e(a10, "baseEventParams().data");
            hhVar.a(loadAdSuccess, a10);
            th.a a11 = ph.this.a();
            if (a11 != null) {
                a11.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.vm.a
        public void a(String reason) {
            kotlin.jvm.internal.n.f(reason, "reason");
            gh a10 = ph.this.c().a(cc.A, reason);
            hh hhVar = ph.this.f19753c;
            er.a loadAdFailed = er.f17299g;
            kotlin.jvm.internal.n.e(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> a11 = a10.a();
            kotlin.jvm.internal.n.e(a11, "eventParams.data");
            hhVar.a(loadAdFailed, a11);
            th.a a12 = ph.this.a();
            if (a12 != null) {
                a12.onNativeAdLoadFailed(reason);
            }
        }

        @Override // com.ironsource.vm.a
        public void c() {
            th.a a10 = ph.this.a();
            if (a10 != null) {
                a10.onNativeAdClicked();
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c implements uh.a {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f19762a;

            static {
                int[] iArr = new int[uh.b.values().length];
                try {
                    iArr[uh.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f19762a = iArr;
            }
        }

        c() {
        }

        @Override // com.ironsource.uh.a
        public void a(qv viewVisibilityParams) {
            kotlin.jvm.internal.n.f(viewVisibilityParams, "viewVisibilityParams");
            ph.this.f19752b.a(viewVisibilityParams);
        }

        @Override // com.ironsource.uh.a
        public void a(uh.b viewName) {
            kotlin.jvm.internal.n.f(viewName, "viewName");
            if (a.f19762a[viewName.ordinal()] == 1) {
                ph.this.f19752b.b();
                return;
            }
            JSONObject clickParams = new JSONObject().put("viewName", viewName.b());
            vm vmVar = ph.this.f19752b;
            kotlin.jvm.internal.n.e(clickParams, "clickParams");
            vmVar.a(clickParams);
        }
    }

    public ph(String id, vm controller, hh eventTracker) {
        kotlin.jvm.internal.n.f(id, "id");
        kotlin.jvm.internal.n.f(controller, "controller");
        kotlin.jvm.internal.n.f(eventTracker, "eventTracker");
        this.f19751a = id;
        this.f19752b = controller;
        this.f19753c = eventTracker;
        controller.a(e());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ph(java.lang.String r1, com.ironsource.vm r2, com.ironsource.hh r3, int r4, kotlin.jvm.internal.h r5) {
        /*
            r0 = this;
            r4 = r4 & 1
            if (r4 == 0) goto L11
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "randomUUID().toString()"
            kotlin.jvm.internal.n.e(r1, r4)
        L11:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.ph.<init>(java.lang.String, com.ironsource.vm, com.ironsource.hh, int, kotlin.jvm.internal.h):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gh c() {
        gh a10 = new gh().a(cc.f16882x, this.f19756f).a(cc.f16880v, this.f19755e).a(cc.f16881w, eh.e.NativeAd.toString()).a(cc.I, Long.valueOf(i()));
        kotlin.jvm.internal.n.e(a10, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return a10;
    }

    public static final ph d() {
        return f19750j.a();
    }

    private final b e() {
        return new b();
    }

    private final c f() {
        return new c();
    }

    private final long i() {
        Long l10 = this.f19757g;
        if (l10 != null) {
            return Calendar.getInstance().getTimeInMillis() - l10.longValue();
        }
        return -1L;
    }

    @Override // com.ironsource.th
    public th.a a() {
        return this.f19758h;
    }

    @Override // com.ironsource.th
    public void a(Activity activity, JSONObject loadParams) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(loadParams, "loadParams");
        this.f19757g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.f19755e = loadParams.optString("demandSourceName");
        this.f19756f = loadParams.optString("inAppBidding");
        hh hhVar = this.f19753c;
        er.a loadAd = er.f17298f;
        kotlin.jvm.internal.n.e(loadAd, "loadAd");
        HashMap<String, Object> a10 = c().a();
        kotlin.jvm.internal.n.e(a10, "baseEventParams().data");
        hhVar.a(loadAd, a10);
        JSONObject jSONObject = new JSONObject(loadParams.toString());
        jSONObject.put(b9.h.f16687y0, String.valueOf(this.f19757g));
        this.f19752b.a(activity, jSONObject);
    }

    @Override // com.ironsource.th
    public void a(th.a aVar) {
        this.f19758h = aVar;
    }

    @Override // com.ironsource.th
    public void a(uh viewHolder) {
        kotlin.jvm.internal.n.f(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> a10 = c().a();
        kotlin.jvm.internal.n.e(a10, "baseEventParams().data");
        linkedHashMap.putAll(a10);
        String jSONObject = viewHolder.t().toString();
        kotlin.jvm.internal.n.e(jSONObject, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(cc.f16883y, jSONObject);
        hh hhVar = this.f19753c;
        er.a registerAd = er.f17306n;
        kotlin.jvm.internal.n.e(registerAd, "registerAd");
        hhVar.a(registerAd, linkedHashMap);
        this.f19759i = viewHolder;
        viewHolder.a(f());
        this.f19752b.a(viewHolder);
    }

    @Override // com.ironsource.th
    public rh b() {
        return this.f19754d;
    }

    @Override // com.ironsource.th
    public void destroy() {
        uh uhVar = this.f19759i;
        if (uhVar != null) {
            uhVar.a((uh.a) null);
        }
        this.f19752b.destroy();
    }

    public final String g() {
        return this.f19755e;
    }

    public final String h() {
        return this.f19756f;
    }
}
