package n4;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import n3.h;
/* compiled from: Cue.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b implements n3.h {

    /* renamed from: r  reason: collision with root package name */
    public static final b f28595r = new C0322b().o("").a();

    /* renamed from: s  reason: collision with root package name */
    public static final h.a<b> f28596s = new h.a() { // from class: n4.a
        @Override // n3.h.a
        public final n3.h a(Bundle bundle) {
            b c10;
            c10 = b.c(bundle);
            return c10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f28597a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f28598b;

    /* renamed from: c  reason: collision with root package name */
    public final Layout.Alignment f28599c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap f28600d;

    /* renamed from: e  reason: collision with root package name */
    public final float f28601e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28602f;

    /* renamed from: g  reason: collision with root package name */
    public final int f28603g;

    /* renamed from: h  reason: collision with root package name */
    public final float f28604h;

    /* renamed from: i  reason: collision with root package name */
    public final int f28605i;

    /* renamed from: j  reason: collision with root package name */
    public final float f28606j;

    /* renamed from: k  reason: collision with root package name */
    public final float f28607k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f28608l;

    /* renamed from: m  reason: collision with root package name */
    public final int f28609m;

    /* renamed from: n  reason: collision with root package name */
    public final int f28610n;

    /* renamed from: o  reason: collision with root package name */
    public final float f28611o;

    /* renamed from: p  reason: collision with root package name */
    public final int f28612p;

    /* renamed from: q  reason: collision with root package name */
    public final float f28613q;

    /* compiled from: Cue.java */
    /* renamed from: n4.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0322b {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f28614a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f28615b;

        /* renamed from: c  reason: collision with root package name */
        private Layout.Alignment f28616c;

        /* renamed from: d  reason: collision with root package name */
        private Layout.Alignment f28617d;

        /* renamed from: e  reason: collision with root package name */
        private float f28618e;

        /* renamed from: f  reason: collision with root package name */
        private int f28619f;

        /* renamed from: g  reason: collision with root package name */
        private int f28620g;

        /* renamed from: h  reason: collision with root package name */
        private float f28621h;

        /* renamed from: i  reason: collision with root package name */
        private int f28622i;

        /* renamed from: j  reason: collision with root package name */
        private int f28623j;

        /* renamed from: k  reason: collision with root package name */
        private float f28624k;

        /* renamed from: l  reason: collision with root package name */
        private float f28625l;

        /* renamed from: m  reason: collision with root package name */
        private float f28626m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f28627n;

        /* renamed from: o  reason: collision with root package name */
        private int f28628o;

        /* renamed from: p  reason: collision with root package name */
        private int f28629p;

        /* renamed from: q  reason: collision with root package name */
        private float f28630q;

        public b a() {
            return new b(this.f28614a, this.f28616c, this.f28617d, this.f28615b, this.f28618e, this.f28619f, this.f28620g, this.f28621h, this.f28622i, this.f28623j, this.f28624k, this.f28625l, this.f28626m, this.f28627n, this.f28628o, this.f28629p, this.f28630q);
        }

        public C0322b b() {
            this.f28627n = false;
            return this;
        }

        public int c() {
            return this.f28620g;
        }

        public int d() {
            return this.f28622i;
        }

        public CharSequence e() {
            return this.f28614a;
        }

        public C0322b f(Bitmap bitmap) {
            this.f28615b = bitmap;
            return this;
        }

        public C0322b g(float f10) {
            this.f28626m = f10;
            return this;
        }

        public C0322b h(float f10, int i10) {
            this.f28618e = f10;
            this.f28619f = i10;
            return this;
        }

        public C0322b i(int i10) {
            this.f28620g = i10;
            return this;
        }

        public C0322b j(Layout.Alignment alignment) {
            this.f28617d = alignment;
            return this;
        }

        public C0322b k(float f10) {
            this.f28621h = f10;
            return this;
        }

        public C0322b l(int i10) {
            this.f28622i = i10;
            return this;
        }

        public C0322b m(float f10) {
            this.f28630q = f10;
            return this;
        }

        public C0322b n(float f10) {
            this.f28625l = f10;
            return this;
        }

        public C0322b o(CharSequence charSequence) {
            this.f28614a = charSequence;
            return this;
        }

        public C0322b p(Layout.Alignment alignment) {
            this.f28616c = alignment;
            return this;
        }

        public C0322b q(float f10, int i10) {
            this.f28624k = f10;
            this.f28623j = i10;
            return this;
        }

        public C0322b r(int i10) {
            this.f28629p = i10;
            return this;
        }

        public C0322b s(int i10) {
            this.f28628o = i10;
            this.f28627n = true;
            return this;
        }

        public C0322b() {
            this.f28614a = null;
            this.f28615b = null;
            this.f28616c = null;
            this.f28617d = null;
            this.f28618e = -3.4028235E38f;
            this.f28619f = RecyclerView.UNDEFINED_DURATION;
            this.f28620g = RecyclerView.UNDEFINED_DURATION;
            this.f28621h = -3.4028235E38f;
            this.f28622i = RecyclerView.UNDEFINED_DURATION;
            this.f28623j = RecyclerView.UNDEFINED_DURATION;
            this.f28624k = -3.4028235E38f;
            this.f28625l = -3.4028235E38f;
            this.f28626m = -3.4028235E38f;
            this.f28627n = false;
            this.f28628o = -16777216;
            this.f28629p = RecyclerView.UNDEFINED_DURATION;
        }

        private C0322b(b bVar) {
            this.f28614a = bVar.f28597a;
            this.f28615b = bVar.f28600d;
            this.f28616c = bVar.f28598b;
            this.f28617d = bVar.f28599c;
            this.f28618e = bVar.f28601e;
            this.f28619f = bVar.f28602f;
            this.f28620g = bVar.f28603g;
            this.f28621h = bVar.f28604h;
            this.f28622i = bVar.f28605i;
            this.f28623j = bVar.f28610n;
            this.f28624k = bVar.f28611o;
            this.f28625l = bVar.f28606j;
            this.f28626m = bVar.f28607k;
            this.f28627n = bVar.f28608l;
            this.f28628o = bVar.f28609m;
            this.f28629p = bVar.f28612p;
            this.f28630q = bVar.f28613q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b c(Bundle bundle) {
        C0322b c0322b = new C0322b();
        CharSequence charSequence = bundle.getCharSequence(d(0));
        if (charSequence != null) {
            c0322b.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(d(1));
        if (alignment != null) {
            c0322b.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(d(2));
        if (alignment2 != null) {
            c0322b.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(d(3));
        if (bitmap != null) {
            c0322b.f(bitmap);
        }
        if (bundle.containsKey(d(4)) && bundle.containsKey(d(5))) {
            c0322b.h(bundle.getFloat(d(4)), bundle.getInt(d(5)));
        }
        if (bundle.containsKey(d(6))) {
            c0322b.i(bundle.getInt(d(6)));
        }
        if (bundle.containsKey(d(7))) {
            c0322b.k(bundle.getFloat(d(7)));
        }
        if (bundle.containsKey(d(8))) {
            c0322b.l(bundle.getInt(d(8)));
        }
        if (bundle.containsKey(d(10)) && bundle.containsKey(d(9))) {
            c0322b.q(bundle.getFloat(d(10)), bundle.getInt(d(9)));
        }
        if (bundle.containsKey(d(11))) {
            c0322b.n(bundle.getFloat(d(11)));
        }
        if (bundle.containsKey(d(12))) {
            c0322b.g(bundle.getFloat(d(12)));
        }
        if (bundle.containsKey(d(13))) {
            c0322b.s(bundle.getInt(d(13)));
        }
        if (!bundle.getBoolean(d(14), false)) {
            c0322b.b();
        }
        if (bundle.containsKey(d(15))) {
            c0322b.r(bundle.getInt(d(15)));
        }
        if (bundle.containsKey(d(16))) {
            c0322b.m(bundle.getFloat(d(16)));
        }
        return c0322b.a();
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public C0322b b() {
        return new C0322b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return TextUtils.equals(this.f28597a, bVar.f28597a) && this.f28598b == bVar.f28598b && this.f28599c == bVar.f28599c && ((bitmap = this.f28600d) != null ? !((bitmap2 = bVar.f28600d) == null || !bitmap.sameAs(bitmap2)) : bVar.f28600d == null) && this.f28601e == bVar.f28601e && this.f28602f == bVar.f28602f && this.f28603g == bVar.f28603g && this.f28604h == bVar.f28604h && this.f28605i == bVar.f28605i && this.f28606j == bVar.f28606j && this.f28607k == bVar.f28607k && this.f28608l == bVar.f28608l && this.f28609m == bVar.f28609m && this.f28610n == bVar.f28610n && this.f28611o == bVar.f28611o && this.f28612p == bVar.f28612p && this.f28613q == bVar.f28613q;
    }

    public int hashCode() {
        return x5.f.b(this.f28597a, this.f28598b, this.f28599c, this.f28600d, Float.valueOf(this.f28601e), Integer.valueOf(this.f28602f), Integer.valueOf(this.f28603g), Float.valueOf(this.f28604h), Integer.valueOf(this.f28605i), Float.valueOf(this.f28606j), Float.valueOf(this.f28607k), Boolean.valueOf(this.f28608l), Integer.valueOf(this.f28609m), Integer.valueOf(this.f28610n), Float.valueOf(this.f28611o), Integer.valueOf(this.f28612p), Float.valueOf(this.f28613q));
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            a5.a.e(bitmap);
        } else {
            a5.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f28597a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f28597a = charSequence.toString();
        } else {
            this.f28597a = null;
        }
        this.f28598b = alignment;
        this.f28599c = alignment2;
        this.f28600d = bitmap;
        this.f28601e = f10;
        this.f28602f = i10;
        this.f28603g = i11;
        this.f28604h = f11;
        this.f28605i = i12;
        this.f28606j = f13;
        this.f28607k = f14;
        this.f28608l = z10;
        this.f28609m = i14;
        this.f28610n = i13;
        this.f28611o = f12;
        this.f28612p = i15;
        this.f28613q = f15;
    }
}
