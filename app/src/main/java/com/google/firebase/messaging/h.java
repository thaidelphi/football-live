package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.b1;
import java.util.concurrent.ExecutorService;
/* compiled from: EnhancedIntentService.java */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class h extends Service {

    /* renamed from: b  reason: collision with root package name */
    private Binder f14993b;

    /* renamed from: d  reason: collision with root package name */
    private int f14995d;

    /* renamed from: a  reason: collision with root package name */
    final ExecutorService f14992a = m.d();

    /* renamed from: c  reason: collision with root package name */
    private final Object f14994c = new Object();

    /* renamed from: e  reason: collision with root package name */
    private int f14996e = 0;

    /* compiled from: EnhancedIntentService.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements b1.a {
        a() {
        }

        @Override // com.google.firebase.messaging.b1.a
        @KeepForSdk
        public Task<Void> a(Intent intent) {
            return h.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            z0.c(intent);
        }
        synchronized (this.f14994c) {
            int i10 = this.f14996e - 1;
            this.f14996e = i10;
            if (i10 == 0) {
                k(this.f14995d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, Task task) {
        d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            f(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> j(final Intent intent) {
        if (g(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f14992a.execute(new Runnable() { // from class: com.google.firebase.messaging.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.i(intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    protected Intent e(Intent intent) {
        return intent;
    }

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean k(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f14993b == null) {
            this.f14993b = new b1(new a());
        }
        return this.f14993b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f14992a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.f14994c) {
            this.f14995d = i11;
            this.f14996e++;
        }
        Intent e8 = e(intent);
        if (e8 == null) {
            d(intent);
            return 2;
        }
        Task<Void> j10 = j(e8);
        if (j10.isComplete()) {
            d(intent);
            return 2;
        }
        j10.addOnCompleteListener(androidx.privacysandbox.ads.adservices.topics.i.f3728a, new OnCompleteListener() { // from class: com.google.firebase.messaging.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                h.this.h(intent, task);
            }
        });
        return 3;
    }
}
