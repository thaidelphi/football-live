package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.core.view.h;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.o;
import d5.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import u5.k;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k  reason: collision with root package name */
    private static final String f14018k = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: l  reason: collision with root package name */
    private static final int f14019l = j.f24114p;

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f14020a;

    /* renamed from: b  reason: collision with root package name */
    private final e f14021b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<d> f14022c;

    /* renamed from: d  reason: collision with root package name */
    private final Comparator<MaterialButton> f14023d;

    /* renamed from: e  reason: collision with root package name */
    private Integer[] f14024e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14025f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14026g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14027h;

    /* renamed from: i  reason: collision with root package name */
    private final int f14028i;

    /* renamed from: j  reason: collision with root package name */
    private Set<Integer> f14029j;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.c cVar) {
            super.g(view, cVar);
            cVar.a0(c.C0048c.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class c {

        /* renamed from: e  reason: collision with root package name */
        private static final u5.c f14032e = new u5.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        u5.c f14033a;

        /* renamed from: b  reason: collision with root package name */
        u5.c f14034b;

        /* renamed from: c  reason: collision with root package name */
        u5.c f14035c;

        /* renamed from: d  reason: collision with root package name */
        u5.c f14036d;

        c(u5.c cVar, u5.c cVar2, u5.c cVar3, u5.c cVar4) {
            this.f14033a = cVar;
            this.f14034b = cVar3;
            this.f14035c = cVar4;
            this.f14036d = cVar2;
        }

        public static c a(c cVar) {
            u5.c cVar2 = f14032e;
            return new c(cVar2, cVar.f14036d, cVar2, cVar.f14035c);
        }

        public static c b(c cVar, View view) {
            return o.e(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            u5.c cVar2 = cVar.f14033a;
            u5.c cVar3 = cVar.f14036d;
            u5.c cVar4 = f14032e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            u5.c cVar2 = f14032e;
            return new c(cVar2, cVar2, cVar.f14034b, cVar.f14035c);
        }

        public static c e(c cVar, View view) {
            return o.e(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            u5.c cVar2 = cVar.f14033a;
            u5.c cVar3 = f14032e;
            return new c(cVar2, cVar3, cVar.f14034b, cVar3);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class e implements MaterialButton.b {
        private e() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d5.b.f23988r);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton h10 = h(i10);
            int min = Math.min(h10.getStrokeWidth(), h(i10 - 1).getStrokeWidth());
            LinearLayout.LayoutParams d10 = d(h10);
            if (getOrientation() == 0) {
                h.c(d10, 0);
                h.d(d10, -min);
                d10.topMargin = 0;
            } else {
                d10.bottomMargin = 0;
                d10.topMargin = -min;
                h.d(d10, 0);
            }
            h10.setLayoutParams(d10);
        }
        n(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i10, boolean z10) {
        if (i10 == -1) {
            String str = f14018k;
            Log.e(str, "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f14029j);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f14026g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
            return;
        } else {
            if (!this.f14027h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        q(hashSet);
    }

    private void g(int i10, boolean z10) {
        Iterator<d> it = this.f14022c.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10, z10);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (k(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private MaterialButton h(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(View view) {
        if (view instanceof MaterialButton) {
            int i10 = 0;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                if (getChildAt(i11) == view) {
                    return i10;
                }
                if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                    i10++;
                }
            }
            return -1;
        }
        return -1;
    }

    private c j(int i10, int i11, int i12) {
        c cVar = this.f14020a.get(i10);
        if (i11 == i12) {
            return cVar;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? c.e(cVar, this) : c.f(cVar);
        } else if (i10 == i12) {
            return z10 ? c.b(cVar, this) : c.a(cVar);
        } else {
            return null;
        }
    }

    private boolean k(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void n(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            return;
        }
        h.c(layoutParams, 0);
        h.d(layoutParams, 0);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    private void o(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof MaterialButton) {
            this.f14025f = true;
            ((MaterialButton) findViewById).setChecked(z10);
            this.f14025f = false;
        }
    }

    private static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f14033a).t(cVar.f14036d).F(cVar.f14034b).x(cVar.f14035c);
        }
    }

    private void q(Set<Integer> set) {
        Set<Integer> set2 = this.f14029j;
        this.f14029j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = h(i10).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.f14023d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(h(i10), Integer.valueOf(i10));
        }
        this.f14024e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(a0.m());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f14021b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f14018k, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f14020a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        a0.q0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f14022c.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f14026g || this.f14029j.isEmpty()) {
            return -1;
        }
        return this.f14029j.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = h(i10).getId();
            if (this.f14029j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f14024e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w(f14018k, "Child order wasn't updated");
        return i11;
    }

    public boolean l() {
        return this.f14026g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(MaterialButton materialButton, boolean z10) {
        if (this.f14025f) {
            return;
        }
        e(materialButton.getId(), z10);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f14028i;
        if (i10 != -1) {
            q(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.c.x0(accessibilityNodeInfo).Z(c.b.a(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        s();
        c();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f14020a.remove(indexOfChild);
        }
        s();
        c();
    }

    void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton h10 = h(i10);
            if (h10.getVisibility() != 8) {
                k.b v10 = h10.getShapeAppearanceModel().v();
                p(v10, j(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                h10.setShapeAppearanceModel(v10.m());
            }
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f14027h = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f14026g != z10) {
            this.f14026g = z10;
            f();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f14019l
            android.content.Context r7 = v5.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f14020a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f14021b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f14022c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f14023d = r7
            r7 = 0
            r6.f14025f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f14029j = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = d5.k.f24298w2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            int r9 = d5.k.f24322z2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = d5.k.f24306x2
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f14028i = r9
            int r9 = d5.k.f24314y2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f14027h = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.a0.A0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
