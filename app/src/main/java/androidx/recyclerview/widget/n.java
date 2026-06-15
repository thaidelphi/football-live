package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SnapHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class n extends RecyclerView.s {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f4124a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f4125b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.OnScrollListener f4126c = new a();

    /* compiled from: SnapHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f4127a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0 && this.f4127a) {
                this.f4127a = false;
                n.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f4127a = true;
        }
    }

    private void e() {
        this.f4124a.removeOnScrollListener(this.f4126c);
        this.f4124a.setOnFlingListener(null);
    }

    private void h() throws IllegalStateException {
        if (this.f4124a.getOnFlingListener() == null) {
            this.f4124a.addOnScrollListener(this.f4126c);
            this.f4124a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean i(RecyclerView.p pVar, int i10, int i11) {
        RecyclerView.y d10;
        int g10;
        if (!(pVar instanceof RecyclerView.y.b) || (d10 = d(pVar)) == null || (g10 = g(pVar, i10, i11)) == -1) {
            return false;
        }
        d10.p(g10);
        pVar.J1(d10);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i10, int i11) {
        RecyclerView.p layoutManager = this.f4124a.getLayoutManager();
        if (layoutManager == null || this.f4124a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4124a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f4124a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f4124a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f4125b = new Scroller(this.f4124a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    protected abstract RecyclerView.y d(RecyclerView.p pVar);

    public abstract View f(RecyclerView.p pVar);

    public abstract int g(RecyclerView.p pVar, int i10, int i11);

    void j() {
        RecyclerView.p layoutManager;
        View f10;
        RecyclerView recyclerView = this.f4124a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f10 = f(layoutManager)) == null) {
            return;
        }
        int[] c10 = c(layoutManager, f10);
        if (c10[0] == 0 && c10[1] == 0) {
            return;
        }
        this.f4124a.smoothScrollBy(c10[0], c10[1]);
    }
}
