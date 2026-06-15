package a1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* compiled from: ViewOverlayApi18.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class a0 implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f46a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(View view) {
        this.f46a = view.getOverlay();
    }

    @Override // a1.b0
    public void a(Drawable drawable) {
        this.f46a.add(drawable);
    }

    @Override // a1.b0
    public void b(Drawable drawable) {
        this.f46a.remove(drawable);
    }
}
