package com.ironsource;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.n7;
import com.ironsource.o2;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class g6 extends n7<k6, AdapterAdViewListener> implements s1, f6 {
    private a7 K;
    private boolean L;
    private IronSourceBannerLayout M;
    private View N;
    private q7<?> O;
    private FrameLayout.LayoutParams P;
    private final AtomicBoolean Q;
    private final AtomicBoolean R;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements b8 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q7 f17542a;

        a(q7 q7Var) {
            this.f17542a = q7Var;
        }

        @Override // com.ironsource.b8
        public void a() {
            ((k6) this.f17542a).Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements b8 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q7 f17544a;

        b(q7 q7Var) {
            this.f17544a = q7Var;
        }

        @Override // com.ironsource.b8
        public void a() {
            ((k6) this.f17544a).Q();
            g6 g6Var = g6.this;
            g6Var.f19364s.f17170j.j(g6Var.n());
            g6.this.Q.set(false);
            g6.this.W();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("start binding timer after impression, expected interval = " + g6.this.f19360o.h().b() + ", current timestamp = " + System.currentTimeMillis());
            g6.this.O().h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17546a;

        static {
            int[] iArr = new int[o2.a.values().length];
            f17546a = iArr;
            try {
                iArr[o2.a.MANUAL_WITH_AUTOMATIC_RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17546a[o2.a.MANUAL_WITH_LOAD_ON_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g6(List<NetworkSettings> list, u6 u6Var, String str, qk qkVar, IronSourceSegment ironSourceSegment) {
        super(new h6(str, list, u6Var), qkVar, ironSourceSegment);
        this.L = false;
        this.Q = new AtomicBoolean(true);
        this.R = new AtomicBoolean(false);
        this.K = N();
    }

    private void M() {
        int i10 = c.f17546a[this.f19362q.b().a().ordinal()];
        if (i10 == 1) {
            P().a();
        } else if (i10 != 2) {
        } else {
            P().l();
            P().m();
            O().a();
            O().b();
        }
    }

    private a7 N() {
        return new a7(this.f19360o.h(), this.f19360o.g(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a7 O() {
        return this.K;
    }

    private g7 P() {
        return (g7) this.f19362q;
    }

    private ISBannerSize Q() {
        IronSourceBannerLayout ironSourceBannerLayout = this.M;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return this.M.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? com.ironsource.mediationsdk.l.a() : ISBannerSize.BANNER : this.M.getSize();
    }

    private boolean S() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(this.N + ", " + this.P + ", " + this.O));
        return (this.N == null || this.P == null || this.O == null) ? false : true;
    }

    private void U() {
        int i10 = c.f17546a[this.f19362q.b().a().ordinal()];
        if (i10 == 1) {
            P().k();
        } else if (i10 != 2) {
        } else {
            P().r();
        }
    }

    private void V() {
        int i10 = c.f17546a[this.f19362q.b().a().ordinal()];
        if (i10 == 1) {
            P().k();
        } else if (i10 != 2) {
        } else {
            P().q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        this.O = null;
        this.N = null;
        this.P = null;
    }

    private void b(q7<?> q7Var, View view, FrameLayout.LayoutParams layoutParams) {
        ((k6) q7Var).R();
        com.ironsource.mediationsdk.l.a(this.M, view, layoutParams, new a(q7Var));
    }

    private void c(q7<?> q7Var, View view, FrameLayout.LayoutParams layoutParams) {
        if (a(n7.f.READY_TO_SHOW, n7.f.SHOWING)) {
            this.R.set(false);
            O().e();
            ((k6) q7Var).R();
            com.ironsource.mediationsdk.l.a(this.M, view, layoutParams, new b(q7Var));
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("wrong state = " + this.f19361p);
    }

    boolean R() {
        IronLog ironLog;
        String str;
        if (!this.M.isShown()) {
            ironLog = IronLog.INTERNAL;
            str = "banner or one of its parents are INVISIBLE or GONE";
        } else if (this.M.hasWindowFocus()) {
            boolean globalVisibleRect = this.M.getGlobalVisibleRect(new Rect());
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("visible = " + globalVisibleRect);
            return globalVisibleRect;
        } else {
            ironLog = IronLog.INTERNAL;
            str = "banner has no window focus";
        }
        ironLog.verbose(str);
        return false;
    }

    public void T() {
        IronSourceBannerLayout ironSourceBannerLayout = this.M;
        if (ironSourceBannerLayout != null) {
            a(ironSourceBannerLayout);
        }
    }

    @Override // com.ironsource.n7
    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return ((AdapterSettingsInterface) adapterBaseInterface).getBannerLoadWhileShowSupportedState(networkSettings);
    }

    @Override // com.ironsource.n7
    protected AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f19360o.b(), str, this.M);
    }

    @Override // com.ironsource.n7, com.ironsource.d2
    public Map<String, Object> a(b2 b2Var) {
        Map<String, Object> a10 = super.a(b2Var);
        if (b(this.M)) {
            com.ironsource.mediationsdk.l.a(a10, this.M.getSize());
        }
        if (this.f19354i != null) {
            a10.put("placement", n());
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.n7
    public void a(int i10, String str, boolean z10) {
        if (!v()) {
            super.a(i10, str, z10);
            return;
        }
        if (!z10) {
            this.f19364s.f17167g.a(ib.a(this.f19359n), i10, str);
            com.ironsource.mediationsdk.n.a().b(this.f19360o.b(), new IronSourceError(i10, str));
        }
        if (v()) {
            a(n7.f.SHOWING);
            V();
        }
    }

    @Override // com.ironsource.n7
    protected void a(Context context, com.ironsource.mediationsdk.i iVar, s4 s4Var) {
        if (this.f19348c == null) {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
            return;
        }
        iVar.a(Q());
        this.f19348c.a(context, iVar, s4Var);
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        try {
            if (!b(ironSourceBannerLayout)) {
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                String format = String.format("can't destroy banner - %s", objArr);
                IronLog.API.error("destroy banner failed - errorMessage = " + format);
                return;
            }
            IronLog.INTERNAL.verbose("destroying banner");
            M();
            k6 k6Var = (k6) this.f19346a.d();
            if (k6Var != null) {
                this.f19364s.f17167g.a(k6Var.r() != null ? k6Var.r().intValue() : this.C.a(this.f19360o.b()));
                k6Var.P();
                this.f19346a.a(null);
                this.f19346a.b(null);
            }
            com.ironsource.mediationsdk.l.a(ironSourceBannerLayout);
            this.M = null;
            this.f19354i = null;
            this.L = false;
            if (P().o()) {
                this.Q.set(true);
                this.R.set(false);
                W();
            }
            a(n7.f.READY_TO_LOAD);
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.f19361p;
            IronLog.INTERNAL.error(b(str));
            e2 e2Var = this.f19364s;
            if (e2Var != null) {
                e2Var.f17171k.g(str);
            }
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, Placement placement) {
        String format;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placement = " + placement);
        int i10 = 510;
        if (!b(ironSourceBannerLayout)) {
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            format = String.format("can't load banner - %s", objArr);
        } else if (placement == null || TextUtils.isEmpty(placement.getPlacementName())) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = placement == null ? "placement is null" : "placement name is empty";
            format = String.format("can't load banner - %s", objArr2);
            i10 = a2.b(this.f19360o.b());
        } else if (this.E.b(ContextProvider.getInstance().getApplicationContext(), placement, this.f19360o.b())) {
            format = String.format("placement %s is capped", placement.getPlacementName());
            i10 = a2.f(this.f19360o.b());
        } else {
            format = null;
        }
        if (!TextUtils.isEmpty(format)) {
            IronLog.API.error(b(format));
            a(i10, format, false);
            return;
        }
        com.ironsource.mediationsdk.l.b(ironSourceBannerLayout);
        this.M = ironSourceBannerLayout;
        this.f19354i = placement;
        A();
    }

    @Override // com.ironsource.u2
    public void a(q7<?> q7Var) {
        IronLog.INTERNAL.verbose(b(q7Var.k()));
        this.f19365t.f(q7Var.f());
    }

    @Override // com.ironsource.s1
    public void a(q7<?> q7Var, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("mState = " + this.f19361p);
        super.e(q7Var);
        if (this.f19360o.h().a() == o2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            if (!a(n7.f.READY_TO_SHOW, n7.f.SHOWING)) {
                return;
            }
            this.f19346a.a(q7Var);
            this.f19346a.b(q7Var);
            b(q7Var, view, layoutParams);
            P().k();
        } else if (!P().o()) {
            return;
        } else {
            this.f19346a.b(q7Var);
            if (this.Q.get()) {
                c(q7Var, view, layoutParams);
            } else {
                this.O = q7Var;
                this.N = view;
                this.P = layoutParams;
            }
        }
        this.f19365t.c(q7Var.f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.n7
    /* renamed from: b */
    public k6 a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, int i10, String str, m5 m5Var) {
        return new k6(this, new m1(IronSource.AD_UNIT.BANNER, this.f19360o.o(), i10, this.f19352g, str, this.f19350e, this.f19351f, networkSettings, this.f19360o.n()), baseAdAdapter, this.M, this.f19354i, v(), m5Var, this);
    }

    @Override // com.ironsource.n7
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    @Override // com.ironsource.n7, com.ironsource.fm
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        try {
            if (this.M == null) {
                ironLog.error("mIronSourceBanner is null");
                this.f19364s.f17167g.b(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
                return;
            }
            boolean z10 = false;
            if (!R()) {
                if (this.f19360o.h().a() == o2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
                    ironLog.verbose("banner is not visible, reload skipped");
                    this.f19364s.f17167g.b(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE);
                }
                U();
                return;
            }
            synchronized (this.f19369x) {
                if (a(n7.f.SHOWING, n7.f.READY_TO_LOAD)) {
                    ironLog.verbose("start reload");
                    this.L = true;
                    z10 = true;
                } else {
                    ironLog.error("wrong state = " + this.f19361p);
                }
            }
            if (z10) {
                a(this.M, this.f19354i);
            }
        } catch (Throwable th) {
            o9.d().a(th);
            this.f19364s.f17171k.c(th.getMessage());
        }
    }

    @Override // com.ironsource.n7, com.ironsource.r2
    public void b(q7<?> q7Var) {
        super.b(q7Var);
        if (P().o()) {
            if (!this.R.compareAndSet(false, true)) {
                IronLog.INTERNAL.verbose("Impression already recorded as receive, it can occur from network onAdOpened or from impression timeout timer - loading next ad already in progress");
                return;
            }
            O().b();
            U();
        }
    }

    boolean b(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    @Override // com.ironsource.u2
    public void c(q7<?> q7Var) {
        IronLog.INTERNAL.verbose(b(q7Var.k()));
        this.f19365t.e(q7Var.f());
    }

    @Override // com.ironsource.u2
    public void d(q7<?> q7Var) {
        IronLog.INTERNAL.verbose(b(q7Var.k()));
        this.f19365t.b(q7Var.f());
    }

    @Override // com.ironsource.f6
    public void e() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, binding skipped");
            O().h();
            this.f19364s.f17167g.b(IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE);
        } else if (!S()) {
            IronLog.INTERNAL.verbose("Cannot bind banner view after interval, the next ad is not ready yet");
            this.Q.set(true);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("done binding timer, binding view now, current timestamp = " + System.currentTimeMillis());
            c(this.O, this.N, this.P);
        }
    }

    @Override // com.ironsource.f6
    public void f() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, starting the impression timeout timer again");
            O().e();
        } else if (this.R.compareAndSet(false, true)) {
            IronLog.INTERNAL.verbose("banner impression timeout reached, reloading banner manually");
            U();
            this.f19364s.f17171k.b("banner impression timeout reached, reloading banner manually");
        }
    }

    @Override // com.ironsource.n7
    protected l2 g() {
        return new b7();
    }

    @Override // com.ironsource.n7
    protected void g(q7<?> q7Var) {
    }

    @Override // com.ironsource.n7
    protected q2 h() {
        return new g7(this.f19360o.h(), this);
    }

    @Override // com.ironsource.n7
    protected void h(q7<?> q7Var) {
    }

    @Override // com.ironsource.n7
    protected String l() {
        return "BN";
    }

    @Override // com.ironsource.n7
    protected String o() {
        return IronSourceConstants.OPW_BN_MANAGER_NAME;
    }

    @Override // com.ironsource.n7
    protected boolean v() {
        return this.L;
    }
}
