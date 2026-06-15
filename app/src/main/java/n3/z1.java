package n3;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.List;
import n3.h;
/* compiled from: MediaMetadata.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class z1 implements h {
    public static final z1 G = new b().F();
    public static final h.a<z1> H = new h.a() { // from class: n3.y1
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            z1 c10;
            c10 = z1.c(bundle);
            return c10;
        }
    };
    public final Integer A;
    public final Integer B;
    public final CharSequence C;
    public final CharSequence D;
    public final CharSequence E;
    public final Bundle F;

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f28542a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f28543b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f28544c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f28545d;

    /* renamed from: e  reason: collision with root package name */
    public final CharSequence f28546e;

    /* renamed from: f  reason: collision with root package name */
    public final CharSequence f28547f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f28548g;

    /* renamed from: h  reason: collision with root package name */
    public final w2 f28549h;

    /* renamed from: i  reason: collision with root package name */
    public final w2 f28550i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f28551j;

    /* renamed from: k  reason: collision with root package name */
    public final Integer f28552k;

    /* renamed from: l  reason: collision with root package name */
    public final Uri f28553l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f28554m;

    /* renamed from: n  reason: collision with root package name */
    public final Integer f28555n;

    /* renamed from: o  reason: collision with root package name */
    public final Integer f28556o;

    /* renamed from: p  reason: collision with root package name */
    public final Boolean f28557p;
    @Deprecated

    /* renamed from: q  reason: collision with root package name */
    public final Integer f28558q;

    /* renamed from: r  reason: collision with root package name */
    public final Integer f28559r;

    /* renamed from: s  reason: collision with root package name */
    public final Integer f28560s;

    /* renamed from: t  reason: collision with root package name */
    public final Integer f28561t;

    /* renamed from: u  reason: collision with root package name */
    public final Integer f28562u;

    /* renamed from: v  reason: collision with root package name */
    public final Integer f28563v;

    /* renamed from: w  reason: collision with root package name */
    public final Integer f28564w;

    /* renamed from: x  reason: collision with root package name */
    public final CharSequence f28565x;

    /* renamed from: y  reason: collision with root package name */
    public final CharSequence f28566y;

    /* renamed from: z  reason: collision with root package name */
    public final CharSequence f28567z;

    /* compiled from: MediaMetadata.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {
        private Integer A;
        private CharSequence B;
        private CharSequence C;
        private CharSequence D;
        private Bundle E;

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f28568a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f28569b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f28570c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f28571d;

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f28572e;

        /* renamed from: f  reason: collision with root package name */
        private CharSequence f28573f;

        /* renamed from: g  reason: collision with root package name */
        private CharSequence f28574g;

        /* renamed from: h  reason: collision with root package name */
        private w2 f28575h;

        /* renamed from: i  reason: collision with root package name */
        private w2 f28576i;

        /* renamed from: j  reason: collision with root package name */
        private byte[] f28577j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f28578k;

        /* renamed from: l  reason: collision with root package name */
        private Uri f28579l;

        /* renamed from: m  reason: collision with root package name */
        private Integer f28580m;

        /* renamed from: n  reason: collision with root package name */
        private Integer f28581n;

        /* renamed from: o  reason: collision with root package name */
        private Integer f28582o;

        /* renamed from: p  reason: collision with root package name */
        private Boolean f28583p;

        /* renamed from: q  reason: collision with root package name */
        private Integer f28584q;

        /* renamed from: r  reason: collision with root package name */
        private Integer f28585r;

        /* renamed from: s  reason: collision with root package name */
        private Integer f28586s;

        /* renamed from: t  reason: collision with root package name */
        private Integer f28587t;

        /* renamed from: u  reason: collision with root package name */
        private Integer f28588u;

        /* renamed from: v  reason: collision with root package name */
        private Integer f28589v;

        /* renamed from: w  reason: collision with root package name */
        private CharSequence f28590w;

        /* renamed from: x  reason: collision with root package name */
        private CharSequence f28591x;

        /* renamed from: y  reason: collision with root package name */
        private CharSequence f28592y;

        /* renamed from: z  reason: collision with root package name */
        private Integer f28593z;

        public z1 F() {
            return new z1(this);
        }

        public b G(byte[] bArr, int i10) {
            if (this.f28577j == null || a5.p0.c(Integer.valueOf(i10), 3) || !a5.p0.c(this.f28578k, 3)) {
                this.f28577j = (byte[]) bArr.clone();
                this.f28578k = Integer.valueOf(i10);
            }
            return this;
        }

        public b H(z1 z1Var) {
            if (z1Var == null) {
                return this;
            }
            CharSequence charSequence = z1Var.f28542a;
            if (charSequence != null) {
                i0(charSequence);
            }
            CharSequence charSequence2 = z1Var.f28543b;
            if (charSequence2 != null) {
                M(charSequence2);
            }
            CharSequence charSequence3 = z1Var.f28544c;
            if (charSequence3 != null) {
                L(charSequence3);
            }
            CharSequence charSequence4 = z1Var.f28545d;
            if (charSequence4 != null) {
                K(charSequence4);
            }
            CharSequence charSequence5 = z1Var.f28546e;
            if (charSequence5 != null) {
                U(charSequence5);
            }
            CharSequence charSequence6 = z1Var.f28547f;
            if (charSequence6 != null) {
                h0(charSequence6);
            }
            CharSequence charSequence7 = z1Var.f28548g;
            if (charSequence7 != null) {
                S(charSequence7);
            }
            w2 w2Var = z1Var.f28549h;
            if (w2Var != null) {
                m0(w2Var);
            }
            w2 w2Var2 = z1Var.f28550i;
            if (w2Var2 != null) {
                Z(w2Var2);
            }
            byte[] bArr = z1Var.f28551j;
            if (bArr != null) {
                N(bArr, z1Var.f28552k);
            }
            Uri uri = z1Var.f28553l;
            if (uri != null) {
                O(uri);
            }
            Integer num = z1Var.f28554m;
            if (num != null) {
                l0(num);
            }
            Integer num2 = z1Var.f28555n;
            if (num2 != null) {
                k0(num2);
            }
            Integer num3 = z1Var.f28556o;
            if (num3 != null) {
                W(num3);
            }
            Boolean bool = z1Var.f28557p;
            if (bool != null) {
                Y(bool);
            }
            Integer num4 = z1Var.f28558q;
            if (num4 != null) {
                c0(num4);
            }
            Integer num5 = z1Var.f28559r;
            if (num5 != null) {
                c0(num5);
            }
            Integer num6 = z1Var.f28560s;
            if (num6 != null) {
                b0(num6);
            }
            Integer num7 = z1Var.f28561t;
            if (num7 != null) {
                a0(num7);
            }
            Integer num8 = z1Var.f28562u;
            if (num8 != null) {
                f0(num8);
            }
            Integer num9 = z1Var.f28563v;
            if (num9 != null) {
                e0(num9);
            }
            Integer num10 = z1Var.f28564w;
            if (num10 != null) {
                d0(num10);
            }
            CharSequence charSequence8 = z1Var.f28565x;
            if (charSequence8 != null) {
                n0(charSequence8);
            }
            CharSequence charSequence9 = z1Var.f28566y;
            if (charSequence9 != null) {
                Q(charSequence9);
            }
            CharSequence charSequence10 = z1Var.f28567z;
            if (charSequence10 != null) {
                R(charSequence10);
            }
            Integer num11 = z1Var.A;
            if (num11 != null) {
                T(num11);
            }
            Integer num12 = z1Var.B;
            if (num12 != null) {
                j0(num12);
            }
            CharSequence charSequence11 = z1Var.C;
            if (charSequence11 != null) {
                X(charSequence11);
            }
            CharSequence charSequence12 = z1Var.D;
            if (charSequence12 != null) {
                P(charSequence12);
            }
            CharSequence charSequence13 = z1Var.E;
            if (charSequence13 != null) {
                g0(charSequence13);
            }
            Bundle bundle = z1Var.F;
            if (bundle != null) {
                V(bundle);
            }
            return this;
        }

        public b I(Metadata metadata) {
            for (int i10 = 0; i10 < metadata.e(); i10++) {
                metadata.d(i10).J(this);
            }
            return this;
        }

        public b J(List<Metadata> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                Metadata metadata = list.get(i10);
                for (int i11 = 0; i11 < metadata.e(); i11++) {
                    metadata.d(i11).J(this);
                }
            }
            return this;
        }

        public b K(CharSequence charSequence) {
            this.f28571d = charSequence;
            return this;
        }

        public b L(CharSequence charSequence) {
            this.f28570c = charSequence;
            return this;
        }

        public b M(CharSequence charSequence) {
            this.f28569b = charSequence;
            return this;
        }

        public b N(byte[] bArr, Integer num) {
            this.f28577j = bArr == null ? null : (byte[]) bArr.clone();
            this.f28578k = num;
            return this;
        }

        public b O(Uri uri) {
            this.f28579l = uri;
            return this;
        }

        public b P(CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public b Q(CharSequence charSequence) {
            this.f28591x = charSequence;
            return this;
        }

        public b R(CharSequence charSequence) {
            this.f28592y = charSequence;
            return this;
        }

        public b S(CharSequence charSequence) {
            this.f28574g = charSequence;
            return this;
        }

        public b T(Integer num) {
            this.f28593z = num;
            return this;
        }

        public b U(CharSequence charSequence) {
            this.f28572e = charSequence;
            return this;
        }

        public b V(Bundle bundle) {
            this.E = bundle;
            return this;
        }

        public b W(Integer num) {
            this.f28582o = num;
            return this;
        }

        public b X(CharSequence charSequence) {
            this.B = charSequence;
            return this;
        }

        public b Y(Boolean bool) {
            this.f28583p = bool;
            return this;
        }

        public b Z(w2 w2Var) {
            this.f28576i = w2Var;
            return this;
        }

        public b a0(Integer num) {
            this.f28586s = num;
            return this;
        }

        public b b0(Integer num) {
            this.f28585r = num;
            return this;
        }

        public b c0(Integer num) {
            this.f28584q = num;
            return this;
        }

        public b d0(Integer num) {
            this.f28589v = num;
            return this;
        }

        public b e0(Integer num) {
            this.f28588u = num;
            return this;
        }

        public b f0(Integer num) {
            this.f28587t = num;
            return this;
        }

        public b g0(CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public b h0(CharSequence charSequence) {
            this.f28573f = charSequence;
            return this;
        }

        public b i0(CharSequence charSequence) {
            this.f28568a = charSequence;
            return this;
        }

        public b j0(Integer num) {
            this.A = num;
            return this;
        }

        public b k0(Integer num) {
            this.f28581n = num;
            return this;
        }

        public b l0(Integer num) {
            this.f28580m = num;
            return this;
        }

        public b m0(w2 w2Var) {
            this.f28575h = w2Var;
            return this;
        }

        public b n0(CharSequence charSequence) {
            this.f28590w = charSequence;
            return this;
        }

        public b() {
        }

        private b(z1 z1Var) {
            this.f28568a = z1Var.f28542a;
            this.f28569b = z1Var.f28543b;
            this.f28570c = z1Var.f28544c;
            this.f28571d = z1Var.f28545d;
            this.f28572e = z1Var.f28546e;
            this.f28573f = z1Var.f28547f;
            this.f28574g = z1Var.f28548g;
            this.f28575h = z1Var.f28549h;
            this.f28576i = z1Var.f28550i;
            this.f28577j = z1Var.f28551j;
            this.f28578k = z1Var.f28552k;
            this.f28579l = z1Var.f28553l;
            this.f28580m = z1Var.f28554m;
            this.f28581n = z1Var.f28555n;
            this.f28582o = z1Var.f28556o;
            this.f28583p = z1Var.f28557p;
            this.f28584q = z1Var.f28559r;
            this.f28585r = z1Var.f28560s;
            this.f28586s = z1Var.f28561t;
            this.f28587t = z1Var.f28562u;
            this.f28588u = z1Var.f28563v;
            this.f28589v = z1Var.f28564w;
            this.f28590w = z1Var.f28565x;
            this.f28591x = z1Var.f28566y;
            this.f28592y = z1Var.f28567z;
            this.f28593z = z1Var.A;
            this.A = z1Var.B;
            this.B = z1Var.C;
            this.C = z1Var.D;
            this.D = z1Var.E;
            this.E = z1Var.F;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static z1 c(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        b bVar = new b();
        bVar.i0(bundle.getCharSequence(d(0))).M(bundle.getCharSequence(d(1))).L(bundle.getCharSequence(d(2))).K(bundle.getCharSequence(d(3))).U(bundle.getCharSequence(d(4))).h0(bundle.getCharSequence(d(5))).S(bundle.getCharSequence(d(6))).N(bundle.getByteArray(d(10)), bundle.containsKey(d(29)) ? Integer.valueOf(bundle.getInt(d(29))) : null).O((Uri) bundle.getParcelable(d(11))).n0(bundle.getCharSequence(d(22))).Q(bundle.getCharSequence(d(23))).R(bundle.getCharSequence(d(24))).X(bundle.getCharSequence(d(27))).P(bundle.getCharSequence(d(28))).g0(bundle.getCharSequence(d(30))).V(bundle.getBundle(d(1000)));
        if (bundle.containsKey(d(8)) && (bundle3 = bundle.getBundle(d(8))) != null) {
            bVar.m0(w2.f28482a.a(bundle3));
        }
        if (bundle.containsKey(d(9)) && (bundle2 = bundle.getBundle(d(9))) != null) {
            bVar.Z(w2.f28482a.a(bundle2));
        }
        if (bundle.containsKey(d(12))) {
            bVar.l0(Integer.valueOf(bundle.getInt(d(12))));
        }
        if (bundle.containsKey(d(13))) {
            bVar.k0(Integer.valueOf(bundle.getInt(d(13))));
        }
        if (bundle.containsKey(d(14))) {
            bVar.W(Integer.valueOf(bundle.getInt(d(14))));
        }
        if (bundle.containsKey(d(15))) {
            bVar.Y(Boolean.valueOf(bundle.getBoolean(d(15))));
        }
        if (bundle.containsKey(d(16))) {
            bVar.c0(Integer.valueOf(bundle.getInt(d(16))));
        }
        if (bundle.containsKey(d(17))) {
            bVar.b0(Integer.valueOf(bundle.getInt(d(17))));
        }
        if (bundle.containsKey(d(18))) {
            bVar.a0(Integer.valueOf(bundle.getInt(d(18))));
        }
        if (bundle.containsKey(d(19))) {
            bVar.f0(Integer.valueOf(bundle.getInt(d(19))));
        }
        if (bundle.containsKey(d(20))) {
            bVar.e0(Integer.valueOf(bundle.getInt(d(20))));
        }
        if (bundle.containsKey(d(21))) {
            bVar.d0(Integer.valueOf(bundle.getInt(d(21))));
        }
        if (bundle.containsKey(d(25))) {
            bVar.T(Integer.valueOf(bundle.getInt(d(25))));
        }
        if (bundle.containsKey(d(26))) {
            bVar.j0(Integer.valueOf(bundle.getInt(d(26))));
        }
        return bVar.F();
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public b b() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z1.class != obj.getClass()) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return a5.p0.c(this.f28542a, z1Var.f28542a) && a5.p0.c(this.f28543b, z1Var.f28543b) && a5.p0.c(this.f28544c, z1Var.f28544c) && a5.p0.c(this.f28545d, z1Var.f28545d) && a5.p0.c(this.f28546e, z1Var.f28546e) && a5.p0.c(this.f28547f, z1Var.f28547f) && a5.p0.c(this.f28548g, z1Var.f28548g) && a5.p0.c(this.f28549h, z1Var.f28549h) && a5.p0.c(this.f28550i, z1Var.f28550i) && Arrays.equals(this.f28551j, z1Var.f28551j) && a5.p0.c(this.f28552k, z1Var.f28552k) && a5.p0.c(this.f28553l, z1Var.f28553l) && a5.p0.c(this.f28554m, z1Var.f28554m) && a5.p0.c(this.f28555n, z1Var.f28555n) && a5.p0.c(this.f28556o, z1Var.f28556o) && a5.p0.c(this.f28557p, z1Var.f28557p) && a5.p0.c(this.f28559r, z1Var.f28559r) && a5.p0.c(this.f28560s, z1Var.f28560s) && a5.p0.c(this.f28561t, z1Var.f28561t) && a5.p0.c(this.f28562u, z1Var.f28562u) && a5.p0.c(this.f28563v, z1Var.f28563v) && a5.p0.c(this.f28564w, z1Var.f28564w) && a5.p0.c(this.f28565x, z1Var.f28565x) && a5.p0.c(this.f28566y, z1Var.f28566y) && a5.p0.c(this.f28567z, z1Var.f28567z) && a5.p0.c(this.A, z1Var.A) && a5.p0.c(this.B, z1Var.B) && a5.p0.c(this.C, z1Var.C) && a5.p0.c(this.D, z1Var.D) && a5.p0.c(this.E, z1Var.E);
    }

    public int hashCode() {
        return x5.f.b(this.f28542a, this.f28543b, this.f28544c, this.f28545d, this.f28546e, this.f28547f, this.f28548g, this.f28549h, this.f28550i, Integer.valueOf(Arrays.hashCode(this.f28551j)), this.f28552k, this.f28553l, this.f28554m, this.f28555n, this.f28556o, this.f28557p, this.f28559r, this.f28560s, this.f28561t, this.f28562u, this.f28563v, this.f28564w, this.f28565x, this.f28566y, this.f28567z, this.A, this.B, this.C, this.D, this.E);
    }

    private z1(b bVar) {
        this.f28542a = bVar.f28568a;
        this.f28543b = bVar.f28569b;
        this.f28544c = bVar.f28570c;
        this.f28545d = bVar.f28571d;
        this.f28546e = bVar.f28572e;
        this.f28547f = bVar.f28573f;
        this.f28548g = bVar.f28574g;
        this.f28549h = bVar.f28575h;
        this.f28550i = bVar.f28576i;
        this.f28551j = bVar.f28577j;
        this.f28552k = bVar.f28578k;
        this.f28553l = bVar.f28579l;
        this.f28554m = bVar.f28580m;
        this.f28555n = bVar.f28581n;
        this.f28556o = bVar.f28582o;
        this.f28557p = bVar.f28583p;
        this.f28558q = bVar.f28584q;
        this.f28559r = bVar.f28584q;
        this.f28560s = bVar.f28585r;
        this.f28561t = bVar.f28586s;
        this.f28562u = bVar.f28587t;
        this.f28563v = bVar.f28588u;
        this.f28564w = bVar.f28589v;
        this.f28565x = bVar.f28590w;
        this.f28566y = bVar.f28591x;
        this.f28567z = bVar.f28592y;
        this.A = bVar.f28593z;
        this.B = bVar.A;
        this.C = bVar.B;
        this.D = bVar.C;
        this.E = bVar.D;
        this.F = bVar.E;
    }
}
