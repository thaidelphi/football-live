package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ironsource.ug;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: ConstraintHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b extends View {

    /* renamed from: a  reason: collision with root package name */
    protected int[] f2098a;

    /* renamed from: b  reason: collision with root package name */
    protected int f2099b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f2100c;

    /* renamed from: d  reason: collision with root package name */
    protected s.h f2101d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f2102e;

    /* renamed from: f  reason: collision with root package name */
    protected String f2103f;

    /* renamed from: g  reason: collision with root package name */
    protected String f2104g;

    /* renamed from: h  reason: collision with root package name */
    private View[] f2105h;

    /* renamed from: i  reason: collision with root package name */
    private HashMap<Integer, String> f2106i;

    public b(Context context) {
        super(context);
        this.f2098a = new int[32];
        this.f2102e = false;
        this.f2105h = null;
        this.f2106i = new HashMap<>();
        this.f2100c = context;
        h(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f2100c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int g10 = g(trim);
        if (g10 != 0) {
            this.f2106i.put(Integer.valueOf(g10), trim);
            b(g10);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f2099b + 1;
        int[] iArr = this.f2098a;
        if (i11 > iArr.length) {
            this.f2098a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2098a;
        int i12 = this.f2099b;
        iArr2[i12] = i10;
        this.f2099b = i12 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f2100c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).V)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2100c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int g(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object g10 = constraintLayout.g(0, str);
            if (g10 instanceof Integer) {
                i10 = ((Integer) g10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = f(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f2100c.getResources().getIdentifier(str, ug.f21009x, this.f2100c.getPackageName()) : i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i10 = 0; i10 < this.f2099b; i10++) {
            View i11 = constraintLayout.i(this.f2098a[i10]);
            if (i11 != null) {
                i11.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    i11.setTranslationZ(i11.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2098a, this.f2099b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f2214a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f2296m1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2103f = string;
                    setIds(string);
                } else if (index == i.f2302n1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2104g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void i(s.e eVar, boolean z10) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
        String str;
        int f10;
        if (isInEditMode()) {
            setIds(this.f2103f);
        }
        s.h hVar = this.f2101d;
        if (hVar == null) {
            return;
        }
        hVar.c();
        for (int i10 = 0; i10 < this.f2099b; i10++) {
            int i11 = this.f2098a[i10];
            View i12 = constraintLayout.i(i11);
            if (i12 == null && (f10 = f(constraintLayout, (str = this.f2106i.get(Integer.valueOf(i11))))) != 0) {
                this.f2098a[i10] = f10;
                this.f2106i.put(Integer.valueOf(f10), str);
                i12 = constraintLayout.i(f10);
            }
            if (i12 != null) {
                this.f2101d.a(constraintLayout.j(i12));
            }
        }
        this.f2101d.b(constraintLayout.f2010c);
    }

    public void n() {
        if (this.f2101d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f2059n0 = (s.e) this.f2101d;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2103f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2104g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f2102e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f2103f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2099b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f2104g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2099b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2103f = null;
        this.f2099b = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f2103f == null) {
            b(i10);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2098a = new int[32];
        this.f2102e = false;
        this.f2105h = null;
        this.f2106i = new HashMap<>();
        this.f2100c = context;
        h(attributeSet);
    }
}
