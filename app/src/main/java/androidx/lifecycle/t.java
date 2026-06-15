package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/* compiled from: LifecycleService.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t extends Service implements p {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f3680a = new j0(this);

    @Override // androidx.lifecycle.p
    public i getLifecycle() {
        return this.f3680a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        kotlin.jvm.internal.n.f(intent, "intent");
        this.f3680a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f3680a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f3680a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f3680a.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
