package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.e9;
import com.ironsource.eh;
import com.ironsource.er;
import com.ironsource.fh;
import com.ironsource.gb;
import com.ironsource.gh;
import com.ironsource.hg;
import com.ironsource.iw;
import com.ironsource.lh;
import com.ironsource.m0;
import com.ironsource.mh;
import com.ironsource.mm;
import com.ironsource.o9;
import com.ironsource.om;
import com.ironsource.pm;
import com.ironsource.pn;
import com.ironsource.q8;
import com.ironsource.qe;
import com.ironsource.s3;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.se;
import com.ironsource.t9;
import com.ironsource.u9;
import com.ironsource.v9;
import com.ironsource.va;
import com.ironsource.vc;
import com.ironsource.wa;
import com.ironsource.wc;
import com.ironsource.x9;
import com.ironsource.y9;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {

    /* renamed from: b  reason: collision with root package name */
    private com.ironsource.sdk.controller.l f20266b;

    /* renamed from: d  reason: collision with root package name */
    private CountDownTimer f20268d;

    /* renamed from: g  reason: collision with root package name */
    private final hg f20271g;

    /* renamed from: h  reason: collision with root package name */
    private final iw f20272h;

    /* renamed from: k  reason: collision with root package name */
    private final pn f20275k;

    /* renamed from: a  reason: collision with root package name */
    private final String f20265a = e.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private eh.b f20267c = eh.b.None;

    /* renamed from: e  reason: collision with root package name */
    private final q8 f20269e = new q8("NativeCommandExecutor");

    /* renamed from: f  reason: collision with root package name */
    private final q8 f20270f = new q8("ControllerCommandsExecutor");

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, l.a> f20273i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, l.b> f20274j = new HashMap();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f20276a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u9 f20277b;

        a(JSONObject jSONObject, u9 u9Var) {
            this.f20276a = jSONObject;
            this.f20277b = u9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.a(this.f20276a, this.f20277b);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ va f20279a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f20280b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u9 f20281c;

        b(va vaVar, Map map, u9 u9Var) {
            this.f20279a = vaVar;
            this.f20280b = map;
            this.f20281c = u9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.a(this.f20279a, this.f20280b, this.f20281c);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20283a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20284b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ va f20285c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t9 f20286d;

        c(String str, String str2, va vaVar, t9 t9Var) {
            this.f20283a = str;
            this.f20284b = str2;
            this.f20285c = vaVar;
            this.f20286d = t9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.a(this.f20283a, this.f20284b, this.f20285c, this.f20286d);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f20288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t9 f20289b;

        d(JSONObject jSONObject, t9 t9Var) {
            this.f20288a = jSONObject;
            this.f20289b = t9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.a(this.f20288a, this.f20289b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$e  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class RunnableC0232e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ va f20291a;

        RunnableC0232e(va vaVar) {
            this.f20291a = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.a(this.f20291a);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ va f20293a;

        f(va vaVar) {
            this.f20293a = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.b(this.f20293a);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ va f20295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f20296b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t9 f20297c;

        g(va vaVar, Map map, t9 t9Var) {
            this.f20295a = vaVar;
            this.f20296b = map;
            this.f20297c = t9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.a(this.f20295a, this.f20296b, this.f20297c);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l.a f20299a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.c f20300b;

        h(l.a aVar, f.c cVar) {
            this.f20299a = aVar;
            this.f20300b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                if (this.f20299a != null) {
                    e.this.f20273i.put(this.f20300b.f(), this.f20299a);
                }
                e.this.f20266b.a(this.f20300b, this.f20299a);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f20302a;

        i(JSONObject jSONObject) {
            this.f20302a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.b(this.f20302a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.destroy();
                e.this.f20266b = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class k extends CountDownTimer {
        k(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f20265a, "Global Controller Timer Finish");
            e.this.d(b9.c.f16566k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            String str = e.this.f20265a;
            Logger.i(str, "Global Controller Timer Tick " + j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20307a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20308b;

        m(String str, String str2) {
            this.f20307a = str;
            this.f20308b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.f20266b = eVar.b(eVar.f20272h.b(), e.this.f20272h.d(), e.this.f20272h.f(), e.this.f20272h.e(), e.this.f20272h.g(), e.this.f20272h.c(), this.f20307a, this.f20308b);
                e.this.f20266b.a();
            } catch (Throwable th) {
                o9.d().a(th);
                e.this.d(Log.getStackTraceString(th));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class n extends CountDownTimer {
        n(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f20265a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(b9.c.f16566k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            String str = e.this.f20265a;
            Logger.i(str, "Recovered Controller | Global Controller Timer Tick " + j10);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20312b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ va f20313c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v9 f20314d;

        o(String str, String str2, va vaVar, v9 v9Var) {
            this.f20311a = str;
            this.f20312b = str2;
            this.f20313c = vaVar;
            this.f20314d = v9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.a(this.f20311a, this.f20312b, this.f20313c, this.f20314d);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f20316a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v9 f20317b;

        p(JSONObject jSONObject, v9 v9Var) {
            this.f20316a = jSONObject;
            this.f20317b = v9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.a(this.f20316a, this.f20317b);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20320b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ va f20321c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u9 f20322d;

        q(String str, String str2, va vaVar, u9 u9Var) {
            this.f20319a = str;
            this.f20320b = str2;
            this.f20321c = vaVar;
            this.f20322d = u9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.a(this.f20319a, this.f20320b, this.f20321c, this.f20322d);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20324a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u9 f20325b;

        r(String str, u9 u9Var) {
            this.f20324a = str;
            this.f20325b = u9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f20266b != null) {
                e.this.f20266b.a(this.f20324a, this.f20325b);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ va f20327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f20328b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u9 f20329c;

        s(va vaVar, Map map, u9 u9Var) {
            this.f20327a = vaVar;
            this.f20328b = map;
            this.f20329c = u9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            lh.a(er.f17302j, new gh().a(cc.f16880v, this.f20327a.f()).a(cc.f16881w, mh.a(this.f20327a, eh.e.Interstitial)).a(cc.f16882x, Boolean.valueOf(mh.a(this.f20327a))).a(cc.I, Long.valueOf(m0.f18364a.b(this.f20327a.h()))).a());
            if (e.this.f20266b != null) {
                e.this.f20266b.b(this.f20327a, this.f20328b, this.f20329c);
            }
        }
    }

    public e(Context context, e9 e9Var, wa waVar, hg hgVar, int i10, JSONObject jSONObject, String str, String str2, pn pnVar) {
        this.f20275k = pnVar;
        this.f20271g = hgVar;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        gb a10 = gb.a(networkStorageDir, hgVar, jSONObject);
        this.f20272h = new iw(context, e9Var, waVar, i10, a10, networkStorageDir);
        a(context, e9Var, waVar, i10, a10, networkStorageDir, str, str2);
    }

    private void a(final Context context, final e9 e9Var, final wa waVar, final int i10, final gb gbVar, final String str, final String str2, final String str3) {
        int c10 = mm.S().d().c();
        if (c10 > 0) {
            lh.a(er.B, new gh().a(cc.f16883y, String.valueOf(c10)).a());
        }
        a(new Runnable() { // from class: com.ironsource.sdk.controller.y
            @Override // java.lang.Runnable
            public final void run() {
                e.this.c(context, e9Var, waVar, i10, gbVar, str, str2, str3);
            }
        }, c10);
        this.f20268d = new k(200000L, 1000L).start();
    }

    private void a(eh.e eVar, va vaVar, String str, String str2) {
        String str3 = this.f20265a;
        Logger.i(str3, "recoverWebController for product: " + eVar.toString());
        gh ghVar = new gh();
        ghVar.a(cc.f16881w, eVar.toString());
        ghVar.a(cc.f16880v, vaVar.f());
        lh.a(er.f17294b, ghVar.a());
        this.f20272h.n();
        destroy();
        b(new m(str, str2));
        this.f20268d = new n(200000L, 1000L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(om omVar) {
        l.b bVar = this.f20274j.get(omVar.d());
        if (bVar != null) {
            bVar.a(omVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(f.a aVar) {
        l.a remove = this.f20273i.remove(aVar.c());
        if (remove != null) {
            remove.a(aVar);
        }
    }

    private void a(Runnable runnable, long j10) {
        hg hgVar = this.f20271g;
        if (hgVar != null) {
            hgVar.d(runnable, j10);
        } else {
            Logger.e(this.f20265a, "mThreadManager = null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, e9 e9Var, wa waVar, int i10, gb gbVar, String str, String str2, String str3) throws Throwable {
        lh.a(er.f17295c);
        v vVar = new v(context, waVar, e9Var, this, this.f20271g, i10, gbVar, str, h(), i(), str2, str3);
        wc wcVar = new wc(context, gbVar, new vc(this.f20271g.a()), new pm(gbVar.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(gbVar.a(), wcVar));
        vVar.a(new s3());
        vVar.a(new y9(context, new x9()));
        return vVar;
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, e9 e9Var, wa waVar, int i10, gb gbVar, String str, String str2, String str3) {
        try {
            v b10 = b(context, e9Var, waVar, i10, gbVar, str, str2, str3);
            this.f20266b = b10;
            b10.a();
        } catch (Throwable th) {
            o9.d().a(th);
            d(Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        lh.a(er.f17296d, new gh().a(cc.A, str).a());
        this.f20267c = eh.b.Loading;
        this.f20266b = new com.ironsource.sdk.controller.n(str, this.f20271g);
        this.f20269e.c();
        this.f20269e.a();
        hg hgVar = this.f20271g;
        if (hgVar != null) {
            hgVar.c(new l());
        }
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new fh(1001, str));
    }

    private l.a h() {
        return new l.a() { // from class: com.ironsource.sdk.controller.w
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                e.this.a(aVar);
            }
        };
    }

    private l.b i() {
        return new l.b() { // from class: com.ironsource.sdk.controller.x
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(om omVar) {
                e.this.a(omVar);
            }
        };
    }

    private void k() {
        Logger.i(this.f20265a, "handleReadyState");
        this.f20267c = eh.b.Ready;
        CountDownTimer countDownTimer = this.f20268d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m();
        this.f20270f.c();
        this.f20270f.a();
        com.ironsource.sdk.controller.l lVar = this.f20266b;
        if (lVar != null) {
            lVar.e();
        }
    }

    private boolean l() {
        return eh.b.Ready.equals(this.f20267c);
    }

    private void m() {
        this.f20272h.a(true);
        com.ironsource.sdk.controller.l lVar = this.f20266b;
        if (lVar != null) {
            lVar.a(this.f20272h.i());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.f20266b.a(activity);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!l() || (lVar = this.f20266b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.ue
    public void a(qe qeVar) {
        er.a aVar;
        gh ghVar;
        StringBuilder sb;
        se b10 = qeVar.b();
        if (b10 == se.SendEvent) {
            aVar = er.A;
            ghVar = new gh();
            sb = new StringBuilder();
        } else if (b10 != se.NativeController) {
            return;
        } else {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(qeVar.a(), this.f20271g);
            this.f20266b = nVar;
            this.f20275k.a(nVar.g());
            er.a aVar2 = er.f17296d;
            gh ghVar2 = new gh();
            lh.a(aVar2, ghVar2.a(cc.A, qeVar.a() + " : strategy: " + b10).a());
            aVar = er.A;
            ghVar = new gh();
            sb = new StringBuilder();
        }
        sb.append(qeVar.a());
        sb.append(" : strategy: ");
        sb.append(b10);
        lh.a(aVar, ghVar.a(cc.f16883y, sb.toString()).a());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        this.f20270f.a(new h(aVar, cVar));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar) {
        this.f20270f.a(new RunnableC0232e(vaVar));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, t9 t9Var) {
        this.f20270f.a(new g(vaVar, map, t9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, u9 u9Var) {
        this.f20270f.a(new b(vaVar, map, u9Var));
    }

    public void a(Runnable runnable) {
        this.f20269e.a(runnable);
    }

    public void a(String str, l.b bVar) {
        this.f20274j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, u9 u9Var) {
        Logger.i(this.f20265a, "load interstitial");
        this.f20270f.a(new r(str, u9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, t9 t9Var) {
        if (this.f20272h.a(g(), this.f20267c)) {
            a(eh.e.Banner, vaVar, str, str2);
        }
        this.f20270f.a(new c(str, str2, vaVar, t9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, u9 u9Var) {
        if (this.f20272h.a(g(), this.f20267c)) {
            a(eh.e.Interstitial, vaVar, str, str2);
        }
        this.f20270f.a(new q(str, str2, vaVar, u9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, v9 v9Var) {
        if (this.f20272h.a(g(), this.f20267c)) {
            a(eh.e.RewardedVideo, vaVar, str, str2);
        }
        this.f20270f.a(new o(str, str2, vaVar, v9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, t9 t9Var) {
        this.f20270f.a(new d(jSONObject, t9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, u9 u9Var) {
        this.f20270f.a(new a(jSONObject, u9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, v9 v9Var) {
        this.f20270f.a(new p(jSONObject, v9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.f20266b == null || !l()) {
            return false;
        }
        return this.f20266b.a(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void b() {
        Logger.i(this.f20265a, "handleControllerLoaded");
        this.f20267c = eh.b.Loaded;
        this.f20269e.c();
        this.f20269e.a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!l() || (lVar = this.f20266b) == null) {
            return;
        }
        lVar.b(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(va vaVar) {
        this.f20270f.a(new f(vaVar));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(va vaVar, Map<String, String> map, u9 u9Var) {
        this.f20270f.a(new s(vaVar, map, u9Var));
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        Logger.i(this.f20265a, "handleControllerFailed ");
        gh ghVar = new gh();
        ghVar.a(cc.A, str);
        ghVar.a(cc.f16883y, String.valueOf(this.f20272h.l()));
        lh.a(er.f17307o, ghVar.a());
        this.f20272h.a(false);
        e(str);
        if (this.f20268d != null) {
            Logger.i(this.f20265a, "cancel timer mControllerReadyTimer");
            this.f20268d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f20270f.a(new i(jSONObject));
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.f20265a, "handleControllerReady ");
        this.f20275k.a(g());
        if (eh.c.Web.equals(g())) {
            lh.a(er.f17297e, new gh().a(cc.f16883y, String.valueOf(this.f20272h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        k();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        lh.a(er.f17317y, new gh().a(cc.f16883y, str).a());
        CountDownTimer countDownTimer = this.f20268d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void d() {
        com.ironsource.sdk.controller.l lVar;
        if (!l() || (lVar = this.f20266b) == null) {
            return;
        }
        lVar.d();
    }

    @Override // com.ironsource.sdk.controller.l
    public void destroy() {
        Logger.i(this.f20265a, "destroy controller");
        CountDownTimer countDownTimer = this.f20268d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        q8 q8Var = this.f20270f;
        if (q8Var != null) {
            q8Var.b();
        }
        this.f20268d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        com.ironsource.sdk.controller.l lVar;
        if (!l() || (lVar = this.f20266b) == null) {
            return;
        }
        lVar.f();
    }

    @Override // com.ironsource.sdk.controller.l
    public eh.c g() {
        com.ironsource.sdk.controller.l lVar = this.f20266b;
        return lVar != null ? lVar.g() : eh.c.None;
    }

    public com.ironsource.sdk.controller.l j() {
        return this.f20266b;
    }
}
