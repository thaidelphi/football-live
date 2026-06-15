package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import e4.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n3.m1;
import n3.q3;
import x4.x;
import y4.m;
import y4.o;
import y5.q;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f10941a;

    /* renamed from: b  reason: collision with root package name */
    private final LayoutInflater f10942b;

    /* renamed from: c  reason: collision with root package name */
    private final CheckedTextView f10943c;

    /* renamed from: d  reason: collision with root package name */
    private final CheckedTextView f10944d;

    /* renamed from: e  reason: collision with root package name */
    private final b f10945e;

    /* renamed from: f  reason: collision with root package name */
    private final List<q3.a> f10946f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<k0, x> f10947g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10948h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10949i;

    /* renamed from: j  reason: collision with root package name */
    private o f10950j;

    /* renamed from: k  reason: collision with root package name */
    private CheckedTextView[][] f10951k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10952l;

    /* renamed from: m  reason: collision with root package name */
    private Comparator<c> f10953m;

    /* renamed from: n  reason: collision with root package name */
    private d f10954n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final q3.a f10956a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10957b;

        public c(q3.a aVar, int i10) {
            this.f10956a = aVar;
            this.f10957b = i10;
        }

        public m1 a() {
            return this.f10956a.c(this.f10957b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        void a(boolean z10, Map<k0, x> map);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map<k0, x> b(Map<k0, x> map, List<q3.a> list, boolean z10) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            x xVar = map.get(list.get(i10).b());
            if (xVar != null && (z10 || hashMap.isEmpty())) {
                hashMap.put(xVar.f32693a, xVar);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        if (view == this.f10943c) {
            e();
        } else if (view == this.f10944d) {
            d();
        } else {
            f(view);
        }
        i();
        d dVar = this.f10954n;
        if (dVar != null) {
            dVar.a(getIsDisabled(), getOverrides());
        }
    }

    private void d() {
        this.f10952l = false;
        this.f10947g.clear();
    }

    private void e() {
        this.f10952l = true;
        this.f10947g.clear();
    }

    private void f(View view) {
        boolean z10 = false;
        this.f10952l = false;
        c cVar = (c) a5.a.e(view.getTag());
        k0 b10 = cVar.f10956a.b();
        int i10 = cVar.f10957b;
        x xVar = this.f10947g.get(b10);
        if (xVar == null) {
            if (!this.f10949i && this.f10947g.size() > 0) {
                this.f10947g.clear();
            }
            this.f10947g.put(b10, new x(b10, q.q(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(xVar.f32694b);
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean g10 = g(cVar.f10956a);
        z10 = (g10 || h()) ? true : true;
        if (isChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.f10947g.remove(b10);
            } else {
                this.f10947g.put(b10, new x(b10, arrayList));
            }
        } else if (isChecked) {
        } else {
            if (g10) {
                arrayList.add(Integer.valueOf(i10));
                this.f10947g.put(b10, new x(b10, arrayList));
                return;
            }
            this.f10947g.put(b10, new x(b10, q.q(Integer.valueOf(i10))));
        }
    }

    private boolean g(q3.a aVar) {
        return this.f10948h && aVar.e();
    }

    private boolean h() {
        return this.f10949i && this.f10946f.size() > 1;
    }

    private void i() {
        this.f10943c.setChecked(this.f10952l);
        this.f10944d.setChecked(!this.f10952l && this.f10947g.size() == 0);
        for (int i10 = 0; i10 < this.f10951k.length; i10++) {
            x xVar = this.f10947g.get(this.f10946f.get(i10).b());
            int i11 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.f10951k;
                if (i11 < checkedTextViewArr[i10].length) {
                    if (xVar != null) {
                        this.f10951k[i10][i11].setChecked(xVar.f32694b.contains(Integer.valueOf(((c) a5.a.e(checkedTextViewArr[i10][i11].getTag())).f10957b)));
                    } else {
                        checkedTextViewArr[i10][i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    private void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f10946f.isEmpty()) {
            this.f10943c.setEnabled(false);
            this.f10944d.setEnabled(false);
            return;
        }
        this.f10943c.setEnabled(true);
        this.f10944d.setEnabled(true);
        this.f10951k = new CheckedTextView[this.f10946f.size()];
        boolean h10 = h();
        for (int i10 = 0; i10 < this.f10946f.size(); i10++) {
            q3.a aVar = this.f10946f.get(i10);
            boolean g10 = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f10951k;
            int i11 = aVar.f28308a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            c[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < aVar.f28308a; i12++) {
                cVarArr[i12] = new c(aVar, i12);
            }
            Comparator<c> comparator = this.f10953m;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                if (i13 == 0) {
                    addView(this.f10942b.inflate(y4.l.f33103a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f10942b.inflate((g10 || h10) ? 17367056 : 17367055, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f10941a);
                checkedTextView.setText(this.f10950j.a(cVarArr[i13].a()));
                checkedTextView.setTag(cVarArr[i13]);
                if (aVar.h(i13)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f10945e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f10951k[i10][i13] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public boolean getIsDisabled() {
        return this.f10952l;
    }

    public Map<k0, x> getOverrides() {
        return this.f10947g;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f10948h != z10) {
            this.f10948h = z10;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f10949i != z10) {
            this.f10949i = z10;
            if (!z10 && this.f10947g.size() > 1) {
                Map<k0, x> b10 = b(this.f10947g, this.f10946f, false);
                this.f10947g.clear();
                this.f10947g.putAll(b10);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f10943c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(o oVar) {
        this.f10950j = (o) a5.a.e(oVar);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f10941a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f10942b = from;
        b bVar = new b();
        this.f10945e = bVar;
        this.f10950j = new y4.e(getResources());
        this.f10946f = new ArrayList();
        this.f10947g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f10943c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(m.f33122q);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(y4.l.f33103a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f10944d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(m.f33121p);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
