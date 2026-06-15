package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.j0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements j0 {

    /* renamed from: a  reason: collision with root package name */
    private j0.a f1340a;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        j0.a aVar = this.f1340a;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.j0
    public void setOnFitSystemWindowsListener(j0.a aVar) {
        this.f1340a = aVar;
    }
}
