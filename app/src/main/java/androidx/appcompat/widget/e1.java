package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
/* compiled from: TooltipPopup.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class e1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1564a;

    /* renamed from: b  reason: collision with root package name */
    private final View f1565b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f1566c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f1567d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f1568e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f1569f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f1570g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1567d = layoutParams;
        this.f1568e = new Rect();
        this.f1569f = new int[2];
        this.f1570g = new int[2];
        this.f1564a = context;
        View inflate = LayoutInflater.from(context).inflate(e.g.f24660s, (ViewGroup) null);
        this.f1565b = inflate;
        this.f1566c = (TextView) inflate.findViewById(e.f.f24634s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = e.i.f24674a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1564a.getResources().getDimensionPixelOffset(e.d.f24587m);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1564a.getResources().getDimensionPixelOffset(e.d.f24586l);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1564a.getResources().getDimensionPixelOffset(z10 ? e.d.f24589o : e.d.f24588n);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f1568e);
        Rect rect = this.f1568e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1564a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1568e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.f1570g);
        view.getLocationOnScreen(this.f1569f);
        int[] iArr = this.f1569f;
        int i13 = iArr[0];
        int[] iArr2 = this.f1570g;
        iArr[0] = i13 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1565b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1565b.getMeasuredHeight();
        int[] iArr3 = this.f1569f;
        int i14 = ((iArr3[1] + i12) - dimensionPixelOffset3) - measuredHeight;
        int i15 = iArr3[1] + height + dimensionPixelOffset3;
        if (z10) {
            if (i14 >= 0) {
                layoutParams.y = i14;
            } else {
                layoutParams.y = i15;
            }
        } else if (measuredHeight + i15 <= this.f1568e.height()) {
            layoutParams.y = i15;
        } else {
            layoutParams.y = i14;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f1564a.getSystemService("window")).removeView(this.f1565b);
        }
    }

    boolean d() {
        return this.f1565b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1566c.setText(charSequence);
        a(view, i10, i11, z10, this.f1567d);
        ((WindowManager) this.f1564a.getSystemService("window")).addView(this.f1565b, this.f1567d);
    }
}
