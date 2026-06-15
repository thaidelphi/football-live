package x4;

import a5.p0;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.Api;
import e4.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import n3.h;
import y5.q;
/* compiled from: TrackSelectionParameters.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class z implements n3.h {
    public static final z A;
    @Deprecated
    public static final z B;
    @Deprecated
    public static final h.a<z> C;

    /* renamed from: a  reason: collision with root package name */
    public final int f32696a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32697b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32698c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32699d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32700e;

    /* renamed from: f  reason: collision with root package name */
    public final int f32701f;

    /* renamed from: g  reason: collision with root package name */
    public final int f32702g;

    /* renamed from: h  reason: collision with root package name */
    public final int f32703h;

    /* renamed from: i  reason: collision with root package name */
    public final int f32704i;

    /* renamed from: j  reason: collision with root package name */
    public final int f32705j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f32706k;

    /* renamed from: l  reason: collision with root package name */
    public final y5.q<String> f32707l;

    /* renamed from: m  reason: collision with root package name */
    public final int f32708m;

    /* renamed from: n  reason: collision with root package name */
    public final y5.q<String> f32709n;

    /* renamed from: o  reason: collision with root package name */
    public final int f32710o;

    /* renamed from: p  reason: collision with root package name */
    public final int f32711p;

    /* renamed from: q  reason: collision with root package name */
    public final int f32712q;

    /* renamed from: r  reason: collision with root package name */
    public final y5.q<String> f32713r;

    /* renamed from: s  reason: collision with root package name */
    public final y5.q<String> f32714s;

    /* renamed from: t  reason: collision with root package name */
    public final int f32715t;

    /* renamed from: u  reason: collision with root package name */
    public final int f32716u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f32717v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f32718w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f32719x;

    /* renamed from: y  reason: collision with root package name */
    public final y5.r<k0, x> f32720y;

    /* renamed from: z  reason: collision with root package name */
    public final y5.s<Integer> f32721z;

    static {
        z A2 = new a().A();
        A = A2;
        B = A2;
        C = new h.a() { // from class: x4.y
            @Override // n3.h.a
            public final n3.h a(Bundle bundle) {
                return z.a(bundle);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z(a aVar) {
        this.f32696a = aVar.f32722a;
        this.f32697b = aVar.f32723b;
        this.f32698c = aVar.f32724c;
        this.f32699d = aVar.f32725d;
        this.f32700e = aVar.f32726e;
        this.f32701f = aVar.f32727f;
        this.f32702g = aVar.f32728g;
        this.f32703h = aVar.f32729h;
        this.f32704i = aVar.f32730i;
        this.f32705j = aVar.f32731j;
        this.f32706k = aVar.f32732k;
        this.f32707l = aVar.f32733l;
        this.f32708m = aVar.f32734m;
        this.f32709n = aVar.f32735n;
        this.f32710o = aVar.f32736o;
        this.f32711p = aVar.f32737p;
        this.f32712q = aVar.f32738q;
        this.f32713r = aVar.f32739r;
        this.f32714s = aVar.f32740s;
        this.f32715t = aVar.f32741t;
        this.f32716u = aVar.f32742u;
        this.f32717v = aVar.f32743v;
        this.f32718w = aVar.f32744w;
        this.f32719x = aVar.f32745x;
        this.f32720y = y5.r.c(aVar.f32746y);
        this.f32721z = y5.s.j(aVar.f32747z);
    }

    public static z a(Bundle bundle) {
        return new a(bundle).A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f32696a == zVar.f32696a && this.f32697b == zVar.f32697b && this.f32698c == zVar.f32698c && this.f32699d == zVar.f32699d && this.f32700e == zVar.f32700e && this.f32701f == zVar.f32701f && this.f32702g == zVar.f32702g && this.f32703h == zVar.f32703h && this.f32706k == zVar.f32706k && this.f32704i == zVar.f32704i && this.f32705j == zVar.f32705j && this.f32707l.equals(zVar.f32707l) && this.f32708m == zVar.f32708m && this.f32709n.equals(zVar.f32709n) && this.f32710o == zVar.f32710o && this.f32711p == zVar.f32711p && this.f32712q == zVar.f32712q && this.f32713r.equals(zVar.f32713r) && this.f32714s.equals(zVar.f32714s) && this.f32715t == zVar.f32715t && this.f32716u == zVar.f32716u && this.f32717v == zVar.f32717v && this.f32718w == zVar.f32718w && this.f32719x == zVar.f32719x && this.f32720y.equals(zVar.f32720y) && this.f32721z.equals(zVar.f32721z);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f32696a + 31) * 31) + this.f32697b) * 31) + this.f32698c) * 31) + this.f32699d) * 31) + this.f32700e) * 31) + this.f32701f) * 31) + this.f32702g) * 31) + this.f32703h) * 31) + (this.f32706k ? 1 : 0)) * 31) + this.f32704i) * 31) + this.f32705j) * 31) + this.f32707l.hashCode()) * 31) + this.f32708m) * 31) + this.f32709n.hashCode()) * 31) + this.f32710o) * 31) + this.f32711p) * 31) + this.f32712q) * 31) + this.f32713r.hashCode()) * 31) + this.f32714s.hashCode()) * 31) + this.f32715t) * 31) + this.f32716u) * 31) + (this.f32717v ? 1 : 0)) * 31) + (this.f32718w ? 1 : 0)) * 31) + (this.f32719x ? 1 : 0)) * 31) + this.f32720y.hashCode()) * 31) + this.f32721z.hashCode();
    }

    /* compiled from: TrackSelectionParameters.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f32722a;

        /* renamed from: b  reason: collision with root package name */
        private int f32723b;

        /* renamed from: c  reason: collision with root package name */
        private int f32724c;

        /* renamed from: d  reason: collision with root package name */
        private int f32725d;

        /* renamed from: e  reason: collision with root package name */
        private int f32726e;

        /* renamed from: f  reason: collision with root package name */
        private int f32727f;

        /* renamed from: g  reason: collision with root package name */
        private int f32728g;

        /* renamed from: h  reason: collision with root package name */
        private int f32729h;

        /* renamed from: i  reason: collision with root package name */
        private int f32730i;

        /* renamed from: j  reason: collision with root package name */
        private int f32731j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f32732k;

        /* renamed from: l  reason: collision with root package name */
        private y5.q<String> f32733l;

        /* renamed from: m  reason: collision with root package name */
        private int f32734m;

        /* renamed from: n  reason: collision with root package name */
        private y5.q<String> f32735n;

        /* renamed from: o  reason: collision with root package name */
        private int f32736o;

        /* renamed from: p  reason: collision with root package name */
        private int f32737p;

        /* renamed from: q  reason: collision with root package name */
        private int f32738q;

        /* renamed from: r  reason: collision with root package name */
        private y5.q<String> f32739r;

        /* renamed from: s  reason: collision with root package name */
        private y5.q<String> f32740s;

        /* renamed from: t  reason: collision with root package name */
        private int f32741t;

        /* renamed from: u  reason: collision with root package name */
        private int f32742u;

        /* renamed from: v  reason: collision with root package name */
        private boolean f32743v;

        /* renamed from: w  reason: collision with root package name */
        private boolean f32744w;

        /* renamed from: x  reason: collision with root package name */
        private boolean f32745x;

        /* renamed from: y  reason: collision with root package name */
        private HashMap<k0, x> f32746y;

        /* renamed from: z  reason: collision with root package name */
        private HashSet<Integer> f32747z;

        @Deprecated
        public a() {
            this.f32722a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32723b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32724c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32725d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32730i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32731j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32732k = true;
            this.f32733l = y5.q.p();
            this.f32734m = 0;
            this.f32735n = y5.q.p();
            this.f32736o = 0;
            this.f32737p = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32738q = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f32739r = y5.q.p();
            this.f32740s = y5.q.p();
            this.f32741t = 0;
            this.f32742u = 0;
            this.f32743v = false;
            this.f32744w = false;
            this.f32745x = false;
            this.f32746y = new HashMap<>();
            this.f32747z = new HashSet<>();
        }

        private void B(z zVar) {
            this.f32722a = zVar.f32696a;
            this.f32723b = zVar.f32697b;
            this.f32724c = zVar.f32698c;
            this.f32725d = zVar.f32699d;
            this.f32726e = zVar.f32700e;
            this.f32727f = zVar.f32701f;
            this.f32728g = zVar.f32702g;
            this.f32729h = zVar.f32703h;
            this.f32730i = zVar.f32704i;
            this.f32731j = zVar.f32705j;
            this.f32732k = zVar.f32706k;
            this.f32733l = zVar.f32707l;
            this.f32734m = zVar.f32708m;
            this.f32735n = zVar.f32709n;
            this.f32736o = zVar.f32710o;
            this.f32737p = zVar.f32711p;
            this.f32738q = zVar.f32712q;
            this.f32739r = zVar.f32713r;
            this.f32740s = zVar.f32714s;
            this.f32741t = zVar.f32715t;
            this.f32742u = zVar.f32716u;
            this.f32743v = zVar.f32717v;
            this.f32744w = zVar.f32718w;
            this.f32745x = zVar.f32719x;
            this.f32747z = new HashSet<>(zVar.f32721z);
            this.f32746y = new HashMap<>(zVar.f32720y);
        }

        private static y5.q<String> C(String[] strArr) {
            q.a j10 = y5.q.j();
            for (String str : (String[]) a5.a.e(strArr)) {
                j10.a(p0.E0((String) a5.a.e(str)));
            }
            return j10.h();
        }

        private void H(Context context) {
            CaptioningManager captioningManager;
            if ((p0.f482a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f32741t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f32740s = y5.q.q(p0.W(locale));
                }
            }
        }

        public z A() {
            return new z(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a D(z zVar) {
            B(zVar);
            return this;
        }

        public a E(boolean z10) {
            this.f32745x = z10;
            return this;
        }

        public a F(int i10) {
            this.f32725d = i10;
            return this;
        }

        public a G(Context context) {
            if (p0.f482a >= 19) {
                H(context);
            }
            return this;
        }

        public a I(int i10, int i11, boolean z10) {
            this.f32730i = i10;
            this.f32731j = i11;
            this.f32732k = z10;
            return this;
        }

        public a J(Context context, boolean z10) {
            Point M = p0.M(context);
            return I(M.x, M.y, z10);
        }

        public a(Context context) {
            this();
            G(context);
            J(context, true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(z zVar) {
            B(zVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(Bundle bundle) {
            y5.q b10;
            String b11 = z.b(6);
            z zVar = z.A;
            this.f32722a = bundle.getInt(b11, zVar.f32696a);
            this.f32723b = bundle.getInt(z.b(7), zVar.f32697b);
            this.f32724c = bundle.getInt(z.b(8), zVar.f32698c);
            this.f32725d = bundle.getInt(z.b(9), zVar.f32699d);
            this.f32726e = bundle.getInt(z.b(10), zVar.f32700e);
            this.f32727f = bundle.getInt(z.b(11), zVar.f32701f);
            this.f32728g = bundle.getInt(z.b(12), zVar.f32702g);
            this.f32729h = bundle.getInt(z.b(13), zVar.f32703h);
            this.f32730i = bundle.getInt(z.b(14), zVar.f32704i);
            this.f32731j = bundle.getInt(z.b(15), zVar.f32705j);
            this.f32732k = bundle.getBoolean(z.b(16), zVar.f32706k);
            this.f32733l = y5.q.m((String[]) x5.e.a(bundle.getStringArray(z.b(17)), new String[0]));
            this.f32734m = bundle.getInt(z.b(25), zVar.f32708m);
            this.f32735n = C((String[]) x5.e.a(bundle.getStringArray(z.b(1)), new String[0]));
            this.f32736o = bundle.getInt(z.b(2), zVar.f32710o);
            this.f32737p = bundle.getInt(z.b(18), zVar.f32711p);
            this.f32738q = bundle.getInt(z.b(19), zVar.f32712q);
            this.f32739r = y5.q.m((String[]) x5.e.a(bundle.getStringArray(z.b(20)), new String[0]));
            this.f32740s = C((String[]) x5.e.a(bundle.getStringArray(z.b(3)), new String[0]));
            this.f32741t = bundle.getInt(z.b(4), zVar.f32715t);
            this.f32742u = bundle.getInt(z.b(26), zVar.f32716u);
            this.f32743v = bundle.getBoolean(z.b(5), zVar.f32717v);
            this.f32744w = bundle.getBoolean(z.b(21), zVar.f32718w);
            this.f32745x = bundle.getBoolean(z.b(22), zVar.f32719x);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(z.b(23));
            if (parcelableArrayList == null) {
                b10 = y5.q.p();
            } else {
                b10 = a5.c.b(x.f32692c, parcelableArrayList);
            }
            this.f32746y = new HashMap<>();
            for (int i10 = 0; i10 < b10.size(); i10++) {
                x xVar = (x) b10.get(i10);
                this.f32746y.put(xVar.f32693a, xVar);
            }
            int[] iArr = (int[]) x5.e.a(bundle.getIntArray(z.b(24)), new int[0]);
            this.f32747z = new HashSet<>();
            for (int i11 : iArr) {
                this.f32747z.add(Integer.valueOf(i11));
            }
        }
    }
}
