package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.y.b {
    int A;
    int B;
    private boolean C;
    SavedState D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* renamed from: s  reason: collision with root package name */
    int f3804s;

    /* renamed from: t  reason: collision with root package name */
    private c f3805t;

    /* renamed from: u  reason: collision with root package name */
    i f3806u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f3807v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f3808w;

    /* renamed from: x  reason: collision with root package name */
    boolean f3809x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f3810y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f3811z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f3812a;

        /* renamed from: b  reason: collision with root package name */
        int f3813b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3814c;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        boolean a() {
            return this.f3812a >= 0;
        }

        void b() {
            this.f3812a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3812a);
            parcel.writeInt(this.f3813b);
            parcel.writeInt(this.f3814c ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f3812a = parcel.readInt();
            this.f3813b = parcel.readInt();
            this.f3814c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f3812a = savedState.f3812a;
            this.f3813b = savedState.f3813b;
            this.f3814c = savedState.f3814c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        i f3815a;

        /* renamed from: b  reason: collision with root package name */
        int f3816b;

        /* renamed from: c  reason: collision with root package name */
        int f3817c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3818d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3819e;

        a() {
            e();
        }

        void a() {
            int m7;
            if (this.f3818d) {
                m7 = this.f3815a.i();
            } else {
                m7 = this.f3815a.m();
            }
            this.f3817c = m7;
        }

        public void b(View view, int i10) {
            if (this.f3818d) {
                this.f3817c = this.f3815a.d(view) + this.f3815a.o();
            } else {
                this.f3817c = this.f3815a.g(view);
            }
            this.f3816b = i10;
        }

        public void c(View view, int i10) {
            int o10 = this.f3815a.o();
            if (o10 >= 0) {
                b(view, i10);
                return;
            }
            this.f3816b = i10;
            if (this.f3818d) {
                int i11 = (this.f3815a.i() - o10) - this.f3815a.d(view);
                this.f3817c = this.f3815a.i() - i11;
                if (i11 > 0) {
                    int e8 = this.f3817c - this.f3815a.e(view);
                    int m7 = this.f3815a.m();
                    int min = e8 - (m7 + Math.min(this.f3815a.g(view) - m7, 0));
                    if (min < 0) {
                        this.f3817c += Math.min(i11, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g10 = this.f3815a.g(view);
            int m10 = g10 - this.f3815a.m();
            this.f3817c = g10;
            if (m10 > 0) {
                int i12 = (this.f3815a.i() - Math.min(0, (this.f3815a.i() - o10) - this.f3815a.d(view))) - (g10 + this.f3815a.e(view));
                if (i12 < 0) {
                    this.f3817c -= Math.min(m10, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < zVar.b();
        }

        void e() {
            this.f3816b = -1;
            this.f3817c = RecyclerView.UNDEFINED_DURATION;
            this.f3818d = false;
            this.f3819e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3816b + ", mCoordinate=" + this.f3817c + ", mLayoutFromEnd=" + this.f3818d + ", mValid=" + this.f3819e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3820a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3821b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3822c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3823d;

        protected b() {
        }

        void a() {
            this.f3820a = 0;
            this.f3821b = false;
            this.f3822c = false;
            this.f3823d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: b  reason: collision with root package name */
        int f3825b;

        /* renamed from: c  reason: collision with root package name */
        int f3826c;

        /* renamed from: d  reason: collision with root package name */
        int f3827d;

        /* renamed from: e  reason: collision with root package name */
        int f3828e;

        /* renamed from: f  reason: collision with root package name */
        int f3829f;

        /* renamed from: g  reason: collision with root package name */
        int f3830g;

        /* renamed from: k  reason: collision with root package name */
        int f3834k;

        /* renamed from: m  reason: collision with root package name */
        boolean f3836m;

        /* renamed from: a  reason: collision with root package name */
        boolean f3824a = true;

        /* renamed from: h  reason: collision with root package name */
        int f3831h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f3832i = 0;

        /* renamed from: j  reason: collision with root package name */
        boolean f3833j = false;

        /* renamed from: l  reason: collision with root package name */
        List<RecyclerView.c0> f3835l = null;

        c() {
        }

        private View e() {
            int size = this.f3835l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f3835l.get(i10).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f3827d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f10 = f(view);
            if (f10 == null) {
                this.f3827d = -1;
            } else {
                this.f3827d = ((RecyclerView.q) f10.getLayoutParams()).a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c(RecyclerView.z zVar) {
            int i10 = this.f3827d;
            return i10 >= 0 && i10 < zVar.b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public View d(RecyclerView.v vVar) {
            if (this.f3835l != null) {
                return e();
            }
            View o10 = vVar.o(this.f3827d);
            this.f3827d += this.f3828e;
            return o10;
        }

        public View f(View view) {
            int a10;
            int size = this.f3835l.size();
            View view2 = null;
            int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f3835l.get(i11).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a10 = (qVar.a() - this.f3827d) * this.f3828e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private boolean B2(RecyclerView.v vVar, RecyclerView.z zVar, a aVar) {
        View f22;
        boolean z10 = false;
        if (J() == 0) {
            return false;
        }
        View V = V();
        if (V != null && aVar.d(V, zVar)) {
            aVar.c(V, h0(V));
            return true;
        }
        boolean z11 = this.f3807v;
        boolean z12 = this.f3810y;
        if (z11 == z12 && (f22 = f2(vVar, zVar, aVar.f3818d, z12)) != null) {
            aVar.b(f22, h0(f22));
            if (!zVar.e() && L1()) {
                int g10 = this.f3806u.g(f22);
                int d10 = this.f3806u.d(f22);
                int m7 = this.f3806u.m();
                int i10 = this.f3806u.i();
                boolean z13 = d10 <= m7 && g10 < m7;
                if (g10 >= i10 && d10 > i10) {
                    z10 = true;
                }
                if (z13 || z10) {
                    if (aVar.f3818d) {
                        m7 = i10;
                    }
                    aVar.f3817c = m7;
                }
            }
            return true;
        }
        return false;
    }

    private boolean C2(RecyclerView.z zVar, a aVar) {
        int i10;
        int g10;
        if (!zVar.e() && (i10 = this.A) != -1) {
            if (i10 >= 0 && i10 < zVar.b()) {
                aVar.f3816b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.a()) {
                    boolean z10 = this.D.f3814c;
                    aVar.f3818d = z10;
                    if (z10) {
                        aVar.f3817c = this.f3806u.i() - this.D.f3813b;
                    } else {
                        aVar.f3817c = this.f3806u.m() + this.D.f3813b;
                    }
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View C = C(this.A);
                    if (C != null) {
                        if (this.f3806u.e(C) > this.f3806u.n()) {
                            aVar.a();
                            return true;
                        } else if (this.f3806u.g(C) - this.f3806u.m() < 0) {
                            aVar.f3817c = this.f3806u.m();
                            aVar.f3818d = false;
                            return true;
                        } else if (this.f3806u.i() - this.f3806u.d(C) < 0) {
                            aVar.f3817c = this.f3806u.i();
                            aVar.f3818d = true;
                            return true;
                        } else {
                            if (aVar.f3818d) {
                                g10 = this.f3806u.d(C) + this.f3806u.o();
                            } else {
                                g10 = this.f3806u.g(C);
                            }
                            aVar.f3817c = g10;
                        }
                    } else {
                        if (J() > 0) {
                            aVar.f3818d = (this.A < h0(I(0))) == this.f3809x;
                        }
                        aVar.a();
                    }
                    return true;
                } else {
                    boolean z11 = this.f3809x;
                    aVar.f3818d = z11;
                    if (z11) {
                        aVar.f3817c = this.f3806u.i() - this.B;
                    } else {
                        aVar.f3817c = this.f3806u.m() + this.B;
                    }
                    return true;
                }
            }
            this.A = -1;
            this.B = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    private void D2(RecyclerView.v vVar, RecyclerView.z zVar, a aVar) {
        if (C2(zVar, aVar) || B2(vVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.f3816b = this.f3810y ? zVar.b() - 1 : 0;
    }

    private void E2(int i10, int i11, boolean z10, RecyclerView.z zVar) {
        int m7;
        this.f3805t.f3836m = v2();
        this.f3805t.f3829f = i10;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(zVar, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f3805t;
        int i12 = z11 ? max2 : max;
        cVar.f3831h = i12;
        if (!z11) {
            max = max2;
        }
        cVar.f3832i = max;
        if (z11) {
            cVar.f3831h = i12 + this.f3806u.j();
            View i22 = i2();
            c cVar2 = this.f3805t;
            cVar2.f3828e = this.f3809x ? -1 : 1;
            int h02 = h0(i22);
            c cVar3 = this.f3805t;
            cVar2.f3827d = h02 + cVar3.f3828e;
            cVar3.f3825b = this.f3806u.d(i22);
            m7 = this.f3806u.d(i22) - this.f3806u.i();
        } else {
            View j22 = j2();
            this.f3805t.f3831h += this.f3806u.m();
            c cVar4 = this.f3805t;
            cVar4.f3828e = this.f3809x ? 1 : -1;
            int h03 = h0(j22);
            c cVar5 = this.f3805t;
            cVar4.f3827d = h03 + cVar5.f3828e;
            cVar5.f3825b = this.f3806u.g(j22);
            m7 = (-this.f3806u.g(j22)) + this.f3806u.m();
        }
        c cVar6 = this.f3805t;
        cVar6.f3826c = i11;
        if (z10) {
            cVar6.f3826c = i11 - m7;
        }
        cVar6.f3830g = m7;
    }

    private void F2(int i10, int i11) {
        this.f3805t.f3826c = this.f3806u.i() - i11;
        c cVar = this.f3805t;
        cVar.f3828e = this.f3809x ? -1 : 1;
        cVar.f3827d = i10;
        cVar.f3829f = 1;
        cVar.f3825b = i11;
        cVar.f3830g = RecyclerView.UNDEFINED_DURATION;
    }

    private void G2(a aVar) {
        F2(aVar.f3816b, aVar.f3817c);
    }

    private void H2(int i10, int i11) {
        this.f3805t.f3826c = i11 - this.f3806u.m();
        c cVar = this.f3805t;
        cVar.f3827d = i10;
        cVar.f3828e = this.f3809x ? 1 : -1;
        cVar.f3829f = -1;
        cVar.f3825b = i11;
        cVar.f3830g = RecyclerView.UNDEFINED_DURATION;
    }

    private void I2(a aVar) {
        H2(aVar.f3816b, aVar.f3817c);
    }

    private int O1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.a(zVar, this.f3806u, X1(!this.f3811z, true), W1(!this.f3811z, true), this, this.f3811z);
    }

    private int P1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.b(zVar, this.f3806u, X1(!this.f3811z, true), W1(!this.f3811z, true), this, this.f3811z, this.f3809x);
    }

    private int Q1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.c(zVar, this.f3806u, X1(!this.f3811z, true), W1(!this.f3811z, true), this, this.f3811z);
    }

    private View V1() {
        return b2(0, J());
    }

    private View Z1() {
        return b2(J() - 1, -1);
    }

    private View d2() {
        return this.f3809x ? V1() : Z1();
    }

    private View e2() {
        return this.f3809x ? Z1() : V1();
    }

    private int g2(int i10, RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        int i11;
        int i12 = this.f3806u.i() - i10;
        if (i12 > 0) {
            int i13 = -x2(-i12, vVar, zVar);
            int i14 = i10 + i13;
            if (!z10 || (i11 = this.f3806u.i() - i14) <= 0) {
                return i13;
            }
            this.f3806u.r(i11);
            return i11 + i13;
        }
        return 0;
    }

    private int h2(int i10, RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        int m7;
        int m10 = i10 - this.f3806u.m();
        if (m10 > 0) {
            int i11 = -x2(m10, vVar, zVar);
            int i12 = i10 + i11;
            if (!z10 || (m7 = i12 - this.f3806u.m()) <= 0) {
                return i11;
            }
            this.f3806u.r(-m7);
            return i11 - m7;
        }
        return 0;
    }

    private View i2() {
        return I(this.f3809x ? 0 : J() - 1);
    }

    private View j2() {
        return I(this.f3809x ? J() - 1 : 0);
    }

    private void p2(RecyclerView.v vVar, RecyclerView.z zVar, int i10, int i11) {
        if (!zVar.g() || J() == 0 || zVar.e() || !L1()) {
            return;
        }
        List<RecyclerView.c0> k10 = vVar.k();
        int size = k10.size();
        int h02 = h0(I(0));
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView.c0 c0Var = k10.get(i14);
            if (!c0Var.isRemoved()) {
                if ((c0Var.getLayoutPosition() < h02) != this.f3809x ? true : true) {
                    i12 += this.f3806u.e(c0Var.itemView);
                } else {
                    i13 += this.f3806u.e(c0Var.itemView);
                }
            }
        }
        this.f3805t.f3835l = k10;
        if (i12 > 0) {
            H2(h0(j2()), i10);
            c cVar = this.f3805t;
            cVar.f3831h = i12;
            cVar.f3826c = 0;
            cVar.a();
            U1(vVar, this.f3805t, zVar, false);
        }
        if (i13 > 0) {
            F2(h0(i2()), i11);
            c cVar2 = this.f3805t;
            cVar2.f3831h = i13;
            cVar2.f3826c = 0;
            cVar2.a();
            U1(vVar, this.f3805t, zVar, false);
        }
        this.f3805t.f3835l = null;
    }

    private void r2(RecyclerView.v vVar, c cVar) {
        if (!cVar.f3824a || cVar.f3836m) {
            return;
        }
        int i10 = cVar.f3830g;
        int i11 = cVar.f3832i;
        if (cVar.f3829f == -1) {
            t2(vVar, i10, i11);
        } else {
            u2(vVar, i10, i11);
        }
    }

    private void s2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                n1(i10, vVar);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            n1(i12, vVar);
        }
    }

    private void t2(RecyclerView.v vVar, int i10, int i11) {
        int J = J();
        if (i10 < 0) {
            return;
        }
        int h10 = (this.f3806u.h() - i10) + i11;
        if (this.f3809x) {
            for (int i12 = 0; i12 < J; i12++) {
                View I = I(i12);
                if (this.f3806u.g(I) < h10 || this.f3806u.q(I) < h10) {
                    s2(vVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = J - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View I2 = I(i14);
            if (this.f3806u.g(I2) < h10 || this.f3806u.q(I2) < h10) {
                s2(vVar, i13, i14);
                return;
            }
        }
    }

    private void u2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int J = J();
        if (!this.f3809x) {
            for (int i13 = 0; i13 < J; i13++) {
                View I = I(i13);
                if (this.f3806u.d(I) > i12 || this.f3806u.p(I) > i12) {
                    s2(vVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = J - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View I2 = I(i15);
            if (this.f3806u.d(I2) > i12 || this.f3806u.p(I2) > i12) {
                s2(vVar, i14, i15);
                return;
            }
        }
    }

    private void w2() {
        if (this.f3804s != 1 && m2()) {
            this.f3809x = !this.f3808w;
        } else {
            this.f3809x = this.f3808w;
        }
    }

    public void A2(boolean z10) {
        g(null);
        if (this.f3810y == z10) {
            return;
        }
        this.f3810y = z10;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View C(int i10) {
        int J = J();
        if (J == 0) {
            return null;
        }
        int h02 = i10 - h0(I(0));
        if (h02 >= 0 && h02 < J) {
            View I = I(h02);
            if (h0(I) == i10) {
                return I;
            }
        }
        return super.C(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean G1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.I0(recyclerView, vVar);
        if (this.C) {
            k1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I1(RecyclerView recyclerView, RecyclerView.z zVar, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        J1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View J0(View view, int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        int R1;
        View d22;
        View i22;
        w2();
        if (J() == 0 || (R1 = R1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        E2(R1, (int) (this.f3806u.n() * 0.33333334f), false, zVar);
        c cVar = this.f3805t;
        cVar.f3830g = RecyclerView.UNDEFINED_DURATION;
        cVar.f3824a = false;
        U1(vVar, cVar, zVar, true);
        if (R1 == -1) {
            d22 = e2();
        } else {
            d22 = d2();
        }
        if (R1 == -1) {
            i22 = j2();
        } else {
            i22 = i2();
        }
        if (i22.hasFocusable()) {
            if (d22 == null) {
                return null;
            }
            return i22;
        }
        return d22;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Y1());
            accessibilityEvent.setToIndex(a2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean L1() {
        return this.D == null && this.f3807v == this.f3810y;
    }

    protected void M1(RecyclerView.z zVar, int[] iArr) {
        int i10;
        int k22 = k2(zVar);
        if (this.f3805t.f3829f == -1) {
            i10 = 0;
        } else {
            i10 = k22;
            k22 = 0;
        }
        iArr[0] = k22;
        iArr[1] = i10;
    }

    void N1(RecyclerView.z zVar, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f3827d;
        if (i10 < 0 || i10 >= zVar.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f3830g));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int R1(int i10) {
        if (i10 == 1) {
            return (this.f3804s != 1 && m2()) ? 1 : -1;
        } else if (i10 == 2) {
            return (this.f3804s != 1 && m2()) ? -1 : 1;
        } else if (i10 == 17) {
            if (this.f3804s == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i10 == 33) {
            if (this.f3804s == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i10 != 66) {
            if (i10 == 130 && this.f3804s == 1) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (this.f3804s == 0) {
            return 1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    c S1() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T1() {
        if (this.f3805t == null) {
            this.f3805t = S1();
        }
    }

    int U1(RecyclerView.v vVar, c cVar, RecyclerView.z zVar, boolean z10) {
        int i10 = cVar.f3826c;
        int i11 = cVar.f3830g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f3830g = i11 + i10;
            }
            r2(vVar, cVar);
        }
        int i12 = cVar.f3826c + cVar.f3831h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f3836m && i12 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            o2(vVar, zVar, cVar, bVar);
            if (!bVar.f3821b) {
                cVar.f3825b += bVar.f3820a * cVar.f3829f;
                if (!bVar.f3822c || cVar.f3835l != null || !zVar.e()) {
                    int i13 = cVar.f3826c;
                    int i14 = bVar.f3820a;
                    cVar.f3826c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f3830g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f3820a;
                    cVar.f3830g = i16;
                    int i17 = cVar.f3826c;
                    if (i17 < 0) {
                        cVar.f3830g = i16 + i17;
                    }
                    r2(vVar, cVar);
                }
                if (z10 && bVar.f3823d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f3826c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View W1(boolean z10, boolean z11) {
        if (this.f3809x) {
            return c2(0, J(), z10, z11);
        }
        return c2(J() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.v vVar, RecyclerView.z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int g22;
        int i14;
        View C;
        int g10;
        int i15;
        int i16 = -1;
        if ((this.D != null || this.A != -1) && zVar.b() == 0) {
            k1(vVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.f3812a;
        }
        T1();
        this.f3805t.f3824a = false;
        w2();
        View V = V();
        a aVar = this.E;
        if (aVar.f3819e && this.A == -1 && this.D == null) {
            if (V != null && (this.f3806u.g(V) >= this.f3806u.i() || this.f3806u.d(V) <= this.f3806u.m())) {
                this.E.c(V, h0(V));
            }
        } else {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f3818d = this.f3809x ^ this.f3810y;
            D2(vVar, zVar, aVar2);
            this.E.f3819e = true;
        }
        c cVar = this.f3805t;
        cVar.f3829f = cVar.f3834k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(zVar, iArr);
        int max = Math.max(0, this.H[0]) + this.f3806u.m();
        int max2 = Math.max(0, this.H[1]) + this.f3806u.j();
        if (zVar.e() && (i14 = this.A) != -1 && this.B != Integer.MIN_VALUE && (C = C(i14)) != null) {
            if (this.f3809x) {
                i15 = this.f3806u.i() - this.f3806u.d(C);
                g10 = this.B;
            } else {
                g10 = this.f3806u.g(C) - this.f3806u.m();
                i15 = this.B;
            }
            int i17 = i15 - g10;
            if (i17 > 0) {
                max += i17;
            } else {
                max2 -= i17;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f3818d ? !this.f3809x : this.f3809x) {
            i16 = 1;
        }
        q2(vVar, zVar, aVar3, i16);
        w(vVar);
        this.f3805t.f3836m = v2();
        this.f3805t.f3833j = zVar.e();
        this.f3805t.f3832i = 0;
        a aVar4 = this.E;
        if (aVar4.f3818d) {
            I2(aVar4);
            c cVar2 = this.f3805t;
            cVar2.f3831h = max;
            U1(vVar, cVar2, zVar, false);
            c cVar3 = this.f3805t;
            i11 = cVar3.f3825b;
            int i18 = cVar3.f3827d;
            int i19 = cVar3.f3826c;
            if (i19 > 0) {
                max2 += i19;
            }
            G2(this.E);
            c cVar4 = this.f3805t;
            cVar4.f3831h = max2;
            cVar4.f3827d += cVar4.f3828e;
            U1(vVar, cVar4, zVar, false);
            c cVar5 = this.f3805t;
            i10 = cVar5.f3825b;
            int i20 = cVar5.f3826c;
            if (i20 > 0) {
                H2(i18, i11);
                c cVar6 = this.f3805t;
                cVar6.f3831h = i20;
                U1(vVar, cVar6, zVar, false);
                i11 = this.f3805t.f3825b;
            }
        } else {
            G2(aVar4);
            c cVar7 = this.f3805t;
            cVar7.f3831h = max2;
            U1(vVar, cVar7, zVar, false);
            c cVar8 = this.f3805t;
            i10 = cVar8.f3825b;
            int i21 = cVar8.f3827d;
            int i22 = cVar8.f3826c;
            if (i22 > 0) {
                max += i22;
            }
            I2(this.E);
            c cVar9 = this.f3805t;
            cVar9.f3831h = max;
            cVar9.f3827d += cVar9.f3828e;
            U1(vVar, cVar9, zVar, false);
            c cVar10 = this.f3805t;
            i11 = cVar10.f3825b;
            int i23 = cVar10.f3826c;
            if (i23 > 0) {
                F2(i21, i10);
                c cVar11 = this.f3805t;
                cVar11.f3831h = i23;
                U1(vVar, cVar11, zVar, false);
                i10 = this.f3805t.f3825b;
            }
        }
        if (J() > 0) {
            if (this.f3809x ^ this.f3810y) {
                int g23 = g2(i10, vVar, zVar, true);
                i12 = i11 + g23;
                i13 = i10 + g23;
                g22 = h2(i12, vVar, zVar, false);
            } else {
                int h22 = h2(i11, vVar, zVar, true);
                i12 = i11 + h22;
                i13 = i10 + h22;
                g22 = g2(i13, vVar, zVar, false);
            }
            i11 = i12 + g22;
            i10 = i13 + g22;
        }
        p2(vVar, zVar, i11, i10);
        if (!zVar.e()) {
            this.f3806u.s();
        } else {
            this.E.e();
        }
        this.f3807v = this.f3810y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View X1(boolean z10, boolean z11) {
        if (this.f3809x) {
            return c2(J() - 1, -1, z10, z11);
        }
        return c2(0, J(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.D = null;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.E.e();
    }

    public int Y1() {
        View c22 = c2(0, J(), false, true);
        if (c22 == null) {
            return -1;
        }
        return h0(c22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF a(int i10) {
        if (J() == 0) {
            return null;
        }
        int i11 = (i10 < h0(I(0))) != this.f3809x ? -1 : 1;
        if (this.f3804s == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    public int a2() {
        View c22 = c2(J() - 1, -1, false, true);
        if (c22 == null) {
            return -1;
        }
        return h0(c22);
    }

    View b2(int i10, int i11) {
        int i12;
        int i13;
        T1();
        if ((i11 > i10 ? (char) 1 : i11 < i10 ? (char) 65535 : (char) 0) == 0) {
            return I(i10);
        }
        if (this.f3806u.g(I(i10)) < this.f3806u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        if (this.f3804s == 0) {
            return this.f3870e.a(i10, i11, i12, i13);
        }
        return this.f3871f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.D = savedState;
            if (this.A != -1) {
                savedState.b();
            }
            t1();
        }
    }

    View c2(int i10, int i11, boolean z10, boolean z11) {
        T1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        if (this.f3804s == 0) {
            return this.f3870e.a(i10, i11, i12, i13);
        }
        return this.f3871f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable d1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (J() > 0) {
            T1();
            boolean z10 = this.f3807v ^ this.f3809x;
            savedState.f3814c = z10;
            if (z10) {
                View i22 = i2();
                savedState.f3813b = this.f3806u.i() - this.f3806u.d(i22);
                savedState.f3812a = h0(i22);
            } else {
                View j22 = j2();
                savedState.f3812a = h0(j22);
                savedState.f3813b = this.f3806u.g(j22) - this.f3806u.m();
            }
        } else {
            savedState.b();
        }
        return savedState;
    }

    View f2(RecyclerView.v vVar, RecyclerView.z zVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        T1();
        int J = J();
        int i12 = -1;
        if (z11) {
            i10 = J() - 1;
            i11 = -1;
        } else {
            i12 = J;
            i10 = 0;
            i11 = 1;
        }
        int b10 = zVar.b();
        int m7 = this.f3806u.m();
        int i13 = this.f3806u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i12) {
            View I = I(i10);
            int h02 = h0(I);
            int g10 = this.f3806u.g(I);
            int d10 = this.f3806u.d(I);
            if (h02 >= 0 && h02 < b10) {
                if (!((RecyclerView.q) I.getLayoutParams()).c()) {
                    boolean z12 = d10 <= m7 && g10 < m7;
                    boolean z13 = g10 >= i13 && d10 > i13;
                    if (!z12 && !z13) {
                        return I;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = I;
                        }
                        view2 = I;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = I;
                        }
                        view2 = I;
                    }
                } else if (view3 == null) {
                    view3 = I;
                }
            }
            i10 += i11;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(String str) {
        if (this.D == null) {
            super.g(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean k() {
        return this.f3804s == 0;
    }

    @Deprecated
    protected int k2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.f3806u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.f3804s == 1;
    }

    public int l2() {
        return this.f3804s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean m2() {
        return Z() == 1;
    }

    public boolean n2() {
        return this.f3811z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o(int i10, int i11, RecyclerView.z zVar, RecyclerView.p.c cVar) {
        if (this.f3804s != 0) {
            i10 = i11;
        }
        if (J() == 0 || i10 == 0) {
            return;
        }
        T1();
        E2(i10 > 0 ? 1 : -1, Math.abs(i10), true, zVar);
        N1(zVar, this.f3805t, cVar);
    }

    void o2(RecyclerView.v vVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int f10;
        View d10 = cVar.d(vVar);
        if (d10 == null) {
            bVar.f3821b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d10.getLayoutParams();
        if (cVar.f3835l == null) {
            if (this.f3809x == (cVar.f3829f == -1)) {
                d(d10);
            } else {
                e(d10, 0);
            }
        } else {
            if (this.f3809x == (cVar.f3829f == -1)) {
                b(d10);
            } else {
                c(d10, 0);
            }
        }
        A0(d10, 0, 0);
        bVar.f3820a = this.f3806u.e(d10);
        if (this.f3804s == 1) {
            if (m2()) {
                f10 = o0() - f0();
                i13 = f10 - this.f3806u.f(d10);
            } else {
                i13 = e0();
                f10 = this.f3806u.f(d10) + i13;
            }
            if (cVar.f3829f == -1) {
                int i14 = cVar.f3825b;
                i12 = i14;
                i11 = f10;
                i10 = i14 - bVar.f3820a;
            } else {
                int i15 = cVar.f3825b;
                i10 = i15;
                i11 = f10;
                i12 = bVar.f3820a + i15;
            }
        } else {
            int g02 = g0();
            int f11 = this.f3806u.f(d10) + g02;
            if (cVar.f3829f == -1) {
                int i16 = cVar.f3825b;
                i11 = i16;
                i10 = g02;
                i12 = f11;
                i13 = i16 - bVar.f3820a;
            } else {
                int i17 = cVar.f3825b;
                i10 = g02;
                i11 = bVar.f3820a + i17;
                i12 = f11;
                i13 = i17;
            }
        }
        z0(d10, i13, i10, i11, i12);
        if (qVar.c() || qVar.b()) {
            bVar.f3822c = true;
        }
        bVar.f3823d = d10.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            SavedState savedState2 = this.D;
            z10 = savedState2.f3814c;
            i11 = savedState2.f3812a;
        } else {
            w2();
            z10 = this.f3809x;
            i11 = this.A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q(RecyclerView.z zVar) {
        return O1(zVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q2(RecyclerView.v vVar, RecyclerView.z zVar, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.z zVar) {
        return P1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.z zVar) {
        return Q1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.z zVar) {
        return O1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.z zVar) {
        return P1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.z zVar) {
        return Q1(zVar);
    }

    boolean v2() {
        return this.f3806u.k() == 0 && this.f3806u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.f3804s == 1) {
            return 0;
        }
        return x2(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void x1(int i10) {
        this.A = i10;
        this.B = RecyclerView.UNDEFINED_DURATION;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        t1();
    }

    int x2(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        T1();
        this.f3805t.f3824a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        E2(i11, abs, true, zVar);
        c cVar = this.f3805t;
        int U1 = cVar.f3830g + U1(vVar, cVar, zVar, false);
        if (U1 < 0) {
            return 0;
        }
        if (abs > U1) {
            i10 = i11 * U1;
        }
        this.f3806u.r(-i10);
        this.f3805t.f3834k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y1(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.f3804s == 0) {
            return 0;
        }
        return x2(i10, vVar, zVar);
    }

    public void y2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        g(null);
        if (i10 != this.f3804s || this.f3806u == null) {
            i b10 = i.b(this, i10);
            this.f3806u = b10;
            this.E.f3815a = b10;
            this.f3804s = i10;
            t1();
        }
    }

    public void z2(boolean z10) {
        g(null);
        if (z10 == this.f3808w) {
            return;
        }
        this.f3808w = z10;
        t1();
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f3804s = 1;
        this.f3808w = false;
        this.f3809x = false;
        this.f3810y = false;
        this.f3811z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        y2(i10);
        z2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f3804s = 1;
        this.f3808w = false;
        this.f3809x = false;
        this.f3810y = false;
        this.f3811z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d i02 = RecyclerView.p.i0(context, attributeSet, i10, i11);
        y2(i02.f3886a);
        z2(i02.f3888c);
        A2(i02.f3889d);
    }
}
