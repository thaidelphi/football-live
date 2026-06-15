package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.t;
import androidx.work.impl.foreground.a;
import androidx.work.p;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SystemForegroundService extends t implements a.b {

    /* renamed from: f  reason: collision with root package name */
    private static final String f4732f = p.f("SystemFgService");

    /* renamed from: g  reason: collision with root package name */
    private static SystemForegroundService f4733g = null;

    /* renamed from: b  reason: collision with root package name */
    private Handler f4734b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4735c;

    /* renamed from: d  reason: collision with root package name */
    androidx.work.impl.foreground.a f4736d;

    /* renamed from: e  reason: collision with root package name */
    NotificationManager f4737e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f4738a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f4739b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f4740c;

        a(int i10, Notification notification, int i11) {
            this.f4738a = i10;
            this.f4739b = notification;
            this.f4740c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f4738a, this.f4739b, this.f4740c);
            } else {
                SystemForegroundService.this.startForeground(this.f4738a, this.f4739b);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f4742a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f4743b;

        b(int i10, Notification notification) {
            this.f4742a = i10;
            this.f4743b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f4737e.notify(this.f4742a, this.f4743b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f4745a;

        c(int i10) {
            this.f4745a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f4737e.cancel(this.f4745a);
        }
    }

    private void e() {
        this.f4734b = new Handler(Looper.getMainLooper());
        this.f4737e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f4736d = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i10, Notification notification) {
        this.f4734b.post(new b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i10, int i11, Notification notification) {
        this.f4734b.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10) {
        this.f4734b.post(new c(i10));
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public void onCreate() {
        super.onCreate();
        f4733g = this;
        e();
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4736d.k();
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4735c) {
            p.c().d(f4732f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f4736d.k();
            e();
            this.f4735c = false;
        }
        if (intent != null) {
            this.f4736d.l(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f4735c = true;
        p.c().a(f4732f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f4733g = null;
        stopSelf();
    }
}
