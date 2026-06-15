package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f;
import i.b;
/* compiled from: AppCompatDialog.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends Dialog implements d {

    /* renamed from: a  reason: collision with root package name */
    private e f958a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f959b;

    /* compiled from: AppCompatDialog.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements f.a {
        a() {
        }

        @Override // androidx.core.view.f.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.c(keyEvent);
        }
    }

    public g(Context context, int i10) {
        super(context, b(context, i10));
        this.f959b = new a();
        e a10 = a();
        a10.F(b(context, i10));
        a10.r(null);
    }

    private static int b(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(e.a.f24565z, typedValue, true);
            return typedValue.resourceId;
        }
        return i10;
    }

    public e a() {
        if (this.f958a == null) {
            this.f958a = e.h(this, this);
        }
        return this.f958a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i10) {
        return a().A(i10);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.f.e(this.f959b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) a().i(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().o();
        super.onCreate(bundle);
        a().r(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().x();
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeFinished(i.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeStarted(i.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public i.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        a().B(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().G(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().C(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().D(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        a().G(getContext().getString(i10));
    }
}
