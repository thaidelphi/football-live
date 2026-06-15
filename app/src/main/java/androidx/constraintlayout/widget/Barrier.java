package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Barrier extends b {

    /* renamed from: j  reason: collision with root package name */
    private int f2005j;

    /* renamed from: k  reason: collision with root package name */
    private int f2006k;

    /* renamed from: l  reason: collision with root package name */
    private s.a f2007l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void p(s.e eVar, int i10, boolean z10) {
        this.f2006k = i10;
        if (Build.VERSION.SDK_INT < 17) {
            int i11 = this.f2005j;
            if (i11 == 5) {
                this.f2006k = 0;
            } else if (i11 == 6) {
                this.f2006k = 1;
            }
        } else if (z10) {
            int i12 = this.f2005j;
            if (i12 == 5) {
                this.f2006k = 1;
            } else if (i12 == 6) {
                this.f2006k = 0;
            }
        } else {
            int i13 = this.f2005j;
            if (i13 == 5) {
                this.f2006k = 0;
            } else if (i13 == 6) {
                this.f2006k = 1;
            }
        }
        if (eVar instanceof s.a) {
            ((s.a) eVar).j1(this.f2006k);
        }
    }

    public int getMargin() {
        return this.f2007l.f1();
    }

    public int getType() {
        return this.f2005j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.b
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f2007l = new s.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f2214a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f2277j1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f2270i1) {
                    this.f2007l.i1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.f2284k1) {
                    this.f2007l.k1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2101d = this.f2007l;
        n();
    }

    @Override // androidx.constraintlayout.widget.b
    public void i(s.e eVar, boolean z10) {
        p(eVar, this.f2005j, z10);
    }

    public boolean o() {
        return this.f2007l.d1();
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f2007l.i1(z10);
    }

    public void setDpMargin(int i10) {
        s.a aVar = this.f2007l;
        aVar.k1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f2007l.k1(i10);
    }

    public void setType(int i10) {
        this.f2005j = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
