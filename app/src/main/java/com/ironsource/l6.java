package com.ironsource;

import android.text.TextUtils;
import com.ironsource.e2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.p1;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class l6 extends p1 {

    /* renamed from: k  reason: collision with root package name */
    private final WeakReference<o6> f18158k;

    /* renamed from: l  reason: collision with root package name */
    private final a f18159l;

    /* renamed from: m  reason: collision with root package name */
    private final m6 f18160m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public final class a extends p1.a implements z5 {
        public a() {
            super();
        }

        @Override // com.ironsource.z5
        public void a(x5 instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            IronLog.INTERNAL.verbose(l6.this.a(instance.p()));
            o6 o6Var = (o6) l6.this.f18158k.get();
            if (o6Var != null) {
                o6Var.d();
            }
        }

        @Override // com.ironsource.p1.a, com.ironsource.e0
        public void b(a0 instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            super.b(instance);
            y1 i10 = l6.this.i();
            if (i10 != null) {
                i10.b();
            }
        }

        @Override // com.ironsource.z5
        public void b(x5 instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            IronLog.INTERNAL.verbose(l6.this.a(instance.p()));
            o6 o6Var = (o6) l6.this.f18158k.get();
            if (o6Var != null) {
                o6Var.g();
            }
        }

        @Override // com.ironsource.z5
        public void c(x5 instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            IronLog.INTERNAL.verbose(l6.this.a(instance.p()));
            o6 o6Var = (o6) l6.this.f18158k.get();
            if (o6Var != null) {
                o6Var.e();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(o1 tools, m6 adUnitData, o6 listener) {
        super(tools, adUnitData, listener, null, 8, null);
        String format;
        int b10;
        kotlin.jvm.internal.n.f(tools, "tools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f18158k = new WeakReference<>(listener);
        this.f18159l = new a();
        this.f18160m = adUnitData;
        Placement g10 = g();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placement = " + g10);
        if (g10 == null || TextUtils.isEmpty(g10.getPlacementName())) {
            kotlin.jvm.internal.d0 d0Var = kotlin.jvm.internal.d0.f27370a;
            Object[] objArr = new Object[1];
            objArr[0] = g10 == null ? "placement is null" : "placement name is empty";
            format = String.format("can't load banner - %s", Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.n.e(format, "format(format, *args)");
            b10 = a2.b(adUnitData.b().a());
        } else {
            format = null;
            b10 = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b10, format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 a(l6 this$0, b0 instanceData, h0 adInstancePayload) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        return new x5(new w2(this$0.f(), e2.b.PROVIDER), instanceData, adInstancePayload, this$0.f18159l);
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        return iSBannerSize.isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? com.ironsource.mediationsdk.l.a() : ISBannerSize.BANNER : iSBannerSize;
    }

    private final ISBannerSize m() {
        return f().a(this.f18160m.b().g());
    }

    @Override // com.ironsource.p1
    protected d0 a() {
        return new d0() { // from class: com.ironsource.nz
            @Override // com.ironsource.d0
            public final a0 a(b0 b0Var, h0 h0Var) {
                a0 a10;
                a10 = l6.a(l6.this, b0Var, h0Var);
                return a10;
            }
        };
    }

    public final void a(ov ovVar, y1 displayListener) {
        kotlin.jvm.internal.n.f(displayListener, "displayListener");
        if (ovVar != null) {
            a(new b6(ovVar), displayListener);
        }
    }

    @Override // com.ironsource.p1
    public r1 b() {
        return new s6(this.f18160m.b(), a(m()));
    }
}
