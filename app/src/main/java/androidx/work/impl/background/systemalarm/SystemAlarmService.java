package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.t;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.p;
import m1.k;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SystemAlarmService extends t implements e.c {

    /* renamed from: d  reason: collision with root package name */
    private static final String f4687d = p.f("SystemAlarmService");

    /* renamed from: b  reason: collision with root package name */
    private e f4688b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4689c;

    private void e() {
        e eVar = new e(this);
        this.f4688b = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void b() {
        this.f4689c = true;
        p.c().a(f4687d, "All commands completed in dispatcher", new Throwable[0]);
        k.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f4689c = false;
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4689c = true;
        this.f4688b.j();
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4689c) {
            p.c().d(f4687d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f4688b.j();
            e();
            this.f4689c = false;
        }
        if (intent != null) {
            this.f4688b.a(intent, i11);
            return 3;
        }
        return 3;
    }
}
