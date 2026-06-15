package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.j0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements j0 {

    /* renamed from: a  reason: collision with root package name */
    private j0.a f1341a;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        j0.a aVar = this.f1341a;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.j0
    public void setOnFitSystemWindowsListener(j0.a aVar) {
        this.f1341a = aVar;
    }
}
