package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.a0;
/* compiled from: MenuPopupHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1197a;

    /* renamed from: b  reason: collision with root package name */
    private final e f1198b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1199c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1200d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1201e;

    /* renamed from: f  reason: collision with root package name */
    private View f1202f;

    /* renamed from: g  reason: collision with root package name */
    private int f1203g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1204h;

    /* renamed from: i  reason: collision with root package name */
    private j.a f1205i;

    /* renamed from: j  reason: collision with root package name */
    private h f1206j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1207k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1208l;

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    private h a() {
        h lVar;
        Display defaultDisplay = ((WindowManager) this.f1197a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.f1197a.getResources().getDimensionPixelSize(e.d.f24577c)) {
            lVar = new b(this.f1197a, this.f1202f, this.f1200d, this.f1201e, this.f1199c);
        } else {
            lVar = new l(this.f1197a, this.f1198b, this.f1202f, this.f1200d, this.f1201e, this.f1199c);
        }
        lVar.j(this.f1198b);
        lVar.t(this.f1208l);
        lVar.n(this.f1202f);
        lVar.d(this.f1205i);
        lVar.q(this.f1204h);
        lVar.r(this.f1203g);
        return lVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h c10 = c();
        c10.u(z11);
        if (z10) {
            if ((androidx.core.view.e.b(this.f1203g, a0.E(this.f1202f)) & 7) == 5) {
                i10 -= this.f1202f.getWidth();
            }
            c10.s(i10);
            c10.v(i11);
            int i12 = (int) ((this.f1197a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.p(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.show();
    }

    public void b() {
        if (d()) {
            this.f1206j.dismiss();
        }
    }

    public h c() {
        if (this.f1206j == null) {
            this.f1206j = a();
        }
        return this.f1206j;
    }

    public boolean d() {
        h hVar = this.f1206j;
        return hVar != null && hVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.f1206j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1207k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f1202f = view;
    }

    public void g(boolean z10) {
        this.f1204h = z10;
        h hVar = this.f1206j;
        if (hVar != null) {
            hVar.q(z10);
        }
    }

    public void h(int i10) {
        this.f1203g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1207k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f1205i = aVar;
        h hVar = this.f1206j;
        if (hVar != null) {
            hVar.d(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f1202f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f1202f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f1203g = 8388611;
        this.f1208l = new a();
        this.f1197a = context;
        this.f1198b = eVar;
        this.f1202f = view;
        this.f1199c = z10;
        this.f1200d = i10;
        this.f1201e = i11;
    }
}
