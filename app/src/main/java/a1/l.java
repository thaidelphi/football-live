package a1;

import android.view.ViewGroup;
/* compiled from: Scene.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f131a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f132b;

    public static l b(ViewGroup viewGroup) {
        return (l) viewGroup.getTag(j.f111c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(ViewGroup viewGroup, l lVar) {
        viewGroup.setTag(j.f111c, lVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f131a) != this || (runnable = this.f132b) == null) {
            return;
        }
        runnable.run();
    }
}
