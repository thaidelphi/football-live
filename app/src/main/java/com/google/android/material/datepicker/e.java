package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.a0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
/* compiled from: MaterialCalendar.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e<S> extends com.google.android.material.datepicker.l<S> {

    /* renamed from: m0  reason: collision with root package name */
    static final Object f14163m0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: n0  reason: collision with root package name */
    static final Object f14164n0 = "NAVIGATION_PREV_TAG";

    /* renamed from: x0  reason: collision with root package name */
    static final Object f14165x0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: y0  reason: collision with root package name */
    static final Object f14166y0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: c0  reason: collision with root package name */
    private int f14167c0;

    /* renamed from: d0  reason: collision with root package name */
    private DateSelector<S> f14168d0;

    /* renamed from: e0  reason: collision with root package name */
    private CalendarConstraints f14169e0;

    /* renamed from: f0  reason: collision with root package name */
    private Month f14170f0;

    /* renamed from: g0  reason: collision with root package name */
    private k f14171g0;

    /* renamed from: h0  reason: collision with root package name */
    private com.google.android.material.datepicker.b f14172h0;

    /* renamed from: i0  reason: collision with root package name */
    private RecyclerView f14173i0;

    /* renamed from: j0  reason: collision with root package name */
    private RecyclerView f14174j0;

    /* renamed from: k0  reason: collision with root package name */
    private View f14175k0;

    /* renamed from: l0  reason: collision with root package name */
    private View f14176l0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f14177a;

        a(int i10) {
            this.f14177a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f14174j0.smoothScrollToPosition(this.f14177a);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.c cVar) {
            super.g(view, cVar);
            cVar.Z(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c extends m {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void M1(RecyclerView.z zVar, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = e.this.f14174j0.getWidth();
                iArr[1] = e.this.f14174j0.getWidth();
                return;
            }
            iArr[0] = e.this.f14174j0.getHeight();
            iArr[1] = e.this.f14174j0.getHeight();
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d implements l {
        d() {
        }

        @Override // com.google.android.material.datepicker.e.l
        public void a(long j10) {
            if (e.this.f14169e0.g().j(j10)) {
                e.this.f14168d0.S(j10);
                Iterator<com.google.android.material.datepicker.k<S>> it = e.this.f14222b0.iterator();
                while (it.hasNext()) {
                    it.next().a((S) e.this.f14168d0.P());
                }
                e.this.f14174j0.getAdapter().notifyDataSetChanged();
                if (e.this.f14173i0 != null) {
                    e.this.f14173i0.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$e  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class C0187e extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f14181a = o.k();

        /* renamed from: b  reason: collision with root package name */
        private final Calendar f14182b = o.k();

        C0187e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            int width;
            if ((recyclerView.getAdapter() instanceof p) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                p pVar = (p) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (androidx.core.util.e<Long, Long> eVar : e.this.f14168d0.F()) {
                    Long l10 = eVar.f2786a;
                    if (l10 != null && eVar.f2787b != null) {
                        this.f14181a.setTimeInMillis(l10.longValue());
                        this.f14182b.setTimeInMillis(eVar.f2787b.longValue());
                        int c10 = pVar.c(this.f14181a.get(1));
                        int c11 = pVar.c(this.f14182b.get(1));
                        View C = gridLayoutManager.C(c10);
                        View C2 = gridLayoutManager.C(c11);
                        int T2 = c10 / gridLayoutManager.T2();
                        int T22 = c11 / gridLayoutManager.T2();
                        int i10 = T2;
                        while (i10 <= T22) {
                            View C3 = gridLayoutManager.C(gridLayoutManager.T2() * i10);
                            if (C3 != null) {
                                int top = C3.getTop() + e.this.f14172h0.f14154d.c();
                                int bottom = C3.getBottom() - e.this.f14172h0.f14154d.b();
                                int left = i10 == T2 ? C.getLeft() + (C.getWidth() / 2) : 0;
                                if (i10 == T22) {
                                    width = C2.getLeft() + (C2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(left, top, width, bottom, e.this.f14172h0.f14158h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class f extends androidx.core.view.a {
        f() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.c cVar) {
            String R;
            super.g(view, cVar);
            if (e.this.f14176l0.getVisibility() == 0) {
                R = e.this.R(d5.i.f24097o);
            } else {
                R = e.this.R(d5.i.f24095m);
            }
            cVar.h0(R);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class g extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.j f14185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialButton f14186b;

        g(com.google.android.material.datepicker.j jVar, MaterialButton materialButton) {
            this.f14185a = jVar;
            this.f14186b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                CharSequence text = this.f14186b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(com.ironsource.mediationsdk.metadata.a.f18931n);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            int a22;
            if (i10 < 0) {
                a22 = e.this.n2().Y1();
            } else {
                a22 = e.this.n2().a2();
            }
            e.this.f14170f0 = this.f14185a.b(a22);
            this.f14186b.setText(this.f14185a.c(a22));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.s2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.j f14189a;

        i(com.google.android.material.datepicker.j jVar) {
            this.f14189a = jVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int Y1 = e.this.n2().Y1() + 1;
            if (Y1 < e.this.f14174j0.getAdapter().getItemCount()) {
                e.this.q2(this.f14189a.b(Y1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.j f14191a;

        j(com.google.android.material.datepicker.j jVar) {
            this.f14191a = jVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int a22 = e.this.n2().a2() - 1;
            if (a22 >= 0) {
                e.this.q2(this.f14191a.b(a22));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface l {
        void a(long j10);
    }

    private void f2(View view, com.google.android.material.datepicker.j jVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(d5.f.f24052q);
        materialButton.setTag(f14166y0);
        a0.q0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(d5.f.f24054s);
        materialButton2.setTag(f14164n0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(d5.f.f24053r);
        materialButton3.setTag(f14165x0);
        this.f14175k0 = view.findViewById(d5.f.f24061z);
        this.f14176l0 = view.findViewById(d5.f.f24056u);
        r2(k.DAY);
        materialButton.setText(this.f14170f0.l());
        this.f14174j0.addOnScrollListener(new g(jVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(jVar));
        materialButton2.setOnClickListener(new j(jVar));
    }

    private RecyclerView.o g2() {
        return new C0187e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l2(Context context) {
        return context.getResources().getDimensionPixelSize(d5.d.B);
    }

    private static int m2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(d5.d.I) + resources.getDimensionPixelOffset(d5.d.J) + resources.getDimensionPixelOffset(d5.d.H);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(d5.d.D);
        int i10 = com.google.android.material.datepicker.i.f14208f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(d5.d.B) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(d5.d.G)) + resources.getDimensionPixelOffset(d5.d.f24028z);
    }

    public static <T> e<T> o2(DateSelector<T> dateSelector, int i10, CalendarConstraints calendarConstraints) {
        e<T> eVar = new e<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.l());
        eVar.E1(bundle);
        return eVar;
    }

    private void p2(int i10) {
        this.f14174j0.post(new a(i10));
    }

    @Override // androidx.fragment.app.Fragment
    public void R0(Bundle bundle) {
        super.R0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f14167c0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f14168d0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f14169e0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f14170f0);
    }

    @Override // com.google.android.material.datepicker.l
    public boolean W1(com.google.android.material.datepicker.k<S> kVar) {
        return super.W1(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CalendarConstraints h2() {
        return this.f14169e0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.b i2() {
        return this.f14172h0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month j2() {
        return this.f14170f0;
    }

    public DateSelector<S> k2() {
        return this.f14168d0;
    }

    LinearLayoutManager n2() {
        return (LinearLayoutManager) this.f14174j0.getLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q2(Month month) {
        com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) this.f14174j0.getAdapter();
        int d10 = jVar.d(month);
        int d11 = d10 - jVar.d(this.f14170f0);
        boolean z10 = Math.abs(d11) > 3;
        boolean z11 = d11 > 0;
        this.f14170f0 = month;
        if (z10 && z11) {
            this.f14174j0.scrollToPosition(d10 - 3);
            p2(d10);
        } else if (z10) {
            this.f14174j0.scrollToPosition(d10 + 3);
            p2(d10);
        } else {
            p2(d10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r2(k kVar) {
        this.f14171g0 = kVar;
        if (kVar == k.YEAR) {
            this.f14173i0.getLayoutManager().x1(((p) this.f14173i0.getAdapter()).c(this.f14170f0.f14140c));
            this.f14175k0.setVisibility(0);
            this.f14176l0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f14175k0.setVisibility(8);
            this.f14176l0.setVisibility(0);
            q2(this.f14170f0);
        }
    }

    void s2() {
        k kVar = this.f14171g0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            r2(k.DAY);
        } else if (kVar == k.DAY) {
            r2(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void v0(Bundle bundle) {
        super.v0(bundle);
        if (bundle == null) {
            bundle = n();
        }
        this.f14167c0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f14168d0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f14169e0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f14170f0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View z0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(p(), this.f14167c0);
        this.f14172h0 = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month m7 = this.f14169e0.m();
        if (com.google.android.material.datepicker.f.B2(contextThemeWrapper)) {
            i10 = d5.h.f24079o;
            i11 = 1;
        } else {
            i10 = d5.h.f24077m;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        inflate.setMinimumHeight(m2(w1()));
        GridView gridView = (GridView) inflate.findViewById(d5.f.f24057v);
        a0.q0(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.d());
        gridView.setNumColumns(m7.f14141d);
        gridView.setEnabled(false);
        this.f14174j0 = (RecyclerView) inflate.findViewById(d5.f.f24060y);
        this.f14174j0.setLayoutManager(new c(p(), i11, false, i11));
        this.f14174j0.setTag(f14163m0);
        com.google.android.material.datepicker.j jVar = new com.google.android.material.datepicker.j(contextThemeWrapper, this.f14168d0, this.f14169e0, new d());
        this.f14174j0.setAdapter(jVar);
        int integer = contextThemeWrapper.getResources().getInteger(d5.g.f24064c);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(d5.f.f24061z);
        this.f14173i0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f14173i0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f14173i0.setAdapter(new p(this));
            this.f14173i0.addItemDecoration(g2());
        }
        if (inflate.findViewById(d5.f.f24052q) != null) {
            f2(inflate, jVar);
        }
        if (!com.google.android.material.datepicker.f.B2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f14174j0);
        }
        this.f14174j0.scrollToPosition(jVar.d(this.f14170f0));
        return inflate;
    }
}
