package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
/* compiled from: LinearSmoothScroller.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends RecyclerView.y {

    /* renamed from: k  reason: collision with root package name */
    protected PointF f4106k;

    /* renamed from: l  reason: collision with root package name */
    private final DisplayMetrics f4107l;

    /* renamed from: n  reason: collision with root package name */
    private float f4109n;

    /* renamed from: i  reason: collision with root package name */
    protected final LinearInterpolator f4104i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    protected final DecelerateInterpolator f4105j = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    private boolean f4108m = false;

    /* renamed from: o  reason: collision with root package name */
    protected int f4110o = 0;

    /* renamed from: p  reason: collision with root package name */
    protected int f4111p = 0;

    public g(Context context) {
        this.f4107l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f4108m) {
            this.f4109n = v(this.f4107l);
            this.f4108m = true;
        }
        return this.f4109n;
    }

    private int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    protected int B() {
        PointF pointF = this.f4106k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void C(RecyclerView.y.a aVar) {
        PointF a10 = a(f());
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            i(a10);
            this.f4106k = a10;
            this.f4110o = (int) (a10.x * 10000.0f);
            this.f4111p = (int) (a10.y * 10000.0f);
            aVar.d((int) (this.f4110o * 1.2f), (int) (this.f4111p * 1.2f), (int) (x(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS) * 1.2f), this.f4104i);
            return;
        }
        aVar.b(f());
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    protected void l(int i10, int i11, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f4110o = y(this.f4110o, i10);
        int y10 = y(this.f4111p, i11);
        this.f4111p = y10;
        if (this.f4110o == 0 && y10 == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    protected void n() {
        this.f4111p = 0;
        this.f4110o = 0;
        this.f4106k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    protected void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        int t10 = t(view, z());
        int u10 = u(view, B());
        int w10 = w((int) Math.sqrt((t10 * t10) + (u10 * u10)));
        if (w10 > 0) {
            aVar.d(-t10, -u10, w10, this.f4105j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    public int t(View view, int i10) {
        RecyclerView.p e8 = e();
        if (e8 == null || !e8.k()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e8.Q(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, e8.T(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, e8.e0(), e8.o0() - e8.f0(), i10);
    }

    public int u(View view, int i10) {
        RecyclerView.p e8 = e();
        if (e8 == null || !e8.l()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e8.U(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, e8.O(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, e8.g0(), e8.W() - e8.d0(), i10);
    }

    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int w(int i10) {
        return (int) Math.ceil(x(i10) / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    protected int z() {
        PointF pointF = this.f4106k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
