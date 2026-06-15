package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.p;
import e1.i;
import java.util.ArrayList;
import java.util.List;
import m1.g;
import m1.k;
import m1.o;
/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e implements e1.b {

    /* renamed from: k  reason: collision with root package name */
    static final String f4710k = p.f("SystemAlarmDispatcher");

    /* renamed from: a  reason: collision with root package name */
    final Context f4711a;

    /* renamed from: b  reason: collision with root package name */
    private final n1.a f4712b;

    /* renamed from: c  reason: collision with root package name */
    private final o f4713c;

    /* renamed from: d  reason: collision with root package name */
    private final e1.d f4714d;

    /* renamed from: e  reason: collision with root package name */
    private final i f4715e;

    /* renamed from: f  reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f4716f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f4717g;

    /* renamed from: h  reason: collision with root package name */
    final List<Intent> f4718h;

    /* renamed from: i  reason: collision with root package name */
    Intent f4719i;

    /* renamed from: j  reason: collision with root package name */
    private c f4720j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f4718h) {
                e eVar2 = e.this;
                eVar2.f4719i = eVar2.f4718h.get(0);
            }
            Intent intent = e.this.f4719i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f4719i.getIntExtra("KEY_START_ID", 0);
                p c10 = p.c();
                String str = e.f4710k;
                c10.a(str, String.format("Processing command %s, %s", e.this.f4719i, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b10 = k.b(e.this.f4711a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    p.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b10), new Throwable[0]);
                    b10.acquire();
                    e eVar3 = e.this;
                    eVar3.f4716f.p(eVar3.f4719i, intExtra, eVar3);
                    p.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                    b10.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        p c11 = p.c();
                        String str2 = e.f4710k;
                        c11.b(str2, "Unexpected error in onHandleIntent", th);
                        p.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                        b10.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        p.c().a(e.f4710k, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                        b10.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final e f4722a;

        /* renamed from: b  reason: collision with root package name */
        private final Intent f4723b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4724c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(e eVar, Intent intent, int i10) {
            this.f4722a = eVar;
            this.f4723b = intent;
            this.f4724c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4722a.a(this.f4723b, this.f4724c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        void b();
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final e f4725a;

        d(e eVar) {
            this.f4725a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4725a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (this.f4717g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f4718h) {
            for (Intent intent : this.f4718h) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock b10 = k.b(this.f4711a, "ProcessCommand");
        try {
            b10.acquire();
            this.f4715e.x().b(new a());
        } finally {
            b10.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        p c10 = p.c();
        String str = f4710k;
        c10.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            p.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.f4718h) {
                boolean z10 = this.f4718h.isEmpty() ? false : true;
                this.f4718h.add(intent);
                if (!z10) {
                    l();
                }
            }
            return true;
        }
    }

    void c() {
        p c10 = p.c();
        String str = f4710k;
        c10.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f4718h) {
            if (this.f4719i != null) {
                p.c().a(str, String.format("Removing command %s", this.f4719i), new Throwable[0]);
                if (this.f4718h.remove(0).equals(this.f4719i)) {
                    this.f4719i = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            g c11 = this.f4712b.c();
            if (!this.f4716f.o() && this.f4718h.isEmpty() && !c11.a()) {
                p.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f4720j;
                if (cVar != null) {
                    cVar.b();
                }
            } else if (!this.f4718h.isEmpty()) {
                l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1.d d() {
        return this.f4714d;
    }

    @Override // e1.b
    public void e(String str, boolean z10) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f4711a, str, z10), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1.a f() {
        return this.f4712b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i g() {
        return this.f4715e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o h() {
        return this.f4713c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        p.c().a(f4710k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f4714d.i(this);
        this.f4713c.a();
        this.f4720j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Runnable runnable) {
        this.f4717g.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(c cVar) {
        if (this.f4720j != null) {
            p.c().b(f4710k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f4720j = cVar;
        }
    }

    e(Context context, e1.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4711a = applicationContext;
        this.f4716f = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f4713c = new o();
        iVar = iVar == null ? i.s(context) : iVar;
        this.f4715e = iVar;
        dVar = dVar == null ? iVar.u() : dVar;
        this.f4714d = dVar;
        this.f4712b = iVar.x();
        dVar.c(this);
        this.f4718h = new ArrayList();
        this.f4719i = null;
        this.f4717g = new Handler(Looper.getMainLooper());
    }
}
