package w4;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: WebvttCssStyle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    private int f32321f;

    /* renamed from: h  reason: collision with root package name */
    private int f32323h;

    /* renamed from: o  reason: collision with root package name */
    private float f32330o;

    /* renamed from: a  reason: collision with root package name */
    private String f32316a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f32317b = "";

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f32318c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private String f32319d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f32320e = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f32322g = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f32324i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f32325j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f32326k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f32327l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f32328m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f32329n = -1;

    /* renamed from: p  reason: collision with root package name */
    private int f32331p = -1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f32332q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public d A(boolean z10) {
        this.f32326k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f32324i) {
            return this.f32323h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f32332q;
    }

    public int c() {
        if (this.f32322g) {
            return this.f32321f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f32320e;
    }

    public float e() {
        return this.f32330o;
    }

    public int f() {
        return this.f32329n;
    }

    public int g() {
        return this.f32331p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f32316a.isEmpty() && this.f32317b.isEmpty() && this.f32318c.isEmpty() && this.f32319d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = B(B(B(0, this.f32316a, str, 1073741824), this.f32317b, str2, 2), this.f32319d, str3, 4);
        if (B == -1 || !set.containsAll(this.f32318c)) {
            return 0;
        }
        return B + (this.f32318c.size() * 4);
    }

    public int i() {
        int i10 = this.f32327l;
        if (i10 == -1 && this.f32328m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f32328m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f32324i;
    }

    public boolean k() {
        return this.f32322g;
    }

    public boolean l() {
        return this.f32325j == 1;
    }

    public boolean m() {
        return this.f32326k == 1;
    }

    public d n(int i10) {
        this.f32323h = i10;
        this.f32324i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f32327l = z10 ? 1 : 0;
        return this;
    }

    public d p(boolean z10) {
        this.f32332q = z10;
        return this;
    }

    public d q(int i10) {
        this.f32321f = i10;
        this.f32322g = true;
        return this;
    }

    public d r(String str) {
        this.f32320e = str == null ? null : x5.a.e(str);
        return this;
    }

    public d s(float f10) {
        this.f32330o = f10;
        return this;
    }

    public d t(int i10) {
        this.f32329n = i10;
        return this;
    }

    public d u(boolean z10) {
        this.f32328m = z10 ? 1 : 0;
        return this;
    }

    public d v(int i10) {
        this.f32331p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f32318c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f32316a = str;
    }

    public void y(String str) {
        this.f32317b = str;
    }

    public void z(String str) {
        this.f32319d = str;
    }
}
