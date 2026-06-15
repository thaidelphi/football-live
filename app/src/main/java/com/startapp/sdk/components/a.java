package com.startapp.sdk.components;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Pair;
import com.startapp.b3;
import com.startapp.b5;
import com.startapp.c4;
import com.startapp.d4;
import com.startapp.d8;
import com.startapp.e5;
import com.startapp.f1;
import com.startapp.f9;
import com.startapp.fb;
import com.startapp.gb;
import com.startapp.h7;
import com.startapp.hb;
import com.startapp.i2;
import com.startapp.i5;
import com.startapp.j2;
import com.startapp.k3;
import com.startapp.l7;
import com.startapp.l8;
import com.startapp.lb;
import com.startapp.o3;
import com.startapp.o4;
import com.startapp.o9;
import com.startapp.q1;
import com.startapp.r1;
import com.startapp.r3;
import com.startapp.s1;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.startapp.sdk.jobs.SchedulerService;
import com.startapp.t4;
import com.startapp.t7;
import com.startapp.u1;
import com.startapp.u5;
import com.startapp.u8;
import com.startapp.v1;
import com.startapp.w2;
import com.startapp.x2;
import com.startapp.x7;
import com.startapp.y2;
import com.startapp.y8;
import com.startapp.z3;
import com.startapp.z7;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {
    public static final j R = new j();
    public final t4<Executor> A;
    public final t4<Executor> B;
    public final t4<w2> C;
    public final t4<w2> D;
    public final t4<com.startapp.sdk.adsbase.e> E;
    public final t4<com.startapp.sdk.adsbase.e> F;
    public final t4<com.startapp.sdk.adsbase.e> G;
    public final t4<com.startapp.r> H;
    public final t4<com.startapp.m> I;
    public final t4<com.startapp.sdk.adsbase.crashreport.b> J;
    public final t4<com.startapp.sdk.ads.video.f> K;
    public final t4<i2<Context, List<String>, TrackingParams, k3>> L;
    public final t4<com.startapp.d> M;
    public final t4<com.startapp.c0> N;
    public final t4<b5> O;
    public final t4<f9> P;
    public final t4<u5> Q;

    /* renamed from: a  reason: collision with root package name */
    public final t4<gb> f23225a;

    /* renamed from: b  reason: collision with root package name */
    public final t4<fb> f23226b;

    /* renamed from: c  reason: collision with root package name */
    public final t4<e5> f23227c;

    /* renamed from: d  reason: collision with root package name */
    public final t4<c4> f23228d;

    /* renamed from: e  reason: collision with root package name */
    public final t4<u8> f23229e;

    /* renamed from: f  reason: collision with root package name */
    public final t4<y8> f23230f;

    /* renamed from: g  reason: collision with root package name */
    public final t4<AdvertisingIdResolver> f23231g;

    /* renamed from: h  reason: collision with root package name */
    public final t4<h7> f23232h;

    /* renamed from: i  reason: collision with root package name */
    public final t4<v1> f23233i;

    /* renamed from: j  reason: collision with root package name */
    public final t4<d4> f23234j;

    /* renamed from: k  reason: collision with root package name */
    public final t4<d8> f23235k;

    /* renamed from: l  reason: collision with root package name */
    public final t4<com.startapp.z> f23236l;

    /* renamed from: m  reason: collision with root package name */
    public final t4<b3> f23237m;

    /* renamed from: n  reason: collision with root package name */
    public final t4<l8> f23238n;

    /* renamed from: o  reason: collision with root package name */
    public final t4<com.startapp.w> f23239o;

    /* renamed from: p  reason: collision with root package name */
    public final t4<r3> f23240p;

    /* renamed from: q  reason: collision with root package name */
    public final t4<f1> f23241q;

    /* renamed from: r  reason: collision with root package name */
    public final t4<z7> f23242r;

    /* renamed from: s  reason: collision with root package name */
    public final t4<u1> f23243s;

    /* renamed from: t  reason: collision with root package name */
    public final t4<l7> f23244t;

    /* renamed from: u  reason: collision with root package name */
    public final t4<o4> f23245u;

    /* renamed from: v  reason: collision with root package name */
    public final t4<i5> f23246v;

    /* renamed from: w  reason: collision with root package name */
    public final t4<x7> f23247w;

    /* renamed from: x  reason: collision with root package name */
    public final t4<w2> f23248x;

    /* renamed from: y  reason: collision with root package name */
    public final t4<Executor> f23249y;

    /* renamed from: z  reason: collision with root package name */
    public final t4<Executor> f23250z;

    /* compiled from: Sta */
    /* renamed from: com.startapp.sdk.components.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0253a implements j2<TelephonyMetadata> {
        @Override // com.startapp.j2
        public final TelephonyMetadata call() {
            return MetaData.f23158k.Q();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a0 implements j2<com.startapp.sdk.adsbase.e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23251a;

        public a0(Context context) {
            this.f23251a = context;
        }

        @Override // com.startapp.j2
        public final com.startapp.sdk.adsbase.e call() {
            return new com.startapp.sdk.adsbase.e(this.f23251a.getSharedPreferences("com.startapp.sdk", 0), null);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements j2<u8> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23252a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ j2 f23253b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f23254c;

        public b(Context context, C0253a c0253a, a aVar) {
            this.f23254c = aVar;
            this.f23252a = context;
            this.f23253b = c0253a;
        }

        @Override // com.startapp.j2
        public final u8 call() {
            Context context = this.f23252a;
            t4 t4Var = new t4(new com.startapp.sdk.components.b(this));
            a aVar = this.f23254c;
            return new u8(context, t4Var, aVar.C, aVar.f23233i, this.f23253b, new com.startapp.sdk.components.c());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b0 implements j2<com.startapp.sdk.adsbase.e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23255a;

        public b0(Context context) {
            this.f23255a = context;
        }

        @Override // com.startapp.j2
        public final com.startapp.sdk.adsbase.e call() {
            return new com.startapp.sdk.adsbase.e(PreferenceManager.getDefaultSharedPreferences(this.f23255a), null);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements j2<y8> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23256a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ j2 f23257b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f23258c;

        public c(Context context, C0253a c0253a, a aVar) {
            this.f23258c = aVar;
            this.f23256a = context;
            this.f23257b = c0253a;
        }

        @Override // com.startapp.j2
        public final y8 call() {
            Context context = this.f23256a;
            a aVar = this.f23258c;
            return new y8(context, aVar.C, new t4(new com.startapp.sdk.components.d(this)), aVar.f23233i, this.f23257b);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c0 implements j2<com.startapp.sdk.adsbase.e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23259a;

        public c0(Context context) {
            this.f23259a = context;
        }

        @Override // com.startapp.j2
        public final com.startapp.sdk.adsbase.e call() {
            return new com.startapp.sdk.adsbase.e(this.f23259a.getSharedPreferences("com.startapp.sdk.extras", 0), new com.startapp.sdk.components.y(this));
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements j2<AdvertisingIdResolver> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23260a;

        public d(Context context) {
            this.f23260a = context;
        }

        @Override // com.startapp.j2
        public final AdvertisingIdResolver call() {
            return new AdvertisingIdResolver(this.f23260a, new s1("air"), new com.startapp.sdk.components.e());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d0 implements j2<com.startapp.r> {
        public d0(Context context) {
        }

        @Override // com.startapp.j2
        public final com.startapp.r call() {
            return new com.startapp.r();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements j2<h7> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23261a;

        public e(Context context) {
            this.f23261a = context;
        }

        @Override // com.startapp.j2
        public final h7 call() {
            return new h7(this.f23261a, new com.startapp.sdk.components.f());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e0 implements j2<com.startapp.m> {
        public e0(Context context) {
        }

        @Override // com.startapp.j2
        public final com.startapp.m call() {
            return new com.startapp.m(new com.startapp.sdk.components.z());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements j2<v1> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23262a;

        public f(Context context) {
            this.f23262a = context;
        }

        @Override // com.startapp.j2
        public final v1 call() {
            Context context = this.f23262a;
            a aVar = a.this;
            return new v1(context, aVar.E, aVar.f23231g);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f0 implements j2<WvfMetadata> {
        @Override // com.startapp.j2
        public final WvfMetadata call() {
            return MetaData.f23158k.T();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements j2<d4> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23264a;

        public g(Context context) {
            this.f23264a = context;
        }

        @Override // com.startapp.j2
        public final d4 call() {
            return new d4(new com.startapp.sdk.adsbase.e(this.f23264a.getSharedPreferences("StartApp-54ff24db2aee60b9", 0), null));
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g0 implements j2<com.startapp.sdk.ads.video.f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23265a;

        public g0(Context context) {
            this.f23265a = context;
        }

        @Override // com.startapp.j2
        public final com.startapp.sdk.ads.video.f call() {
            return new com.startapp.sdk.ads.video.f(this.f23265a, a.this.f23250z, new t4(new com.startapp.sdk.components.b0()));
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements j2<d8> {
        @Override // com.startapp.j2
        public final d8 call() {
            return new d8();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h0 implements j2<i2<Context, List<String>, TrackingParams, k3>> {
        @Override // com.startapp.j2
        public final i2<Context, List<String>, TrackingParams, k3> call() {
            return new com.startapp.sdk.components.d0();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements j2<com.startapp.z> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23267a;

        public i(Context context) {
            this.f23267a = context;
        }

        @Override // com.startapp.j2
        public final com.startapp.z call() {
            return new com.startapp.z(new com.startapp.sdk.adsbase.e(this.f23267a.getSharedPreferences("StartApp-790ba54ab8e69f2f", 0), null));
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i0 implements j2<com.startapp.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23268a;

        public i0(Context context) {
            this.f23268a = context;
        }

        @Override // com.startapp.j2
        public final com.startapp.d call() {
            return new com.startapp.d(this.f23268a, a.this.f23231g, new com.startapp.sdk.components.e0());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j extends q1<a, Context> {
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j0 implements j2<com.startapp.c0> {
        @Override // com.startapp.j2
        public final com.startapp.c0 call() {
            return new com.startapp.c0(new com.startapp.sdk.components.f0(), new com.startapp.sdk.components.g0());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class k implements j2<b3> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23270a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4 f23271b;

        public k(Context context, t4 t4Var) {
            this.f23270a = context;
            this.f23271b = t4Var;
        }

        @Override // com.startapp.j2
        public final b3 call() {
            a aVar = a.this;
            return new b3(aVar.f23231g, new com.startapp.sdk.components.i(this), aVar.f23227c, new t4(new com.startapp.sdk.components.k(this)), new com.startapp.sdk.components.l());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class k0 implements j2<b5> {
        public k0() {
        }

        @Override // com.startapp.j2
        public final b5 call() {
            a aVar = a.this;
            return new b5(aVar.f23250z, aVar.D);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class l implements j2<l8> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23274a;

        public l(Context context) {
            this.f23274a = context;
        }

        @Override // com.startapp.j2
        public final l8 call() {
            Context context = this.f23274a;
            return new l8(context, new com.startapp.sdk.adsbase.e(context.getSharedPreferences("StartApp-9b9bfdb86df82dad", 0), null), new com.startapp.sdk.components.m());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class l0 implements j2<f9> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23275a;

        public l0(Context context) {
            this.f23275a = context;
        }

        @Override // com.startapp.j2
        public final f9 call() {
            return new f9(this.f23275a, a.this.B, new com.startapp.sdk.components.h0());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class m implements j2<com.startapp.w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23277a;

        public m(Context context) {
            this.f23277a = context;
        }

        @Override // com.startapp.j2
        public final com.startapp.w call() {
            return new com.startapp.w(this.f23277a);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class m0 implements j2<u5> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23278a;

        public m0(Context context) {
            this.f23278a = context;
        }

        @Override // com.startapp.j2
        public final u5 call() {
            return new u5(a.this.B, new File(this.f23278a.getFilesDir(), "StartApp-68962b1486d766d9"), new com.startapp.sdk.components.i0());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class n implements j2<r3> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23280a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4 f23281b;

        public n(Context context, t4 t4Var) {
            this.f23280a = context;
            this.f23281b = t4Var;
        }

        @Override // com.startapp.j2
        public final r3 call() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, 5L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new s1("info"));
            o3 o3Var = new o3(this.f23280a);
            w2 w2Var = (w2) this.f23281b.a();
            com.startapp.sdk.components.n nVar = new com.startapp.sdk.components.n(threadPoolExecutor);
            a aVar = a.this;
            return new r3(o3Var, w2Var, threadPoolExecutor, nVar, aVar.f23243s, new z3(this.f23280a, aVar.f23237m, aVar.f23232h), new com.startapp.sdk.components.o());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class n0 implements j2<gb> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j2 f23283a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f23284b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f23285c;

        public n0(Context context, f0 f0Var, a aVar) {
            this.f23285c = aVar;
            this.f23283a = f0Var;
            this.f23284b = context;
        }

        @Override // com.startapp.j2
        public final gb call() {
            WvfMetadata wvfMetadata = (WvfMetadata) this.f23283a.call();
            if (wvfMetadata != null && o9.a(wvfMetadata.b())) {
                return new lb(this.f23284b, this.f23283a);
            }
            Context context = this.f23284b;
            a aVar = this.f23285c;
            return new hb(context, aVar.B, aVar.D, new t4(new com.startapp.sdk.components.a0()), this.f23283a);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class o implements j2<f1> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23286a;

        public o(Context context) {
            this.f23286a = context;
        }

        @Override // com.startapp.j2
        public final f1 call() {
            Context context = this.f23286a;
            a aVar = a.this;
            return new f1(context, aVar.E, new t4(new com.startapp.sdk.components.p(this)), aVar.f23233i, aVar.C, new com.startapp.sdk.components.q());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class o0 implements j2<fb> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23288a;

        public o0(Context context) {
            this.f23288a = context;
        }

        @Override // com.startapp.j2
        public final fb call() {
            return new fb(this.f23288a, a.this.f23225a);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class p implements j2<z7> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23290a;

        public p(Context context) {
            this.f23290a = context;
        }

        @Override // com.startapp.j2
        public final z7 call() {
            Context context = this.f23290a;
            t4 t4Var = new t4(new com.startapp.sdk.components.r(this));
            a aVar = a.this;
            return new z7(context, t4Var, aVar.f23233i, aVar.C, new com.startapp.sdk.components.s());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class p0 implements j2<w2> {
        @Override // com.startapp.j2
        public final w2 call() {
            y2 y2Var = new y2("startapp-".concat("db"));
            y2Var.start();
            return new x2(new Handler(y2Var.getLooper()));
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class q implements j2<u1> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23292a;

        public q(Context context) {
            this.f23292a = context;
        }

        @Override // com.startapp.j2
        public final u1 call() {
            return new u1(this.f23292a, new com.startapp.sdk.components.t());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class q0 implements j2<Executor> {
        @Override // com.startapp.j2
        public final Executor call() {
            return a.a(24, "shared", 2L);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class r implements j2<l7> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23293a;

        public r(Context context) {
            this.f23293a = context;
        }

        @Override // com.startapp.j2
        public final l7 call() {
            return new l7(this.f23293a, a.this.B, new com.startapp.sdk.components.u());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class r0 implements j2<e5> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23295a;

        public r0(Context context) {
            this.f23295a = context;
        }

        @Override // com.startapp.j2
        public final e5 call() {
            return new e5(this.f23295a);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class s implements j2<o4> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23296a;

        public s(Context context) {
            this.f23296a = context;
        }

        @Override // com.startapp.j2
        public final o4 call() {
            Pair pair;
            Context context = this.f23296a;
            com.startapp.sdk.jobs.e eVar = new com.startapp.sdk.jobs.e(context);
            if (Build.VERSION.SDK_INT >= 21) {
                pair = new Pair(new com.startapp.sdk.jobs.c(context, SchedulerService.class), eVar);
            } else {
                pair = new Pair(eVar, eVar);
            }
            return new o4((t7) pair.first, (t7) pair.second);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class s0 implements j2<c4> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23297a;

        public s0(Context context) {
            this.f23297a = context;
        }

        @Override // com.startapp.j2
        public final c4 call() {
            return new c4(this.f23297a);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class t implements j2<i5> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23298a;

        public t(Context context) {
            this.f23298a = context;
        }

        @Override // com.startapp.j2
        public final i5 call() {
            Context context = this.f23298a;
            return new i5(context, new com.startapp.sdk.adsbase.e(context.getSharedPreferences("StartApp-b36110d5cb803404", 0), null), new com.startapp.sdk.components.v(), new Handler(Looper.getMainLooper()));
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class u implements j2<com.startapp.sdk.adsbase.crashreport.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23299a;

        public u(Context context) {
            this.f23299a = context;
        }

        @Override // com.startapp.j2
        public final com.startapp.sdk.adsbase.crashreport.b call() {
            ANRRemoteConfig f10 = MetaData.f23158k.f();
            com.startapp.sdk.adsbase.crashreport.b bVar = new com.startapp.sdk.adsbase.crashreport.b(f10 != null ? f10.c() : 2000L, f10 != null && f10.g());
            if (f10 != null && f10.e()) {
                bVar.f23091b = new com.startapp.sdk.components.g(f10);
                bVar.f23090a = new com.startapp.sdk.adsbase.crashreport.a(this.f23299a, f10.h(), f10.a(), f10.d());
                if (f10.f()) {
                    bVar.f23093d = new com.startapp.sdk.components.h(this);
                }
                bVar.start();
            }
            return bVar;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class v implements j2<x7> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23300a;

        public v(Context context) {
            this.f23300a = context;
        }

        @Override // com.startapp.j2
        public final x7 call() {
            return new x7(a.this.f23231g, new t4(new com.startapp.sdk.components.w(this)), new com.startapp.sdk.components.x(), this.f23300a);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class w implements j2<w2> {
        @Override // com.startapp.j2
        public final w2 call() {
            y2 y2Var = new y2("startapp-".concat("core"));
            y2Var.start();
            return new x2(new Handler(y2Var.getLooper()));
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class x implements j2<Executor> {
        @Override // com.startapp.j2
        public final Executor call() {
            return a.a(4, "generic", 5L);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class y implements j2<w2> {
        @Override // com.startapp.j2
        public final w2 call() {
            y2 y2Var = new y2("startapp-".concat("dc"));
            y2Var.start();
            return new x2(new Handler(y2Var.getLooper()));
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class z implements j2<w2> {
        @Override // com.startapp.j2
        public final w2 call() {
            return new x2(new Handler(Looper.getMainLooper()));
        }
    }

    public a(Context context) {
        this.J = new t4<>(new u(context));
        this.f23225a = new t4<>(new n0(context, new f0(), this));
        this.f23226b = new t4<>(new o0(context));
        t4 t4Var = new t4(new p0());
        t4<Executor> t4Var2 = new t4<>(new q0());
        this.f23227c = new t4<>(new r0(context));
        this.f23228d = new t4<>(new s0(context));
        C0253a c0253a = new C0253a();
        this.f23229e = new t4<>(new b(context, c0253a, this));
        this.f23230f = new t4<>(new c(context, c0253a, this));
        this.f23231g = new t4<>(new d(context));
        this.f23232h = new t4<>(new e(context));
        this.f23233i = new t4<>(new f(context));
        this.f23234j = new t4<>(new g(context));
        this.f23235k = new t4<>(new h());
        this.f23236l = new t4<>(new i(context));
        this.f23237m = new t4<>(new k(context, t4Var));
        this.f23238n = new t4<>(new l(context));
        this.f23239o = new t4<>(new m(context));
        this.f23240p = new t4<>(new n(context, t4Var));
        this.f23241q = new t4<>(new o(context));
        this.f23242r = new t4<>(new p(context));
        this.f23243s = new t4<>(new q(context));
        this.f23244t = new t4<>(new r(context));
        this.f23245u = new t4<>(new s(context));
        this.f23246v = new t4<>(new t(context));
        this.f23247w = new t4<>(new v(context));
        this.f23248x = new t4<>(new w());
        this.f23249y = t4Var2;
        this.f23250z = t4Var2;
        this.A = t4Var2;
        this.B = new t4<>(new x());
        this.C = new t4<>(new y());
        this.D = new t4<>(new z());
        this.E = new t4<>(new a0(context));
        this.F = new t4<>(new b0(context));
        this.G = new t4<>(new c0(context));
        this.H = new t4<>(new d0(context));
        this.I = new t4<>(new e0(context));
        this.K = new t4<>(new g0(context));
        this.L = new t4<>(new h0());
        this.M = new t4<>(new i0(context));
        this.N = new t4<>(new j0());
        this.O = new t4<>(new k0());
        this.P = new t4<>(new l0(context));
        this.Q = new t4<>(new m0(context));
    }

    public static a a(Context context) {
        j jVar = R;
        a aVar = jVar.f22411a;
        if (aVar == null) {
            synchronized (jVar) {
                aVar = jVar.f22411a;
                if (aVar == null) {
                    Context a10 = com.startapp.f0.a(context);
                    if (a10 != null) {
                        context = a10;
                    }
                    aVar = new a(context);
                    jVar.f22411a = aVar;
                }
            }
        }
        return aVar;
    }

    public final t4<com.startapp.w> b() {
        return this.f23239o;
    }

    public final t4<v1> c() {
        return this.f23233i;
    }

    public final t4<l7> d() {
        return this.f23244t;
    }

    public final t4<gb> e() {
        return this.f23225a;
    }

    public static ExecutorService a(int i10, String str, long j10) {
        if (Build.VERSION.SDK_INT < 21) {
            if (i10 < 2) {
                return Executors.newSingleThreadExecutor(new s1(str));
            }
            return Executors.newCachedThreadPool(new s1(str));
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, i10, j10, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() { // from class: com.startapp.sdk.components.ComponentLocator$47
            @Override // java.util.concurrent.LinkedTransferQueue, java.util.Queue, java.util.concurrent.BlockingQueue
            public final boolean offer(Object obj) {
                return tryTransfer((Runnable) obj);
            }
        }, new s1(str), new r1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static s1 a() {
        return new s1("scheduler");
    }
}
