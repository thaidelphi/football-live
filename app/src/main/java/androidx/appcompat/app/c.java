package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
/* compiled from: AlertDialog.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends g {

    /* renamed from: c  reason: collision with root package name */
    final AlertController f879c;

    /* compiled from: AlertDialog.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f880a;

        /* renamed from: b  reason: collision with root package name */
        private final int f881b;

        public a(Context context) {
            this(context, c.f(context, 0));
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f880a;
            fVar.f859w = listAdapter;
            fVar.f860x = onClickListener;
            return this;
        }

        public a b(View view) {
            this.f880a.f843g = view;
            return this;
        }

        public a c(Drawable drawable) {
            this.f880a.f840d = drawable;
            return this;
        }

        public c create() {
            c cVar = new c(this.f880a.f837a, this.f881b);
            this.f880a.a(cVar.f879c);
            cVar.setCancelable(this.f880a.f854r);
            if (this.f880a.f854r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f880a.f855s);
            cVar.setOnDismissListener(this.f880a.f856t);
            DialogInterface.OnKeyListener onKeyListener = this.f880a.f857u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public a d(DialogInterface.OnKeyListener onKeyListener) {
            this.f880a.f857u = onKeyListener;
            return this;
        }

        public a e(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f880a;
            fVar.f859w = listAdapter;
            fVar.f860x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public Context getContext() {
            return this.f880a.f837a;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f880a;
            fVar.f848l = fVar.f837a.getText(i10);
            this.f880a.f850n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f880a;
            fVar.f845i = fVar.f837a.getText(i10);
            this.f880a.f847k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f880a.f842f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.f fVar = this.f880a;
            fVar.f862z = view;
            fVar.f861y = 0;
            fVar.E = false;
            return this;
        }

        public a(Context context, int i10) {
            this.f880a = new AlertController.f(new ContextThemeWrapper(context, c.f(context, i10)));
            this.f881b = i10;
        }
    }

    protected c(Context context, int i10) {
        super(context, f(context, i10));
        this.f879c = new AlertController(getContext(), this, getWindow());
    }

    static int f(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.f24554o, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f879c.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f879c.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f879c.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f879c.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.g, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f879c.q(charSequence);
    }
}
