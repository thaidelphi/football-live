package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* compiled from: AppCompatSeekBar.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class y extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    private final z f1798a;

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.J);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1798a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1798a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1798a.g(canvas);
    }

    public y(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        u0.a(this, getContext());
        z zVar = new z(this);
        this.f1798a = zVar;
        zVar.c(attributeSet, i10);
    }
}
