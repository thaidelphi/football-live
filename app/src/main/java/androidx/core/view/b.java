package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: ActionProvider.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2861a;

    /* renamed from: b  reason: collision with root package name */
    private a f2862b;

    /* renamed from: c  reason: collision with root package name */
    private InterfaceC0050b f2863c;

    /* compiled from: ActionProvider.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: androidx.core.view.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0050b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f2861a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f2863c = null;
        this.f2862b = null;
    }

    public void i(a aVar) {
        this.f2862b = aVar;
    }

    public void j(InterfaceC0050b interfaceC0050b) {
        if (this.f2863c != null && interfaceC0050b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2863c = interfaceC0050b;
    }
}
