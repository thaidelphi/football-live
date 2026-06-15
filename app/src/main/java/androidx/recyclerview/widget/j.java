package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
/* compiled from: PagerSnapHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j extends n {

    /* renamed from: d  reason: collision with root package name */
    private i f4116d;

    /* renamed from: e  reason: collision with root package name */
    private i f4117e;

    /* compiled from: PagerSnapHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.y
        protected void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            j jVar = j.this;
            int[] c10 = jVar.c(jVar.f4124a.getLayoutManager(), view);
            int i10 = c10[0];
            int i11 = c10[1];
            int w10 = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (w10 > 0) {
                aVar.d(i10, i11, w10, this.f4105j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.g
        public int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int k(View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    private View l(RecyclerView.p pVar, i iVar) {
        int J = pVar.J();
        View view = null;
        if (J == 0) {
            return null;
        }
        int m7 = iVar.m() + (iVar.n() / 2);
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < J; i11++) {
            View I = pVar.I(i11);
            int abs = Math.abs((iVar.g(I) + (iVar.e(I) / 2)) - m7);
            if (abs < i10) {
                view = I;
                i10 = abs;
            }
        }
        return view;
    }

    private i m(RecyclerView.p pVar) {
        i iVar = this.f4117e;
        if (iVar == null || iVar.f4113a != pVar) {
            this.f4117e = i.a(pVar);
        }
        return this.f4117e;
    }

    private i n(RecyclerView.p pVar) {
        if (pVar.l()) {
            return o(pVar);
        }
        if (pVar.k()) {
            return m(pVar);
        }
        return null;
    }

    private i o(RecyclerView.p pVar) {
        i iVar = this.f4116d;
        if (iVar == null || iVar.f4113a != pVar) {
            this.f4116d = i.c(pVar);
        }
        return this.f4116d;
    }

    private boolean p(RecyclerView.p pVar, int i10, int i11) {
        return pVar.k() ? i10 > 0 : i11 > 0;
    }

    private boolean q(RecyclerView.p pVar) {
        PointF a10;
        int Y = pVar.Y();
        if (!(pVar instanceof RecyclerView.y.b) || (a10 = ((RecyclerView.y.b) pVar).a(Y - 1)) == null) {
            return false;
        }
        return a10.x < 0.0f || a10.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.n
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.k()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.l()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    protected RecyclerView.y d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.y.b) {
            return new a(this.f4124a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View f(RecyclerView.p pVar) {
        if (pVar.l()) {
            return l(pVar, o(pVar));
        }
        if (pVar.k()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public int g(RecyclerView.p pVar, int i10, int i11) {
        i n10;
        int Y = pVar.Y();
        if (Y == 0 || (n10 = n(pVar)) == null) {
            return -1;
        }
        int i12 = RecyclerView.UNDEFINED_DURATION;
        int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int J = pVar.J();
        View view = null;
        View view2 = null;
        for (int i14 = 0; i14 < J; i14++) {
            View I = pVar.I(i14);
            if (I != null) {
                int k10 = k(I, n10);
                if (k10 <= 0 && k10 > i12) {
                    view2 = I;
                    i12 = k10;
                }
                if (k10 >= 0 && k10 < i13) {
                    view = I;
                    i13 = k10;
                }
            }
        }
        boolean p10 = p(pVar, i10, i11);
        if (!p10 || view == null) {
            if (p10 || view2 == null) {
                if (p10) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int h02 = pVar.h0(view) + (q(pVar) == p10 ? -1 : 1);
                if (h02 < 0 || h02 >= Y) {
                    return -1;
                }
                return h02;
            }
            return pVar.h0(view2);
        }
        return pVar.h0(view);
    }
}
