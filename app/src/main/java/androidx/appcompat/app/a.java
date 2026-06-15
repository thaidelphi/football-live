package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import i.b;
/* compiled from: ActionBar.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(boolean z10);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z10);

    public abstract void s(boolean z10);

    public abstract void t(boolean z10);

    public abstract void u(boolean z10);

    public abstract void v(CharSequence charSequence);

    public abstract void w(CharSequence charSequence);

    public abstract void x();

    public i.b y(b.a aVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0018a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f878a;

        public C0018a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f878a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f24773t);
            this.f878a = obtainStyledAttributes.getInt(e.j.f24778u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0018a(int i10, int i11) {
            super(i10, i11);
            this.f878a = 0;
            this.f878a = 8388627;
        }

        public C0018a(C0018a c0018a) {
            super((ViewGroup.MarginLayoutParams) c0018a);
            this.f878a = 0;
            this.f878a = c0018a.f878a;
        }

        public C0018a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f878a = 0;
        }
    }
}
