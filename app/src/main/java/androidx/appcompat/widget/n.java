package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
/* compiled from: AppCompatEmojiTextHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class n {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1691a;

    /* renamed from: b  reason: collision with root package name */
    private final e0.f f1692b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(TextView textView) {
        this.f1691a = textView;
        this.f1692b = new e0.f(textView, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1692b.a(inputFilterArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1691a.getContext().obtainStyledAttributes(attributeSet, e.j.f24709g0, i10, 0);
        try {
            int i11 = e.j.f24779u0;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z10) {
        this.f1692b.b(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z10) {
        this.f1692b.c(z10);
    }
}
