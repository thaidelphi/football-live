package e0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
/* compiled from: EmojiTransformationMethod.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class h implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    private final TransformationMethod f24836a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(TransformationMethod transformationMethod) {
        this.f24836a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f24836a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f24836a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.d.b().d() != 1) ? charSequence : androidx.emoji2.text.d.b().o(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f24836a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
