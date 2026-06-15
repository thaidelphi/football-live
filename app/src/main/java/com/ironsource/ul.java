package com.ironsource;

import android.content.Context;
import com.ironsource.e2;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.kj;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mm;
import com.ironsource.sq;
import com.ironsource.ul;
import com.ironsource.wh;
import com.ironsource.zf;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import java.util.Arrays;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ul {

    /* renamed from: a  reason: collision with root package name */
    public static final ul f21036a = new ul();

    /* renamed from: b  reason: collision with root package name */
    private static final vl f21037b = new vl();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f21038c = false;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements qr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LevelPlayInitRequest f21039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f21040b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ib f21041c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LevelPlayInitListener f21042d;

        a(LevelPlayInitRequest levelPlayInitRequest, Context context, ib ibVar, LevelPlayInitListener levelPlayInitListener) {
            this.f21039a = levelPlayInitRequest;
            this.f21040b = context;
            this.f21041c = ibVar;
            this.f21042d = levelPlayInitListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, ib initDuration, mr error) {
            kotlin.jvm.internal.n.f(initDuration, "$initDuration");
            kotlin.jvm.internal.n.f(error, "$error");
            ul.f21036a.a(levelPlayInitListener, initDuration, error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitRequest initRequest, kr sdkConfig, Context context, ib initDuration, LevelPlayInitListener levelPlayInitListener) {
            kotlin.jvm.internal.n.f(initRequest, "$initRequest");
            kotlin.jvm.internal.n.f(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.n.f(context, "$context");
            kotlin.jvm.internal.n.f(initDuration, "$initDuration");
            ul.f21036a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.ironsource.qr
        public void a(final kr sdkConfig) {
            kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
            vl vlVar = ul.f21037b;
            final LevelPlayInitRequest levelPlayInitRequest = this.f21039a;
            final Context context = this.f21040b;
            final ib ibVar = this.f21041c;
            final LevelPlayInitListener levelPlayInitListener = this.f21042d;
            vlVar.a(new Runnable() { // from class: com.ironsource.m10
                @Override // java.lang.Runnable
                public final void run() {
                    ul.a.a(LevelPlayInitRequest.this, sdkConfig, context, ibVar, levelPlayInitListener);
                }
            });
        }

        @Override // com.ironsource.qr
        public void a(final mr error) {
            kotlin.jvm.internal.n.f(error, "error");
            vl vlVar = ul.f21037b;
            final LevelPlayInitListener levelPlayInitListener = this.f21042d;
            final ib ibVar = this.f21041c;
            vlVar.a(new Runnable() { // from class: com.ironsource.l10
                @Override // java.lang.Runnable
                public final void run() {
                    ul.a.a(LevelPlayInitListener.this, ibVar, error);
                }
            });
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements qr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LevelPlayInitRequest f21043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f21044b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ib f21045c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LevelPlayInitListener f21046d;

        b(LevelPlayInitRequest levelPlayInitRequest, Context context, ib ibVar, LevelPlayInitListener levelPlayInitListener) {
            this.f21043a = levelPlayInitRequest;
            this.f21044b = context;
            this.f21045c = ibVar;
            this.f21046d = levelPlayInitListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, ib initDuration, mr error) {
            kotlin.jvm.internal.n.f(initDuration, "$initDuration");
            kotlin.jvm.internal.n.f(error, "$error");
            ul.f21036a.a(levelPlayInitListener, initDuration, error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitRequest initRequest, kr sdkConfig, Context context, ib initDuration, LevelPlayInitListener levelPlayInitListener) {
            kotlin.jvm.internal.n.f(initRequest, "$initRequest");
            kotlin.jvm.internal.n.f(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.n.f(context, "$context");
            kotlin.jvm.internal.n.f(initDuration, "$initDuration");
            ul.f21036a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.ironsource.qr
        public void a(final kr sdkConfig) {
            kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
            vl vlVar = ul.f21037b;
            final LevelPlayInitRequest levelPlayInitRequest = this.f21043a;
            final Context context = this.f21044b;
            final ib ibVar = this.f21045c;
            final LevelPlayInitListener levelPlayInitListener = this.f21046d;
            vlVar.a(new Runnable() { // from class: com.ironsource.o10
                @Override // java.lang.Runnable
                public final void run() {
                    ul.b.a(LevelPlayInitRequest.this, sdkConfig, context, ibVar, levelPlayInitListener);
                }
            });
        }

        @Override // com.ironsource.qr
        public void a(final mr error) {
            kotlin.jvm.internal.n.f(error, "error");
            vl vlVar = ul.f21037b;
            final LevelPlayInitListener levelPlayInitListener = this.f21046d;
            final ib ibVar = this.f21045c;
            vlVar.a(new Runnable() { // from class: com.ironsource.n10
                @Override // java.lang.Runnable
                public final void run() {
                    ul.b.a(LevelPlayInitListener.this, ibVar, error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c extends kotlin.jvm.internal.o implements t8.a<i8.w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ el f21047a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ib f21048b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f21049c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LevelPlayInitListener f21050d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(el elVar, ib ibVar, long j10, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f21047a = elVar;
            this.f21048b = ibVar;
            this.f21049c = j10;
            this.f21050d = levelPlayInitListener;
        }

        public final void a() {
            ul.f21036a.a(this.f21047a, this.f21048b, this.f21049c, this.f21050d);
        }

        @Override // t8.a
        public /* bridge */ /* synthetic */ i8.w invoke() {
            a();
            return i8.w.f26638a;
        }
    }

    private ul() {
    }

    private final void a(long j10, t8.a<i8.w> aVar) {
        if (mm.f19249r.d().t().c() || j10 <= 0) {
            aVar.invoke();
        } else {
            f21037b.a(aVar, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final el elVar, ib ibVar, long j10, final LevelPlayInitListener levelPlayInitListener) {
        mm.f19249r.a().D().d();
        long a10 = ib.a(ibVar);
        vl vlVar = f21037b;
        vlVar.a(a10, elVar.f(), j10);
        vlVar.e(new Runnable() { // from class: com.ironsource.j10
            @Override // java.lang.Runnable
            public final void run() {
                ul.a(LevelPlayInitListener.this, elVar);
            }
        });
    }

    public static /* synthetic */ void a(ul ulVar, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            levelPlayInitListener = null;
        }
        ulVar.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, el levelPlayConfig) {
        kotlin.jvm.internal.n.f(levelPlayConfig, "$levelPlayConfig");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final LevelPlayInitListener levelPlayInitListener, ib ibVar, final mr mrVar) {
        long a10 = ib.a(ibVar);
        vl vlVar = f21037b;
        vlVar.a(mrVar, a10);
        vlVar.e(new Runnable() { // from class: com.ironsource.k10
            @Override // java.lang.Runnable
            public final void run() {
                ul.a(LevelPlayInitListener.this, mrVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, mr error) {
        kotlin.jvm.internal.n.f(error, "$error");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(error));
        }
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, el elVar) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && elVar.d().c().f() != null) {
            sq.a aVar = sq.f20716z;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            sq a10 = aVar.a(new f1(ad_unit, lf.f18190a.a(), "", null, null, 24, null), elVar, true);
            List<zn> c10 = elVar.c(adFormat);
            e2.b bVar = e2.b.MEDIATION;
            new xp(new w2(new o1(ad_unit, bVar), a10, bVar), adFormat, c10, a10).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && elVar.d().c().d() != null) {
            kj.a aVar2 = kj.f18084z;
            IronSource.AD_UNIT ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
            kj a11 = aVar2.a(new f1(ad_unit2, lf.f18190a.a(), "", null, null, 24, null), elVar, true);
            List<zn> c11 = elVar.c(adFormat2);
            e2.b bVar2 = e2.b.MEDIATION;
            new xp(new w2(new o1(ad_unit2, bVar2), a11, bVar2), adFormat2, c11, a11).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || elVar.d().c().c() == null) {
            return;
        }
        m6 a12 = m6.f18438z.a(new j6(), elVar, true);
        List<zn> c12 = elVar.c(adFormat3);
        IronSource.AD_UNIT ad_unit3 = IronSource.AD_UNIT.BANNER;
        e2.b bVar3 = e2.b.MEDIATION;
        new xp(new w2(new o1(ad_unit3, bVar3), a12, bVar3), adFormat3, c12, a12).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, kr krVar, Context context, ib ibVar, LevelPlayInitListener levelPlayInitListener) {
        mm.b bVar = mm.f19249r;
        wh.a D = bVar.a().D();
        el elVar = new el(krVar);
        if (elVar.k()) {
            f21037b.a(context);
        }
        zf.a a10 = bVar.a().a();
        vl vlVar = f21037b;
        elVar.b(vlVar).a(a10);
        elVar.a(vlVar).a(bVar.a().w());
        elVar.c(vlVar).a(bVar.a().A());
        ul ulVar = f21036a;
        ulVar.a(levelPlayInitRequest, elVar);
        long b10 = bVar.d().d().b();
        ulVar.a(b10, new c(elVar, ibVar, b10, levelPlayInitListener));
        D.a(elVar);
        if (krVar.a().e()) {
            new eq(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.n.f(context, "$context");
        kotlin.jvm.internal.n.f(initRequest, "$initRequest");
        f21036a.c(context, initRequest, levelPlayInitListener);
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        List v10;
        ib ibVar = new ib();
        vl vlVar = f21037b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        v10 = j8.m.v(vlVar.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)));
        rr rrVar = new rr(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), v10);
        rrVar.e().isEmpty();
        yr.f21582a.a(context, rrVar, new a(levelPlayInitRequest, context, ibVar, levelPlayInitListener));
    }

    public final void a(final Context context, final LevelPlayInitRequest initRequest, final LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(initRequest, "initRequest");
        f21037b.d(new Runnable() { // from class: com.ironsource.i10
            @Override // java.lang.Runnable
            public final void run() {
                ul.b(context, initRequest, levelPlayInitListener);
            }
        });
    }
}
