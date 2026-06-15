package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.j;
/* compiled from: MenuDialogHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: a  reason: collision with root package name */
    private e f1165a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.appcompat.app.c f1166b;

    /* renamed from: c  reason: collision with root package name */
    c f1167c;

    /* renamed from: d  reason: collision with root package name */
    private j.a f1168d;

    public f(e eVar) {
        this.f1165a = eVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f1166b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(e eVar, boolean z10) {
        if (z10 || eVar == this.f1165a) {
            a();
        }
        j.a aVar = this.f1168d;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(e eVar) {
        j.a aVar = this.f1168d;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f1165a;
        c.a aVar = new c.a(eVar.u());
        c cVar = new c(aVar.getContext(), e.g.f24651j);
        this.f1167c = cVar;
        cVar.d(this);
        this.f1165a.b(this.f1167c);
        aVar.a(this.f1167c.a(), this);
        View y10 = eVar.y();
        if (y10 != null) {
            aVar.b(y10);
        } else {
            aVar.c(eVar.w()).setTitle(eVar.x());
        }
        aVar.d(this);
        androidx.appcompat.app.c create = aVar.create();
        this.f1166b = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1166b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1166b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f1165a.L((g) this.f1167c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1167c.b(this.f1165a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1166b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1166b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1165a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1165a.performShortcut(i10, keyEvent, 0);
    }
}
