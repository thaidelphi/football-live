package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b extends a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FloatingActionButton floatingActionButton, t5.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator f0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f14292v, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f14292v, View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(a.C);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void A() {
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void C(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f14292v.isEnabled()) {
                this.f14292v.setElevation(this.f14277g);
                if (this.f14292v.isPressed()) {
                    this.f14292v.setTranslationZ(this.f14279i);
                    return;
                } else if (!this.f14292v.isFocused() && !this.f14292v.isHovered()) {
                    this.f14292v.setTranslationZ(0.0f);
                    return;
                } else {
                    this.f14292v.setTranslationZ(this.f14278h);
                    return;
                }
            }
            this.f14292v.setElevation(0.0f);
            this.f14292v.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void D(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21) {
            this.f14292v.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(a.D, f0(f10, f12));
            stateListAnimator.addState(a.E, f0(f10, f11));
            stateListAnimator.addState(a.F, f0(f10, f11));
            stateListAnimator.addState(a.G, f0(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f14292v, "elevation", f10).setDuration(0L));
            if (i10 >= 22 && i10 <= 24) {
                FloatingActionButton floatingActionButton = this.f14292v;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f14292v, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a.C);
            stateListAnimator.addState(a.H, animatorSet);
            stateListAnimator.addState(a.I, f0(0.0f, 0.0f));
            this.f14292v.setStateListAnimator(stateListAnimator);
        }
        if (W()) {
            c0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    boolean I() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void S(ColorStateList colorStateList) {
        Drawable drawable = this.f14273c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(s5.b.a(colorStateList));
        } else {
            super.S(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    boolean W() {
        return this.f14293w.c() || !Y();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void a0() {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float m() {
        return this.f14292v.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void r(Rect rect) {
        if (this.f14293w.c()) {
            super.r(rect);
        } else if (!Y()) {
            int sizeDimension = (this.f14280j - this.f14292v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void y() {
    }
}
