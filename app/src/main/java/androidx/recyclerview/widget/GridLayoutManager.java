package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean I;
    int J;
    int[] K;
    View[] L;
    final SparseIntArray M;
    final SparseIntArray N;
    c O;
    final Rect P;
    private boolean Q;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return 1;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f3800a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        final SparseIntArray f3801b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        private boolean f3802c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3803d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f3803d) {
                return d(i10, i11);
            }
            int i12 = this.f3801b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int d10 = d(i10, i11);
            this.f3801b.put(i10, d10);
            return d10;
        }

        int c(int i10, int i11) {
            if (!this.f3802c) {
                return e(i10, i11);
            }
            int i12 = this.f3800a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int e8 = e(i10, i11);
            this.f3800a.put(i10, e8);
            return e8;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int a10;
            if (!this.f3803d || (a10 = a(this.f3801b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            } else {
                i12 = this.f3801b.get(a10);
                i13 = a10 + 1;
                i14 = c(a10, i11) + f(a10);
                if (i14 == i11) {
                    i12++;
                    i14 = 0;
                }
            }
            int f10 = f(i10);
            while (i13 < i10) {
                int f11 = f(i13);
                i14 += f11;
                if (i14 == i11) {
                    i12++;
                    i14 = 0;
                } else if (i14 > i11) {
                    i12++;
                    i14 = f11;
                }
                i13++;
            }
            return i14 + f10 > i11 ? i12 + 1 : i12;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f3801b.clear();
        }

        public void h() {
            this.f3800a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        b3(RecyclerView.p.i0(context, attributeSet, i10, i11).f3887b);
    }

    private void J2(RecyclerView.v vVar, RecyclerView.z zVar, int i10, boolean z10) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = -1;
        if (z10) {
            i12 = 1;
            i14 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
        }
        while (i11 != i14) {
            View view = this.L[i11];
            b bVar = (b) view.getLayoutParams();
            int W2 = W2(vVar, zVar, h0(view));
            bVar.f3799f = W2;
            bVar.f3798e = i13;
            i13 += W2;
            i11 += i12;
        }
    }

    private void K2() {
        int J = J();
        for (int i10 = 0; i10 < J; i10++) {
            b bVar = (b) I(i10).getLayoutParams();
            int a10 = bVar.a();
            this.M.put(a10, bVar.f());
            this.N.put(a10, bVar.e());
        }
    }

    private void L2(int i10) {
        this.K = M2(this.K, this.J, i10);
    }

    static int[] M2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void N2() {
        this.M.clear();
        this.N.clear();
    }

    private int O2(RecyclerView.z zVar) {
        int max;
        if (J() != 0 && zVar.b() != 0) {
            T1();
            boolean n22 = n2();
            View X1 = X1(!n22, true);
            View W1 = W1(!n22, true);
            if (X1 != null && W1 != null) {
                int b10 = this.O.b(h0(X1), this.J);
                int b11 = this.O.b(h0(W1), this.J);
                int min = Math.min(b10, b11);
                int max2 = Math.max(b10, b11);
                int b12 = this.O.b(zVar.b() - 1, this.J) + 1;
                if (this.f3809x) {
                    max = Math.max(0, (b12 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (n22) {
                    return Math.round((max * (Math.abs(this.f3806u.d(W1) - this.f3806u.g(X1)) / ((this.O.b(h0(W1), this.J) - this.O.b(h0(X1), this.J)) + 1))) + (this.f3806u.m() - this.f3806u.g(X1)));
                }
                return max;
            }
        }
        return 0;
    }

    private int P2(RecyclerView.z zVar) {
        if (J() != 0 && zVar.b() != 0) {
            T1();
            View X1 = X1(!n2(), true);
            View W1 = W1(!n2(), true);
            if (X1 != null && W1 != null) {
                if (!n2()) {
                    return this.O.b(zVar.b() - 1, this.J) + 1;
                }
                int d10 = this.f3806u.d(W1) - this.f3806u.g(X1);
                int b10 = this.O.b(h0(X1), this.J);
                return (int) ((d10 / ((this.O.b(h0(W1), this.J) - b10) + 1)) * (this.O.b(zVar.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    private void Q2(RecyclerView.v vVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int V2 = V2(vVar, zVar, aVar.f3816b);
        if (z10) {
            while (V2 > 0) {
                int i11 = aVar.f3816b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f3816b = i12;
                V2 = V2(vVar, zVar, i12);
            }
            return;
        }
        int b10 = zVar.b() - 1;
        int i13 = aVar.f3816b;
        while (i13 < b10) {
            int i14 = i13 + 1;
            int V22 = V2(vVar, zVar, i14);
            if (V22 <= V2) {
                break;
            }
            i13 = i14;
            V2 = V22;
        }
        aVar.f3816b = i13;
    }

    private void R2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int U2(RecyclerView.v vVar, RecyclerView.z zVar, int i10) {
        if (!zVar.e()) {
            return this.O.b(i10, this.J);
        }
        int f10 = vVar.f(i10);
        if (f10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.O.b(f10, this.J);
    }

    private int V2(RecyclerView.v vVar, RecyclerView.z zVar, int i10) {
        if (!zVar.e()) {
            return this.O.c(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = vVar.f(i10);
        if (f10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return this.O.c(f10, this.J);
    }

    private int W2(RecyclerView.v vVar, RecyclerView.z zVar, int i10) {
        if (!zVar.e()) {
            return this.O.f(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = vVar.f(i10);
        if (f10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.O.f(f10);
    }

    private void Y2(float f10, int i10) {
        L2(Math.max(Math.round(f10 * this.J), i10));
    }

    private void Z2(View view, int i10, boolean z10) {
        int i11;
        int i12;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f3891b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int S2 = S2(bVar.f3798e, bVar.f3799f);
        if (this.f3804s == 1) {
            i12 = RecyclerView.p.K(S2, i10, i14, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i11 = RecyclerView.p.K(this.f3806u.n(), X(), i13, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int K = RecyclerView.p.K(S2, i10, i13, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int K2 = RecyclerView.p.K(this.f3806u.n(), p0(), i14, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i11 = K;
            i12 = K2;
        }
        a3(view, i12, i11, z10);
    }

    private void a3(View view, int i10, int i11, boolean z10) {
        boolean F1;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10) {
            F1 = H1(view, i10, i11, qVar);
        } else {
            F1 = F1(view, i10, i11, qVar);
        }
        if (F1) {
            view.measure(i10, i11);
        }
    }

    private void c3() {
        int W;
        int g02;
        if (l2() == 1) {
            W = o0() - f0();
            g02 = e0();
        } else {
            W = W() - d0();
            g02 = g0();
        }
        L2(W - g02);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A2(boolean z10) {
        if (!z10) {
            super.A2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C1(Rect rect, int i10, int i11) {
        int n10;
        int n11;
        if (this.K == null) {
            super.C1(rect, i10, i11);
        }
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f3804s == 1) {
            n11 = RecyclerView.p.n(i11, rect.height() + g02, b0());
            int[] iArr = this.K;
            n10 = RecyclerView.p.n(i10, iArr[iArr.length - 1] + e02, c0());
        } else {
            n10 = RecyclerView.p.n(i10, rect.width() + e02, c0());
            int[] iArr2 = this.K;
            n11 = RecyclerView.p.n(i11, iArr2[iArr2.length - 1] + g02, b0());
        }
        B1(n10, n11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        if (this.f3804s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.z r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean L1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int N(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.f3804s == 1) {
            return this.J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return U2(vVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void N1(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && cVar.c(zVar) && i10 > 0; i11++) {
            int i12 = cVar.f3827d;
            cVar2.a(i12, Math.max(0, cVar.f3830g));
            i10 -= this.O.f(i12);
            cVar.f3827d += cVar.f3828e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(RecyclerView.v vVar, RecyclerView.z zVar, View view, androidx.core.view.accessibility.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.O0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int U2 = U2(vVar, zVar, bVar.a());
        if (this.f3804s == 0) {
            cVar.a0(c.C0048c.a(bVar.e(), bVar.f(), U2, 1, false, false));
        } else {
            cVar.a0(c.C0048c.a(U2, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    int S2(int i10, int i11) {
        if (this.f3804s == 1 && m2()) {
            int[] iArr = this.K;
            int i12 = this.J;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.K;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.O.h();
        this.O.g();
    }

    public int T2() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (zVar.e()) {
            K2();
        }
        super.X0(vVar, zVar);
        N2();
    }

    public c X2() {
        return this.O;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.I = false;
    }

    public void b3(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 >= 1) {
            this.J = i10;
            this.O.h();
            t1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View f2(RecyclerView.v vVar, RecyclerView.z zVar, boolean z10, boolean z11) {
        int i10;
        int J = J();
        int i11 = -1;
        int i12 = 1;
        if (z11) {
            i10 = J() - 1;
            i12 = -1;
        } else {
            i11 = J;
            i10 = 0;
        }
        int b10 = zVar.b();
        T1();
        int m7 = this.f3806u.m();
        int i13 = this.f3806u.i();
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View I = I(i10);
            int h02 = h0(I);
            if (h02 >= 0 && h02 < b10 && V2(vVar, zVar, h02) == 0) {
                if (((RecyclerView.q) I.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else if (this.f3806u.g(I) < i13 && this.f3806u.d(I) >= m7) {
                    return I;
                } else {
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i10 += i12;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int k0(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.f3804s == 0) {
            return this.J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return U2(vVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.f3821b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void o2(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.z r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.o2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void q2(RecyclerView.v vVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i10) {
        super.q2(vVar, zVar, aVar, i10);
        c3();
        if (zVar.b() > 0 && !zVar.e()) {
            Q2(vVar, zVar, aVar, i10);
        }
        R2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.z zVar) {
        if (this.Q) {
            return O2(zVar);
        }
        return super.r(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.z zVar) {
        if (this.Q) {
            return P2(zVar);
        }
        return super.s(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.z zVar) {
        if (this.Q) {
            return O2(zVar);
        }
        return super.u(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.z zVar) {
        if (this.Q) {
            return P2(zVar);
        }
        return super.v(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        c3();
        R2();
        return super.w1(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int y1(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        c3();
        R2();
        return super.y1(i10, vVar, zVar);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends RecyclerView.q {

        /* renamed from: e  reason: collision with root package name */
        int f3798e;

        /* renamed from: f  reason: collision with root package name */
        int f3799f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3798e = -1;
            this.f3799f = 0;
        }

        public int e() {
            return this.f3798e;
        }

        public int f() {
            return this.f3799f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f3798e = -1;
            this.f3799f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3798e = -1;
            this.f3799f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3798e = -1;
            this.f3799f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        b3(i10);
    }
}
