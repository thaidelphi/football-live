package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.y.b {
    private BitSet B;
    private boolean G;
    private boolean H;
    private SavedState I;
    private int J;
    private int[] O;

    /* renamed from: t  reason: collision with root package name */
    d[] f3942t;

    /* renamed from: u  reason: collision with root package name */
    i f3943u;

    /* renamed from: v  reason: collision with root package name */
    i f3944v;

    /* renamed from: w  reason: collision with root package name */
    private int f3945w;

    /* renamed from: x  reason: collision with root package name */
    private int f3946x;

    /* renamed from: y  reason: collision with root package name */
    private final f f3947y;

    /* renamed from: s  reason: collision with root package name */
    private int f3941s = -1;

    /* renamed from: z  reason: collision with root package name */
    boolean f3948z = false;
    boolean A = false;
    int C = -1;
    int D = RecyclerView.UNDEFINED_DURATION;
    LazySpanLookup E = new LazySpanLookup();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f3955a;

        /* renamed from: b  reason: collision with root package name */
        int f3956b;

        /* renamed from: c  reason: collision with root package name */
        int f3957c;

        /* renamed from: d  reason: collision with root package name */
        int[] f3958d;

        /* renamed from: e  reason: collision with root package name */
        int f3959e;

        /* renamed from: f  reason: collision with root package name */
        int[] f3960f;

        /* renamed from: g  reason: collision with root package name */
        List<LazySpanLookup.FullSpanItem> f3961g;

        /* renamed from: h  reason: collision with root package name */
        boolean f3962h;

        /* renamed from: i  reason: collision with root package name */
        boolean f3963i;

        /* renamed from: j  reason: collision with root package name */
        boolean f3964j;

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

        void a() {
            this.f3958d = null;
            this.f3957c = 0;
            this.f3955a = -1;
            this.f3956b = -1;
        }

        void b() {
            this.f3958d = null;
            this.f3957c = 0;
            this.f3959e = 0;
            this.f3960f = null;
            this.f3961g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3955a);
            parcel.writeInt(this.f3956b);
            parcel.writeInt(this.f3957c);
            if (this.f3957c > 0) {
                parcel.writeIntArray(this.f3958d);
            }
            parcel.writeInt(this.f3959e);
            if (this.f3959e > 0) {
                parcel.writeIntArray(this.f3960f);
            }
            parcel.writeInt(this.f3962h ? 1 : 0);
            parcel.writeInt(this.f3963i ? 1 : 0);
            parcel.writeInt(this.f3964j ? 1 : 0);
            parcel.writeList(this.f3961g);
        }

        SavedState(Parcel parcel) {
            this.f3955a = parcel.readInt();
            this.f3956b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3957c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3958d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3959e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3960f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3962h = parcel.readInt() == 1;
            this.f3963i = parcel.readInt() == 1;
            this.f3964j = parcel.readInt() == 1;
            this.f3961g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f3957c = savedState.f3957c;
            this.f3955a = savedState.f3955a;
            this.f3956b = savedState.f3956b;
            this.f3958d = savedState.f3958d;
            this.f3959e = savedState.f3959e;
            this.f3960f = savedState.f3960f;
            this.f3962h = savedState.f3962h;
            this.f3963i = savedState.f3963i;
            this.f3964j = savedState.f3964j;
            this.f3961g = savedState.f3961g;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.S1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f3966a;

        /* renamed from: b  reason: collision with root package name */
        int f3967b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3968c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3969d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3970e;

        /* renamed from: f  reason: collision with root package name */
        int[] f3971f;

        b() {
            c();
        }

        void a() {
            this.f3967b = this.f3968c ? StaggeredGridLayoutManager.this.f3943u.i() : StaggeredGridLayoutManager.this.f3943u.m();
        }

        void b(int i10) {
            if (this.f3968c) {
                this.f3967b = StaggeredGridLayoutManager.this.f3943u.i() - i10;
            } else {
                this.f3967b = StaggeredGridLayoutManager.this.f3943u.m() + i10;
            }
        }

        void c() {
            this.f3966a = -1;
            this.f3967b = RecyclerView.UNDEFINED_DURATION;
            this.f3968c = false;
            this.f3969d = false;
            this.f3970e = false;
            int[] iArr = this.f3971f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f3971f;
            if (iArr == null || iArr.length < length) {
                this.f3971f = new int[StaggeredGridLayoutManager.this.f3942t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f3971f[i10] = dVarArr[i10].p(RecyclerView.UNDEFINED_DURATION);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c extends RecyclerView.q {

        /* renamed from: e  reason: collision with root package name */
        d f3973e;

        /* renamed from: f  reason: collision with root package name */
        boolean f3974f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f3974f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f3975a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f3976b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c  reason: collision with root package name */
        int f3977c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d  reason: collision with root package name */
        int f3978d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f3979e;

        d(int i10) {
            this.f3979e = i10;
        }

        void a(View view) {
            c n10 = n(view);
            n10.f3973e = this;
            this.f3975a.add(view);
            this.f3977c = RecyclerView.UNDEFINED_DURATION;
            if (this.f3975a.size() == 1) {
                this.f3976b = RecyclerView.UNDEFINED_DURATION;
            }
            if (n10.c() || n10.b()) {
                this.f3978d += StaggeredGridLayoutManager.this.f3943u.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int p10;
            if (z10) {
                p10 = l(RecyclerView.UNDEFINED_DURATION);
            } else {
                p10 = p(RecyclerView.UNDEFINED_DURATION);
            }
            e();
            if (p10 == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || p10 >= StaggeredGridLayoutManager.this.f3943u.i()) {
                if (z10 || p10 <= StaggeredGridLayoutManager.this.f3943u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        p10 += i10;
                    }
                    this.f3977c = p10;
                    this.f3976b = p10;
                }
            }
        }

        void c() {
            LazySpanLookup.FullSpanItem f10;
            ArrayList<View> arrayList = this.f3975a;
            View view = arrayList.get(arrayList.size() - 1);
            c n10 = n(view);
            this.f3977c = StaggeredGridLayoutManager.this.f3943u.d(view);
            if (n10.f3974f && (f10 = StaggeredGridLayoutManager.this.E.f(n10.a())) != null && f10.f3952b == 1) {
                this.f3977c += f10.a(this.f3979e);
            }
        }

        void d() {
            LazySpanLookup.FullSpanItem f10;
            View view = this.f3975a.get(0);
            c n10 = n(view);
            this.f3976b = StaggeredGridLayoutManager.this.f3943u.g(view);
            if (n10.f3974f && (f10 = StaggeredGridLayoutManager.this.E.f(n10.a())) != null && f10.f3952b == -1) {
                this.f3976b -= f10.a(this.f3979e);
            }
        }

        void e() {
            this.f3975a.clear();
            q();
            this.f3978d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.f3948z) {
                return i(this.f3975a.size() - 1, -1, true);
            }
            return i(0, this.f3975a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.f3948z) {
                return i(0, this.f3975a.size(), true);
            }
            return i(this.f3975a.size() - 1, -1, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int m7 = StaggeredGridLayoutManager.this.f3943u.m();
            int i12 = StaggeredGridLayoutManager.this.f3943u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f3975a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.f3943u.g(view);
                int d10 = StaggeredGridLayoutManager.this.f3943u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? g10 >= i12 : g10 > i12;
                if (!z12 ? d10 > m7 : d10 >= m7) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (g10 >= m7 && d10 <= i12) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                    } else if (z11) {
                        return StaggeredGridLayoutManager.this.h0(view);
                    } else {
                        if (g10 < m7 || d10 > i12) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f3978d;
        }

        int k() {
            int i10 = this.f3977c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f3977c;
        }

        int l(int i10) {
            int i11 = this.f3977c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3975a.size() == 0) {
                return i10;
            }
            c();
            return this.f3977c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 == -1) {
                int size = this.f3975a.size();
                int i12 = 0;
                while (i12 < size) {
                    View view2 = this.f3975a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3948z && staggeredGridLayoutManager.h0(view2) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3948z && staggeredGridLayoutManager2.h0(view2) >= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view2;
                }
            } else {
                int size2 = this.f3975a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.f3975a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3948z && staggeredGridLayoutManager3.h0(view3) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3948z && staggeredGridLayoutManager4.h0(view3) <= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f3976b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f3976b;
        }

        int p(int i10) {
            int i11 = this.f3976b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3975a.size() == 0) {
                return i10;
            }
            d();
            return this.f3976b;
        }

        void q() {
            this.f3976b = RecyclerView.UNDEFINED_DURATION;
            this.f3977c = RecyclerView.UNDEFINED_DURATION;
        }

        void r(int i10) {
            int i11 = this.f3976b;
            if (i11 != Integer.MIN_VALUE) {
                this.f3976b = i11 + i10;
            }
            int i12 = this.f3977c;
            if (i12 != Integer.MIN_VALUE) {
                this.f3977c = i12 + i10;
            }
        }

        void s() {
            int size = this.f3975a.size();
            View remove = this.f3975a.remove(size - 1);
            c n10 = n(remove);
            n10.f3973e = null;
            if (n10.c() || n10.b()) {
                this.f3978d -= StaggeredGridLayoutManager.this.f3943u.e(remove);
            }
            if (size == 1) {
                this.f3976b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f3977c = RecyclerView.UNDEFINED_DURATION;
        }

        void t() {
            View remove = this.f3975a.remove(0);
            c n10 = n(remove);
            n10.f3973e = null;
            if (this.f3975a.size() == 0) {
                this.f3977c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n10.c() || n10.b()) {
                this.f3978d -= StaggeredGridLayoutManager.this.f3943u.e(remove);
            }
            this.f3976b = RecyclerView.UNDEFINED_DURATION;
        }

        void u(View view) {
            c n10 = n(view);
            n10.f3973e = this;
            this.f3975a.add(0, view);
            this.f3976b = RecyclerView.UNDEFINED_DURATION;
            if (this.f3975a.size() == 1) {
                this.f3977c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n10.c() || n10.b()) {
                this.f3978d += StaggeredGridLayoutManager.this.f3943u.e(view);
            }
        }

        void v(int i10) {
            this.f3976b = i10;
            this.f3977c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d i02 = RecyclerView.p.i0(context, attributeSet, i10, i11);
        I2(i02.f3886a);
        K2(i02.f3887b);
        J2(i02.f3888c);
        this.f3947y = new f();
        a2();
    }

    private void A2(View view) {
        for (int i10 = this.f3941s - 1; i10 >= 0; i10--) {
            this.f3942t[i10].u(view);
        }
    }

    private void B2(RecyclerView.v vVar, f fVar) {
        int min;
        int min2;
        if (!fVar.f4095a || fVar.f4103i) {
            return;
        }
        if (fVar.f4096b == 0) {
            if (fVar.f4099e == -1) {
                C2(vVar, fVar.f4101g);
            } else {
                D2(vVar, fVar.f4100f);
            }
        } else if (fVar.f4099e == -1) {
            int i10 = fVar.f4100f;
            int m22 = i10 - m2(i10);
            if (m22 < 0) {
                min2 = fVar.f4101g;
            } else {
                min2 = fVar.f4101g - Math.min(m22, fVar.f4096b);
            }
            C2(vVar, min2);
        } else {
            int n22 = n2(fVar.f4101g) - fVar.f4101g;
            if (n22 < 0) {
                min = fVar.f4100f;
            } else {
                min = Math.min(n22, fVar.f4096b) + fVar.f4100f;
            }
            D2(vVar, min);
        }
    }

    private void C2(RecyclerView.v vVar, int i10) {
        for (int J = J() - 1; J >= 0; J--) {
            View I = I(J);
            if (this.f3943u.g(I) < i10 || this.f3943u.q(I) < i10) {
                return;
            }
            c cVar = (c) I.getLayoutParams();
            if (cVar.f3974f) {
                for (int i11 = 0; i11 < this.f3941s; i11++) {
                    if (this.f3942t[i11].f3975a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3941s; i12++) {
                    this.f3942t[i12].s();
                }
            } else if (cVar.f3973e.f3975a.size() == 1) {
                return;
            } else {
                cVar.f3973e.s();
            }
            m1(I, vVar);
        }
    }

    private void D2(RecyclerView.v vVar, int i10) {
        while (J() > 0) {
            View I = I(0);
            if (this.f3943u.d(I) > i10 || this.f3943u.p(I) > i10) {
                return;
            }
            c cVar = (c) I.getLayoutParams();
            if (cVar.f3974f) {
                for (int i11 = 0; i11 < this.f3941s; i11++) {
                    if (this.f3942t[i11].f3975a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3941s; i12++) {
                    this.f3942t[i12].t();
                }
            } else if (cVar.f3973e.f3975a.size() == 1) {
                return;
            } else {
                cVar.f3973e.t();
            }
            m1(I, vVar);
        }
    }

    private void E2() {
        if (this.f3944v.k() == 1073741824) {
            return;
        }
        float f10 = 0.0f;
        int J = J();
        for (int i10 = 0; i10 < J; i10++) {
            View I = I(i10);
            float e8 = this.f3944v.e(I);
            if (e8 >= f10) {
                if (((c) I.getLayoutParams()).e()) {
                    e8 = (e8 * 1.0f) / this.f3941s;
                }
                f10 = Math.max(f10, e8);
            }
        }
        int i11 = this.f3946x;
        int round = Math.round(f10 * this.f3941s);
        if (this.f3944v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f3944v.n());
        }
        Q2(round);
        if (this.f3946x == i11) {
            return;
        }
        for (int i12 = 0; i12 < J; i12++) {
            View I2 = I(i12);
            c cVar = (c) I2.getLayoutParams();
            if (!cVar.f3974f) {
                if (u2() && this.f3945w == 1) {
                    int i13 = this.f3941s;
                    int i14 = cVar.f3973e.f3979e;
                    I2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f3946x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f3973e.f3979e;
                    int i16 = this.f3946x * i15;
                    int i17 = i15 * i11;
                    if (this.f3945w == 1) {
                        I2.offsetLeftAndRight(i16 - i17);
                    } else {
                        I2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    private void F2() {
        if (this.f3945w != 1 && u2()) {
            this.A = !this.f3948z;
        } else {
            this.A = this.f3948z;
        }
    }

    private void H2(int i10) {
        f fVar = this.f3947y;
        fVar.f4099e = i10;
        fVar.f4098d = this.A != (i10 == -1) ? -1 : 1;
    }

    private void L2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f3941s; i12++) {
            if (!this.f3942t[i12].f3975a.isEmpty()) {
                R2(this.f3942t[i12], i10, i11);
            }
        }
    }

    private void M1(View view) {
        for (int i10 = this.f3941s - 1; i10 >= 0; i10--) {
            this.f3942t[i10].a(view);
        }
    }

    private boolean M2(RecyclerView.z zVar, b bVar) {
        int c22;
        if (this.G) {
            c22 = g2(zVar.b());
        } else {
            c22 = c2(zVar.b());
        }
        bVar.f3966a = c22;
        bVar.f3967b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    private void N1(b bVar) {
        int m7;
        SavedState savedState = this.I;
        int i10 = savedState.f3957c;
        if (i10 > 0) {
            if (i10 == this.f3941s) {
                for (int i11 = 0; i11 < this.f3941s; i11++) {
                    this.f3942t[i11].e();
                    SavedState savedState2 = this.I;
                    int i12 = savedState2.f3958d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        if (savedState2.f3963i) {
                            m7 = this.f3943u.i();
                        } else {
                            m7 = this.f3943u.m();
                        }
                        i12 += m7;
                    }
                    this.f3942t[i11].v(i12);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.I;
                savedState3.f3955a = savedState3.f3956b;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.f3964j;
        J2(savedState4.f3962h);
        F2();
        SavedState savedState5 = this.I;
        int i13 = savedState5.f3955a;
        if (i13 != -1) {
            this.C = i13;
            bVar.f3968c = savedState5.f3963i;
        } else {
            bVar.f3968c = this.A;
        }
        if (savedState5.f3959e > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.f3949a = savedState5.f3960f;
            lazySpanLookup.f3950b = savedState5.f3961g;
        }
    }

    private void P2(int i10, RecyclerView.z zVar) {
        int i11;
        int i12;
        int c10;
        f fVar = this.f3947y;
        boolean z10 = false;
        fVar.f4096b = 0;
        fVar.f4097c = i10;
        if (!x0() || (c10 = zVar.c()) == -1) {
            i11 = 0;
            i12 = 0;
        } else {
            if (this.A == (c10 < i10)) {
                i11 = this.f3943u.n();
                i12 = 0;
            } else {
                i12 = this.f3943u.n();
                i11 = 0;
            }
        }
        if (M()) {
            this.f3947y.f4100f = this.f3943u.m() - i12;
            this.f3947y.f4101g = this.f3943u.i() + i11;
        } else {
            this.f3947y.f4101g = this.f3943u.h() + i11;
            this.f3947y.f4100f = -i12;
        }
        f fVar2 = this.f3947y;
        fVar2.f4102h = false;
        fVar2.f4095a = true;
        if (this.f3943u.k() == 0 && this.f3943u.h() == 0) {
            z10 = true;
        }
        fVar2.f4103i = z10;
    }

    private void Q1(View view, c cVar, f fVar) {
        if (fVar.f4099e == 1) {
            if (cVar.f3974f) {
                M1(view);
            } else {
                cVar.f3973e.a(view);
            }
        } else if (cVar.f3974f) {
            A2(view);
        } else {
            cVar.f3973e.u(view);
        }
    }

    private int R1(int i10) {
        if (J() == 0) {
            return this.A ? 1 : -1;
        }
        return (i10 < j2()) != this.A ? -1 : 1;
    }

    private void R2(d dVar, int i10, int i11) {
        int j10 = dVar.j();
        if (i10 == -1) {
            if (dVar.o() + j10 <= i11) {
                this.B.set(dVar.f3979e, false);
            }
        } else if (dVar.k() - j10 >= i11) {
            this.B.set(dVar.f3979e, false);
        }
    }

    private int S2(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private boolean T1(d dVar) {
        if (this.A) {
            if (dVar.k() < this.f3943u.i()) {
                ArrayList<View> arrayList = dVar.f3975a;
                return !dVar.n(arrayList.get(arrayList.size() - 1)).f3974f;
            }
        } else if (dVar.o() > this.f3943u.m()) {
            return !dVar.n(dVar.f3975a.get(0)).f3974f;
        }
        return false;
    }

    private int U1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return l.a(zVar, this.f3943u, e2(!this.N), d2(!this.N), this, this.N);
    }

    private int V1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return l.b(zVar, this.f3943u, e2(!this.N), d2(!this.N), this, this.N, this.A);
    }

    private int W1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return l.c(zVar, this.f3943u, e2(!this.N), d2(!this.N), this, this.N);
    }

    private int X1(int i10) {
        if (i10 == 1) {
            return (this.f3945w != 1 && u2()) ? 1 : -1;
        } else if (i10 == 2) {
            return (this.f3945w != 1 && u2()) ? -1 : 1;
        } else if (i10 == 17) {
            if (this.f3945w == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i10 == 33) {
            if (this.f3945w == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i10 != 66) {
            if (i10 == 130 && this.f3945w == 1) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (this.f3945w == 0) {
            return 1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private LazySpanLookup.FullSpanItem Y1(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3953c = new int[this.f3941s];
        for (int i11 = 0; i11 < this.f3941s; i11++) {
            fullSpanItem.f3953c[i11] = i10 - this.f3942t[i11].l(i10);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem Z1(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3953c = new int[this.f3941s];
        for (int i11 = 0; i11 < this.f3941s; i11++) {
            fullSpanItem.f3953c[i11] = this.f3942t[i11].p(i10) - i10;
        }
        return fullSpanItem;
    }

    private void a2() {
        this.f3943u = i.b(this, this.f3945w);
        this.f3944v = i.b(this, 1 - this.f3945w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int b2(RecyclerView.v vVar, f fVar, RecyclerView.z zVar) {
        int i10;
        int m7;
        int l22;
        d dVar;
        int e8;
        int i11;
        int i12;
        int e10;
        boolean z10;
        boolean P1;
        ?? r92 = 0;
        this.B.set(0, this.f3941s, true);
        if (this.f3947y.f4103i) {
            i10 = fVar.f4099e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : RecyclerView.UNDEFINED_DURATION;
        } else if (fVar.f4099e == 1) {
            i10 = fVar.f4101g + fVar.f4096b;
        } else {
            i10 = fVar.f4100f - fVar.f4096b;
        }
        int i13 = i10;
        L2(fVar.f4099e, i13);
        if (this.A) {
            m7 = this.f3943u.i();
        } else {
            m7 = this.f3943u.m();
        }
        int i14 = m7;
        boolean z11 = false;
        while (fVar.a(zVar) && (this.f3947y.f4103i || !this.B.isEmpty())) {
            View b10 = fVar.b(vVar);
            c cVar = (c) b10.getLayoutParams();
            int a10 = cVar.a();
            int g10 = this.E.g(a10);
            boolean z12 = g10 == -1 ? true : r92;
            if (z12) {
                dVar = cVar.f3974f ? this.f3942t[r92] : p2(fVar);
                this.E.n(a10, dVar);
            } else {
                dVar = this.f3942t[g10];
            }
            d dVar2 = dVar;
            cVar.f3973e = dVar2;
            if (fVar.f4099e == 1) {
                d(b10);
            } else {
                e(b10, r92);
            }
            w2(b10, cVar, r92);
            if (fVar.f4099e == 1) {
                int l23 = cVar.f3974f ? l2(i14) : dVar2.l(i14);
                int e11 = this.f3943u.e(b10) + l23;
                if (z12 && cVar.f3974f) {
                    LazySpanLookup.FullSpanItem Y1 = Y1(l23);
                    Y1.f3952b = -1;
                    Y1.f3951a = a10;
                    this.E.a(Y1);
                }
                i11 = e11;
                e8 = l23;
            } else {
                int o22 = cVar.f3974f ? o2(i14) : dVar2.p(i14);
                e8 = o22 - this.f3943u.e(b10);
                if (z12 && cVar.f3974f) {
                    LazySpanLookup.FullSpanItem Z1 = Z1(o22);
                    Z1.f3952b = 1;
                    Z1.f3951a = a10;
                    this.E.a(Z1);
                }
                i11 = o22;
            }
            if (cVar.f3974f && fVar.f4098d == -1) {
                if (z12) {
                    this.M = true;
                } else {
                    if (fVar.f4099e == 1) {
                        P1 = O1();
                    } else {
                        P1 = P1();
                    }
                    if (!P1) {
                        LazySpanLookup.FullSpanItem f10 = this.E.f(a10);
                        if (f10 != null) {
                            f10.f3954d = true;
                        }
                        this.M = true;
                    }
                }
            }
            Q1(b10, cVar, fVar);
            if (u2() && this.f3945w == 1) {
                int i15 = cVar.f3974f ? this.f3944v.i() : this.f3944v.i() - (((this.f3941s - 1) - dVar2.f3979e) * this.f3946x);
                e10 = i15;
                i12 = i15 - this.f3944v.e(b10);
            } else {
                int m10 = cVar.f3974f ? this.f3944v.m() : (dVar2.f3979e * this.f3946x) + this.f3944v.m();
                i12 = m10;
                e10 = this.f3944v.e(b10) + m10;
            }
            if (this.f3945w == 1) {
                z0(b10, i12, e8, e10, i11);
            } else {
                z0(b10, e8, i12, i11, e10);
            }
            if (cVar.f3974f) {
                L2(this.f3947y.f4099e, i13);
            } else {
                R2(dVar2, this.f3947y.f4099e, i13);
            }
            B2(vVar, this.f3947y);
            if (this.f3947y.f4102h && b10.hasFocusable()) {
                if (cVar.f3974f) {
                    this.B.clear();
                } else {
                    z10 = false;
                    this.B.set(dVar2.f3979e, false);
                    r92 = z10;
                    z11 = true;
                }
            }
            z10 = false;
            r92 = z10;
            z11 = true;
        }
        int i16 = r92;
        if (!z11) {
            B2(vVar, this.f3947y);
        }
        if (this.f3947y.f4099e == -1) {
            l22 = this.f3943u.m() - o2(this.f3943u.m());
        } else {
            l22 = l2(this.f3943u.i()) - this.f3943u.i();
        }
        return l22 > 0 ? Math.min(fVar.f4096b, l22) : i16;
    }

    private int c2(int i10) {
        int J = J();
        for (int i11 = 0; i11 < J; i11++) {
            int h02 = h0(I(i11));
            if (h02 >= 0 && h02 < i10) {
                return h02;
            }
        }
        return 0;
    }

    private int g2(int i10) {
        for (int J = J() - 1; J >= 0; J--) {
            int h02 = h0(I(J));
            if (h02 >= 0 && h02 < i10) {
                return h02;
            }
        }
        return 0;
    }

    private void h2(RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        int i10;
        int l22 = l2(RecyclerView.UNDEFINED_DURATION);
        if (l22 != Integer.MIN_VALUE && (i10 = this.f3943u.i() - l22) > 0) {
            int i11 = i10 - (-G2(-i10, vVar, zVar));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f3943u.r(i11);
        }
    }

    private void i2(RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        int m7;
        int o22 = o2(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (o22 != Integer.MAX_VALUE && (m7 = o22 - this.f3943u.m()) > 0) {
            int G2 = m7 - G2(m7, vVar, zVar);
            if (!z10 || G2 <= 0) {
                return;
            }
            this.f3943u.r(-G2);
        }
    }

    private int l2(int i10) {
        int l10 = this.f3942t[0].l(i10);
        for (int i11 = 1; i11 < this.f3941s; i11++) {
            int l11 = this.f3942t[i11].l(i10);
            if (l11 > l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int m2(int i10) {
        int p10 = this.f3942t[0].p(i10);
        for (int i11 = 1; i11 < this.f3941s; i11++) {
            int p11 = this.f3942t[i11].p(i10);
            if (p11 > p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private int n2(int i10) {
        int l10 = this.f3942t[0].l(i10);
        for (int i11 = 1; i11 < this.f3941s; i11++) {
            int l11 = this.f3942t[i11].l(i10);
            if (l11 < l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int o2(int i10) {
        int p10 = this.f3942t[0].p(i10);
        for (int i11 = 1; i11 < this.f3941s; i11++) {
            int p11 = this.f3942t[i11].p(i10);
            if (p11 < p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private d p2(f fVar) {
        int i10;
        int i11;
        int i12 = -1;
        if (y2(fVar.f4099e)) {
            i10 = this.f3941s - 1;
            i11 = -1;
        } else {
            i10 = 0;
            i12 = this.f3941s;
            i11 = 1;
        }
        d dVar = null;
        if (fVar.f4099e == 1) {
            int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int m7 = this.f3943u.m();
            while (i10 != i12) {
                d dVar2 = this.f3942t[i10];
                int l10 = dVar2.l(m7);
                if (l10 < i13) {
                    dVar = dVar2;
                    i13 = l10;
                }
                i10 += i11;
            }
            return dVar;
        }
        int i14 = RecyclerView.UNDEFINED_DURATION;
        int i15 = this.f3943u.i();
        while (i10 != i12) {
            d dVar3 = this.f3942t[i10];
            int p10 = dVar3.p(i15);
            if (p10 > i14) {
                dVar = dVar3;
                i14 = p10;
            }
            i10 += i11;
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.k2()
            goto Ld
        L9:
            int r0 = r6.j2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.E
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.A
            if (r7 == 0) goto L4d
            int r7 = r6.j2()
            goto L51
        L4d:
            int r7 = r6.k2()
        L51:
            if (r3 > r7) goto L56
            r6.t1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r2(int, int, int):void");
    }

    private void v2(View view, int i10, int i11, boolean z10) {
        boolean F1;
        j(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int S2 = S2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int S22 = S2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10) {
            F1 = H1(view, S2, S22, cVar);
        } else {
            F1 = F1(view, S2, S22, cVar);
        }
        if (F1) {
            view.measure(S2, S22);
        }
    }

    private void w2(View view, c cVar, boolean z10) {
        if (cVar.f3974f) {
            if (this.f3945w == 1) {
                v2(view, this.J, RecyclerView.p.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
            } else {
                v2(view, RecyclerView.p.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z10);
            }
        } else if (this.f3945w == 1) {
            v2(view, RecyclerView.p.K(this.f3946x, p0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            v2(view, RecyclerView.p.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.K(this.f3946x, X(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (S1() != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void x2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.z r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.x2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    private boolean y2(int i10) {
        if (this.f3945w == 0) {
            return (i10 == -1) != this.A;
        }
        return ((i10 == -1) == this.A) == u2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C0(int i10) {
        super.C0(i10);
        for (int i11 = 0; i11 < this.f3941s; i11++) {
            this.f3942t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C1(Rect rect, int i10, int i11) {
        int n10;
        int n11;
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f3945w == 1) {
            n11 = RecyclerView.p.n(i11, rect.height() + g02, b0());
            n10 = RecyclerView.p.n(i10, (this.f3946x * this.f3941s) + e02, c0());
        } else {
            n10 = RecyclerView.p.n(i10, rect.width() + e02, c0());
            n11 = RecyclerView.p.n(i11, (this.f3946x * this.f3941s) + g02, b0());
        }
        B1(n10, n11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        if (this.f3945w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D0(int i10) {
        super.D0(i10);
        for (int i11 = 0; i11 < this.f3941s; i11++) {
            this.f3942t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void E0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i10 = 0; i10 < this.f3941s; i10++) {
            this.f3942t[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    int G2(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        z2(i10, zVar);
        int b22 = b2(vVar, this.f3947y, zVar);
        if (this.f3947y.f4096b >= b22) {
            i10 = i10 < 0 ? -b22 : b22;
        }
        this.f3943u.r(-i10);
        this.G = this.A;
        f fVar = this.f3947y;
        fVar.f4096b = 0;
        B2(vVar, fVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.I0(recyclerView, vVar);
        o1(this.P);
        for (int i10 = 0; i10 < this.f3941s; i10++) {
            this.f3942t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I1(RecyclerView recyclerView, RecyclerView.z zVar, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        J1(gVar);
    }

    public void I2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        g(null);
        if (i10 == this.f3945w) {
            return;
        }
        this.f3945w = i10;
        i iVar = this.f3943u;
        this.f3943u = this.f3944v;
        this.f3944v = iVar;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View J0(View view, int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        View B;
        int j22;
        int g10;
        int g11;
        int g12;
        View m7;
        if (J() == 0 || (B = B(view)) == null) {
            return null;
        }
        F2();
        int X1 = X1(i10);
        if (X1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) B.getLayoutParams();
        boolean z10 = cVar.f3974f;
        d dVar = cVar.f3973e;
        if (X1 == 1) {
            j22 = k2();
        } else {
            j22 = j2();
        }
        P2(j22, zVar);
        H2(X1);
        f fVar = this.f3947y;
        fVar.f4097c = fVar.f4098d + j22;
        fVar.f4096b = (int) (this.f3943u.n() * 0.33333334f);
        f fVar2 = this.f3947y;
        fVar2.f4102h = true;
        fVar2.f4095a = false;
        b2(vVar, fVar2, zVar);
        this.G = this.A;
        if (z10 || (m7 = dVar.m(j22, X1)) == null || m7 == B) {
            if (y2(X1)) {
                for (int i11 = this.f3941s - 1; i11 >= 0; i11--) {
                    View m10 = this.f3942t[i11].m(j22, X1);
                    if (m10 != null && m10 != B) {
                        return m10;
                    }
                }
            } else {
                for (int i12 = 0; i12 < this.f3941s; i12++) {
                    View m11 = this.f3942t[i12].m(j22, X1);
                    if (m11 != null && m11 != B) {
                        return m11;
                    }
                }
            }
            boolean z11 = (this.f3948z ^ true) == (X1 == -1);
            if (!z10) {
                if (z11) {
                    g12 = dVar.f();
                } else {
                    g12 = dVar.g();
                }
                View C = C(g12);
                if (C != null && C != B) {
                    return C;
                }
            }
            if (y2(X1)) {
                for (int i13 = this.f3941s - 1; i13 >= 0; i13--) {
                    if (i13 != dVar.f3979e) {
                        if (z11) {
                            g11 = this.f3942t[i13].f();
                        } else {
                            g11 = this.f3942t[i13].g();
                        }
                        View C2 = C(g11);
                        if (C2 != null && C2 != B) {
                            return C2;
                        }
                    }
                }
            } else {
                for (int i14 = 0; i14 < this.f3941s; i14++) {
                    if (z11) {
                        g10 = this.f3942t[i14].f();
                    } else {
                        g10 = this.f3942t[i14].g();
                    }
                    View C3 = C(g10);
                    if (C3 != null && C3 != B) {
                        return C3;
                    }
                }
            }
            return null;
        }
        return m7;
    }

    public void J2(boolean z10) {
        g(null);
        SavedState savedState = this.I;
        if (savedState != null && savedState.f3962h != z10) {
            savedState.f3962h = z10;
        }
        this.f3948z = z10;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            View e22 = e2(false);
            View d22 = d2(false);
            if (e22 == null || d22 == null) {
                return;
            }
            int h02 = h0(e22);
            int h03 = h0(d22);
            if (h02 < h03) {
                accessibilityEvent.setFromIndex(h02);
                accessibilityEvent.setToIndex(h03);
                return;
            }
            accessibilityEvent.setFromIndex(h03);
            accessibilityEvent.setToIndex(h02);
        }
    }

    public void K2(int i10) {
        g(null);
        if (i10 != this.f3941s) {
            t2();
            this.f3941s = i10;
            this.B = new BitSet(this.f3941s);
            this.f3942t = new d[this.f3941s];
            for (int i11 = 0; i11 < this.f3941s; i11++) {
                this.f3942t[i11] = new d(i11);
            }
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean L1() {
        return this.I == null;
    }

    boolean N2(RecyclerView.z zVar, b bVar) {
        int i10;
        int m7;
        if (!zVar.e() && (i10 = this.C) != -1) {
            if (i10 >= 0 && i10 < zVar.b()) {
                SavedState savedState = this.I;
                if (savedState != null && savedState.f3955a != -1 && savedState.f3957c >= 1) {
                    bVar.f3967b = RecyclerView.UNDEFINED_DURATION;
                    bVar.f3966a = this.C;
                } else {
                    View C = C(this.C);
                    if (C != null) {
                        bVar.f3966a = this.A ? k2() : j2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f3968c) {
                                bVar.f3967b = (this.f3943u.i() - this.D) - this.f3943u.d(C);
                            } else {
                                bVar.f3967b = (this.f3943u.m() + this.D) - this.f3943u.g(C);
                            }
                            return true;
                        } else if (this.f3943u.e(C) > this.f3943u.n()) {
                            if (bVar.f3968c) {
                                m7 = this.f3943u.i();
                            } else {
                                m7 = this.f3943u.m();
                            }
                            bVar.f3967b = m7;
                            return true;
                        } else {
                            int g10 = this.f3943u.g(C) - this.f3943u.m();
                            if (g10 < 0) {
                                bVar.f3967b = -g10;
                                return true;
                            }
                            int i11 = this.f3943u.i() - this.f3943u.d(C);
                            if (i11 < 0) {
                                bVar.f3967b = i11;
                                return true;
                            }
                            bVar.f3967b = RecyclerView.UNDEFINED_DURATION;
                        }
                    } else {
                        int i12 = this.C;
                        bVar.f3966a = i12;
                        int i13 = this.D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f3968c = R1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f3969d = true;
                    }
                }
                return true;
            }
            this.C = -1;
            this.D = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    boolean O1() {
        int l10 = this.f3942t[0].l(RecyclerView.UNDEFINED_DURATION);
        for (int i10 = 1; i10 < this.f3941s; i10++) {
            if (this.f3942t[i10].l(RecyclerView.UNDEFINED_DURATION) != l10) {
                return false;
            }
        }
        return true;
    }

    void O2(RecyclerView.z zVar, b bVar) {
        if (N2(zVar, bVar) || M2(zVar, bVar)) {
            return;
        }
        bVar.a();
        bVar.f3966a = 0;
    }

    boolean P1() {
        int p10 = this.f3942t[0].p(RecyclerView.UNDEFINED_DURATION);
        for (int i10 = 1; i10 < this.f3941s; i10++) {
            if (this.f3942t[i10].p(RecyclerView.UNDEFINED_DURATION) != p10) {
                return false;
            }
        }
        return true;
    }

    void Q2(int i10) {
        this.f3946x = i10 / this.f3941s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f3944v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView, int i10, int i11) {
        r2(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView) {
        this.E.b();
        t1();
    }

    boolean S1() {
        int j22;
        int k22;
        if (J() == 0 || this.F == 0 || !r0()) {
            return false;
        }
        if (this.A) {
            j22 = k2();
            k22 = j2();
        } else {
            j22 = j2();
            k22 = k2();
        }
        if (j22 == 0 && s2() != null) {
            this.E.b();
            u1();
            t1();
            return true;
        } else if (this.M) {
            int i10 = this.A ? -1 : 1;
            int i11 = k22 + 1;
            LazySpanLookup.FullSpanItem e8 = this.E.e(j22, i11, i10, true);
            if (e8 == null) {
                this.M = false;
                this.E.d(i11);
                return false;
            }
            LazySpanLookup.FullSpanItem e10 = this.E.e(j22, e8.f3951a, i10 * (-1), true);
            if (e10 == null) {
                this.E.d(e8.f3951a);
            } else {
                this.E.d(e10.f3951a + 1);
            }
            u1();
            t1();
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        r2(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i10, int i11) {
        r2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        r2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.v vVar, RecyclerView.z zVar) {
        x2(vVar, zVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.C = -1;
        this.D = RecyclerView.UNDEFINED_DURATION;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF a(int i10) {
        int R1 = R1(i10);
        PointF pointF = new PointF();
        if (R1 == 0) {
            return null;
        }
        if (this.f3945w == 0) {
            pointF.x = R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = R1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.I = savedState;
            if (this.C != -1) {
                savedState.a();
                this.I.b();
            }
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable d1() {
        int p10;
        int m7;
        int[] iArr;
        if (this.I != null) {
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.f3962h = this.f3948z;
        savedState.f3963i = this.G;
        savedState.f3964j = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.f3949a) != null) {
            savedState.f3960f = iArr;
            savedState.f3959e = iArr.length;
            savedState.f3961g = lazySpanLookup.f3950b;
        } else {
            savedState.f3959e = 0;
        }
        if (J() > 0) {
            savedState.f3955a = this.G ? k2() : j2();
            savedState.f3956b = f2();
            int i10 = this.f3941s;
            savedState.f3957c = i10;
            savedState.f3958d = new int[i10];
            for (int i11 = 0; i11 < this.f3941s; i11++) {
                if (this.G) {
                    p10 = this.f3942t[i11].l(RecyclerView.UNDEFINED_DURATION);
                    if (p10 != Integer.MIN_VALUE) {
                        m7 = this.f3943u.i();
                        p10 -= m7;
                        savedState.f3958d[i11] = p10;
                    } else {
                        savedState.f3958d[i11] = p10;
                    }
                } else {
                    p10 = this.f3942t[i11].p(RecyclerView.UNDEFINED_DURATION);
                    if (p10 != Integer.MIN_VALUE) {
                        m7 = this.f3943u.m();
                        p10 -= m7;
                        savedState.f3958d[i11] = p10;
                    } else {
                        savedState.f3958d[i11] = p10;
                    }
                }
            }
        } else {
            savedState.f3955a = -1;
            savedState.f3956b = -1;
            savedState.f3957c = 0;
        }
        return savedState;
    }

    View d2(boolean z10) {
        int m7 = this.f3943u.m();
        int i10 = this.f3943u.i();
        View view = null;
        for (int J = J() - 1; J >= 0; J--) {
            View I = I(J);
            int g10 = this.f3943u.g(I);
            int d10 = this.f3943u.d(I);
            if (d10 > m7 && g10 < i10) {
                if (d10 <= i10 || !z10) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(int i10) {
        if (i10 == 0) {
            S1();
        }
    }

    View e2(boolean z10) {
        int m7 = this.f3943u.m();
        int i10 = this.f3943u.i();
        int J = J();
        View view = null;
        for (int i11 = 0; i11 < J; i11++) {
            View I = I(i11);
            int g10 = this.f3943u.g(I);
            if (this.f3943u.d(I) > m7 && g10 < i10) {
                if (g10 >= m7 || !z10) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    int f2() {
        View d22 = this.A ? d2(true) : e2(true);
        if (d22 == null) {
            return -1;
        }
        return h0(d22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(String str) {
        if (this.I == null) {
            super.g(str);
        }
    }

    int j2() {
        if (J() == 0) {
            return 0;
        }
        return h0(I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean k() {
        return this.f3945w == 0;
    }

    int k2() {
        int J = J();
        if (J == 0) {
            return 0;
        }
        return h0(I(J - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.f3945w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o(int i10, int i11, RecyclerView.z zVar, RecyclerView.p.c cVar) {
        int l10;
        int i12;
        if (this.f3945w != 0) {
            i10 = i11;
        }
        if (J() == 0 || i10 == 0) {
            return;
        }
        z2(i10, zVar);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f3941s) {
            this.O = new int[this.f3941s];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f3941s; i14++) {
            f fVar = this.f3947y;
            if (fVar.f4098d == -1) {
                l10 = fVar.f4100f;
                i12 = this.f3942t[i14].p(l10);
            } else {
                l10 = this.f3942t[i14].l(fVar.f4101g);
                i12 = this.f3947y.f4101g;
            }
            int i15 = l10 - i12;
            if (i15 >= 0) {
                this.O[i13] = i15;
                i13++;
            }
        }
        Arrays.sort(this.O, 0, i13);
        for (int i16 = 0; i16 < i13 && this.f3947y.a(zVar); i16++) {
            cVar.a(this.f3947y.f4097c, this.O[i16]);
            f fVar2 = this.f3947y;
            fVar2.f4097c += fVar2.f4098d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q(RecyclerView.z zVar) {
        return U1(zVar);
    }

    public int q2() {
        return this.f3941s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.z zVar) {
        return V1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.z zVar) {
        return W1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s0() {
        return this.F != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View s2() {
        /*
            r12 = this;
            int r0 = r12.J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3941s
            r2.<init>(r3)
            int r3 = r12.f3941s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3945w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.u2()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f3973e
            int r9 = r9.f3979e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f3973e
            boolean r9 = r12.T1(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f3973e
            int r9 = r9.f3979e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f3974f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.I(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.i r10 = r12.f3943u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.i r11 = r12.f3943u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.i r10 = r12.f3943u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.i r11 = r12.f3943u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f3973e
            int r8 = r8.f3979e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f3973e
            int r9 = r9.f3979e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.s2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.z zVar) {
        return U1(zVar);
    }

    public void t2() {
        this.E.b();
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.z zVar) {
        return V1(zVar);
    }

    boolean u2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.z zVar) {
        return W1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        return G2(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void x1(int i10) {
        SavedState savedState = this.I;
        if (savedState != null && savedState.f3955a != i10) {
            savedState.a();
        }
        this.C = i10;
        this.D = RecyclerView.UNDEFINED_DURATION;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y1(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        return G2(i10, vVar, zVar);
    }

    void z2(int i10, RecyclerView.z zVar) {
        int i11;
        int j22;
        if (i10 > 0) {
            j22 = k2();
            i11 = 1;
        } else {
            i11 = -1;
            j22 = j2();
        }
        this.f3947y.f4095a = true;
        P2(j22, zVar);
        H2(i11);
        f fVar = this.f3947y;
        fVar.f4097c = j22 + fVar.f4098d;
        fVar.f4096b = Math.abs(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class LazySpanLookup {

        /* renamed from: a  reason: collision with root package name */
        int[] f3949a;

        /* renamed from: b  reason: collision with root package name */
        List<FullSpanItem> f3950b;

        LazySpanLookup() {
        }

        private int i(int i10) {
            if (this.f3950b == null) {
                return -1;
            }
            FullSpanItem f10 = f(i10);
            if (f10 != null) {
                this.f3950b.remove(f10);
            }
            int size = this.f3950b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (this.f3950b.get(i11).f3951a >= i10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                this.f3950b.remove(i11);
                return this.f3950b.get(i11).f3951a;
            }
            return -1;
        }

        private void l(int i10, int i11) {
            List<FullSpanItem> list = this.f3950b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3950b.get(size);
                int i12 = fullSpanItem.f3951a;
                if (i12 >= i10) {
                    fullSpanItem.f3951a = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List<FullSpanItem> list = this.f3950b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3950b.get(size);
                int i13 = fullSpanItem.f3951a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f3950b.remove(size);
                    } else {
                        fullSpanItem.f3951a = i13 - i11;
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f3950b == null) {
                this.f3950b = new ArrayList();
            }
            int size = this.f3950b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = this.f3950b.get(i10);
                if (fullSpanItem2.f3951a == fullSpanItem.f3951a) {
                    this.f3950b.remove(i10);
                }
                if (fullSpanItem2.f3951a >= fullSpanItem.f3951a) {
                    this.f3950b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.f3950b.add(fullSpanItem);
        }

        void b() {
            int[] iArr = this.f3949a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3950b = null;
        }

        void c(int i10) {
            int[] iArr = this.f3949a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f3949a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f3949a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3949a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List<FullSpanItem> list = this.f3950b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3950b.get(size).f3951a >= i10) {
                        this.f3950b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public FullSpanItem e(int i10, int i11, int i12, boolean z10) {
            List<FullSpanItem> list = this.f3950b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = this.f3950b.get(i13);
                int i14 = fullSpanItem.f3951a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.f3952b == i12 || (z10 && fullSpanItem.f3954d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i10) {
            List<FullSpanItem> list = this.f3950b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3950b.get(size);
                if (fullSpanItem.f3951a == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f3949a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f3949a;
            if (iArr != null && i10 < iArr.length) {
                int i11 = i(i10);
                if (i11 == -1) {
                    int[] iArr2 = this.f3949a;
                    Arrays.fill(iArr2, i10, iArr2.length, -1);
                    return this.f3949a.length;
                }
                int min = Math.min(i11 + 1, this.f3949a.length);
                Arrays.fill(this.f3949a, i10, min, -1);
                return min;
            }
            return -1;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f3949a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3949a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f3949a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f3949a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3949a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f3949a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        void n(int i10, d dVar) {
            c(i10);
            this.f3949a[i10] = dVar.f3979e;
        }

        int o(int i10) {
            int length = this.f3949a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            int f3951a;

            /* renamed from: b  reason: collision with root package name */
            int f3952b;

            /* renamed from: c  reason: collision with root package name */
            int[] f3953c;

            /* renamed from: d  reason: collision with root package name */
            boolean f3954d;

            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
            class a implements Parcelable.Creator<FullSpanItem> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f3951a = parcel.readInt();
                this.f3952b = parcel.readInt();
                this.f3954d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3953c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f3953c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3951a + ", mGapDir=" + this.f3952b + ", mHasUnwantedGapAfter=" + this.f3954d + ", mGapPerSpan=" + Arrays.toString(this.f3953c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f3951a);
                parcel.writeInt(this.f3952b);
                parcel.writeInt(this.f3954d ? 1 : 0);
                int[] iArr = this.f3953c;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f3953c);
                    return;
                }
                parcel.writeInt(0);
            }

            FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i10, int i11) {
        this.f3945w = i11;
        K2(i10);
        this.f3947y = new f();
        a2();
    }
}
