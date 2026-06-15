package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
/* compiled from: AppCompatEmojiEditTextHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class m {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f1656a;

    /* renamed from: b  reason: collision with root package name */
    private final e0.a f1657b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(EditText editText) {
        this.f1656a = editText;
        this.f1657b = new e0.a(editText, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f1657b.a(keyListener) : keyListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1656a.getContext().obtainStyledAttributes(attributeSet, e.j.f24709g0, i10, 0);
        try {
            int i11 = e.j.f24779u0;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1657b.b(inputConnection, editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z10) {
        this.f1657b.c(z10);
    }
}
