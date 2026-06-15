package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: OrientationHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.p f4113a;

    /* renamed from: b  reason: collision with root package name */
    private int f4114b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f4115c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends i {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f4113a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f4113a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f4113a.R(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f4113a.Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f4113a.o0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f4113a.o0() - this.f4113a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f4113a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f4113a.p0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f4113a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f4113a.e0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f4113a.o0() - this.f4113a.e0()) - this.f4113a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f4113a.n0(view, true, this.f4115c);
            return this.f4115c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f4113a.n0(view, true, this.f4115c);
            return this.f4115c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f4113a.C0(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends i {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f4113a.O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f4113a.R(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f4113a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f4113a.U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f4113a.W();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f4113a.W() - this.f4113a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f4113a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f4113a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f4113a.p0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f4113a.g0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f4113a.W() - this.f4113a.g0()) - this.f4113a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f4113a.n0(view, true, this.f4115c);
            return this.f4115c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f4113a.n0(view, true, this.f4115c);
            return this.f4115c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f4113a.D0(i10);
        }
    }

    /* synthetic */ i(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static i a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static i b(RecyclerView.p pVar, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return c(pVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return a(pVar);
    }

    public static i c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f4114b) {
            return 0;
        }
        return n() - this.f4114b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f4114b = n();
    }

    private i(RecyclerView.p pVar) {
        this.f4114b = RecyclerView.UNDEFINED_DURATION;
        this.f4115c = new Rect();
        this.f4113a = pVar;
    }
}
