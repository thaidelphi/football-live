package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import s.k;
/* compiled from: VirtualLayout.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class j extends b {

    /* renamed from: j  reason: collision with root package name */
    private boolean f2378j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2379k;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.b
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f2214a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f2228c1) {
                    this.f2378j = true;
                } else if (index == i.f2263h1) {
                    this.f2379k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o(k kVar, int i10, int i11) {
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2378j || this.f2379k) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i10 = 0; i10 < this.f2099b; i10++) {
                View i11 = constraintLayout.i(this.f2098a[i10]);
                if (i11 != null) {
                    if (this.f2378j) {
                        i11.setVisibility(visibility);
                    }
                    if (this.f2379k && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        i11.setTranslationZ(i11.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }
}
