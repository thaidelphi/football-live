package com.google.android.exoplayer2.source.dash;

import a5.g0;
import a5.p0;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.e;
import com.unity3d.services.core.di.ServiceProvider;
import e4.a0;
import e4.p;
import e4.q;
import e4.t;
import i4.j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.h2;
import n3.j1;
import n3.l3;
import n3.u1;
import r3.o;
import z4.i0;
import z4.j0;
import z4.k0;
import z4.l;
import z4.m0;
import z4.s0;
import z4.y;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class DashMediaSource extends e4.a {
    private j0 A;
    private s0 B;
    private IOException C;
    private Handler D;
    private u1.g E;
    private Uri F;
    private Uri G;
    private i4.c H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long N;
    private int O;

    /* renamed from: h  reason: collision with root package name */
    private final u1 f10654h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f10655i;

    /* renamed from: j  reason: collision with root package name */
    private final l.a f10656j;

    /* renamed from: k  reason: collision with root package name */
    private final a.InterfaceC0173a f10657k;

    /* renamed from: l  reason: collision with root package name */
    private final e4.g f10658l;

    /* renamed from: m  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.l f10659m;

    /* renamed from: n  reason: collision with root package name */
    private final i0 f10660n;

    /* renamed from: o  reason: collision with root package name */
    private final h4.b f10661o;

    /* renamed from: p  reason: collision with root package name */
    private final long f10662p;

    /* renamed from: q  reason: collision with root package name */
    private final a0.a f10663q;

    /* renamed from: r  reason: collision with root package name */
    private final m0.a<? extends i4.c> f10664r;

    /* renamed from: s  reason: collision with root package name */
    private final e f10665s;

    /* renamed from: t  reason: collision with root package name */
    private final Object f10666t;

    /* renamed from: u  reason: collision with root package name */
    private final SparseArray<com.google.android.exoplayer2.source.dash.b> f10667u;

    /* renamed from: v  reason: collision with root package name */
    private final Runnable f10668v;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f10669w;

    /* renamed from: x  reason: collision with root package name */
    private final e.b f10670x;

    /* renamed from: y  reason: collision with root package name */
    private final k0 f10671y;

    /* renamed from: z  reason: collision with root package name */
    private l f10672z;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Factory implements t.a {

        /* renamed from: a  reason: collision with root package name */
        private final a.InterfaceC0173a f10673a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f10674b;

        /* renamed from: c  reason: collision with root package name */
        private o f10675c;

        /* renamed from: d  reason: collision with root package name */
        private e4.g f10676d;

        /* renamed from: e  reason: collision with root package name */
        private i0 f10677e;

        /* renamed from: f  reason: collision with root package name */
        private long f10678f;

        /* renamed from: g  reason: collision with root package name */
        private m0.a<? extends i4.c> f10679g;

        public Factory(l.a aVar) {
            this(new c.a(aVar), aVar);
        }

        public DashMediaSource a(u1 u1Var) {
            a5.a.e(u1Var.f28373b);
            m0.a aVar = this.f10679g;
            if (aVar == null) {
                aVar = new i4.d();
            }
            List<StreamKey> list = u1Var.f28373b.f28441e;
            return new DashMediaSource(u1Var, null, this.f10674b, !list.isEmpty() ? new d4.b(aVar, list) : aVar, this.f10673a, this.f10676d, this.f10675c.a(u1Var), this.f10677e, this.f10678f, null);
        }

        public Factory(a.InterfaceC0173a interfaceC0173a, l.a aVar) {
            this.f10673a = (a.InterfaceC0173a) a5.a.e(interfaceC0173a);
            this.f10674b = aVar;
            this.f10675c = new i();
            this.f10677e = new y();
            this.f10678f = 30000L;
            this.f10676d = new e4.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements g0.b {
        a() {
        }

        @Override // a5.g0.b
        public void a(IOException iOException) {
            DashMediaSource.this.Z(iOException);
        }

        @Override // a5.g0.b
        public void b() {
            DashMediaSource.this.a0(g0.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends l3 {

        /* renamed from: c  reason: collision with root package name */
        private final long f10681c;

        /* renamed from: d  reason: collision with root package name */
        private final long f10682d;

        /* renamed from: e  reason: collision with root package name */
        private final long f10683e;

        /* renamed from: f  reason: collision with root package name */
        private final int f10684f;

        /* renamed from: g  reason: collision with root package name */
        private final long f10685g;

        /* renamed from: h  reason: collision with root package name */
        private final long f10686h;

        /* renamed from: i  reason: collision with root package name */
        private final long f10687i;

        /* renamed from: j  reason: collision with root package name */
        private final i4.c f10688j;

        /* renamed from: k  reason: collision with root package name */
        private final u1 f10689k;

        /* renamed from: l  reason: collision with root package name */
        private final u1.g f10690l;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, i4.c cVar, u1 u1Var, u1.g gVar) {
            a5.a.f(cVar.f26522d == (gVar != null));
            this.f10681c = j10;
            this.f10682d = j11;
            this.f10683e = j12;
            this.f10684f = i10;
            this.f10685g = j13;
            this.f10686h = j14;
            this.f10687i = j15;
            this.f10688j = cVar;
            this.f10689k = u1Var;
            this.f10690l = gVar;
        }

        private long x(long j10) {
            h4.f l10;
            long j11 = this.f10687i;
            if (y(this.f10688j)) {
                if (j10 > 0) {
                    j11 += j10;
                    if (j11 > this.f10686h) {
                        return -9223372036854775807L;
                    }
                }
                long j12 = this.f10685g + j11;
                long g10 = this.f10688j.g(0);
                int i10 = 0;
                while (i10 < this.f10688j.e() - 1 && j12 >= g10) {
                    j12 -= g10;
                    i10++;
                    g10 = this.f10688j.g(i10);
                }
                i4.g d10 = this.f10688j.d(i10);
                int a10 = d10.a(2);
                return (a10 == -1 || (l10 = d10.f26556c.get(a10).f26511c.get(0).l()) == null || l10.g(g10) == 0) ? j11 : (j11 + l10.a(l10.f(j12, g10))) - j12;
            }
            return j11;
        }

        private static boolean y(i4.c cVar) {
            return cVar.f26522d && cVar.f26523e != -9223372036854775807L && cVar.f26520b == -9223372036854775807L;
        }

        @Override // n3.l3
        public int f(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f10684f) >= 0 && intValue < m()) {
                return intValue;
            }
            return -1;
        }

        @Override // n3.l3
        public l3.b k(int i10, l3.b bVar, boolean z10) {
            a5.a.c(i10, 0, m());
            return bVar.v(z10 ? this.f10688j.d(i10).f26554a : null, z10 ? Integer.valueOf(this.f10684f + i10) : null, 0, this.f10688j.g(i10), p0.C0(this.f10688j.d(i10).f26555b - this.f10688j.d(0).f26555b) - this.f10685g);
        }

        @Override // n3.l3
        public int m() {
            return this.f10688j.e();
        }

        @Override // n3.l3
        public Object q(int i10) {
            a5.a.c(i10, 0, m());
            return Integer.valueOf(this.f10684f + i10);
        }

        @Override // n3.l3
        public l3.d s(int i10, l3.d dVar, long j10) {
            a5.a.c(i10, 0, 1);
            long x10 = x(j10);
            Object obj = l3.d.f28142r;
            u1 u1Var = this.f10689k;
            i4.c cVar = this.f10688j;
            return dVar.i(obj, u1Var, cVar, this.f10681c, this.f10682d, this.f10683e, true, y(cVar), this.f10690l, x10, this.f10686h, 0, m() - 1, this.f10685g);
        }

        @Override // n3.l3
        public int t() {
            return 1;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class c implements e.b {
        private c() {
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void a(long j10) {
            DashMediaSource.this.S(j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void b() {
            DashMediaSource.this.T();
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d implements m0.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f10692a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // z4.m0.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, x5.b.f32750c)).readLine();
            try {
                Matcher matcher = f10692a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                        long parseLong = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        time -= j10 * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000);
                    }
                    return Long.valueOf(time);
                }
                throw h2.c("Couldn't parse timestamp: " + readLine, null);
            } catch (ParseException e8) {
                throw h2.c(null, e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class e implements j0.b<m0<i4.c>> {
        private e() {
        }

        @Override // z4.j0.b
        /* renamed from: a */
        public void m(m0<i4.c> m0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.U(m0Var, j10, j11);
        }

        @Override // z4.j0.b
        /* renamed from: b */
        public void i(m0<i4.c> m0Var, long j10, long j11) {
            DashMediaSource.this.V(m0Var, j10, j11);
        }

        @Override // z4.j0.b
        /* renamed from: c */
        public j0.c s(m0<i4.c> m0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.W(m0Var, j10, j11, iOException, i10);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    final class f implements k0 {
        f() {
        }

        private void b() throws IOException {
            if (DashMediaSource.this.C != null) {
                throw DashMediaSource.this.C;
            }
        }

        @Override // z4.k0
        public void a() throws IOException {
            DashMediaSource.this.A.a();
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class g implements j0.b<m0<Long>> {
        private g() {
        }

        @Override // z4.j0.b
        /* renamed from: a */
        public void m(m0<Long> m0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.U(m0Var, j10, j11);
        }

        @Override // z4.j0.b
        /* renamed from: b */
        public void i(m0<Long> m0Var, long j10, long j11) {
            DashMediaSource.this.X(m0Var, j10, j11);
        }

        @Override // z4.j0.b
        /* renamed from: c */
        public j0.c s(m0<Long> m0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.Y(m0Var, j10, j11, iOException);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class h implements m0.a<Long> {
        private h() {
        }

        @Override // z4.m0.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(p0.J0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        j1.a("goog.exo.dash");
    }

    /* synthetic */ DashMediaSource(u1 u1Var, i4.c cVar, l.a aVar, m0.a aVar2, a.InterfaceC0173a interfaceC0173a, e4.g gVar, com.google.android.exoplayer2.drm.l lVar, i0 i0Var, long j10, a aVar3) {
        this(u1Var, cVar, aVar, aVar2, interfaceC0173a, gVar, lVar, i0Var, j10);
    }

    private static long K(i4.g gVar, long j10, long j11) {
        long C0 = p0.C0(gVar.f26555b);
        boolean O = O(gVar);
        long j12 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f26556c.size(); i10++) {
            i4.a aVar = gVar.f26556c.get(i10);
            List<j> list = aVar.f26511c;
            if ((!O || aVar.f26510b != 3) && !list.isEmpty()) {
                h4.f l10 = list.get(0).l();
                if (l10 == null) {
                    return C0 + j10;
                }
                long j13 = l10.j(j10, j11);
                if (j13 == 0) {
                    return C0;
                }
                long c10 = (l10.c(j10, j11) + j13) - 1;
                j12 = Math.min(j12, l10.b(c10, j10) + l10.a(c10) + C0);
            }
        }
        return j12;
    }

    private static long L(i4.g gVar, long j10, long j11) {
        long C0 = p0.C0(gVar.f26555b);
        boolean O = O(gVar);
        long j12 = C0;
        for (int i10 = 0; i10 < gVar.f26556c.size(); i10++) {
            i4.a aVar = gVar.f26556c.get(i10);
            List<j> list = aVar.f26511c;
            if ((!O || aVar.f26510b != 3) && !list.isEmpty()) {
                h4.f l10 = list.get(0).l();
                if (l10 == null || l10.j(j10, j11) == 0) {
                    return C0;
                }
                j12 = Math.max(j12, l10.a(l10.c(j10, j11)) + C0);
            }
        }
        return j12;
    }

    private static long M(i4.c cVar, long j10) {
        h4.f l10;
        int e8 = cVar.e() - 1;
        i4.g d10 = cVar.d(e8);
        long C0 = p0.C0(d10.f26555b);
        long g10 = cVar.g(e8);
        long C02 = p0.C0(j10);
        long C03 = p0.C0(cVar.f26519a);
        long C04 = p0.C0(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        for (int i10 = 0; i10 < d10.f26556c.size(); i10++) {
            List<j> list = d10.f26556c.get(i10).f26511c;
            if (!list.isEmpty() && (l10 = list.get(0).l()) != null) {
                long d11 = ((C03 + C0) + l10.d(g10, C02)) - C02;
                if (d11 < C04 - 100000 || (d11 > C04 && d11 < C04 + 100000)) {
                    C04 = d11;
                }
            }
        }
        return z5.b.a(C04, 1000L, RoundingMode.CEILING);
    }

    private long N() {
        return Math.min((this.M - 1) * 1000, 5000);
    }

    private static boolean O(i4.g gVar) {
        for (int i10 = 0; i10 < gVar.f26556c.size(); i10++) {
            int i11 = gVar.f26556c.get(i10).f26510b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean P(i4.g gVar) {
        for (int i10 = 0; i10 < gVar.f26556c.size(); i10++) {
            h4.f l10 = gVar.f26556c.get(i10).f26511c.get(0).l();
            if (l10 == null || l10.h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        b0(false);
    }

    private void R() {
        g0.j(this.A, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(IOException iOException) {
        a5.t.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        b0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(long j10) {
        this.L = j10;
        b0(true);
    }

    private void b0(boolean z10) {
        i4.g gVar;
        long j10;
        long j11;
        for (int i10 = 0; i10 < this.f10667u.size(); i10++) {
            int keyAt = this.f10667u.keyAt(i10);
            if (keyAt >= this.O) {
                this.f10667u.valueAt(i10).L(this.H, keyAt - this.O);
            }
        }
        i4.g d10 = this.H.d(0);
        int e8 = this.H.e() - 1;
        i4.g d11 = this.H.d(e8);
        long g10 = this.H.g(e8);
        long C0 = p0.C0(p0.Z(this.L));
        long L = L(d10, this.H.g(0), C0);
        long K = K(d11, g10, C0);
        boolean z11 = this.H.f26522d && !P(d11);
        if (z11) {
            long j12 = this.H.f26524f;
            if (j12 != -9223372036854775807L) {
                L = Math.max(L, K - p0.C0(j12));
            }
        }
        long j13 = K - L;
        i4.c cVar = this.H;
        if (cVar.f26522d) {
            a5.a.f(cVar.f26519a != -9223372036854775807L);
            long C02 = (C0 - p0.C0(this.H.f26519a)) - L;
            i0(C02, j13);
            long Z0 = this.H.f26519a + p0.Z0(L);
            long C03 = C02 - p0.C0(this.E.f28427a);
            long min = Math.min(5000000L, j13 / 2);
            j10 = Z0;
            j11 = C03 < min ? min : C03;
            gVar = d10;
        } else {
            gVar = d10;
            j10 = -9223372036854775807L;
            j11 = 0;
        }
        long C04 = L - p0.C0(gVar.f26555b);
        i4.c cVar2 = this.H;
        C(new b(cVar2.f26519a, j10, this.L, this.O, C04, j13, j11, cVar2, this.f10654h, cVar2.f26522d ? this.E : null));
        if (this.f10655i) {
            return;
        }
        this.D.removeCallbacks(this.f10669w);
        if (z11) {
            this.D.postDelayed(this.f10669w, M(this.H, p0.Z(this.L)));
        }
        if (this.I) {
            h0();
        } else if (z10) {
            i4.c cVar3 = this.H;
            if (cVar3.f26522d) {
                long j14 = cVar3.f26523e;
                if (j14 != -9223372036854775807L) {
                    if (j14 == 0) {
                        j14 = ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;
                    }
                    f0(Math.max(0L, (this.J + j14) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void c0(i4.o oVar) {
        String str = oVar.f26609a;
        if (!p0.c(str, "urn:mpeg:dash:utc:direct:2014") && !p0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            if (!p0.c(str, "urn:mpeg:dash:utc:http-iso:2014") && !p0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                if (!p0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !p0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    if (!p0.c(str, "urn:mpeg:dash:utc:ntp:2014") && !p0.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
                        Z(new IOException("Unsupported UTC timing scheme"));
                        return;
                    } else {
                        R();
                        return;
                    }
                }
                e0(oVar, new h(null));
                return;
            }
            e0(oVar, new d());
            return;
        }
        d0(oVar);
    }

    private void d0(i4.o oVar) {
        try {
            a0(p0.J0(oVar.f26610b) - this.K);
        } catch (h2 e8) {
            Z(e8);
        }
    }

    private void e0(i4.o oVar, m0.a<Long> aVar) {
        g0(new m0(this.f10672z, Uri.parse(oVar.f26610b), 5, aVar), new g(this, null), 1);
    }

    private void f0(long j10) {
        this.D.postDelayed(this.f10668v, j10);
    }

    private <T> void g0(m0<T> m0Var, j0.b<m0<T>> bVar, int i10) {
        this.f10663q.z(new e4.l(m0Var.f33549a, m0Var.f33550b, this.A.n(m0Var, bVar, i10)), m0Var.f33551c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        Uri uri;
        this.D.removeCallbacks(this.f10668v);
        if (this.A.i()) {
            return;
        }
        if (this.A.j()) {
            this.I = true;
            return;
        }
        synchronized (this.f10666t) {
            uri = this.F;
        }
        this.I = false;
        g0(new m0(this.f10672z, uri, 4, this.f10664r), this.f10665s, this.f10660n.a(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i0(long r18, long r20) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.i0(long, long):void");
    }

    @Override // e4.a
    protected void B(s0 s0Var) {
        this.B = s0Var;
        this.f10659m.a();
        this.f10659m.e(Looper.myLooper(), z());
        if (this.f10655i) {
            b0(false);
            return;
        }
        this.f10672z = this.f10656j.a();
        this.A = new j0("DashMediaSource");
        this.D = p0.v();
        h0();
    }

    @Override // e4.a
    protected void D() {
        this.I = false;
        this.f10672z = null;
        j0 j0Var = this.A;
        if (j0Var != null) {
            j0Var.l();
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.f10655i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.f10667u.clear();
        this.f10661o.i();
        this.f10659m.release();
    }

    void S(long j10) {
        long j11 = this.N;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.N = j10;
        }
    }

    void T() {
        this.D.removeCallbacks(this.f10669w);
        h0();
    }

    void U(m0<?> m0Var, long j10, long j11) {
        e4.l lVar = new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c());
        this.f10660n.c(m0Var.f33549a);
        this.f10663q.q(lVar, m0Var.f33551c);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void V(z4.m0<i4.c> r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.V(z4.m0, long, long):void");
    }

    j0.c W(m0<i4.c> m0Var, long j10, long j11, IOException iOException, int i10) {
        j0.c h10;
        e4.l lVar = new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c());
        long b10 = this.f10660n.b(new i0.c(lVar, new p(m0Var.f33551c), iOException, i10));
        if (b10 == -9223372036854775807L) {
            h10 = j0.f33524g;
        } else {
            h10 = j0.h(false, b10);
        }
        boolean z10 = !h10.c();
        this.f10663q.x(lVar, m0Var.f33551c, iOException, z10);
        if (z10) {
            this.f10660n.c(m0Var.f33549a);
        }
        return h10;
    }

    void X(m0<Long> m0Var, long j10, long j11) {
        e4.l lVar = new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c());
        this.f10660n.c(m0Var.f33549a);
        this.f10663q.t(lVar, m0Var.f33551c);
        a0(m0Var.e().longValue() - j10);
    }

    j0.c Y(m0<Long> m0Var, long j10, long j11, IOException iOException) {
        this.f10663q.x(new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c()), m0Var.f33551c, iOException, true);
        this.f10660n.c(m0Var.f33549a);
        Z(iOException);
        return j0.f33523f;
    }

    @Override // e4.t
    public u1 a() {
        return this.f10654h;
    }

    @Override // e4.t
    public q d(t.b bVar, z4.b bVar2, long j10) {
        int intValue = ((Integer) bVar.f25139a).intValue() - this.O;
        a0.a w10 = w(bVar, this.H.d(intValue).f26555b);
        com.google.android.exoplayer2.source.dash.b bVar3 = new com.google.android.exoplayer2.source.dash.b(intValue + this.O, this.H, this.f10661o, intValue, this.f10657k, this.B, this.f10659m, t(bVar), this.f10660n, w10, this.L, this.f10671y, bVar2, this.f10658l, this.f10670x, z());
        this.f10667u.put(bVar3.f10698a, bVar3);
        return bVar3;
    }

    @Override // e4.t
    public void g(q qVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) qVar;
        bVar.H();
        this.f10667u.remove(bVar.f10698a);
    }

    @Override // e4.t
    public void k() throws IOException {
        this.f10671y.a();
    }

    private DashMediaSource(u1 u1Var, i4.c cVar, l.a aVar, m0.a<? extends i4.c> aVar2, a.InterfaceC0173a interfaceC0173a, e4.g gVar, com.google.android.exoplayer2.drm.l lVar, i0 i0Var, long j10) {
        this.f10654h = u1Var;
        this.E = u1Var.f28375d;
        this.F = ((u1.h) a5.a.e(u1Var.f28373b)).f28437a;
        this.G = u1Var.f28373b.f28437a;
        this.H = cVar;
        this.f10656j = aVar;
        this.f10664r = aVar2;
        this.f10657k = interfaceC0173a;
        this.f10659m = lVar;
        this.f10660n = i0Var;
        this.f10662p = j10;
        this.f10658l = gVar;
        this.f10661o = new h4.b();
        boolean z10 = cVar != null;
        this.f10655i = z10;
        this.f10663q = v(null);
        this.f10666t = new Object();
        this.f10667u = new SparseArray<>();
        this.f10670x = new c(this, null);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        if (z10) {
            a5.a.f(true ^ cVar.f26522d);
            this.f10665s = null;
            this.f10668v = null;
            this.f10669w = null;
            this.f10671y = new k0.a();
            return;
        }
        this.f10665s = new e(this, null);
        this.f10671y = new f();
        this.f10668v = new Runnable() { // from class: h4.d
            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.this.h0();
            }
        };
        this.f10669w = new Runnable() { // from class: h4.e
            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.this.Q();
            }
        };
    }
}
