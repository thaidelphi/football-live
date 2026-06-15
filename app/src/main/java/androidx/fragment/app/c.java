package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
/* compiled from: DialogFragment.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: b0  reason: collision with root package name */
    private Handler f3325b0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f3334k0;

    /* renamed from: m0  reason: collision with root package name */
    private Dialog f3336m0;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f3337n0;

    /* renamed from: x0  reason: collision with root package name */
    private boolean f3338x0;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f3339y0;

    /* renamed from: c0  reason: collision with root package name */
    private Runnable f3326c0 = new a();

    /* renamed from: d0  reason: collision with root package name */
    private DialogInterface.OnCancelListener f3327d0 = new b();

    /* renamed from: e0  reason: collision with root package name */
    private DialogInterface.OnDismissListener f3328e0 = new DialogInterface$OnDismissListenerC0058c();

    /* renamed from: f0  reason: collision with root package name */
    private int f3329f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    private int f3330g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f3331h0 = true;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f3332i0 = true;

    /* renamed from: j0  reason: collision with root package name */
    private int f3333j0 = -1;

    /* renamed from: l0  reason: collision with root package name */
    private androidx.lifecycle.x<androidx.lifecycle.p> f3335l0 = new d();

    /* renamed from: z0  reason: collision with root package name */
    private boolean f3340z0 = false;

    /* compiled from: DialogFragment.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            c.this.f3328e0.onDismiss(c.this.f3336m0);
        }
    }

    /* compiled from: DialogFragment.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (c.this.f3336m0 != null) {
                c cVar = c.this;
                cVar.onCancel(cVar.f3336m0);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class DialogInterface$OnDismissListenerC0058c implements DialogInterface.OnDismissListener {
        DialogInterface$OnDismissListenerC0058c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (c.this.f3336m0 != null) {
                c cVar = c.this;
                cVar.onDismiss(cVar.f3336m0);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements androidx.lifecycle.x<androidx.lifecycle.p> {
        d() {
        }

        @Override // androidx.lifecycle.x
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(androidx.lifecycle.p pVar) {
            if (pVar == null || !c.this.f3332i0) {
                return;
            }
            View x12 = c.this.x1();
            if (x12.getParent() == null) {
                if (c.this.f3336m0 != null) {
                    if (FragmentManager.F0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + c.this.f3336m0);
                    }
                    c.this.f3336m0.setContentView(x12);
                    return;
                }
                return;
            }
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
    }

    /* compiled from: DialogFragment.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class e extends androidx.fragment.app.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f3345a;

        e(androidx.fragment.app.e eVar) {
            this.f3345a = eVar;
        }

        @Override // androidx.fragment.app.e
        public View c(int i10) {
            if (this.f3345a.d()) {
                return this.f3345a.c(i10);
            }
            return c.this.e2(i10);
        }

        @Override // androidx.fragment.app.e
        public boolean d() {
            return this.f3345a.d() || c.this.f2();
        }
    }

    private void a2(boolean z10, boolean z11) {
        if (this.f3338x0) {
            return;
        }
        this.f3338x0 = true;
        this.f3339y0 = false;
        Dialog dialog = this.f3336m0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f3336m0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f3325b0.getLooper()) {
                    onDismiss(this.f3336m0);
                } else {
                    this.f3325b0.post(this.f3326c0);
                }
            }
        }
        this.f3337n0 = true;
        if (this.f3333j0 >= 0) {
            E().V0(this.f3333j0, 1);
            this.f3333j0 = -1;
            return;
        }
        q m7 = E().m();
        m7.l(this);
        if (z10) {
            m7.g();
        } else {
            m7.f();
        }
    }

    private void g2(Bundle bundle) {
        if (this.f3332i0 && !this.f3340z0) {
            try {
                this.f3334k0 = true;
                Dialog d22 = d2(bundle);
                this.f3336m0 = d22;
                if (this.f3332i0) {
                    j2(d22, this.f3329f0);
                    Context p10 = p();
                    if (p10 instanceof Activity) {
                        this.f3336m0.setOwnerActivity((Activity) p10);
                    }
                    this.f3336m0.setCancelable(this.f3331h0);
                    this.f3336m0.setOnCancelListener(this.f3327d0);
                    this.f3336m0.setOnDismissListener(this.f3328e0);
                    this.f3340z0 = true;
                } else {
                    this.f3336m0 = null;
                }
            } finally {
                this.f3334k0 = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void C0() {
        super.C0();
        Dialog dialog = this.f3336m0;
        if (dialog != null) {
            this.f3337n0 = true;
            dialog.setOnDismissListener(null);
            this.f3336m0.dismiss();
            if (!this.f3338x0) {
                onDismiss(this.f3336m0);
            }
            this.f3336m0 = null;
            this.f3340z0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void D0() {
        super.D0();
        if (!this.f3339y0 && !this.f3338x0) {
            this.f3338x0 = true;
        }
        X().i(this.f3335l0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater E0(Bundle bundle) {
        LayoutInflater E0 = super.E0(bundle);
        if (this.f3332i0 && !this.f3334k0) {
            g2(bundle);
            if (FragmentManager.F0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f3336m0;
            return dialog != null ? E0.cloneInContext(dialog.getContext()) : E0;
        }
        if (FragmentManager.F0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f3332i0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            } else {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            }
        }
        return E0;
    }

    @Override // androidx.fragment.app.Fragment
    public void R0(Bundle bundle) {
        super.R0(bundle);
        Dialog dialog = this.f3336m0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f3329f0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f3330g0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f3331h0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f3332i0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f3333j0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void S0() {
        super.S0();
        Dialog dialog = this.f3336m0;
        if (dialog != null) {
            this.f3337n0 = false;
            dialog.show();
            View decorView = this.f3336m0.getWindow().getDecorView();
            q0.a(decorView, this);
            r0.a(decorView, this);
            u0.e.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void T0() {
        super.T0();
        Dialog dialog = this.f3336m0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void V0(Bundle bundle) {
        Bundle bundle2;
        super.V0(bundle);
        if (this.f3336m0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f3336m0.onRestoreInstanceState(bundle2);
    }

    public void Z1() {
        a2(false, false);
    }

    public Dialog b2() {
        return this.f3336m0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public void c1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.c1(layoutInflater, viewGroup, bundle);
        if (this.H != null || this.f3336m0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f3336m0.onRestoreInstanceState(bundle2);
    }

    public int c2() {
        return this.f3330g0;
    }

    public Dialog d2(Bundle bundle) {
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(w1(), c2());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public androidx.fragment.app.e e() {
        return new e(super.e());
    }

    View e2(int i10) {
        Dialog dialog = this.f3336m0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    boolean f2() {
        return this.f3340z0;
    }

    public final Dialog h2() {
        Dialog b22 = b2();
        if (b22 != null) {
            return b22;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void i2(boolean z10) {
        this.f3332i0 = z10;
    }

    public void j2(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void k2(FragmentManager fragmentManager, String str) {
        this.f3338x0 = false;
        this.f3339y0 = true;
        q m7 = fragmentManager.m();
        m7.d(this, str);
        m7.f();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f3337n0) {
            return;
        }
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        a2(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void s0(Context context) {
        super.s0(context);
        X().e(this.f3335l0);
        if (this.f3339y0) {
            return;
        }
        this.f3338x0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void v0(Bundle bundle) {
        super.v0(bundle);
        this.f3325b0 = new Handler();
        this.f3332i0 = this.f3165x == 0;
        if (bundle != null) {
            this.f3329f0 = bundle.getInt("android:style", 0);
            this.f3330g0 = bundle.getInt("android:theme", 0);
            this.f3331h0 = bundle.getBoolean("android:cancelable", true);
            this.f3332i0 = bundle.getBoolean("android:showsDialog", this.f3332i0);
            this.f3333j0 = bundle.getInt("android:backStackId", -1);
        }
    }
}
