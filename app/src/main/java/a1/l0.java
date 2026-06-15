package a1;

import android.view.View;
import android.view.WindowId;
/* compiled from: WindowIdApi18.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class l0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f133a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(View view) {
        this.f133a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof l0) && ((l0) obj).f133a.equals(this.f133a);
    }

    public int hashCode() {
        return this.f133a.hashCode();
    }
}
