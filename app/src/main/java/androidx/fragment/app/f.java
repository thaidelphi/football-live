package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.p0;
/* compiled from: FragmentController.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final h<?> f3365a;

    private f(h<?> hVar) {
        this.f3365a = hVar;
    }

    public static f b(h<?> hVar) {
        return new f((h) androidx.core.util.i.g(hVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.f3365a;
        hVar.f3371e.k(hVar, hVar, fragment);
    }

    public void c() {
        this.f3365a.f3371e.z();
    }

    public void d(Configuration configuration) {
        this.f3365a.f3371e.B(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f3365a.f3371e.C(menuItem);
    }

    public void f() {
        this.f3365a.f3371e.D();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f3365a.f3371e.E(menu, menuInflater);
    }

    public void h() {
        this.f3365a.f3371e.F();
    }

    public void i() {
        this.f3365a.f3371e.H();
    }

    public void j(boolean z10) {
        this.f3365a.f3371e.I(z10);
    }

    public boolean k(MenuItem menuItem) {
        return this.f3365a.f3371e.K(menuItem);
    }

    public void l(Menu menu) {
        this.f3365a.f3371e.L(menu);
    }

    public void m() {
        this.f3365a.f3371e.N();
    }

    public void n(boolean z10) {
        this.f3365a.f3371e.O(z10);
    }

    public boolean o(Menu menu) {
        return this.f3365a.f3371e.P(menu);
    }

    public void p() {
        this.f3365a.f3371e.R();
    }

    public void q() {
        this.f3365a.f3371e.S();
    }

    public void r() {
        this.f3365a.f3371e.U();
    }

    public boolean s() {
        return this.f3365a.f3371e.b0(true);
    }

    public FragmentManager t() {
        return this.f3365a.f3371e;
    }

    public void u() {
        this.f3365a.f3371e.S0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3365a.f3371e.u0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        h<?> hVar = this.f3365a;
        if (hVar instanceof p0) {
            hVar.f3371e.f1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable x() {
        return this.f3365a.f3371e.h1();
    }
}
