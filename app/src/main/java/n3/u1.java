package n3;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import n3.h;
import n3.u1;
import y5.q;
/* compiled from: MediaItem.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u1 implements n3.h {

    /* renamed from: i  reason: collision with root package name */
    public static final u1 f28370i = new c().a();

    /* renamed from: j  reason: collision with root package name */
    public static final h.a<u1> f28371j = new h.a() { // from class: n3.t1
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            u1 b10;
            b10 = u1.b(bundle);
            return b10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f28372a;

    /* renamed from: b  reason: collision with root package name */
    public final h f28373b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final i f28374c;

    /* renamed from: d  reason: collision with root package name */
    public final g f28375d;

    /* renamed from: e  reason: collision with root package name */
    public final z1 f28376e;

    /* renamed from: f  reason: collision with root package name */
    public final d f28377f;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public final e f28378g;

    /* renamed from: h  reason: collision with root package name */
    public final j f28379h;

    /* compiled from: MediaItem.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {
    }

    /* compiled from: MediaItem.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f28380a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f28381b;

        /* renamed from: c  reason: collision with root package name */
        private String f28382c;

        /* renamed from: g  reason: collision with root package name */
        private String f28386g;

        /* renamed from: i  reason: collision with root package name */
        private b f28388i;

        /* renamed from: j  reason: collision with root package name */
        private Object f28389j;

        /* renamed from: k  reason: collision with root package name */
        private z1 f28390k;

        /* renamed from: d  reason: collision with root package name */
        private d.a f28383d = new d.a();

        /* renamed from: e  reason: collision with root package name */
        private f.a f28384e = new f.a();

        /* renamed from: f  reason: collision with root package name */
        private List<StreamKey> f28385f = Collections.emptyList();

        /* renamed from: h  reason: collision with root package name */
        private y5.q<l> f28387h = y5.q.p();

        /* renamed from: l  reason: collision with root package name */
        private g.a f28391l = new g.a();

        /* renamed from: m  reason: collision with root package name */
        private j f28392m = j.f28446d;

        public u1 a() {
            i iVar;
            a5.a.f(this.f28384e.f28418b == null || this.f28384e.f28417a != null);
            Uri uri = this.f28381b;
            if (uri != null) {
                iVar = new i(uri, this.f28382c, this.f28384e.f28417a != null ? this.f28384e.i() : null, this.f28388i, this.f28385f, this.f28386g, this.f28387h, this.f28389j);
            } else {
                iVar = null;
            }
            String str = this.f28380a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e g10 = this.f28383d.g();
            g f10 = this.f28391l.f();
            z1 z1Var = this.f28390k;
            if (z1Var == null) {
                z1Var = z1.G;
            }
            return new u1(str2, g10, iVar, f10, z1Var, this.f28392m);
        }

        public c b(f fVar) {
            this.f28384e = fVar != null ? fVar.b() : new f.a();
            return this;
        }

        public c c(String str) {
            this.f28380a = (String) a5.a.e(str);
            return this;
        }

        public c d(String str) {
            this.f28382c = str;
            return this;
        }

        public c e(Object obj) {
            this.f28389j = obj;
            return this;
        }

        public c f(Uri uri) {
            this.f28381b = uri;
            return this;
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d implements n3.h {

        /* renamed from: f  reason: collision with root package name */
        public static final d f28393f = new a().f();

        /* renamed from: g  reason: collision with root package name */
        public static final h.a<e> f28394g = new h.a() { // from class: n3.v1
            @Override // n3.h.a
            public final h a(Bundle bundle) {
                u1.e c10;
                c10 = u1.d.c(bundle);
                return c10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final long f28395a;

        /* renamed from: b  reason: collision with root package name */
        public final long f28396b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f28397c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f28398d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f28399e;

        /* compiled from: MediaItem.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private long f28400a;

            /* renamed from: b  reason: collision with root package name */
            private long f28401b = Long.MIN_VALUE;

            /* renamed from: c  reason: collision with root package name */
            private boolean f28402c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f28403d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f28404e;

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a h(long j10) {
                a5.a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f28401b = j10;
                return this;
            }

            public a i(boolean z10) {
                this.f28403d = z10;
                return this;
            }

            public a j(boolean z10) {
                this.f28402c = z10;
                return this;
            }

            public a k(long j10) {
                a5.a.a(j10 >= 0);
                this.f28400a = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f28404e = z10;
                return this;
            }
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e c(Bundle bundle) {
            return new a().k(bundle.getLong(b(0), 0L)).h(bundle.getLong(b(1), Long.MIN_VALUE)).j(bundle.getBoolean(b(2), false)).i(bundle.getBoolean(b(3), false)).l(bundle.getBoolean(b(4), false)).g();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f28395a == dVar.f28395a && this.f28396b == dVar.f28396b && this.f28397c == dVar.f28397c && this.f28398d == dVar.f28398d && this.f28399e == dVar.f28399e;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f28395a;
            long j11 = this.f28396b;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f28397c ? 1 : 0)) * 31) + (this.f28398d ? 1 : 0)) * 31) + (this.f28399e ? 1 : 0);
        }

        private d(a aVar) {
            this.f28395a = aVar.f28400a;
            this.f28396b = aVar.f28401b;
            this.f28397c = aVar.f28402c;
            this.f28398d = aVar.f28403d;
            this.f28399e = aVar.f28404e;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e extends d {

        /* renamed from: h  reason: collision with root package name */
        public static final e f28405h = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f28406a;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public final UUID f28407b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f28408c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public final y5.r<String, String> f28409d;

        /* renamed from: e  reason: collision with root package name */
        public final y5.r<String, String> f28410e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f28411f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f28412g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f28413h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public final y5.q<Integer> f28414i;

        /* renamed from: j  reason: collision with root package name */
        public final y5.q<Integer> f28415j;

        /* renamed from: k  reason: collision with root package name */
        private final byte[] f28416k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f28416k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return this.f28406a.equals(fVar.f28406a) && a5.p0.c(this.f28408c, fVar.f28408c) && a5.p0.c(this.f28410e, fVar.f28410e) && this.f28411f == fVar.f28411f && this.f28413h == fVar.f28413h && this.f28412g == fVar.f28412g && this.f28415j.equals(fVar.f28415j) && Arrays.equals(this.f28416k, fVar.f28416k);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f28406a.hashCode() * 31;
            Uri uri = this.f28408c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f28410e.hashCode()) * 31) + (this.f28411f ? 1 : 0)) * 31) + (this.f28413h ? 1 : 0)) * 31) + (this.f28412g ? 1 : 0)) * 31) + this.f28415j.hashCode()) * 31) + Arrays.hashCode(this.f28416k);
        }

        /* compiled from: MediaItem.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private UUID f28417a;

            /* renamed from: b  reason: collision with root package name */
            private Uri f28418b;

            /* renamed from: c  reason: collision with root package name */
            private y5.r<String, String> f28419c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f28420d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f28421e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f28422f;

            /* renamed from: g  reason: collision with root package name */
            private y5.q<Integer> f28423g;

            /* renamed from: h  reason: collision with root package name */
            private byte[] f28424h;

            public f i() {
                return new f(this);
            }

            public a j(Map<String, String> map) {
                this.f28419c = y5.r.c(map);
                return this;
            }

            public a k(Uri uri) {
                this.f28418b = uri;
                return this;
            }

            public a l(boolean z10) {
                this.f28420d = z10;
                return this;
            }

            public a(UUID uuid) {
                this.f28417a = uuid;
                this.f28419c = y5.r.j();
                this.f28423g = y5.q.p();
            }

            @Deprecated
            private a() {
                this.f28419c = y5.r.j();
                this.f28423g = y5.q.p();
            }

            private a(f fVar) {
                this.f28417a = fVar.f28406a;
                this.f28418b = fVar.f28408c;
                this.f28419c = fVar.f28410e;
                this.f28420d = fVar.f28411f;
                this.f28421e = fVar.f28412g;
                this.f28422f = fVar.f28413h;
                this.f28423g = fVar.f28415j;
                this.f28424h = fVar.f28416k;
            }
        }

        private f(a aVar) {
            a5.a.f((aVar.f28422f && aVar.f28418b == null) ? false : true);
            UUID uuid = (UUID) a5.a.e(aVar.f28417a);
            this.f28406a = uuid;
            this.f28407b = uuid;
            this.f28408c = aVar.f28418b;
            this.f28409d = aVar.f28419c;
            this.f28410e = aVar.f28419c;
            this.f28411f = aVar.f28420d;
            this.f28413h = aVar.f28422f;
            this.f28412g = aVar.f28421e;
            this.f28414i = aVar.f28423g;
            this.f28415j = aVar.f28423g;
            this.f28416k = aVar.f28424h != null ? Arrays.copyOf(aVar.f28424h, aVar.f28424h.length) : null;
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g implements n3.h {

        /* renamed from: f  reason: collision with root package name */
        public static final g f28425f = new a().f();

        /* renamed from: g  reason: collision with root package name */
        public static final h.a<g> f28426g = new h.a() { // from class: n3.w1
            @Override // n3.h.a
            public final h a(Bundle bundle) {
                u1.g c10;
                c10 = u1.g.c(bundle);
                return c10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final long f28427a;

        /* renamed from: b  reason: collision with root package name */
        public final long f28428b;

        /* renamed from: c  reason: collision with root package name */
        public final long f28429c;

        /* renamed from: d  reason: collision with root package name */
        public final float f28430d;

        /* renamed from: e  reason: collision with root package name */
        public final float f28431e;

        /* compiled from: MediaItem.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private long f28432a = -9223372036854775807L;

            /* renamed from: b  reason: collision with root package name */
            private long f28433b = -9223372036854775807L;

            /* renamed from: c  reason: collision with root package name */
            private long f28434c = -9223372036854775807L;

            /* renamed from: d  reason: collision with root package name */
            private float f28435d = -3.4028235E38f;

            /* renamed from: e  reason: collision with root package name */
            private float f28436e = -3.4028235E38f;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f28434c = j10;
                return this;
            }

            public a h(float f10) {
                this.f28436e = f10;
                return this;
            }

            public a i(long j10) {
                this.f28433b = j10;
                return this;
            }

            public a j(float f10) {
                this.f28435d = f10;
                return this;
            }

            public a k(long j10) {
                this.f28432a = j10;
                return this;
            }
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ g c(Bundle bundle) {
            return new g(bundle.getLong(b(0), -9223372036854775807L), bundle.getLong(b(1), -9223372036854775807L), bundle.getLong(b(2), -9223372036854775807L), bundle.getFloat(b(3), -3.4028235E38f), bundle.getFloat(b(4), -3.4028235E38f));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.f28427a == gVar.f28427a && this.f28428b == gVar.f28428b && this.f28429c == gVar.f28429c && this.f28430d == gVar.f28430d && this.f28431e == gVar.f28431e;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f28427a;
            long j11 = this.f28428b;
            long j12 = this.f28429c;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f28430d;
            int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f28431e;
            return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        private g(a aVar) {
            this(aVar.f28432a, aVar.f28433b, aVar.f28434c, aVar.f28435d, aVar.f28436e);
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f28427a = j10;
            this.f28428b = j11;
            this.f28429c = j12;
            this.f28430d = f10;
            this.f28431e = f11;
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f28437a;

        /* renamed from: b  reason: collision with root package name */
        public final String f28438b;

        /* renamed from: c  reason: collision with root package name */
        public final f f28439c;

        /* renamed from: d  reason: collision with root package name */
        public final b f28440d;

        /* renamed from: e  reason: collision with root package name */
        public final List<StreamKey> f28441e;

        /* renamed from: f  reason: collision with root package name */
        public final String f28442f;

        /* renamed from: g  reason: collision with root package name */
        public final y5.q<l> f28443g;
        @Deprecated

        /* renamed from: h  reason: collision with root package name */
        public final List<k> f28444h;

        /* renamed from: i  reason: collision with root package name */
        public final Object f28445i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return this.f28437a.equals(hVar.f28437a) && a5.p0.c(this.f28438b, hVar.f28438b) && a5.p0.c(this.f28439c, hVar.f28439c) && a5.p0.c(this.f28440d, hVar.f28440d) && this.f28441e.equals(hVar.f28441e) && a5.p0.c(this.f28442f, hVar.f28442f) && this.f28443g.equals(hVar.f28443g) && a5.p0.c(this.f28445i, hVar.f28445i);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f28437a.hashCode() * 31;
            String str = this.f28438b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f28439c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f28441e.hashCode()) * 31;
            String str2 = this.f28442f;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f28443g.hashCode()) * 31;
            Object obj = this.f28445i;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }

        private h(Uri uri, String str, f fVar, b bVar, List<StreamKey> list, String str2, y5.q<l> qVar, Object obj) {
            this.f28437a = uri;
            this.f28438b = str;
            this.f28439c = fVar;
            this.f28441e = list;
            this.f28442f = str2;
            this.f28443g = qVar;
            q.a j10 = y5.q.j();
            for (int i10 = 0; i10 < qVar.size(); i10++) {
                j10.a(qVar.get(i10).a().i());
            }
            this.f28444h = j10.h();
            this.f28445i = obj;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class i extends h {
        private i(Uri uri, String str, f fVar, b bVar, List<StreamKey> list, String str2, y5.q<l> qVar, Object obj) {
            super(uri, str, fVar, bVar, list, str2, qVar, obj);
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class j implements n3.h {

        /* renamed from: d  reason: collision with root package name */
        public static final j f28446d = new a().d();

        /* renamed from: e  reason: collision with root package name */
        public static final h.a<j> f28447e = new h.a() { // from class: n3.x1
            @Override // n3.h.a
            public final h a(Bundle bundle) {
                u1.j c10;
                c10 = u1.j.c(bundle);
                return c10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final Uri f28448a;

        /* renamed from: b  reason: collision with root package name */
        public final String f28449b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f28450c;

        /* compiled from: MediaItem.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Uri f28451a;

            /* renamed from: b  reason: collision with root package name */
            private String f28452b;

            /* renamed from: c  reason: collision with root package name */
            private Bundle f28453c;

            public j d() {
                return new j(this);
            }

            public a e(Bundle bundle) {
                this.f28453c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.f28451a = uri;
                return this;
            }

            public a g(String str) {
                this.f28452b = str;
                return this;
            }
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ j c(Bundle bundle) {
            return new a().f((Uri) bundle.getParcelable(b(0))).g(bundle.getString(b(1))).e(bundle.getBundle(b(2))).d();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return a5.p0.c(this.f28448a, jVar.f28448a) && a5.p0.c(this.f28449b, jVar.f28449b);
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f28448a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f28449b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        private j(a aVar) {
            this.f28448a = aVar.f28451a;
            this.f28449b = aVar.f28452b;
            this.f28450c = aVar.f28453c;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class k extends l {
        private k(l.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f28454a;

        /* renamed from: b  reason: collision with root package name */
        public final String f28455b;

        /* renamed from: c  reason: collision with root package name */
        public final String f28456c;

        /* renamed from: d  reason: collision with root package name */
        public final int f28457d;

        /* renamed from: e  reason: collision with root package name */
        public final int f28458e;

        /* renamed from: f  reason: collision with root package name */
        public final String f28459f;

        /* renamed from: g  reason: collision with root package name */
        public final String f28460g;

        /* compiled from: MediaItem.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Uri f28461a;

            /* renamed from: b  reason: collision with root package name */
            private String f28462b;

            /* renamed from: c  reason: collision with root package name */
            private String f28463c;

            /* renamed from: d  reason: collision with root package name */
            private int f28464d;

            /* renamed from: e  reason: collision with root package name */
            private int f28465e;

            /* renamed from: f  reason: collision with root package name */
            private String f28466f;

            /* renamed from: g  reason: collision with root package name */
            private String f28467g;

            /* JADX INFO: Access modifiers changed from: private */
            public k i() {
                return new k(this);
            }

            private a(l lVar) {
                this.f28461a = lVar.f28454a;
                this.f28462b = lVar.f28455b;
                this.f28463c = lVar.f28456c;
                this.f28464d = lVar.f28457d;
                this.f28465e = lVar.f28458e;
                this.f28466f = lVar.f28459f;
                this.f28467g = lVar.f28460g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return this.f28454a.equals(lVar.f28454a) && a5.p0.c(this.f28455b, lVar.f28455b) && a5.p0.c(this.f28456c, lVar.f28456c) && this.f28457d == lVar.f28457d && this.f28458e == lVar.f28458e && a5.p0.c(this.f28459f, lVar.f28459f) && a5.p0.c(this.f28460g, lVar.f28460g);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f28454a.hashCode() * 31;
            String str = this.f28455b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f28456c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f28457d) * 31) + this.f28458e) * 31;
            String str3 = this.f28459f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f28460g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private l(a aVar) {
            this.f28454a = aVar.f28461a;
            this.f28455b = aVar.f28462b;
            this.f28456c = aVar.f28463c;
            this.f28457d = aVar.f28464d;
            this.f28458e = aVar.f28465e;
            this.f28459f = aVar.f28466f;
            this.f28460g = aVar.f28467g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u1 b(Bundle bundle) {
        g a10;
        z1 a11;
        e a12;
        j a13;
        String str = (String) a5.a.e(bundle.getString(d(0), ""));
        Bundle bundle2 = bundle.getBundle(d(1));
        if (bundle2 == null) {
            a10 = g.f28425f;
        } else {
            a10 = g.f28426g.a(bundle2);
        }
        g gVar = a10;
        Bundle bundle3 = bundle.getBundle(d(2));
        if (bundle3 == null) {
            a11 = z1.G;
        } else {
            a11 = z1.H.a(bundle3);
        }
        z1 z1Var = a11;
        Bundle bundle4 = bundle.getBundle(d(3));
        if (bundle4 == null) {
            a12 = e.f28405h;
        } else {
            a12 = d.f28394g.a(bundle4);
        }
        e eVar = a12;
        Bundle bundle5 = bundle.getBundle(d(4));
        if (bundle5 == null) {
            a13 = j.f28446d;
        } else {
            a13 = j.f28447e.a(bundle5);
        }
        return new u1(str, eVar, null, gVar, z1Var, a13);
    }

    public static u1 c(Uri uri) {
        return new c().f(uri).a();
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            return a5.p0.c(this.f28372a, u1Var.f28372a) && this.f28377f.equals(u1Var.f28377f) && a5.p0.c(this.f28373b, u1Var.f28373b) && a5.p0.c(this.f28375d, u1Var.f28375d) && a5.p0.c(this.f28376e, u1Var.f28376e) && a5.p0.c(this.f28379h, u1Var.f28379h);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f28372a.hashCode() * 31;
        h hVar = this.f28373b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f28375d.hashCode()) * 31) + this.f28377f.hashCode()) * 31) + this.f28376e.hashCode()) * 31) + this.f28379h.hashCode();
    }

    private u1(String str, e eVar, i iVar, g gVar, z1 z1Var, j jVar) {
        this.f28372a = str;
        this.f28373b = iVar;
        this.f28374c = iVar;
        this.f28375d = gVar;
        this.f28376e = z1Var;
        this.f28377f = eVar;
        this.f28378g = eVar;
        this.f28379h = jVar;
    }
}
