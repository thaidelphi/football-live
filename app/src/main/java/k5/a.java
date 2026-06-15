package k5;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: InsetDialogOnTouchListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final Dialog f27265a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27266b;

    /* renamed from: c  reason: collision with root package name */
    private final int f27267c;

    /* renamed from: d  reason: collision with root package name */
    private final int f27268d;

    public a(Dialog dialog, Rect rect) {
        this.f27265a = dialog;
        this.f27266b = rect.left;
        this.f27267c = rect.top;
        this.f27268d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f27266b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f27267c + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f27268d;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f27265a.onTouchEvent(obtain);
    }
}
