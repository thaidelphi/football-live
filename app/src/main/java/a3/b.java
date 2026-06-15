package a3;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.b9;
import com.ironsource.fe;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.io.IOException;
/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b implements k6.a {

    /* renamed from: a  reason: collision with root package name */
    public static final k6.a f236a = new b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a implements j6.d<a3.a> {

        /* renamed from: a  reason: collision with root package name */
        static final a f237a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final j6.c f238b = j6.c.d("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        private static final j6.c f239c = j6.c.d(fe.B);

        /* renamed from: d  reason: collision with root package name */
        private static final j6.c f240d = j6.c.d("hardware");

        /* renamed from: e  reason: collision with root package name */
        private static final j6.c f241e = j6.c.d(b9.h.G);

        /* renamed from: f  reason: collision with root package name */
        private static final j6.c f242f = j6.c.d(AppLovinEventTypes.USER_VIEWED_PRODUCT);

        /* renamed from: g  reason: collision with root package name */
        private static final j6.c f243g = j6.c.d("osBuild");

        /* renamed from: h  reason: collision with root package name */
        private static final j6.c f244h = j6.c.d("manufacturer");

        /* renamed from: i  reason: collision with root package name */
        private static final j6.c f245i = j6.c.d("fingerprint");

        /* renamed from: j  reason: collision with root package name */
        private static final j6.c f246j = j6.c.d("locale");

        /* renamed from: k  reason: collision with root package name */
        private static final j6.c f247k = j6.c.d(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY);

        /* renamed from: l  reason: collision with root package name */
        private static final j6.c f248l = j6.c.d("mccMnc");

        /* renamed from: m  reason: collision with root package name */
        private static final j6.c f249m = j6.c.d("applicationBuild");

        private a() {
        }

        @Override // j6.d
        /* renamed from: b */
        public void a(a3.a aVar, j6.e eVar) throws IOException {
            eVar.d(f238b, aVar.m());
            eVar.d(f239c, aVar.j());
            eVar.d(f240d, aVar.f());
            eVar.d(f241e, aVar.d());
            eVar.d(f242f, aVar.l());
            eVar.d(f243g, aVar.k());
            eVar.d(f244h, aVar.h());
            eVar.d(f245i, aVar.e());
            eVar.d(f246j, aVar.g());
            eVar.d(f247k, aVar.c());
            eVar.d(f248l, aVar.i());
            eVar.d(f249m, aVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: a3.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class C0008b implements j6.d<j> {

        /* renamed from: a  reason: collision with root package name */
        static final C0008b f250a = new C0008b();

        /* renamed from: b  reason: collision with root package name */
        private static final j6.c f251b = j6.c.d("logRequest");

        private C0008b() {
        }

        @Override // j6.d
        /* renamed from: b */
        public void a(j jVar, j6.e eVar) throws IOException {
            eVar.d(f251b, jVar.c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class c implements j6.d<k> {

        /* renamed from: a  reason: collision with root package name */
        static final c f252a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final j6.c f253b = j6.c.d("clientType");

        /* renamed from: c  reason: collision with root package name */
        private static final j6.c f254c = j6.c.d("androidClientInfo");

        private c() {
        }

        @Override // j6.d
        /* renamed from: b */
        public void a(k kVar, j6.e eVar) throws IOException {
            eVar.d(f253b, kVar.c());
            eVar.d(f254c, kVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class d implements j6.d<l> {

        /* renamed from: a  reason: collision with root package name */
        static final d f255a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final j6.c f256b = j6.c.d("eventTimeMs");

        /* renamed from: c  reason: collision with root package name */
        private static final j6.c f257c = j6.c.d("eventCode");

        /* renamed from: d  reason: collision with root package name */
        private static final j6.c f258d = j6.c.d("eventUptimeMs");

        /* renamed from: e  reason: collision with root package name */
        private static final j6.c f259e = j6.c.d("sourceExtension");

        /* renamed from: f  reason: collision with root package name */
        private static final j6.c f260f = j6.c.d("sourceExtensionJsonProto3");

        /* renamed from: g  reason: collision with root package name */
        private static final j6.c f261g = j6.c.d("timezoneOffsetSeconds");

        /* renamed from: h  reason: collision with root package name */
        private static final j6.c f262h = j6.c.d("networkConnectionInfo");

        private d() {
        }

        @Override // j6.d
        /* renamed from: b */
        public void a(l lVar, j6.e eVar) throws IOException {
            eVar.b(f256b, lVar.c());
            eVar.d(f257c, lVar.b());
            eVar.b(f258d, lVar.d());
            eVar.d(f259e, lVar.f());
            eVar.d(f260f, lVar.g());
            eVar.b(f261g, lVar.h());
            eVar.d(f262h, lVar.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class e implements j6.d<m> {

        /* renamed from: a  reason: collision with root package name */
        static final e f263a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final j6.c f264b = j6.c.d("requestTimeMs");

        /* renamed from: c  reason: collision with root package name */
        private static final j6.c f265c = j6.c.d("requestUptimeMs");

        /* renamed from: d  reason: collision with root package name */
        private static final j6.c f266d = j6.c.d("clientInfo");

        /* renamed from: e  reason: collision with root package name */
        private static final j6.c f267e = j6.c.d("logSource");

        /* renamed from: f  reason: collision with root package name */
        private static final j6.c f268f = j6.c.d("logSourceName");

        /* renamed from: g  reason: collision with root package name */
        private static final j6.c f269g = j6.c.d("logEvent");

        /* renamed from: h  reason: collision with root package name */
        private static final j6.c f270h = j6.c.d("qosTier");

        private e() {
        }

        @Override // j6.d
        /* renamed from: b */
        public void a(m mVar, j6.e eVar) throws IOException {
            eVar.b(f264b, mVar.g());
            eVar.b(f265c, mVar.h());
            eVar.d(f266d, mVar.b());
            eVar.d(f267e, mVar.d());
            eVar.d(f268f, mVar.e());
            eVar.d(f269g, mVar.c());
            eVar.d(f270h, mVar.f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class f implements j6.d<o> {

        /* renamed from: a  reason: collision with root package name */
        static final f f271a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final j6.c f272b = j6.c.d("networkType");

        /* renamed from: c  reason: collision with root package name */
        private static final j6.c f273c = j6.c.d("mobileSubtype");

        private f() {
        }

        @Override // j6.d
        /* renamed from: b */
        public void a(o oVar, j6.e eVar) throws IOException {
            eVar.d(f272b, oVar.c());
            eVar.d(f273c, oVar.b());
        }
    }

    private b() {
    }

    @Override // k6.a
    public void a(k6.b<?> bVar) {
        C0008b c0008b = C0008b.f250a;
        bVar.a(j.class, c0008b);
        bVar.a(a3.d.class, c0008b);
        e eVar = e.f263a;
        bVar.a(m.class, eVar);
        bVar.a(g.class, eVar);
        c cVar = c.f252a;
        bVar.a(k.class, cVar);
        bVar.a(a3.e.class, cVar);
        a aVar = a.f237a;
        bVar.a(a3.a.class, aVar);
        bVar.a(a3.c.class, aVar);
        d dVar = d.f255a;
        bVar.a(l.class, dVar);
        bVar.a(a3.f.class, dVar);
        f fVar = f.f271a;
        bVar.a(o.class, fVar);
        bVar.a(i.class, fVar);
    }
}
