package a1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* compiled from: ViewGroupOverlayApi18.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class v implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f188a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(ViewGroup viewGroup) {
        this.f188a = viewGroup.getOverlay();
    }

    @Override // a1.b0
    public void a(Drawable drawable) {
        this.f188a.add(drawable);
    }

    @Override // a1.b0
    public void b(Drawable drawable) {
        this.f188a.remove(drawable);
    }

    @Override // a1.w
    public void c(View view) {
        this.f188a.add(view);
    }

    @Override // a1.w
    public void d(View view) {
        this.f188a.remove(view);
    }
}
