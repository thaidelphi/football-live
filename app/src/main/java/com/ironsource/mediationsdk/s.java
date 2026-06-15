package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.Cdo;
import com.ironsource.a4;
import com.ironsource.ak;
import com.ironsource.ar;
import com.ironsource.as;
import com.ironsource.bf;
import com.ironsource.ce;
import com.ironsource.cq;
import com.ironsource.e4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.eq;
import com.ironsource.ip;
import com.ironsource.k4;
import com.ironsource.ls;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.integration.IntegrationHelper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mm;
import com.ironsource.mo;
import com.ironsource.ms;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.os;
import com.ironsource.xa;
import com.ironsource.zb;
import com.ironsource.zr;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s implements Cdo {
    private static s A;

    /* renamed from: a  reason: collision with root package name */
    private os f19083a;

    /* renamed from: p  reason: collision with root package name */
    private NetworkStateReceiver f19098p;

    /* renamed from: q  reason: collision with root package name */
    private CountDownTimer f19099q;

    /* renamed from: t  reason: collision with root package name */
    private String f19102t;

    /* renamed from: u  reason: collision with root package name */
    private ls f19103u;

    /* renamed from: v  reason: collision with root package name */
    private SegmentListener f19104v;

    /* renamed from: x  reason: collision with root package name */
    private long f19106x;

    /* renamed from: b  reason: collision with root package name */
    private int f19084b = e.f19123f;

    /* renamed from: c  reason: collision with root package name */
    private bf f19085c = mm.S().v();

    /* renamed from: d  reason: collision with root package name */
    private final String f19086d = "appKey";

    /* renamed from: e  reason: collision with root package name */
    private final String f19087e = getClass().getSimpleName();

    /* renamed from: l  reason: collision with root package name */
    private boolean f19094l = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f19096n = false;

    /* renamed from: r  reason: collision with root package name */
    private List<mo> f19100r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private String f19101s = "";

    /* renamed from: z  reason: collision with root package name */
    private f f19108z = new a();

    /* renamed from: m  reason: collision with root package name */
    private Handler f19095m = IronSourceThreadManager.INSTANCE.getInitHandler();

    /* renamed from: f  reason: collision with root package name */
    private int f19088f = 1;

    /* renamed from: g  reason: collision with root package name */
    private int f19089g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f19090h = 62;

    /* renamed from: i  reason: collision with root package name */
    private int f19091i = 12;

    /* renamed from: j  reason: collision with root package name */
    private int f19092j = 5;

    /* renamed from: o  reason: collision with root package name */
    private AtomicBoolean f19097o = new AtomicBoolean(true);

    /* renamed from: k  reason: collision with root package name */
    private boolean f19093k = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f19105w = false;

    /* renamed from: y  reason: collision with root package name */
    private ak f19107y = new ak();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends f {
        a() {
            super();
        }

        @Override // java.lang.Runnable
        public void run() {
            ms i10;
            try {
                p m7 = p.m();
                if (!TextUtils.isEmpty(s.this.f19101s)) {
                    ce.a().a("userId", s.this.f19101s);
                }
                if (!TextUtils.isEmpty(s.this.f19102t)) {
                    ce.a().a("appKey", s.this.f19102t);
                }
                s.this.f19107y.i(s.this.f19101s);
                s.this.f19106x = new Date().getTime();
                cq.c().a();
                s.this.f19103u = m7.b(ContextProvider.getInstance().getApplicationContext(), s.this.f19101s, this.f19126c);
                if (s.this.f19103u != null) {
                    s.this.f19095m.removeCallbacks(this);
                    if (s.this.f19103u.p()) {
                        s.this.b(d.INITIATED);
                        new nm().a(s.this.f19103u.c().b().d().b(), m7.B());
                        k4 e8 = s.this.f19103u.c().b().e();
                        if (e8 != null) {
                            xa xaVar = xa.f21388a;
                            xaVar.c(e8.g());
                            xaVar.a(e8.f());
                            xaVar.a(e8.j());
                            IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(e8.h());
                            s.this.f19085c.a(e8);
                        }
                        s.this.a(ContextProvider.getInstance().getApplicationContext(), s.this.f19103u);
                        m7.a(new Date().getTime() - s.this.f19106x, s.this.f19103u.h());
                        if (e8 != null && e8.e()) {
                            new eq(ar.i(), new t8.a() { // from class: com.ironsource.mediationsdk.b0
                                @Override // t8.a
                                public final Object invoke() {
                                    return Long.valueOf(System.currentTimeMillis());
                                }
                            }, mm.S(), IronSourceThreadManager.INSTANCE.getThreadPoolExecutor()).c(ContextProvider.getInstance().getApplicationContext());
                        }
                        s.this.f19083a = new os();
                        s.this.f19083a.a(s.this.f19085c);
                        if (s.this.f19103u.c().b().f() && ContextProvider.getInstance().getApplicationContext() != null) {
                            IntegrationHelper.validateIntegration(ContextProvider.getInstance().getApplicationContext());
                        }
                        List<IronSource.AD_UNIT> g10 = s.this.f19103u.g();
                        for (mo moVar : s.this.f19100r) {
                            moVar.a(g10, s.this.h(), s.this.f19103u.c());
                        }
                        new ip.a().a();
                        if (s.this.f19104v != null && (i10 = s.this.f19103u.c().b().i()) != null && !TextUtils.isEmpty(i10.c())) {
                            s.this.f19104v.onSegmentReceived(i10.c());
                        }
                        e4 c10 = s.this.f19103u.c().b().c();
                        if (c10.f()) {
                            o9.d().a(c10.b(), c10.d(), c10.c(), c10.e(), IronSourceUtils.getSessionId(), c10.a(), c10.g());
                        }
                    } else if (!s.this.f19094l) {
                        s.this.b(d.INIT_FAILED);
                        s.this.f19094l = true;
                        for (mo moVar2 : s.this.f19100r) {
                            moVar2.d("serverResponseIsNotValid");
                        }
                    }
                } else {
                    if (s.this.f19089g == 3) {
                        s.this.f19105w = true;
                        for (mo moVar3 : s.this.f19100r) {
                            moVar3.a();
                        }
                    }
                    if (this.f19124a && s.this.f19089g < s.this.f19090h) {
                        s.this.f19093k = true;
                        s.this.f19095m.postDelayed(this, s.this.f19088f * 1000);
                        if (s.this.f19089g < s.this.f19091i) {
                            s.a(s.this, 2);
                        }
                    }
                    if ((!this.f19124a || s.this.f19089g == s.this.f19092j) && !s.this.f19094l) {
                        s.this.f19094l = true;
                        if (TextUtils.isEmpty(this.f19125b)) {
                            this.f19125b = "noServerResponse";
                        }
                        for (mo moVar4 : s.this.f19100r) {
                            moVar4.d(this.f19125b);
                        }
                        s.this.b(d.INIT_FAILED);
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                    }
                    s.f(s.this);
                }
                s.this.e();
            } catch (Exception e10) {
                o9.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a extends CountDownTimer {
            a(long j10, long j11) {
                super(j10, j11);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (s.this.f19094l) {
                    return;
                }
                s.this.f19094l = true;
                for (mo moVar : s.this.f19100r) {
                    moVar.d("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                if (j10 <= 45000) {
                    s.this.f19105w = true;
                    for (mo moVar : s.this.f19100r) {
                        moVar.a();
                    }
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.f19099q = new a(60000L, 15000L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19112a;

        static {
            int[] iArr = new int[d.values().length];
            f19112a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19112a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19112a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public static int f19118a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static int f19119b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static int f19120c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static int f19121d = 3;

        /* renamed from: e  reason: collision with root package name */
        public static int f19122e = 4;

        /* renamed from: f  reason: collision with root package name */
        public static int f19123f = 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public abstract class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        String f19125b;

        /* renamed from: a  reason: collision with root package name */
        boolean f19124a = true;

        /* renamed from: c  reason: collision with root package name */
        protected p.c f19126c = new a();

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements p.c {
            a() {
            }

            @Override // com.ironsource.mediationsdk.p.c
            public void a(String str) {
                f fVar = f.this;
                fVar.f19124a = false;
                fVar.f19125b = str;
            }
        }

        f() {
        }
    }

    private s() {
    }

    private static int a(d dVar) {
        int i10 = c.f19112a[dVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? e.f19118a : e.f19119b : e.f19122e : e.f19121d;
    }

    static /* synthetic */ int a(s sVar, int i10) {
        int i11 = sVar.f19088f * i10;
        sVar.f19088f = i11;
        return i11;
    }

    public static synchronized s c() {
        s sVar;
        synchronized (s.class) {
            if (A == null) {
                A = new s();
            }
            sVar = A;
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (mm.S().d().f()) {
            ar.i().a(new zb(IronSourceConstants.EP_CONFIG_RECEIVED, null));
        }
    }

    static /* synthetic */ int f(s sVar) {
        int i10 = sVar.f19089g;
        sVar.f19089g = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return this.f19093k;
    }

    public synchronized d a() {
        return d.values()[as.f16400a.a().ordinal()];
    }

    public void a(Context context, ls lsVar) {
        this.f19107y.i(lsVar.f().h());
        this.f19107y.b(lsVar.f().d());
        a4 b10 = lsVar.c().b();
        this.f19107y.a(b10.a());
        this.f19107y.c(b10.b().b());
        this.f19107y.b(b10.j().b());
        this.f19107y.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
        k4 e8 = lsVar.c().b().e();
        this.f19107y.b(e8.b());
        mm.M().x().a(e8.c());
    }

    public synchronized void a(Context context, String str, String str2, IronSource.AD_UNIT... ad_unitArr) {
        try {
            AtomicBoolean atomicBoolean = this.f19097o;
            if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                logger.log(ironSourceTag, this.f19087e + ": Multiple calls to init are not allowed", 2);
            } else {
                b(d.INIT_IN_PROGRESS);
                this.f19101s = str2;
                this.f19102t = str;
                if (IronSourceUtils.isNetworkConnected(context)) {
                    this.f19095m.post(this.f19108z);
                } else {
                    this.f19096n = true;
                    if (this.f19098p == null) {
                        this.f19098p = new NetworkStateReceiver(context, this);
                    }
                    context.registerReceiver(this.f19098p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                }
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public void a(SegmentListener segmentListener) {
        this.f19104v = segmentListener;
    }

    public void a(mo moVar) {
        if (moVar == null) {
            return;
        }
        this.f19100r.add(moVar);
    }

    @Override // com.ironsource.Cdo
    public void a(boolean z10) {
        if (this.f19096n && z10) {
            CountDownTimer countDownTimer = this.f19099q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f19096n = false;
            this.f19093k = true;
            ar.i().a(new zb(IronSourceConstants.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.getMediationAdditionalData(false)));
            this.f19095m.post(this.f19108z);
        }
    }

    public int b() {
        return this.f19084b;
    }

    public synchronized void b(d dVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("old status: " + a() + ", new status: " + dVar + ")");
        as.f16400a.a(zr.values()[dVar.ordinal()]);
    }

    public void b(mo moVar) {
        if (moVar == null || this.f19100r.size() == 0) {
            return;
        }
        this.f19100r.remove(moVar);
    }

    public synchronized boolean d() {
        return this.f19105w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        b(d.INIT_FAILED);
    }

    public synchronized void g() {
        int a10 = a(a());
        this.f19084b = a10;
        this.f19107y.c(a10);
    }
}
