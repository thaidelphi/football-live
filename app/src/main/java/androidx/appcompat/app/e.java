package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import i.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* compiled from: AppCompatDelegate.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static int f882a = -100;

    /* renamed from: b  reason: collision with root package name */
    private static final androidx.collection.b<WeakReference<e>> f883b = new androidx.collection.b<>();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f884c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(e eVar) {
        synchronized (f884c) {
            z(eVar);
            f883b.add(new WeakReference<>(eVar));
        }
    }

    public static e g(Activity activity, d dVar) {
        return new f(activity, dVar);
    }

    public static e h(Dialog dialog, d dVar) {
        return new f(dialog, dVar);
    }

    public static int j() {
        return f882a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void y(e eVar) {
        synchronized (f884c) {
            z(eVar);
        }
    }

    private static void z(e eVar) {
        synchronized (f884c) {
            Iterator<WeakReference<e>> it = f883b.iterator();
            while (it.hasNext()) {
                e eVar2 = it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract boolean A(int i10);

    public abstract void B(int i10);

    public abstract void C(View view);

    public abstract void D(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void E(Toolbar toolbar);

    public void F(int i10) {
    }

    public abstract void G(CharSequence charSequence);

    public abstract i.b H(b.a aVar);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void e(Context context) {
    }

    public Context f(Context context) {
        e(context);
        return context;
    }

    public abstract <T extends View> T i(int i10);

    public abstract b k();

    public int l() {
        return -100;
    }

    public abstract MenuInflater m();

    public abstract a n();

    public abstract void o();

    public abstract void p();

    public abstract void q(Configuration configuration);

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x();
}
