package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import com.ironsource.ug;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ConstraintSet.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f2122d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    private static SparseIntArray f2123e;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f2124a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f2125b = true;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Integer, a> f2126c = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f2127a;

        /* renamed from: b  reason: collision with root package name */
        public final C0033d f2128b = new C0033d();

        /* renamed from: c  reason: collision with root package name */
        public final c f2129c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final b f2130d = new b();

        /* renamed from: e  reason: collision with root package name */
        public final e f2131e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f2132f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i10, ConstraintLayout.b bVar) {
            this.f2127a = i10;
            b bVar2 = this.f2130d;
            bVar2.f2148h = bVar.f2038d;
            bVar2.f2150i = bVar.f2040e;
            bVar2.f2152j = bVar.f2042f;
            bVar2.f2154k = bVar.f2044g;
            bVar2.f2155l = bVar.f2046h;
            bVar2.f2156m = bVar.f2048i;
            bVar2.f2157n = bVar.f2050j;
            bVar2.f2158o = bVar.f2052k;
            bVar2.f2159p = bVar.f2054l;
            bVar2.f2160q = bVar.f2062p;
            bVar2.f2161r = bVar.f2063q;
            bVar2.f2162s = bVar.f2064r;
            bVar2.f2163t = bVar.f2065s;
            bVar2.f2164u = bVar.f2072z;
            bVar2.f2165v = bVar.A;
            bVar2.f2166w = bVar.B;
            bVar2.f2167x = bVar.f2056m;
            bVar2.f2168y = bVar.f2058n;
            bVar2.f2169z = bVar.f2060o;
            bVar2.A = bVar.Q;
            bVar2.B = bVar.R;
            bVar2.C = bVar.S;
            bVar2.f2146g = bVar.f2036c;
            bVar2.f2142e = bVar.f2032a;
            bVar2.f2144f = bVar.f2034b;
            bVar2.f2138c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f2140d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.P = bVar.F;
            bVar2.Q = bVar.E;
            bVar2.S = bVar.H;
            bVar2.R = bVar.G;
            bVar2.f2149h0 = bVar.T;
            bVar2.f2151i0 = bVar.U;
            bVar2.T = bVar.I;
            bVar2.U = bVar.J;
            bVar2.V = bVar.M;
            bVar2.W = bVar.N;
            bVar2.X = bVar.K;
            bVar2.Y = bVar.L;
            bVar2.Z = bVar.O;
            bVar2.f2135a0 = bVar.P;
            bVar2.f2147g0 = bVar.V;
            bVar2.K = bVar.f2067u;
            bVar2.M = bVar.f2069w;
            bVar2.J = bVar.f2066t;
            bVar2.L = bVar.f2068v;
            bVar2.O = bVar.f2070x;
            bVar2.N = bVar.f2071y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar2.H = bVar.getMarginEnd();
                this.f2130d.I = bVar.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i10, e.a aVar) {
            f(i10, aVar);
            this.f2128b.f2181d = aVar.f2198p0;
            e eVar = this.f2131e;
            eVar.f2185b = aVar.f2201s0;
            eVar.f2186c = aVar.f2202t0;
            eVar.f2187d = aVar.f2203u0;
            eVar.f2188e = aVar.f2204v0;
            eVar.f2189f = aVar.f2205w0;
            eVar.f2190g = aVar.f2206x0;
            eVar.f2191h = aVar.f2207y0;
            eVar.f2192i = aVar.f2208z0;
            eVar.f2193j = aVar.A0;
            eVar.f2194k = aVar.B0;
            eVar.f2196m = aVar.f2200r0;
            eVar.f2195l = aVar.f2199q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.b bVar, int i10, e.a aVar) {
            g(i10, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f2130d;
                bVar2.f2141d0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f2137b0 = barrier.getType();
                this.f2130d.f2143e0 = barrier.getReferencedIds();
                this.f2130d.f2139c0 = barrier.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f2130d;
            bVar.f2038d = bVar2.f2148h;
            bVar.f2040e = bVar2.f2150i;
            bVar.f2042f = bVar2.f2152j;
            bVar.f2044g = bVar2.f2154k;
            bVar.f2046h = bVar2.f2155l;
            bVar.f2048i = bVar2.f2156m;
            bVar.f2050j = bVar2.f2157n;
            bVar.f2052k = bVar2.f2158o;
            bVar.f2054l = bVar2.f2159p;
            bVar.f2062p = bVar2.f2160q;
            bVar.f2063q = bVar2.f2161r;
            bVar.f2064r = bVar2.f2162s;
            bVar.f2065s = bVar2.f2163t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.G;
            bVar.f2070x = bVar2.O;
            bVar.f2071y = bVar2.N;
            bVar.f2067u = bVar2.K;
            bVar.f2069w = bVar2.M;
            bVar.f2072z = bVar2.f2164u;
            bVar.A = bVar2.f2165v;
            bVar.f2056m = bVar2.f2167x;
            bVar.f2058n = bVar2.f2168y;
            bVar.f2060o = bVar2.f2169z;
            bVar.B = bVar2.f2166w;
            bVar.Q = bVar2.A;
            bVar.R = bVar2.B;
            bVar.F = bVar2.P;
            bVar.E = bVar2.Q;
            bVar.H = bVar2.S;
            bVar.G = bVar2.R;
            bVar.T = bVar2.f2149h0;
            bVar.U = bVar2.f2151i0;
            bVar.I = bVar2.T;
            bVar.J = bVar2.U;
            bVar.M = bVar2.V;
            bVar.N = bVar2.W;
            bVar.K = bVar2.X;
            bVar.L = bVar2.Y;
            bVar.O = bVar2.Z;
            bVar.P = bVar2.f2135a0;
            bVar.S = bVar2.C;
            bVar.f2036c = bVar2.f2146g;
            bVar.f2032a = bVar2.f2142e;
            bVar.f2034b = bVar2.f2144f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f2138c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f2140d;
            String str = bVar2.f2147g0;
            if (str != null) {
                bVar.V = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(bVar2.I);
                bVar.setMarginEnd(this.f2130d.H);
            }
            bVar.a();
        }

        /* renamed from: e */
        public a clone() {
            a aVar = new a();
            aVar.f2130d.a(this.f2130d);
            aVar.f2129c.a(this.f2129c);
            aVar.f2128b.a(this.f2128b);
            aVar.f2131e.a(this.f2131e);
            aVar.f2127a = this.f2127a;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: k0  reason: collision with root package name */
        private static SparseIntArray f2133k0;

        /* renamed from: c  reason: collision with root package name */
        public int f2138c;

        /* renamed from: d  reason: collision with root package name */
        public int f2140d;

        /* renamed from: e0  reason: collision with root package name */
        public int[] f2143e0;

        /* renamed from: f0  reason: collision with root package name */
        public String f2145f0;

        /* renamed from: g0  reason: collision with root package name */
        public String f2147g0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2134a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2136b = false;

        /* renamed from: e  reason: collision with root package name */
        public int f2142e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2144f = -1;

        /* renamed from: g  reason: collision with root package name */
        public float f2146g = -1.0f;

        /* renamed from: h  reason: collision with root package name */
        public int f2148h = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f2150i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f2152j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f2154k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f2155l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f2156m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f2157n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f2158o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f2159p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f2160q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f2161r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f2162s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f2163t = -1;

        /* renamed from: u  reason: collision with root package name */
        public float f2164u = 0.5f;

        /* renamed from: v  reason: collision with root package name */
        public float f2165v = 0.5f;

        /* renamed from: w  reason: collision with root package name */
        public String f2166w = null;

        /* renamed from: x  reason: collision with root package name */
        public int f2167x = -1;

        /* renamed from: y  reason: collision with root package name */
        public int f2168y = 0;

        /* renamed from: z  reason: collision with root package name */
        public float f2169z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;

        /* renamed from: a0  reason: collision with root package name */
        public float f2135a0 = 1.0f;

        /* renamed from: b0  reason: collision with root package name */
        public int f2137b0 = -1;

        /* renamed from: c0  reason: collision with root package name */
        public int f2139c0 = 0;

        /* renamed from: d0  reason: collision with root package name */
        public int f2141d0 = -1;

        /* renamed from: h0  reason: collision with root package name */
        public boolean f2149h0 = false;

        /* renamed from: i0  reason: collision with root package name */
        public boolean f2151i0 = false;

        /* renamed from: j0  reason: collision with root package name */
        public boolean f2153j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2133k0 = sparseIntArray;
            sparseIntArray.append(i.F3, 24);
            f2133k0.append(i.G3, 25);
            f2133k0.append(i.I3, 28);
            f2133k0.append(i.J3, 29);
            f2133k0.append(i.O3, 35);
            f2133k0.append(i.N3, 34);
            f2133k0.append(i.f2322q3, 4);
            f2133k0.append(i.f2316p3, 3);
            f2133k0.append(i.f2304n3, 1);
            f2133k0.append(i.T3, 6);
            f2133k0.append(i.U3, 7);
            f2133k0.append(i.f2364x3, 17);
            f2133k0.append(i.f2370y3, 18);
            f2133k0.append(i.f2376z3, 19);
            f2133k0.append(i.Y2, 26);
            f2133k0.append(i.K3, 31);
            f2133k0.append(i.L3, 32);
            f2133k0.append(i.f2358w3, 10);
            f2133k0.append(i.f2352v3, 9);
            f2133k0.append(i.X3, 13);
            f2133k0.append(i.f2217a4, 16);
            f2133k0.append(i.Y3, 14);
            f2133k0.append(i.V3, 11);
            f2133k0.append(i.Z3, 15);
            f2133k0.append(i.W3, 12);
            f2133k0.append(i.R3, 38);
            f2133k0.append(i.D3, 37);
            f2133k0.append(i.C3, 39);
            f2133k0.append(i.Q3, 40);
            f2133k0.append(i.B3, 20);
            f2133k0.append(i.P3, 36);
            f2133k0.append(i.f2346u3, 5);
            f2133k0.append(i.E3, 76);
            f2133k0.append(i.M3, 76);
            f2133k0.append(i.H3, 76);
            f2133k0.append(i.f2310o3, 76);
            f2133k0.append(i.f2298m3, 76);
            f2133k0.append(i.f2223b3, 23);
            f2133k0.append(i.f2237d3, 27);
            f2133k0.append(i.f2251f3, 30);
            f2133k0.append(i.f2258g3, 8);
            f2133k0.append(i.f2230c3, 33);
            f2133k0.append(i.f2244e3, 2);
            f2133k0.append(i.Z2, 22);
            f2133k0.append(i.f2216a3, 21);
            f2133k0.append(i.f2328r3, 61);
            f2133k0.append(i.f2340t3, 62);
            f2133k0.append(i.f2334s3, 63);
            f2133k0.append(i.S3, 69);
            f2133k0.append(i.A3, 70);
            f2133k0.append(i.f2286k3, 71);
            f2133k0.append(i.f2272i3, 72);
            f2133k0.append(i.f2279j3, 73);
            f2133k0.append(i.f2292l3, 74);
            f2133k0.append(i.f2265h3, 75);
        }

        public void a(b bVar) {
            this.f2134a = bVar.f2134a;
            this.f2138c = bVar.f2138c;
            this.f2136b = bVar.f2136b;
            this.f2140d = bVar.f2140d;
            this.f2142e = bVar.f2142e;
            this.f2144f = bVar.f2144f;
            this.f2146g = bVar.f2146g;
            this.f2148h = bVar.f2148h;
            this.f2150i = bVar.f2150i;
            this.f2152j = bVar.f2152j;
            this.f2154k = bVar.f2154k;
            this.f2155l = bVar.f2155l;
            this.f2156m = bVar.f2156m;
            this.f2157n = bVar.f2157n;
            this.f2158o = bVar.f2158o;
            this.f2159p = bVar.f2159p;
            this.f2160q = bVar.f2160q;
            this.f2161r = bVar.f2161r;
            this.f2162s = bVar.f2162s;
            this.f2163t = bVar.f2163t;
            this.f2164u = bVar.f2164u;
            this.f2165v = bVar.f2165v;
            this.f2166w = bVar.f2166w;
            this.f2167x = bVar.f2167x;
            this.f2168y = bVar.f2168y;
            this.f2169z = bVar.f2169z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f2135a0 = bVar.f2135a0;
            this.f2137b0 = bVar.f2137b0;
            this.f2139c0 = bVar.f2139c0;
            this.f2141d0 = bVar.f2141d0;
            this.f2147g0 = bVar.f2147g0;
            int[] iArr = bVar.f2143e0;
            if (iArr != null) {
                this.f2143e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2143e0 = null;
            }
            this.f2145f0 = bVar.f2145f0;
            this.f2149h0 = bVar.f2149h0;
            this.f2151i0 = bVar.f2151i0;
            this.f2153j0 = bVar.f2153j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.X2);
            this.f2136b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f2133k0.get(index);
                if (i11 == 80) {
                    this.f2149h0 = obtainStyledAttributes.getBoolean(index, this.f2149h0);
                } else if (i11 != 81) {
                    switch (i11) {
                        case 1:
                            this.f2159p = d.o(obtainStyledAttributes, index, this.f2159p);
                            continue;
                        case 2:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            continue;
                        case 3:
                            this.f2158o = d.o(obtainStyledAttributes, index, this.f2158o);
                            continue;
                        case 4:
                            this.f2157n = d.o(obtainStyledAttributes, index, this.f2157n);
                            continue;
                        case 5:
                            this.f2166w = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            continue;
                        case 7:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            continue;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            this.f2163t = d.o(obtainStyledAttributes, index, this.f2163t);
                            continue;
                        case 10:
                            this.f2162s = d.o(obtainStyledAttributes, index, this.f2162s);
                            continue;
                        case 11:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        case 12:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        case 13:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        case 14:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        case 15:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        case 16:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        case 17:
                            this.f2142e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2142e);
                            continue;
                        case 18:
                            this.f2144f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2144f);
                            continue;
                        case 19:
                            this.f2146g = obtainStyledAttributes.getFloat(index, this.f2146g);
                            continue;
                        case 20:
                            this.f2164u = obtainStyledAttributes.getFloat(index, this.f2164u);
                            continue;
                        case 21:
                            this.f2140d = obtainStyledAttributes.getLayoutDimension(index, this.f2140d);
                            continue;
                        case 22:
                            this.f2138c = obtainStyledAttributes.getLayoutDimension(index, this.f2138c);
                            continue;
                        case 23:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            continue;
                        case 24:
                            this.f2148h = d.o(obtainStyledAttributes, index, this.f2148h);
                            continue;
                        case 25:
                            this.f2150i = d.o(obtainStyledAttributes, index, this.f2150i);
                            continue;
                        case 26:
                            this.C = obtainStyledAttributes.getInt(index, this.C);
                            continue;
                        case 27:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            continue;
                        case 28:
                            this.f2152j = d.o(obtainStyledAttributes, index, this.f2152j);
                            continue;
                        case 29:
                            this.f2154k = d.o(obtainStyledAttributes, index, this.f2154k);
                            continue;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                                break;
                            } else {
                                continue;
                            }
                        case 31:
                            this.f2160q = d.o(obtainStyledAttributes, index, this.f2160q);
                            continue;
                        case 32:
                            this.f2161r = d.o(obtainStyledAttributes, index, this.f2161r);
                            continue;
                        case 33:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            continue;
                        case 34:
                            this.f2156m = d.o(obtainStyledAttributes, index, this.f2156m);
                            continue;
                        case 35:
                            this.f2155l = d.o(obtainStyledAttributes, index, this.f2155l);
                            continue;
                        case 36:
                            this.f2165v = obtainStyledAttributes.getFloat(index, this.f2165v);
                            continue;
                        case 37:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            continue;
                        case 38:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            continue;
                        case 39:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            continue;
                        case 40:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            continue;
                        default:
                            switch (i11) {
                                case 54:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    continue;
                                case 55:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    continue;
                                case 56:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    continue;
                                case 57:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    continue;
                                case 58:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    continue;
                                case 59:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    continue;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.f2167x = d.o(obtainStyledAttributes, index, this.f2167x);
                                            continue;
                                        case 62:
                                            this.f2168y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2168y);
                                            continue;
                                        case 63:
                                            this.f2169z = obtainStyledAttributes.getFloat(index, this.f2169z);
                                            continue;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f2135a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f2137b0 = obtainStyledAttributes.getInt(index, this.f2137b0);
                                                    continue;
                                                case 73:
                                                    this.f2139c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2139c0);
                                                    continue;
                                                case 74:
                                                    this.f2145f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f2153j0 = obtainStyledAttributes.getBoolean(index, this.f2153j0);
                                                    continue;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2133k0.get(index));
                                                    continue;
                                                case 77:
                                                    this.f2147g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2133k0.get(index));
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f2151i0 = obtainStyledAttributes.getBoolean(index, this.f2151i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: h  reason: collision with root package name */
        private static SparseIntArray f2170h;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2171a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2172b = -1;

        /* renamed from: c  reason: collision with root package name */
        public String f2173c = null;

        /* renamed from: d  reason: collision with root package name */
        public int f2174d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f2175e = 0;

        /* renamed from: f  reason: collision with root package name */
        public float f2176f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public float f2177g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2170h = sparseIntArray;
            sparseIntArray.append(i.f2293l4, 1);
            f2170h.append(i.f2305n4, 2);
            f2170h.append(i.f2311o4, 3);
            f2170h.append(i.f2287k4, 4);
            f2170h.append(i.f2280j4, 5);
            f2170h.append(i.f2299m4, 6);
        }

        public void a(c cVar) {
            this.f2171a = cVar.f2171a;
            this.f2172b = cVar.f2172b;
            this.f2173c = cVar.f2173c;
            this.f2174d = cVar.f2174d;
            this.f2175e = cVar.f2175e;
            this.f2177g = cVar.f2177g;
            this.f2176f = cVar.f2176f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f2273i4);
            this.f2171a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2170h.get(index)) {
                    case 1:
                        this.f2177g = obtainStyledAttributes.getFloat(index, this.f2177g);
                        break;
                    case 2:
                        this.f2174d = obtainStyledAttributes.getInt(index, this.f2174d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2173c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f2173c = p.a.f29508c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f2175e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2172b = d.o(obtainStyledAttributes, index, this.f2172b);
                        break;
                    case 6:
                        this.f2176f = obtainStyledAttributes.getFloat(index, this.f2176f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0033d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2178a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2179b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2180c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f2181d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2182e = Float.NaN;

        public void a(C0033d c0033d) {
            this.f2178a = c0033d.f2178a;
            this.f2179b = c0033d.f2179b;
            this.f2181d = c0033d.f2181d;
            this.f2182e = c0033d.f2182e;
            this.f2180c = c0033d.f2180c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f2365x4);
            this.f2178a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f2377z4) {
                    this.f2181d = obtainStyledAttributes.getFloat(index, this.f2181d);
                } else if (index == i.f2371y4) {
                    this.f2179b = obtainStyledAttributes.getInt(index, this.f2179b);
                    this.f2179b = d.f2122d[this.f2179b];
                } else if (index == i.B4) {
                    this.f2180c = obtainStyledAttributes.getInt(index, this.f2180c);
                } else if (index == i.A4) {
                    this.f2182e = obtainStyledAttributes.getFloat(index, this.f2182e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e {

        /* renamed from: n  reason: collision with root package name */
        private static SparseIntArray f2183n;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2184a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f2185b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f2186c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f2187d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2188e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f2189f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f2190g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f2191h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public float f2192i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f2193j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f2194k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2195l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f2196m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2183n = sparseIntArray;
            sparseIntArray.append(i.V4, 1);
            f2183n.append(i.W4, 2);
            f2183n.append(i.X4, 3);
            f2183n.append(i.T4, 4);
            f2183n.append(i.U4, 5);
            f2183n.append(i.P4, 6);
            f2183n.append(i.Q4, 7);
            f2183n.append(i.R4, 8);
            f2183n.append(i.S4, 9);
            f2183n.append(i.Y4, 10);
            f2183n.append(i.Z4, 11);
        }

        public void a(e eVar) {
            this.f2184a = eVar.f2184a;
            this.f2185b = eVar.f2185b;
            this.f2186c = eVar.f2186c;
            this.f2187d = eVar.f2187d;
            this.f2188e = eVar.f2188e;
            this.f2189f = eVar.f2189f;
            this.f2190g = eVar.f2190g;
            this.f2191h = eVar.f2191h;
            this.f2192i = eVar.f2192i;
            this.f2193j = eVar.f2193j;
            this.f2194k = eVar.f2194k;
            this.f2195l = eVar.f2195l;
            this.f2196m = eVar.f2196m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.O4);
            this.f2184a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2183n.get(index)) {
                    case 1:
                        this.f2185b = obtainStyledAttributes.getFloat(index, this.f2185b);
                        break;
                    case 2:
                        this.f2186c = obtainStyledAttributes.getFloat(index, this.f2186c);
                        break;
                    case 3:
                        this.f2187d = obtainStyledAttributes.getFloat(index, this.f2187d);
                        break;
                    case 4:
                        this.f2188e = obtainStyledAttributes.getFloat(index, this.f2188e);
                        break;
                    case 5:
                        this.f2189f = obtainStyledAttributes.getFloat(index, this.f2189f);
                        break;
                    case 6:
                        this.f2190g = obtainStyledAttributes.getDimension(index, this.f2190g);
                        break;
                    case 7:
                        this.f2191h = obtainStyledAttributes.getDimension(index, this.f2191h);
                        break;
                    case 8:
                        this.f2192i = obtainStyledAttributes.getDimension(index, this.f2192i);
                        break;
                    case 9:
                        this.f2193j = obtainStyledAttributes.getDimension(index, this.f2193j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f2194k = obtainStyledAttributes.getDimension(index, this.f2194k);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f2195l = true;
                            this.f2196m = obtainStyledAttributes.getDimension(index, this.f2196m);
                            break;
                        } else {
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2123e = sparseIntArray;
        sparseIntArray.append(i.f2343u0, 25);
        f2123e.append(i.f2349v0, 26);
        f2123e.append(i.f2361x0, 29);
        f2123e.append(i.f2367y0, 30);
        f2123e.append(i.E0, 36);
        f2123e.append(i.D0, 35);
        f2123e.append(i.f2227c0, 4);
        f2123e.append(i.f2220b0, 3);
        f2123e.append(i.Z, 1);
        f2123e.append(i.M0, 6);
        f2123e.append(i.N0, 7);
        f2123e.append(i.f2276j0, 17);
        f2123e.append(i.f2283k0, 18);
        f2123e.append(i.f2289l0, 19);
        f2123e.append(i.f2330s, 27);
        f2123e.append(i.f2373z0, 32);
        f2123e.append(i.A0, 33);
        f2123e.append(i.f2269i0, 10);
        f2123e.append(i.f2262h0, 9);
        f2123e.append(i.Q0, 13);
        f2123e.append(i.T0, 16);
        f2123e.append(i.R0, 14);
        f2123e.append(i.O0, 11);
        f2123e.append(i.S0, 15);
        f2123e.append(i.P0, 12);
        f2123e.append(i.H0, 40);
        f2123e.append(i.f2331s0, 39);
        f2123e.append(i.f2325r0, 41);
        f2123e.append(i.G0, 42);
        f2123e.append(i.f2319q0, 20);
        f2123e.append(i.F0, 37);
        f2123e.append(i.f2255g0, 5);
        f2123e.append(i.f2337t0, 82);
        f2123e.append(i.C0, 82);
        f2123e.append(i.f2355w0, 82);
        f2123e.append(i.f2213a0, 82);
        f2123e.append(i.Y, 82);
        f2123e.append(i.f2360x, 24);
        f2123e.append(i.f2372z, 28);
        f2123e.append(i.L, 31);
        f2123e.append(i.M, 8);
        f2123e.append(i.f2366y, 34);
        f2123e.append(i.A, 2);
        f2123e.append(i.f2348v, 23);
        f2123e.append(i.f2354w, 21);
        f2123e.append(i.f2342u, 22);
        f2123e.append(i.B, 43);
        f2123e.append(i.O, 44);
        f2123e.append(i.J, 45);
        f2123e.append(i.K, 46);
        f2123e.append(i.I, 60);
        f2123e.append(i.G, 47);
        f2123e.append(i.H, 48);
        f2123e.append(i.C, 49);
        f2123e.append(i.D, 50);
        f2123e.append(i.E, 51);
        f2123e.append(i.F, 52);
        f2123e.append(i.N, 53);
        f2123e.append(i.I0, 54);
        f2123e.append(i.f2295m0, 55);
        f2123e.append(i.J0, 56);
        f2123e.append(i.f2301n0, 57);
        f2123e.append(i.K0, 58);
        f2123e.append(i.f2307o0, 59);
        f2123e.append(i.f2234d0, 61);
        f2123e.append(i.f2248f0, 62);
        f2123e.append(i.f2241e0, 63);
        f2123e.append(i.P, 64);
        f2123e.append(i.X0, 65);
        f2123e.append(i.V, 66);
        f2123e.append(i.Y0, 67);
        f2123e.append(i.V0, 79);
        f2123e.append(i.f2336t, 38);
        f2123e.append(i.U0, 68);
        f2123e.append(i.L0, 69);
        f2123e.append(i.f2313p0, 70);
        f2123e.append(i.T, 71);
        f2123e.append(i.R, 72);
        f2123e.append(i.S, 73);
        f2123e.append(i.U, 74);
        f2123e.append(i.Q, 75);
        f2123e.append(i.W0, 76);
        f2123e.append(i.B0, 77);
        f2123e.append(i.Z0, 78);
        f2123e.append(i.X, 80);
        f2123e.append(i.W, 81);
    }

    private int[] j(View view, String str) {
        int i10;
        Object g10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, ug.f21009x, context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (g10 = ((ConstraintLayout) view.getParent()).g(0, trim)) != null && (g10 instanceof Integer)) {
                i10 = ((Integer) g10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    private a k(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f2324r);
        p(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a l(int i10) {
        if (!this.f2126c.containsKey(Integer.valueOf(i10))) {
            this.f2126c.put(Integer.valueOf(i10), new a());
        }
        return this.f2126c.get(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    private void p(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != i.f2336t && i.L != index && i.M != index) {
                aVar.f2129c.f2171a = true;
                aVar.f2130d.f2136b = true;
                aVar.f2128b.f2178a = true;
                aVar.f2131e.f2184a = true;
            }
            switch (f2123e.get(index)) {
                case 1:
                    b bVar = aVar.f2130d;
                    bVar.f2159p = o(typedArray, index, bVar.f2159p);
                    break;
                case 2:
                    b bVar2 = aVar.f2130d;
                    bVar2.G = typedArray.getDimensionPixelSize(index, bVar2.G);
                    break;
                case 3:
                    b bVar3 = aVar.f2130d;
                    bVar3.f2158o = o(typedArray, index, bVar3.f2158o);
                    break;
                case 4:
                    b bVar4 = aVar.f2130d;
                    bVar4.f2157n = o(typedArray, index, bVar4.f2157n);
                    break;
                case 5:
                    aVar.f2130d.f2166w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f2130d;
                    bVar5.A = typedArray.getDimensionPixelOffset(index, bVar5.A);
                    break;
                case 7:
                    b bVar6 = aVar.f2130d;
                    bVar6.B = typedArray.getDimensionPixelOffset(index, bVar6.B);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar7 = aVar.f2130d;
                        bVar7.H = typedArray.getDimensionPixelSize(index, bVar7.H);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    b bVar8 = aVar.f2130d;
                    bVar8.f2163t = o(typedArray, index, bVar8.f2163t);
                    break;
                case 10:
                    b bVar9 = aVar.f2130d;
                    bVar9.f2162s = o(typedArray, index, bVar9.f2162s);
                    break;
                case 11:
                    b bVar10 = aVar.f2130d;
                    bVar10.M = typedArray.getDimensionPixelSize(index, bVar10.M);
                    break;
                case 12:
                    b bVar11 = aVar.f2130d;
                    bVar11.N = typedArray.getDimensionPixelSize(index, bVar11.N);
                    break;
                case 13:
                    b bVar12 = aVar.f2130d;
                    bVar12.J = typedArray.getDimensionPixelSize(index, bVar12.J);
                    break;
                case 14:
                    b bVar13 = aVar.f2130d;
                    bVar13.L = typedArray.getDimensionPixelSize(index, bVar13.L);
                    break;
                case 15:
                    b bVar14 = aVar.f2130d;
                    bVar14.O = typedArray.getDimensionPixelSize(index, bVar14.O);
                    break;
                case 16:
                    b bVar15 = aVar.f2130d;
                    bVar15.K = typedArray.getDimensionPixelSize(index, bVar15.K);
                    break;
                case 17:
                    b bVar16 = aVar.f2130d;
                    bVar16.f2142e = typedArray.getDimensionPixelOffset(index, bVar16.f2142e);
                    break;
                case 18:
                    b bVar17 = aVar.f2130d;
                    bVar17.f2144f = typedArray.getDimensionPixelOffset(index, bVar17.f2144f);
                    break;
                case 19:
                    b bVar18 = aVar.f2130d;
                    bVar18.f2146g = typedArray.getFloat(index, bVar18.f2146g);
                    break;
                case 20:
                    b bVar19 = aVar.f2130d;
                    bVar19.f2164u = typedArray.getFloat(index, bVar19.f2164u);
                    break;
                case 21:
                    b bVar20 = aVar.f2130d;
                    bVar20.f2140d = typedArray.getLayoutDimension(index, bVar20.f2140d);
                    break;
                case 22:
                    C0033d c0033d = aVar.f2128b;
                    c0033d.f2179b = typedArray.getInt(index, c0033d.f2179b);
                    C0033d c0033d2 = aVar.f2128b;
                    c0033d2.f2179b = f2122d[c0033d2.f2179b];
                    break;
                case 23:
                    b bVar21 = aVar.f2130d;
                    bVar21.f2138c = typedArray.getLayoutDimension(index, bVar21.f2138c);
                    break;
                case 24:
                    b bVar22 = aVar.f2130d;
                    bVar22.D = typedArray.getDimensionPixelSize(index, bVar22.D);
                    break;
                case 25:
                    b bVar23 = aVar.f2130d;
                    bVar23.f2148h = o(typedArray, index, bVar23.f2148h);
                    break;
                case 26:
                    b bVar24 = aVar.f2130d;
                    bVar24.f2150i = o(typedArray, index, bVar24.f2150i);
                    break;
                case 27:
                    b bVar25 = aVar.f2130d;
                    bVar25.C = typedArray.getInt(index, bVar25.C);
                    break;
                case 28:
                    b bVar26 = aVar.f2130d;
                    bVar26.E = typedArray.getDimensionPixelSize(index, bVar26.E);
                    break;
                case 29:
                    b bVar27 = aVar.f2130d;
                    bVar27.f2152j = o(typedArray, index, bVar27.f2152j);
                    break;
                case 30:
                    b bVar28 = aVar.f2130d;
                    bVar28.f2154k = o(typedArray, index, bVar28.f2154k);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar29 = aVar.f2130d;
                        bVar29.I = typedArray.getDimensionPixelSize(index, bVar29.I);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    b bVar30 = aVar.f2130d;
                    bVar30.f2160q = o(typedArray, index, bVar30.f2160q);
                    break;
                case 33:
                    b bVar31 = aVar.f2130d;
                    bVar31.f2161r = o(typedArray, index, bVar31.f2161r);
                    break;
                case 34:
                    b bVar32 = aVar.f2130d;
                    bVar32.F = typedArray.getDimensionPixelSize(index, bVar32.F);
                    break;
                case 35:
                    b bVar33 = aVar.f2130d;
                    bVar33.f2156m = o(typedArray, index, bVar33.f2156m);
                    break;
                case 36:
                    b bVar34 = aVar.f2130d;
                    bVar34.f2155l = o(typedArray, index, bVar34.f2155l);
                    break;
                case 37:
                    b bVar35 = aVar.f2130d;
                    bVar35.f2165v = typedArray.getFloat(index, bVar35.f2165v);
                    break;
                case 38:
                    aVar.f2127a = typedArray.getResourceId(index, aVar.f2127a);
                    break;
                case 39:
                    b bVar36 = aVar.f2130d;
                    bVar36.Q = typedArray.getFloat(index, bVar36.Q);
                    break;
                case 40:
                    b bVar37 = aVar.f2130d;
                    bVar37.P = typedArray.getFloat(index, bVar37.P);
                    break;
                case 41:
                    b bVar38 = aVar.f2130d;
                    bVar38.R = typedArray.getInt(index, bVar38.R);
                    break;
                case 42:
                    b bVar39 = aVar.f2130d;
                    bVar39.S = typedArray.getInt(index, bVar39.S);
                    break;
                case 43:
                    C0033d c0033d3 = aVar.f2128b;
                    c0033d3.f2181d = typedArray.getFloat(index, c0033d3.f2181d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar = aVar.f2131e;
                        eVar.f2195l = true;
                        eVar.f2196m = typedArray.getDimension(index, eVar.f2196m);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    e eVar2 = aVar.f2131e;
                    eVar2.f2186c = typedArray.getFloat(index, eVar2.f2186c);
                    break;
                case 46:
                    e eVar3 = aVar.f2131e;
                    eVar3.f2187d = typedArray.getFloat(index, eVar3.f2187d);
                    break;
                case 47:
                    e eVar4 = aVar.f2131e;
                    eVar4.f2188e = typedArray.getFloat(index, eVar4.f2188e);
                    break;
                case 48:
                    e eVar5 = aVar.f2131e;
                    eVar5.f2189f = typedArray.getFloat(index, eVar5.f2189f);
                    break;
                case 49:
                    e eVar6 = aVar.f2131e;
                    eVar6.f2190g = typedArray.getDimension(index, eVar6.f2190g);
                    break;
                case 50:
                    e eVar7 = aVar.f2131e;
                    eVar7.f2191h = typedArray.getDimension(index, eVar7.f2191h);
                    break;
                case 51:
                    e eVar8 = aVar.f2131e;
                    eVar8.f2192i = typedArray.getDimension(index, eVar8.f2192i);
                    break;
                case 52:
                    e eVar9 = aVar.f2131e;
                    eVar9.f2193j = typedArray.getDimension(index, eVar9.f2193j);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar10 = aVar.f2131e;
                        eVar10.f2194k = typedArray.getDimension(index, eVar10.f2194k);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    b bVar40 = aVar.f2130d;
                    bVar40.T = typedArray.getInt(index, bVar40.T);
                    break;
                case 55:
                    b bVar41 = aVar.f2130d;
                    bVar41.U = typedArray.getInt(index, bVar41.U);
                    break;
                case 56:
                    b bVar42 = aVar.f2130d;
                    bVar42.V = typedArray.getDimensionPixelSize(index, bVar42.V);
                    break;
                case 57:
                    b bVar43 = aVar.f2130d;
                    bVar43.W = typedArray.getDimensionPixelSize(index, bVar43.W);
                    break;
                case 58:
                    b bVar44 = aVar.f2130d;
                    bVar44.X = typedArray.getDimensionPixelSize(index, bVar44.X);
                    break;
                case 59:
                    b bVar45 = aVar.f2130d;
                    bVar45.Y = typedArray.getDimensionPixelSize(index, bVar45.Y);
                    break;
                case 60:
                    e eVar11 = aVar.f2131e;
                    eVar11.f2185b = typedArray.getFloat(index, eVar11.f2185b);
                    break;
                case 61:
                    b bVar46 = aVar.f2130d;
                    bVar46.f2167x = o(typedArray, index, bVar46.f2167x);
                    break;
                case 62:
                    b bVar47 = aVar.f2130d;
                    bVar47.f2168y = typedArray.getDimensionPixelSize(index, bVar47.f2168y);
                    break;
                case 63:
                    b bVar48 = aVar.f2130d;
                    bVar48.f2169z = typedArray.getFloat(index, bVar48.f2169z);
                    break;
                case 64:
                    c cVar = aVar.f2129c;
                    cVar.f2172b = o(typedArray, index, cVar.f2172b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f2129c.f2173c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f2129c.f2173c = p.a.f29508c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f2129c.f2175e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f2129c;
                    cVar2.f2177g = typedArray.getFloat(index, cVar2.f2177g);
                    break;
                case 68:
                    C0033d c0033d4 = aVar.f2128b;
                    c0033d4.f2182e = typedArray.getFloat(index, c0033d4.f2182e);
                    break;
                case 69:
                    aVar.f2130d.Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f2130d.f2135a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f2130d;
                    bVar49.f2137b0 = typedArray.getInt(index, bVar49.f2137b0);
                    break;
                case 73:
                    b bVar50 = aVar.f2130d;
                    bVar50.f2139c0 = typedArray.getDimensionPixelSize(index, bVar50.f2139c0);
                    break;
                case 74:
                    aVar.f2130d.f2145f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f2130d;
                    bVar51.f2153j0 = typedArray.getBoolean(index, bVar51.f2153j0);
                    break;
                case 76:
                    c cVar3 = aVar.f2129c;
                    cVar3.f2174d = typedArray.getInt(index, cVar3.f2174d);
                    break;
                case 77:
                    aVar.f2130d.f2147g0 = typedArray.getString(index);
                    break;
                case 78:
                    C0033d c0033d5 = aVar.f2128b;
                    c0033d5.f2180c = typedArray.getInt(index, c0033d5.f2180c);
                    break;
                case 79:
                    c cVar4 = aVar.f2129c;
                    cVar4.f2176f = typedArray.getFloat(index, cVar4.f2176f);
                    break;
                case 80:
                    b bVar52 = aVar.f2130d;
                    bVar52.f2149h0 = typedArray.getBoolean(index, bVar52.f2149h0);
                    break;
                case 81:
                    b bVar53 = aVar.f2130d;
                    bVar53.f2151i0 = typedArray.getBoolean(index, bVar53.f2151i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2123e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2123e.get(index));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2126c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!this.f2126c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + q.a.a(childAt));
            } else if (this.f2125b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.f2126c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f2126c.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f2130d.f2141d0 = 1;
                        }
                        int i11 = aVar.f2130d.f2141d0;
                        if (i11 != -1 && i11 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f2130d.f2137b0);
                            barrier.setMargin(aVar.f2130d.f2139c0);
                            barrier.setAllowsGoneWidget(aVar.f2130d.f2153j0);
                            b bVar = aVar.f2130d;
                            int[] iArr = bVar.f2143e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f2145f0;
                                if (str != null) {
                                    bVar.f2143e0 = j(barrier, str);
                                    barrier.setReferencedIds(aVar.f2130d.f2143e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z10) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f2132f);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0033d c0033d = aVar.f2128b;
                        if (c0033d.f2180c == 0) {
                            childAt.setVisibility(c0033d.f2179b);
                        }
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 17) {
                            childAt.setAlpha(aVar.f2128b.f2181d);
                            childAt.setRotation(aVar.f2131e.f2185b);
                            childAt.setRotationX(aVar.f2131e.f2186c);
                            childAt.setRotationY(aVar.f2131e.f2187d);
                            childAt.setScaleX(aVar.f2131e.f2188e);
                            childAt.setScaleY(aVar.f2131e.f2189f);
                            if (!Float.isNaN(aVar.f2131e.f2190g)) {
                                childAt.setPivotX(aVar.f2131e.f2190g);
                            }
                            if (!Float.isNaN(aVar.f2131e.f2191h)) {
                                childAt.setPivotY(aVar.f2131e.f2191h);
                            }
                            childAt.setTranslationX(aVar.f2131e.f2192i);
                            childAt.setTranslationY(aVar.f2131e.f2193j);
                            if (i12 >= 21) {
                                childAt.setTranslationZ(aVar.f2131e.f2194k);
                                e eVar = aVar.f2131e;
                                if (eVar.f2195l) {
                                    childAt.setElevation(eVar.f2196m);
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f2126c.get(num);
            int i13 = aVar2.f2130d.f2141d0;
            if (i13 != -1 && i13 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f2130d;
                int[] iArr2 = bVar3.f2143e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f2145f0;
                    if (str2 != null) {
                        bVar3.f2143e0 = j(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f2130d.f2143e0);
                    }
                }
                barrier2.setType(aVar2.f2130d.f2137b0);
                barrier2.setMargin(aVar2.f2130d.f2139c0);
                ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.n();
                aVar2.d(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f2130d.f2134a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.d(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    public void e(int i10, int i11) {
        if (this.f2126c.containsKey(Integer.valueOf(i10))) {
            a aVar = this.f2126c.get(Integer.valueOf(i10));
            switch (i11) {
                case 1:
                    b bVar = aVar.f2130d;
                    bVar.f2150i = -1;
                    bVar.f2148h = -1;
                    bVar.D = -1;
                    bVar.J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f2130d;
                    bVar2.f2154k = -1;
                    bVar2.f2152j = -1;
                    bVar2.E = -1;
                    bVar2.L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f2130d;
                    bVar3.f2156m = -1;
                    bVar3.f2155l = -1;
                    bVar3.F = -1;
                    bVar3.K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f2130d;
                    bVar4.f2157n = -1;
                    bVar4.f2158o = -1;
                    bVar4.G = -1;
                    bVar4.M = -1;
                    return;
                case 5:
                    aVar.f2130d.f2159p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f2130d;
                    bVar5.f2160q = -1;
                    bVar5.f2161r = -1;
                    bVar5.I = -1;
                    bVar5.O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f2130d;
                    bVar6.f2162s = -1;
                    bVar6.f2163t = -1;
                    bVar6.H = -1;
                    bVar6.N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void f(Context context, int i10) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2126c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2125b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2126c.containsKey(Integer.valueOf(id))) {
                this.f2126c.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f2126c.get(Integer.valueOf(id));
            aVar.f2132f = androidx.constraintlayout.widget.a.a(this.f2124a, childAt);
            aVar.f(id, bVar);
            aVar.f2128b.f2179b = childAt.getVisibility();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 17) {
                aVar.f2128b.f2181d = childAt.getAlpha();
                aVar.f2131e.f2185b = childAt.getRotation();
                aVar.f2131e.f2186c = childAt.getRotationX();
                aVar.f2131e.f2187d = childAt.getRotationY();
                aVar.f2131e.f2188e = childAt.getScaleX();
                aVar.f2131e.f2189f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f2131e;
                    eVar.f2190g = pivotX;
                    eVar.f2191h = pivotY;
                }
                aVar.f2131e.f2192i = childAt.getTranslationX();
                aVar.f2131e.f2193j = childAt.getTranslationY();
                if (i11 >= 21) {
                    aVar.f2131e.f2194k = childAt.getTranslationZ();
                    e eVar2 = aVar.f2131e;
                    if (eVar2.f2195l) {
                        eVar2.f2196m = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f2130d.f2153j0 = barrier.o();
                aVar.f2130d.f2143e0 = barrier.getReferencedIds();
                aVar.f2130d.f2137b0 = barrier.getType();
                aVar.f2130d.f2139c0 = barrier.getMargin();
            }
        }
    }

    public void h(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.f2126c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = eVar.getChildAt(i10);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2125b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2126c.containsKey(Integer.valueOf(id))) {
                this.f2126c.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f2126c.get(Integer.valueOf(id));
            if (childAt instanceof androidx.constraintlayout.widget.b) {
                aVar2.h((androidx.constraintlayout.widget.b) childAt, id, aVar);
            }
            aVar2.g(id, aVar);
        }
    }

    public void i(int i10, int i11, int i12, float f10) {
        b bVar = l(i10).f2130d;
        bVar.f2167x = i11;
        bVar.f2168y = i12;
        bVar.f2169z = f10;
    }

    public void m(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a k10 = k(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        k10.f2130d.f2134a = true;
                    }
                    this.f2126c.put(Integer.valueOf(k10.f2127a), k10);
                    continue;
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0179, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.n(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
