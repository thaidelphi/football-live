package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.b9;
import com.ironsource.mm;
import com.ironsource.nf;
import com.ironsource.o9;
import com.ironsource.sdk.controller.v;
import com.ironsource.so;
import com.ironsource.u5;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h extends FrameLayout implements so {

    /* renamed from: a  reason: collision with root package name */
    private Context f20358a;

    /* renamed from: b  reason: collision with root package name */
    private v f20359b;

    /* renamed from: c  reason: collision with root package name */
    private final nf f20360c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(h.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(h.this);
            }
        }
    }

    public h(Context context) {
        super(context);
        this.f20360c = mm.S().f();
        this.f20358a = context;
        setClickable(true);
    }

    private void a() {
        ((Activity) this.f20358a).runOnUiThread(new a());
    }

    private void a(int i10, int i11) {
        try {
            Context context = this.f20358a;
            if (context != null) {
                int H = this.f20360c.H(context);
                if (H == 1) {
                    setPadding(0, i10, 0, i11);
                } else if (H == 2) {
                    setPadding(0, i10, i11, 0);
                }
            }
        } catch (Exception e8) {
            o9.d().a(e8);
        }
    }

    private void b() {
        ((Activity) this.f20358a).runOnUiThread(new b());
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.f20358a;
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.f20360c.H(activity) == 1) {
                int i10 = rect.bottom - rect2.bottom;
                if (i10 > 0) {
                    return i10;
                }
                return 0;
            }
            int i11 = rect.right - rect2.right;
            if (i11 > 0) {
                return i11;
            }
            return 0;
        } catch (Exception e8) {
            o9.d().a(e8);
            return 0;
        }
    }

    @SuppressLint({"DiscouragedApi", "InternalInsetResource"})
    private int getStatusBarHeight() {
        int identifier;
        try {
            Context context = this.f20358a;
            if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                return this.f20358a.getResources().getDimensionPixelSize(identifier);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
        }
        return 0;
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if (!((((Activity) this.f20358a).getWindow().getAttributes().flags & 1024) != 0) && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.f20358a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    public void a(v vVar) {
        this.f20359b = vVar;
        vVar.a(this);
        this.f20359b.E();
        this.f20358a = this.f20359b.q();
        a(getStatusBarPadding(), getNavigationBarPadding());
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20359b.F();
        this.f20359b.a(true, b9.h.Z);
    }

    @Override // com.ironsource.so
    public boolean onBackButtonPressed() {
        return u5.a().a((Activity) this.f20358a);
    }

    @Override // com.ironsource.so
    public void onCloseRequested() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20359b.B();
        this.f20359b.a(false, b9.h.Z);
        v vVar = this.f20359b;
        if (vVar != null) {
            vVar.a(v.u.Gone);
            this.f20359b.C();
            this.f20359b.D();
        }
        removeAllViews();
    }

    @Override // com.ironsource.so
    public void onOrientationChanged(String str, int i10) {
    }
}
