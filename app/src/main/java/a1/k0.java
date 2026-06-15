package a1;

import android.os.IBinder;
/* compiled from: WindowIdApi14.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class k0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f130a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(IBinder iBinder) {
        this.f130a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f130a.equals(this.f130a);
    }

    public int hashCode() {
        return this.f130a.hashCode();
    }
}
