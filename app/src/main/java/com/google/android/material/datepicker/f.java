package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.a0;
import androidx.core.view.l0;
import androidx.core.view.u;
import androidx.fragment.app.q;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: MaterialDatePicker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f<S> extends androidx.fragment.app.c {
    static final Object W0 = "CONFIRM_BUTTON_TAG";
    static final Object X0 = "CANCEL_BUTTON_TAG";
    static final Object Y0 = "TOGGLE_BUTTON_TAG";
    private final LinkedHashSet<g<? super S>> A0 = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> B0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> C0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> D0 = new LinkedHashSet<>();
    private int E0;
    private DateSelector<S> F0;
    private l<S> G0;
    private CalendarConstraints H0;
    private com.google.android.material.datepicker.e<S> I0;
    private int J0;
    private CharSequence K0;
    private boolean L0;
    private int M0;
    private int N0;
    private CharSequence O0;
    private int P0;
    private CharSequence Q0;
    private TextView R0;
    private CheckableImageButton S0;
    private u5.g T0;
    private Button U0;
    private boolean V0;

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = f.this.A0.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(f.this.y2());
            }
            f.this.Z1();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = f.this.B0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            f.this.Z1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f14198a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f14199b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f14200c;

        c(int i10, View view, int i11) {
            this.f14198a = i10;
            this.f14199b = view;
            this.f14200c = i11;
        }

        @Override // androidx.core.view.u
        public l0 a(View view, l0 l0Var) {
            int i10 = l0Var.f(l0.m.c()).f2612b;
            if (this.f14198a >= 0) {
                this.f14199b.getLayoutParams().height = this.f14198a + i10;
                View view2 = this.f14199b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f14199b;
            view3.setPadding(view3.getPaddingLeft(), this.f14200c + i10, this.f14199b.getPaddingRight(), this.f14199b.getPaddingBottom());
            return l0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class d extends k<S> {
        d() {
        }

        @Override // com.google.android.material.datepicker.k
        public void a(S s10) {
            f.this.F2();
            f.this.U0.setEnabled(f.this.v2().K());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.U0.setEnabled(f.this.v2().K());
            f.this.S0.toggle();
            f fVar = f.this;
            fVar.G2(fVar.S0);
            f.this.E2();
        }
    }

    private void A2(Context context) {
        this.S0.setTag(Y0);
        this.S0.setImageDrawable(t2(context));
        this.S0.setChecked(this.M0 != 0);
        a0.q0(this.S0, null);
        G2(this.S0);
        this.S0.setOnClickListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean B2(Context context) {
        return D2(context, 16843277);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean C2(Context context) {
        return D2(context, d5.b.f23994x);
    }

    static boolean D2(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r5.b.d(context, d5.b.f23989s, com.google.android.material.datepicker.e.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E2() {
        l<S> lVar;
        int z22 = z2(w1());
        this.I0 = com.google.android.material.datepicker.e.o2(v2(), z22, this.H0);
        if (this.S0.isChecked()) {
            lVar = h.Y1(v2(), z22, this.H0);
        } else {
            lVar = this.I0;
        }
        this.G0 = lVar;
        F2();
        q m7 = o().m();
        m7.m(d5.f.f24058w, this.G0);
        m7.h();
        this.G0.W1(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F2() {
        String w22 = w2();
        this.R0.setContentDescription(String.format(R(d5.i.f24091i), w22));
        this.R0.setText(w22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G2(CheckableImageButton checkableImageButton) {
        String string;
        if (this.S0.isChecked()) {
            string = checkableImageButton.getContext().getString(d5.i.f24094l);
        } else {
            string = checkableImageButton.getContext().getString(d5.i.f24096n);
        }
        this.S0.setContentDescription(string);
    }

    private static Drawable t2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, f.a.b(context, d5.e.f24030b));
        stateListDrawable.addState(new int[0], f.a.b(context, d5.e.f24031c));
        return stateListDrawable;
    }

    private void u2(Window window) {
        if (this.V0) {
            return;
        }
        View findViewById = x1().findViewById(d5.f.f24041f);
        com.google.android.material.internal.d.a(window, true, com.google.android.material.internal.o.c(findViewById), null);
        a0.C0(findViewById, new c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.V0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector<S> v2() {
        if (this.F0 == null) {
            this.F0 = (DateSelector) n().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.F0;
    }

    private static int x2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(d5.d.A);
        int i10 = Month.d().f14141d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(d5.d.C) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(d5.d.F));
    }

    private int z2(Context context) {
        int i10 = this.E0;
        return i10 != 0 ? i10 : v2().f(context);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void R0(Bundle bundle) {
        super.R0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.E0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.F0);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.H0);
        if (this.I0.j2() != null) {
            bVar.b(this.I0.j2().f14143f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.J0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.K0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.N0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.O0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.P0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.Q0);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void S0() {
        super.S0();
        Window window = h2().getWindow();
        if (this.L0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.T0);
            u2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = K().getDimensionPixelOffset(d5.d.E);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.T0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new k5.a(h2(), rect));
        }
        E2();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void T0() {
        this.G0.X1();
        super.T0();
    }

    @Override // androidx.fragment.app.c
    public final Dialog d2(Bundle bundle) {
        Dialog dialog = new Dialog(w1(), z2(w1()));
        Context context = dialog.getContext();
        this.L0 = B2(context);
        int d10 = r5.b.d(context, d5.b.f23981k, f.class.getCanonicalName());
        u5.g gVar = new u5.g(context, null, d5.b.f23989s, d5.j.f24115q);
        this.T0 = gVar;
        gVar.N(context);
        this.T0.X(ColorStateList.valueOf(d10));
        this.T0.W(a0.y(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.C0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.D0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) W();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        if (bundle == null) {
            bundle = n();
        }
        this.E0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.F0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.H0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.J0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.K0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.M0 = bundle.getInt("INPUT_MODE_KEY");
        this.N0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.O0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.P0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.Q0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    public String w2() {
        return v2().k(p());
    }

    public final S y2() {
        return v2().P();
    }

    @Override // androidx.fragment.app.Fragment
    public final View z0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.L0 ? d5.h.f24082r : d5.h.f24081q, viewGroup);
        Context context = inflate.getContext();
        if (this.L0) {
            inflate.findViewById(d5.f.f24058w).setLayoutParams(new LinearLayout.LayoutParams(x2(context), -2));
        } else {
            inflate.findViewById(d5.f.f24059x).setLayoutParams(new LinearLayout.LayoutParams(x2(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(d5.f.C);
        this.R0 = textView;
        a0.s0(textView, 1);
        this.S0 = (CheckableImageButton) inflate.findViewById(d5.f.D);
        TextView textView2 = (TextView) inflate.findViewById(d5.f.E);
        CharSequence charSequence = this.K0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.J0);
        }
        A2(context);
        this.U0 = (Button) inflate.findViewById(d5.f.f24038c);
        if (v2().K()) {
            this.U0.setEnabled(true);
        } else {
            this.U0.setEnabled(false);
        }
        this.U0.setTag(W0);
        CharSequence charSequence2 = this.O0;
        if (charSequence2 != null) {
            this.U0.setText(charSequence2);
        } else {
            int i10 = this.N0;
            if (i10 != 0) {
                this.U0.setText(i10);
            }
        }
        this.U0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(d5.f.f24036a);
        button.setTag(X0);
        CharSequence charSequence3 = this.Q0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.P0;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }
}
