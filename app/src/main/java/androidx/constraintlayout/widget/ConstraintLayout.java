package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashMap;
import s.e;
import s.k;
import t.b;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    SparseArray<View> f2008a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.widget.b> f2009b;

    /* renamed from: c  reason: collision with root package name */
    protected s.f f2010c;

    /* renamed from: d  reason: collision with root package name */
    private int f2011d;

    /* renamed from: e  reason: collision with root package name */
    private int f2012e;

    /* renamed from: f  reason: collision with root package name */
    private int f2013f;

    /* renamed from: g  reason: collision with root package name */
    private int f2014g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f2015h;

    /* renamed from: i  reason: collision with root package name */
    private int f2016i;

    /* renamed from: j  reason: collision with root package name */
    private d f2017j;

    /* renamed from: k  reason: collision with root package name */
    protected androidx.constraintlayout.widget.c f2018k;

    /* renamed from: l  reason: collision with root package name */
    private int f2019l;

    /* renamed from: m  reason: collision with root package name */
    private HashMap<String, Integer> f2020m;

    /* renamed from: n  reason: collision with root package name */
    private int f2021n;

    /* renamed from: o  reason: collision with root package name */
    private int f2022o;

    /* renamed from: p  reason: collision with root package name */
    int f2023p;

    /* renamed from: q  reason: collision with root package name */
    int f2024q;

    /* renamed from: r  reason: collision with root package name */
    int f2025r;

    /* renamed from: s  reason: collision with root package name */
    int f2026s;

    /* renamed from: t  reason: collision with root package name */
    private SparseArray<s.e> f2027t;

    /* renamed from: u  reason: collision with root package name */
    c f2028u;

    /* renamed from: v  reason: collision with root package name */
    private int f2029v;

    /* renamed from: w  reason: collision with root package name */
    private int f2030w;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2031a;

        static {
            int[] iArr = new int[e.b.values().length];
            f2031a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2031a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2031a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2031a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements b.InterfaceC0356b {

        /* renamed from: a  reason: collision with root package name */
        ConstraintLayout f2074a;

        /* renamed from: b  reason: collision with root package name */
        int f2075b;

        /* renamed from: c  reason: collision with root package name */
        int f2076c;

        /* renamed from: d  reason: collision with root package name */
        int f2077d;

        /* renamed from: e  reason: collision with root package name */
        int f2078e;

        /* renamed from: f  reason: collision with root package name */
        int f2079f;

        /* renamed from: g  reason: collision with root package name */
        int f2080g;

        public c(ConstraintLayout constraintLayout) {
            this.f2074a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        @Override // t.b.InterfaceC0356b
        public final void a() {
            int childCount = this.f2074a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f2074a.getChildAt(i10);
                if (childAt instanceof g) {
                    ((g) childAt).a(this.f2074a);
                }
            }
            int size = this.f2074a.f2009b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f2074a.f2009b.get(i11)).k(this.f2074a);
                }
            }
        }

        @Override // t.b.InterfaceC0356b
        @SuppressLint({"WrongCall"})
        public final void b(s.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i10;
            int i11;
            int i12;
            if (eVar == null) {
                return;
            }
            if (eVar.Q() == 8 && !eVar.a0()) {
                aVar.f30828e = 0;
                aVar.f30829f = 0;
                aVar.f30830g = 0;
            } else if (eVar.I() == null) {
            } else {
                e.b bVar = aVar.f30824a;
                e.b bVar2 = aVar.f30825b;
                int i13 = aVar.f30826c;
                int i14 = aVar.f30827d;
                int i15 = this.f2075b + this.f2076c;
                int i16 = this.f2077d;
                View view = (View) eVar.q();
                int[] iArr = a.f2031a;
                int i17 = iArr[bVar.ordinal()];
                if (i17 == 1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else if (i17 == 2) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2079f, i16, -2);
                } else if (i17 == 3) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2079f, i16 + eVar.z(), -1);
                } else if (i17 != 4) {
                    makeMeasureSpec = 0;
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2079f, i16, -2);
                    boolean z10 = eVar.f30557p == 1;
                    int i18 = aVar.f30833j;
                    if (i18 == b.a.f30822l || i18 == b.a.f30823m) {
                        if (aVar.f30833j == b.a.f30823m || !z10 || (z10 && (view.getMeasuredHeight() == eVar.v())) || (view instanceof g) || eVar.e0()) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.R(), 1073741824);
                        }
                    }
                }
                int i19 = iArr[bVar2.ordinal()];
                if (i19 == 1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                } else if (i19 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2080g, i15, -2);
                } else if (i19 == 3) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2080g, i15 + eVar.P(), -1);
                } else if (i19 != 4) {
                    makeMeasureSpec2 = 0;
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2080g, i15, -2);
                    boolean z11 = eVar.f30559q == 1;
                    int i20 = aVar.f30833j;
                    if (i20 == b.a.f30822l || i20 == b.a.f30823m) {
                        if (aVar.f30833j == b.a.f30823m || !z11 || (z11 && (view.getMeasuredWidth() == eVar.R())) || (view instanceof g) || eVar.f0()) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                        }
                    }
                }
                s.f fVar = (s.f) eVar.I();
                if (fVar != null && s.j.b(ConstraintLayout.this.f2016i, 256) && view.getMeasuredWidth() == eVar.R() && view.getMeasuredWidth() < fVar.R() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.d0()) {
                    if (d(eVar.A(), makeMeasureSpec, eVar.R()) && d(eVar.B(), makeMeasureSpec2, eVar.v())) {
                        aVar.f30828e = eVar.R();
                        aVar.f30829f = eVar.v();
                        aVar.f30830g = eVar.n();
                        return;
                    }
                }
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                boolean z12 = bVar == bVar3;
                boolean z13 = bVar2 == bVar3;
                e.b bVar4 = e.b.MATCH_PARENT;
                boolean z14 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
                boolean z15 = bVar == bVar4 || bVar == e.b.FIXED;
                boolean z16 = z12 && eVar.W > 0.0f;
                boolean z17 = z13 && eVar.W > 0.0f;
                if (view == null) {
                    return;
                }
                b bVar5 = (b) view.getLayoutParams();
                int i21 = aVar.f30833j;
                if (i21 != b.a.f30822l && i21 != b.a.f30823m && z12 && eVar.f30557p == 0 && z13 && eVar.f30559q == 0) {
                    i12 = -1;
                    i11 = 0;
                    baseline = 0;
                    max = 0;
                } else {
                    if ((view instanceof j) && (eVar instanceof k)) {
                        ((j) view).o((k) eVar, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    eVar.F0(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i22 = eVar.f30563s;
                    max = i22 > 0 ? Math.max(i22, measuredWidth) : measuredWidth;
                    int i23 = eVar.f30565t;
                    if (i23 > 0) {
                        max = Math.min(i23, max);
                    }
                    int i24 = eVar.f30569v;
                    if (i24 > 0) {
                        i11 = Math.max(i24, measuredHeight);
                        i10 = makeMeasureSpec;
                    } else {
                        i10 = makeMeasureSpec;
                        i11 = measuredHeight;
                    }
                    int i25 = eVar.f30571w;
                    if (i25 > 0) {
                        i11 = Math.min(i25, i11);
                    }
                    if (!s.j.b(ConstraintLayout.this.f2016i, 1)) {
                        if (z16 && z14) {
                            max = (int) ((i11 * eVar.W) + 0.5f);
                        } else if (z17 && z15) {
                            i11 = (int) ((max / eVar.W) + 0.5f);
                        }
                    }
                    if (measuredWidth != max || measuredHeight != i11) {
                        int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i10;
                        if (measuredHeight != i11) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                        }
                        view.measure(makeMeasureSpec3, makeMeasureSpec2);
                        eVar.F0(makeMeasureSpec3, makeMeasureSpec2);
                        max = view.getMeasuredWidth();
                        i11 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i12 = -1;
                }
                boolean z18 = baseline != i12;
                aVar.f30832i = (max == aVar.f30826c && i11 == aVar.f30827d) ? false : true;
                if (bVar5.Y) {
                    z18 = true;
                }
                if (z18 && baseline != -1 && eVar.n() != baseline) {
                    aVar.f30832i = true;
                }
                aVar.f30828e = max;
                aVar.f30829f = i11;
                aVar.f30831h = z18;
                aVar.f30830g = baseline;
            }
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f2075b = i12;
            this.f2076c = i13;
            this.f2077d = i14;
            this.f2078e = i15;
            this.f2079f = i10;
            this.f2080g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2008a = new SparseArray<>();
        this.f2009b = new ArrayList<>(4);
        this.f2010c = new s.f();
        this.f2011d = 0;
        this.f2012e = 0;
        this.f2013f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f2014g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f2015h = true;
        this.f2016i = 257;
        this.f2017j = null;
        this.f2018k = null;
        this.f2019l = -1;
        this.f2020m = new HashMap<>();
        this.f2021n = -1;
        this.f2022o = -1;
        this.f2023p = -1;
        this.f2024q = -1;
        this.f2025r = 0;
        this.f2026s = 0;
        this.f2027t = new SparseArray<>();
        this.f2028u = new c(this);
        this.f2029v = 0;
        this.f2030w = 0;
        k(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart()) : 0;
        return max2 > 0 ? max2 : max;
    }

    private final s.e h(int i10) {
        if (i10 == 0) {
            return this.f2010c;
        }
        View view = this.f2008a.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2010c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f2059n0;
    }

    private void k(AttributeSet attributeSet, int i10, int i11) {
        this.f2010c.l0(this);
        this.f2010c.D1(this.f2028u);
        this.f2008a.put(getId(), this);
        this.f2017j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f2214a1, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == i.f2249f1) {
                    this.f2011d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2011d);
                } else if (index == i.f2256g1) {
                    this.f2012e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2012e);
                } else if (index == i.f2235d1) {
                    this.f2013f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2013f);
                } else if (index == i.f2242e1) {
                    this.f2014g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2014g);
                } else if (index == i.f2303n2) {
                    this.f2016i = obtainStyledAttributes.getInt(index, this.f2016i);
                } else if (index == i.f2308o1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            n(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2018k = null;
                        }
                    }
                } else if (index == i.f2290l1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f2017j = dVar;
                        dVar.m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2017j = null;
                    }
                    this.f2019l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2010c.E1(this.f2016i);
    }

    private void m() {
        this.f2015h = true;
        this.f2021n = -1;
        this.f2022o = -1;
        this.f2023p = -1;
        this.f2024q = -1;
        this.f2025r = 0;
        this.f2026s = 0;
    }

    private void q() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            s.e j10 = j(getChildAt(i10));
            if (j10 != null) {
                j10.h0();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    r(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    h(childAt.getId()).m0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2019l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f2019l && (childAt2 instanceof e)) {
                    this.f2017j = ((e) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.f2017j;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f2010c.d1();
        int size = this.f2009b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.f2009b.get(i13).m(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof g) {
                ((g) childAt3).b(this);
            }
        }
        this.f2027t.clear();
        this.f2027t.put(0, this.f2010c);
        this.f2027t.put(getId(), this.f2010c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f2027t.put(childAt4.getId(), j(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            s.e j11 = j(childAt5);
            if (j11 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f2010c.a(j11);
                d(isInEditMode, childAt5, j11, bVar, this.f2027t);
            }
        }
    }

    private boolean t() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            q();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void d(boolean r20, android.view.View r21, s.e r22, androidx.constraintlayout.widget.ConstraintLayout.b r23, android.util.SparseArray<s.e> r24) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.d(boolean, android.view.View, s.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.f2009b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f2009b.get(i10).l(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: e */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        m();
        super.forceLayout();
    }

    public Object g(int i10, Object obj) {
        if (i10 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f2020m;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.f2020m.get(str);
        }
        return null;
    }

    public int getMaxHeight() {
        return this.f2014g;
    }

    public int getMaxWidth() {
        return this.f2013f;
    }

    public int getMinHeight() {
        return this.f2012e;
    }

    public int getMinWidth() {
        return this.f2011d;
    }

    public int getOptimizationLevel() {
        return this.f2010c.s1();
    }

    public View i(int i10) {
        return this.f2008a.get(i10);
    }

    public final s.e j(View view) {
        if (view == this) {
            return this.f2010c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f2059n0;
    }

    protected boolean l() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    protected void n(int i10) {
        this.f2018k = new androidx.constraintlayout.widget.c(getContext(), this, i10);
    }

    protected void o(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f2028u;
        int i14 = cVar.f2078e;
        int i15 = i12 + cVar.f2077d;
        int i16 = i13 + i14;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(i15, i10, 0);
            int min = Math.min(this.f2013f, resolveSizeAndState & 16777215);
            int min2 = Math.min(this.f2014g, ViewGroup.resolveSizeAndState(i16, i11, 0) & 16777215);
            if (z10) {
                min |= 16777216;
            }
            if (z11) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.f2021n = min;
            this.f2022o = min2;
            return;
        }
        setMeasuredDimension(i15, i16);
        this.f2021n = i15;
        this.f2022o = i16;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            s.e eVar = bVar.f2059n0;
            if ((childAt.getVisibility() != 8 || bVar.Z || bVar.f2033a0 || bVar.f2037c0 || isInEditMode) && !bVar.f2035b0) {
                int S = eVar.S();
                int T = eVar.T();
                int R = eVar.R() + S;
                int v10 = eVar.v() + T;
                childAt.layout(S, T, R, v10);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(S, T, R, v10);
                }
            }
        }
        int size = this.f2009b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f2009b.get(i15).j(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f2015h) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                } else if (getChildAt(i12).isLayoutRequested()) {
                    this.f2015h = true;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (!this.f2015h) {
            int i13 = this.f2029v;
            if (i13 == i10 && this.f2030w == i11) {
                o(i10, i11, this.f2010c.R(), this.f2010c.v(), this.f2010c.y1(), this.f2010c.w1());
                return;
            } else if (i13 == i10 && View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f2030w) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i11) >= this.f2010c.v()) {
                this.f2029v = i10;
                this.f2030w = i11;
                o(i10, i11, this.f2010c.R(), this.f2010c.v(), this.f2010c.y1(), this.f2010c.w1());
                return;
            }
        }
        this.f2029v = i10;
        this.f2030w = i11;
        this.f2010c.F1(l());
        if (this.f2015h) {
            this.f2015h = false;
            if (t()) {
                this.f2010c.H1();
            }
        }
        p(this.f2010c, this.f2016i, i10, i11);
        o(i10, i11, this.f2010c.R(), this.f2010c.v(), this.f2010c.y1(), this.f2010c.w1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        s.e j10 = j(view);
        if ((view instanceof Guideline) && !(j10 instanceof s.g)) {
            b bVar = (b) view.getLayoutParams();
            s.g gVar = new s.g();
            bVar.f2059n0 = gVar;
            bVar.Z = true;
            gVar.j1(bVar.S);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.n();
            ((b) view.getLayoutParams()).f2033a0 = true;
            if (!this.f2009b.contains(bVar2)) {
                this.f2009b.add(bVar2);
            }
        }
        this.f2008a.put(view.getId(), view);
        this.f2015h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f2008a.remove(view.getId());
        this.f2010c.c1(j(view));
        this.f2009b.remove(view);
        this.f2015h = true;
    }

    protected void p(s.f fVar, int i10, int i11, int i12) {
        int max;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i13 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        this.f2028u.c(i11, i12, max2, max3, paddingWidth, i13);
        if (Build.VERSION.SDK_INT >= 17) {
            int max4 = Math.max(0, getPaddingStart());
            int max5 = Math.max(0, getPaddingEnd());
            if (max4 <= 0 && max5 <= 0) {
                max4 = Math.max(0, getPaddingLeft());
            } else if (l()) {
                max4 = max5;
            }
            max = max4;
        } else {
            max = Math.max(0, getPaddingLeft());
        }
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        s(fVar, mode, i14, mode2, i15);
        fVar.z1(i10, mode, i14, mode2, i15, this.f2021n, this.f2022o, max, max2);
    }

    public void r(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2020m == null) {
                this.f2020m = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2020m.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m();
        super.requestLayout();
    }

    protected void s(s.f fVar, int i10, int i11, int i12, int i13) {
        e.b bVar;
        c cVar = this.f2028u;
        int i14 = cVar.f2078e;
        int i15 = cVar.f2077d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f2011d);
            }
        } else if (i10 == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f2011d);
            }
            i11 = 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
            i11 = 0;
        } else {
            i11 = Math.min(this.f2013f - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f2012e);
            }
        } else if (i12 != 0) {
            if (i12 == 1073741824) {
                i13 = Math.min(this.f2014g - i14, i13);
            }
            i13 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f2012e);
            }
            i13 = 0;
        }
        if (i11 != fVar.R() || i13 != fVar.v()) {
            fVar.v1();
        }
        fVar.V0(0);
        fVar.W0(0);
        fVar.H0(this.f2013f - i15);
        fVar.G0(this.f2014g - i14);
        fVar.K0(0);
        fVar.J0(0);
        fVar.z0(bVar);
        fVar.U0(i11);
        fVar.Q0(bVar2);
        fVar.v0(i13);
        fVar.K0(this.f2011d - i15);
        fVar.J0(this.f2012e - i14);
    }

    public void setConstraintSet(d dVar) {
        this.f2017j = dVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f2008a.remove(getId());
        super.setId(i10);
        this.f2008a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f2014g) {
            return;
        }
        this.f2014g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f2013f) {
            return;
        }
        this.f2013f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f2012e) {
            return;
        }
        this.f2012e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f2011d) {
            return;
        }
        this.f2011d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        androidx.constraintlayout.widget.c cVar = this.f2018k;
        if (cVar != null) {
            cVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f2016i = i10;
        this.f2010c.E1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2008a = new SparseArray<>();
        this.f2009b = new ArrayList<>(4);
        this.f2010c = new s.f();
        this.f2011d = 0;
        this.f2012e = 0;
        this.f2013f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f2014g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f2015h = true;
        this.f2016i = 257;
        this.f2017j = null;
        this.f2018k = null;
        this.f2019l = -1;
        this.f2020m = new HashMap<>();
        this.f2021n = -1;
        this.f2022o = -1;
        this.f2023p = -1;
        this.f2024q = -1;
        this.f2025r = 0;
        this.f2026s = 0;
        this.f2027t = new SparseArray<>();
        this.f2028u = new c(this);
        this.f2029v = 0;
        this.f2030w = 0;
        k(attributeSet, i10, 0);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* renamed from: a  reason: collision with root package name */
        public int f2032a;

        /* renamed from: a0  reason: collision with root package name */
        boolean f2033a0;

        /* renamed from: b  reason: collision with root package name */
        public int f2034b;

        /* renamed from: b0  reason: collision with root package name */
        boolean f2035b0;

        /* renamed from: c  reason: collision with root package name */
        public float f2036c;

        /* renamed from: c0  reason: collision with root package name */
        boolean f2037c0;

        /* renamed from: d  reason: collision with root package name */
        public int f2038d;

        /* renamed from: d0  reason: collision with root package name */
        int f2039d0;

        /* renamed from: e  reason: collision with root package name */
        public int f2040e;

        /* renamed from: e0  reason: collision with root package name */
        int f2041e0;

        /* renamed from: f  reason: collision with root package name */
        public int f2042f;

        /* renamed from: f0  reason: collision with root package name */
        int f2043f0;

        /* renamed from: g  reason: collision with root package name */
        public int f2044g;

        /* renamed from: g0  reason: collision with root package name */
        int f2045g0;

        /* renamed from: h  reason: collision with root package name */
        public int f2046h;

        /* renamed from: h0  reason: collision with root package name */
        int f2047h0;

        /* renamed from: i  reason: collision with root package name */
        public int f2048i;

        /* renamed from: i0  reason: collision with root package name */
        int f2049i0;

        /* renamed from: j  reason: collision with root package name */
        public int f2050j;

        /* renamed from: j0  reason: collision with root package name */
        float f2051j0;

        /* renamed from: k  reason: collision with root package name */
        public int f2052k;

        /* renamed from: k0  reason: collision with root package name */
        int f2053k0;

        /* renamed from: l  reason: collision with root package name */
        public int f2054l;

        /* renamed from: l0  reason: collision with root package name */
        int f2055l0;

        /* renamed from: m  reason: collision with root package name */
        public int f2056m;

        /* renamed from: m0  reason: collision with root package name */
        float f2057m0;

        /* renamed from: n  reason: collision with root package name */
        public int f2058n;

        /* renamed from: n0  reason: collision with root package name */
        s.e f2059n0;

        /* renamed from: o  reason: collision with root package name */
        public float f2060o;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f2061o0;

        /* renamed from: p  reason: collision with root package name */
        public int f2062p;

        /* renamed from: q  reason: collision with root package name */
        public int f2063q;

        /* renamed from: r  reason: collision with root package name */
        public int f2064r;

        /* renamed from: s  reason: collision with root package name */
        public int f2065s;

        /* renamed from: t  reason: collision with root package name */
        public int f2066t;

        /* renamed from: u  reason: collision with root package name */
        public int f2067u;

        /* renamed from: v  reason: collision with root package name */
        public int f2068v;

        /* renamed from: w  reason: collision with root package name */
        public int f2069w;

        /* renamed from: x  reason: collision with root package name */
        public int f2070x;

        /* renamed from: y  reason: collision with root package name */
        public int f2071y;

        /* renamed from: z  reason: collision with root package name */
        public float f2072z;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        private static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f2073a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2073a = sparseIntArray;
                sparseIntArray.append(i.N1, 8);
                sparseIntArray.append(i.O1, 9);
                sparseIntArray.append(i.Q1, 10);
                sparseIntArray.append(i.R1, 11);
                sparseIntArray.append(i.X1, 12);
                sparseIntArray.append(i.W1, 13);
                sparseIntArray.append(i.f2350v1, 14);
                sparseIntArray.append(i.f2344u1, 15);
                sparseIntArray.append(i.f2332s1, 16);
                sparseIntArray.append(i.f2356w1, 2);
                sparseIntArray.append(i.f2368y1, 3);
                sparseIntArray.append(i.f2362x1, 4);
                sparseIntArray.append(i.f2250f2, 49);
                sparseIntArray.append(i.f2257g2, 50);
                sparseIntArray.append(i.C1, 5);
                sparseIntArray.append(i.D1, 6);
                sparseIntArray.append(i.E1, 7);
                sparseIntArray.append(i.f2221b1, 1);
                sparseIntArray.append(i.S1, 17);
                sparseIntArray.append(i.T1, 18);
                sparseIntArray.append(i.B1, 19);
                sparseIntArray.append(i.A1, 20);
                sparseIntArray.append(i.f2278j2, 21);
                sparseIntArray.append(i.f2297m2, 22);
                sparseIntArray.append(i.f2285k2, 23);
                sparseIntArray.append(i.f2264h2, 24);
                sparseIntArray.append(i.f2291l2, 25);
                sparseIntArray.append(i.f2271i2, 26);
                sparseIntArray.append(i.J1, 29);
                sparseIntArray.append(i.Y1, 30);
                sparseIntArray.append(i.f2374z1, 44);
                sparseIntArray.append(i.L1, 45);
                sparseIntArray.append(i.f2215a2, 46);
                sparseIntArray.append(i.K1, 47);
                sparseIntArray.append(i.Z1, 48);
                sparseIntArray.append(i.f2320q1, 27);
                sparseIntArray.append(i.f2314p1, 28);
                sparseIntArray.append(i.f2222b2, 31);
                sparseIntArray.append(i.F1, 32);
                sparseIntArray.append(i.f2236d2, 33);
                sparseIntArray.append(i.f2229c2, 34);
                sparseIntArray.append(i.f2243e2, 35);
                sparseIntArray.append(i.H1, 36);
                sparseIntArray.append(i.G1, 37);
                sparseIntArray.append(i.I1, 38);
                sparseIntArray.append(i.M1, 39);
                sparseIntArray.append(i.V1, 40);
                sparseIntArray.append(i.P1, 41);
                sparseIntArray.append(i.f2338t1, 42);
                sparseIntArray.append(i.f2326r1, 43);
                sparseIntArray.append(i.U1, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i10;
            this.f2032a = -1;
            this.f2034b = -1;
            this.f2036c = -1.0f;
            this.f2038d = -1;
            this.f2040e = -1;
            this.f2042f = -1;
            this.f2044g = -1;
            this.f2046h = -1;
            this.f2048i = -1;
            this.f2050j = -1;
            this.f2052k = -1;
            this.f2054l = -1;
            this.f2056m = -1;
            this.f2058n = 0;
            this.f2060o = 0.0f;
            this.f2062p = -1;
            this.f2063q = -1;
            this.f2064r = -1;
            this.f2065s = -1;
            this.f2066t = -1;
            this.f2067u = -1;
            this.f2068v = -1;
            this.f2069w = -1;
            this.f2070x = -1;
            this.f2071y = -1;
            this.f2072z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f2033a0 = false;
            this.f2035b0 = false;
            this.f2037c0 = false;
            this.f2039d0 = -1;
            this.f2041e0 = -1;
            this.f2043f0 = -1;
            this.f2045g0 = -1;
            this.f2047h0 = -1;
            this.f2049i0 = -1;
            this.f2051j0 = 0.5f;
            this.f2059n0 = new s.e();
            this.f2061o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f2214a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = a.f2073a.get(index);
                switch (i12) {
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2056m);
                        this.f2056m = resourceId;
                        if (resourceId == -1) {
                            this.f2056m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f2058n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2058n);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f2060o) % 360.0f;
                        this.f2060o = f10;
                        if (f10 < 0.0f) {
                            this.f2060o = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f2032a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2032a);
                        break;
                    case 6:
                        this.f2034b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2034b);
                        break;
                    case 7:
                        this.f2036c = obtainStyledAttributes.getFloat(index, this.f2036c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2038d);
                        this.f2038d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2038d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2040e);
                        this.f2040e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2040e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2042f);
                        this.f2042f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2042f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2044g);
                        this.f2044g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2044g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2046h);
                        this.f2046h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2046h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2048i);
                        this.f2048i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2048i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2050j);
                        this.f2050j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2050j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2052k);
                        this.f2052k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2052k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2054l);
                        this.f2054l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2054l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2062p);
                        this.f2062p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2062p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2063q);
                        this.f2063q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2063q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2064r);
                        this.f2064r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2064r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2065s);
                        this.f2065s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2065s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f2066t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2066t);
                        break;
                    case 22:
                        this.f2067u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2067u);
                        break;
                    case 23:
                        this.f2068v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2068v);
                        break;
                    case 24:
                        this.f2069w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2069w);
                        break;
                    case 25:
                        this.f2070x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2070x);
                        break;
                    case 26:
                        this.f2071y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2071y);
                        break;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        break;
                    case 29:
                        this.f2072z = obtainStyledAttributes.getFloat(index, this.f2072z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.I = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i14 = obtainStyledAttributes.getInt(index, 0);
                        this.J = i14;
                        if (i14 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        break;
                    case 36:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i10 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i10 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i10, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.D == 1) {
                                                        this.C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i10);
                                        if (substring4.length() > 0) {
                                            this.C = Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 46:
                                this.F = obtainStyledAttributes.getFloat(index, this.F);
                                continue;
                            case 47:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                            case 50:
                                this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                continue;
                            case 51:
                                this.V = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.W = false;
                if (i10 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.X = false;
                if (i11 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.f2036c == -1.0f && this.f2032a == -1 && this.f2034b == -1) {
                return;
            }
            this.Z = true;
            this.W = true;
            this.X = true;
            if (!(this.f2059n0 instanceof s.g)) {
                this.f2059n0 = new s.g();
            }
            ((s.g) this.f2059n0).j1(this.S);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f2032a = -1;
            this.f2034b = -1;
            this.f2036c = -1.0f;
            this.f2038d = -1;
            this.f2040e = -1;
            this.f2042f = -1;
            this.f2044g = -1;
            this.f2046h = -1;
            this.f2048i = -1;
            this.f2050j = -1;
            this.f2052k = -1;
            this.f2054l = -1;
            this.f2056m = -1;
            this.f2058n = 0;
            this.f2060o = 0.0f;
            this.f2062p = -1;
            this.f2063q = -1;
            this.f2064r = -1;
            this.f2065s = -1;
            this.f2066t = -1;
            this.f2067u = -1;
            this.f2068v = -1;
            this.f2069w = -1;
            this.f2070x = -1;
            this.f2071y = -1;
            this.f2072z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f2033a0 = false;
            this.f2035b0 = false;
            this.f2037c0 = false;
            this.f2039d0 = -1;
            this.f2041e0 = -1;
            this.f2043f0 = -1;
            this.f2045g0 = -1;
            this.f2047h0 = -1;
            this.f2049i0 = -1;
            this.f2051j0 = 0.5f;
            this.f2059n0 = new s.e();
            this.f2061o0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2032a = -1;
            this.f2034b = -1;
            this.f2036c = -1.0f;
            this.f2038d = -1;
            this.f2040e = -1;
            this.f2042f = -1;
            this.f2044g = -1;
            this.f2046h = -1;
            this.f2048i = -1;
            this.f2050j = -1;
            this.f2052k = -1;
            this.f2054l = -1;
            this.f2056m = -1;
            this.f2058n = 0;
            this.f2060o = 0.0f;
            this.f2062p = -1;
            this.f2063q = -1;
            this.f2064r = -1;
            this.f2065s = -1;
            this.f2066t = -1;
            this.f2067u = -1;
            this.f2068v = -1;
            this.f2069w = -1;
            this.f2070x = -1;
            this.f2071y = -1;
            this.f2072z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f2033a0 = false;
            this.f2035b0 = false;
            this.f2037c0 = false;
            this.f2039d0 = -1;
            this.f2041e0 = -1;
            this.f2043f0 = -1;
            this.f2045g0 = -1;
            this.f2047h0 = -1;
            this.f2049i0 = -1;
            this.f2051j0 = 0.5f;
            this.f2059n0 = new s.e();
            this.f2061o0 = false;
        }
    }
}
