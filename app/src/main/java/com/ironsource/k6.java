package com.ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.q7;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class k6 extends q7<s1> implements BannerAdListener {

    /* renamed from: t  reason: collision with root package name */
    public static final String f18035t = "bannerLayout";

    /* renamed from: u  reason: collision with root package name */
    public static final String f18036u = "bannerSize";

    /* renamed from: r  reason: collision with root package name */
    private final IronSourceBannerLayout f18037r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f18038s;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f18039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f18040b;

        a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f18039a = view;
            this.f18040b = layoutParams;
        }

        @Override // com.ironsource.hr
        public void a() {
            k6.this.a(this.f18039a, this.f18040b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b extends hr {
        b() {
        }

        @Override // com.ironsource.hr
        public void a() {
            k6.this.J();
        }
    }

    public k6(tp tpVar, m1 m1Var, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, IronSourceBannerLayout ironSourceBannerLayout, Placement placement, boolean z10, m5 m5Var, s1 s1Var) {
        super(tpVar, m1Var, baseAdAdapter, new c3(m1Var.g(), m1Var.g().getBannerSettings(), IronSource.AD_UNIT.BANNER), m5Var, s1Var);
        this.f18037r = ironSourceBannerLayout;
        this.f19847g = placement;
        this.f18038s = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (y()) {
            super.onAdOpened();
        } else if (this.f19845e == q7.h.FAILED) {
        } else {
            ironLog.error(String.format("unexpected onAdOpened for %s, state - %s", k(), this.f19845e));
            if (this.f19844d != null) {
                this.f19844d.f17171k.p(String.format("unexpected onAdOpened, state - %s", this.f19845e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!y() || (listener = this.f19842b) == 0) {
            return;
        }
        ((s1) listener).a(this, view, layoutParams);
    }

    @Override // com.ironsource.q7
    protected void G() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f19843c;
        if (baseAdAdapter instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) baseAdAdapter).loadAd(this.f19851k, ContextProvider.getInstance().getCurrentActiveActivity(), this.f18037r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.ironsource.q7
    protected boolean O() {
        return false;
    }

    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(q7.h.NONE);
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f19843c;
        if (baseAdAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (baseAdAdapter instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) baseAdAdapter).destroyAd(this.f19851k);
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.f19845e;
            IronLog.INTERNAL.error(a(str));
            e2 e2Var = this.f19844d;
            if (e2Var != null) {
                e2Var.f17171k.g(str);
            }
        }
        e2 e2Var2 = this.f19844d;
        if (e2Var2 != null) {
            e2Var2.f17167g.a(r().intValue());
        }
    }

    public void Q() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f19843c;
        if (baseAdAdapter instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) baseAdAdapter).onAdViewBound(this.f19851k);
        }
    }

    public void R() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f19843c;
        if (baseAdAdapter instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) baseAdAdapter).onAdViewWillBind(this.f19851k);
        }
    }

    @Override // com.ironsource.q7
    protected AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.ironsource.q7, com.ironsource.d2
    public Map<String, Object> a(b2 b2Var) {
        Map<String, Object> a10 = super.a(b2Var);
        IronSourceBannerLayout ironSourceBannerLayout = this.f18037r;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            com.ironsource.mediationsdk.l.a(a10, this.f18037r.getSize());
        }
        if (this.f19847g != null) {
            a10.put("placement", j());
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.q7
    public Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> a10 = super.a(map);
        m1 m1Var = this.f19841a;
        if (m1Var != null && this.f18037r != null && TextUtils.isEmpty(m1Var.g().getCustomNetwork())) {
            a10.put("bannerLayout", this.f18037r);
        }
        return a10;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        e2 e2Var;
        Placement placement = this.f19847g;
        if (placement != null && (e2Var = this.f19844d) != null) {
            e2Var.f17170j.f(placement.getPlacementName());
        }
        Listener listener = this.f19842b;
        if (listener != 0) {
            ((s1) listener).d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams) {
        if (u().c()) {
            u().a(new a(view, layoutParams));
        } else {
            a(view, layoutParams);
        }
    }

    @Override // com.ironsource.q7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new b());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        e2 e2Var;
        Placement placement = this.f19847g;
        if (placement != null && (e2Var = this.f19844d) != null) {
            e2Var.f17170j.c(placement.getPlacementName());
        }
        Listener listener = this.f19842b;
        if (listener != 0) {
            ((s1) listener).c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        e2 e2Var;
        Placement placement = this.f19847g;
        if (placement != null && (e2Var = this.f19844d) != null) {
            e2Var.f17170j.h(placement.getPlacementName());
        }
        Listener listener = this.f19842b;
        if (listener != 0) {
            ((s1) listener).a(this);
        }
    }

    @Override // com.ironsource.q7
    protected boolean v() {
        return this.f18038s;
    }
}
