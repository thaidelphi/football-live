package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableState.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f2643a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f2644b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f2645c;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f2646d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(f fVar) {
        this.f2645c = null;
        this.f2646d = d.f2635g;
        if (fVar != null) {
            this.f2643a = fVar.f2643a;
            this.f2644b = fVar.f2644b;
            this.f2645c = fVar.f2645c;
            this.f2646d = fVar.f2646d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f2644b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f2643a;
        Drawable.ConstantState constantState = this.f2644b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(this, resources);
        }
        return new d(this, resources);
    }
}
