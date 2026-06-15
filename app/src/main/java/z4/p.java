package z4;

import android.net.Uri;
import com.ironsource.b9;
import com.ironsource.in;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import n3.j1;
/* compiled from: DataSpec.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f33569a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33570b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33571c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f33572d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f33573e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public final long f33574f;

    /* renamed from: g  reason: collision with root package name */
    public final long f33575g;

    /* renamed from: h  reason: collision with root package name */
    public final long f33576h;

    /* renamed from: i  reason: collision with root package name */
    public final String f33577i;

    /* renamed from: j  reason: collision with root package name */
    public final int f33578j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f33579k;

    /* compiled from: DataSpec.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f33580a;

        /* renamed from: b  reason: collision with root package name */
        private long f33581b;

        /* renamed from: c  reason: collision with root package name */
        private int f33582c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f33583d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f33584e;

        /* renamed from: f  reason: collision with root package name */
        private long f33585f;

        /* renamed from: g  reason: collision with root package name */
        private long f33586g;

        /* renamed from: h  reason: collision with root package name */
        private String f33587h;

        /* renamed from: i  reason: collision with root package name */
        private int f33588i;

        /* renamed from: j  reason: collision with root package name */
        private Object f33589j;

        public p a() {
            a5.a.i(this.f33580a, "The uri must be set.");
            return new p(this.f33580a, this.f33581b, this.f33582c, this.f33583d, this.f33584e, this.f33585f, this.f33586g, this.f33587h, this.f33588i, this.f33589j);
        }

        public b b(int i10) {
            this.f33588i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f33583d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f33582c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f33584e = map;
            return this;
        }

        public b f(String str) {
            this.f33587h = str;
            return this;
        }

        public b g(long j10) {
            this.f33586g = j10;
            return this;
        }

        public b h(long j10) {
            this.f33585f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f33580a = uri;
            return this;
        }

        public b j(String str) {
            this.f33580a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f33582c = 1;
            this.f33584e = Collections.emptyMap();
            this.f33586g = -1L;
        }

        private b(p pVar) {
            this.f33580a = pVar.f33569a;
            this.f33581b = pVar.f33570b;
            this.f33582c = pVar.f33571c;
            this.f33583d = pVar.f33572d;
            this.f33584e = pVar.f33573e;
            this.f33585f = pVar.f33575g;
            this.f33586g = pVar.f33576h;
            this.f33587h = pVar.f33577i;
            this.f33588i = pVar.f33578j;
            this.f33589j = pVar.f33579k;
        }
    }

    static {
        j1.a("goog.exo.datasource");
    }

    public static String c(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return in.f17849b;
        }
        return in.f17848a;
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f33571c);
    }

    public boolean d(int i10) {
        return (this.f33578j & i10) == i10;
    }

    public p e(long j10) {
        long j11 = this.f33576h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public p f(long j10, long j11) {
        return (j10 == 0 && this.f33576h == j11) ? this : new p(this.f33569a, this.f33570b, this.f33571c, this.f33572d, this.f33573e, this.f33575g + j10, j11, this.f33577i, this.f33578j, this.f33579k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f33569a + ", " + this.f33575g + ", " + this.f33576h + ", " + this.f33577i + ", " + this.f33578j + b9.i.f16698e;
    }

    public p(Uri uri) {
        this(uri, 0L, -1L);
    }

    public p(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    private p(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        a5.a.a(j13 >= 0);
        a5.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        a5.a.a(z10);
        this.f33569a = uri;
        this.f33570b = j10;
        this.f33571c = i10;
        this.f33572d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f33573e = Collections.unmodifiableMap(new HashMap(map));
        this.f33575g = j11;
        this.f33574f = j13;
        this.f33576h = j12;
        this.f33577i = str;
        this.f33578j = i11;
        this.f33579k = obj;
    }
}
