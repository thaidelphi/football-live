package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import e1.i;
import h1.c;
import h1.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements c, e1.b {

    /* renamed from: k  reason: collision with root package name */
    static final String f4747k = p.f("SystemFgDispatcher");

    /* renamed from: a  reason: collision with root package name */
    private Context f4748a;

    /* renamed from: b  reason: collision with root package name */
    private i f4749b;

    /* renamed from: c  reason: collision with root package name */
    private final n1.a f4750c;

    /* renamed from: d  reason: collision with root package name */
    final Object f4751d = new Object();

    /* renamed from: e  reason: collision with root package name */
    String f4752e;

    /* renamed from: f  reason: collision with root package name */
    final Map<String, androidx.work.i> f4753f;

    /* renamed from: g  reason: collision with root package name */
    final Map<String, l1.p> f4754g;

    /* renamed from: h  reason: collision with root package name */
    final Set<l1.p> f4755h;

    /* renamed from: i  reason: collision with root package name */
    final d f4756i;

    /* renamed from: j  reason: collision with root package name */
    private b f4757j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class RunnableC0085a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WorkDatabase f4758a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f4759b;

        RunnableC0085a(WorkDatabase workDatabase, String str) {
            this.f4758a = workDatabase;
            this.f4759b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            l1.p g10 = this.f4758a.l().g(this.f4759b);
            if (g10 == null || !g10.b()) {
                return;
            }
            synchronized (a.this.f4751d) {
                a.this.f4754g.put(this.f4759b, g10);
                a.this.f4755h.add(g10);
                a aVar = a.this;
                aVar.f4756i.d(aVar.f4755h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemForegroundDispatcher.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(int i10, Notification notification);

        void c(int i10, int i11, Notification notification);

        void d(int i10);

        void stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f4748a = context;
        i s10 = i.s(context);
        this.f4749b = s10;
        n1.a x10 = s10.x();
        this.f4750c = x10;
        this.f4752e = null;
        this.f4753f = new LinkedHashMap();
        this.f4755h = new HashSet();
        this.f4754g = new HashMap();
        this.f4756i = new d(this.f4748a, x10, this);
        this.f4749b.u().c(this);
    }

    public static Intent a(Context context, String str, androidx.work.i iVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.a());
        intent.putExtra("KEY_NOTIFICATION", iVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, androidx.work.i iVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.a());
        intent.putExtra("KEY_NOTIFICATION", iVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        p.c().d(f4747k, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f4749b.m(UUID.fromString(stringExtra));
    }

    private void h(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        p.c().a(f4747k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f4757j == null) {
            return;
        }
        this.f4753f.put(stringExtra, new androidx.work.i(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f4752e)) {
            this.f4752e = stringExtra;
            this.f4757j.c(intExtra, intExtra2, notification);
            return;
        }
        this.f4757j.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<String, androidx.work.i> entry : this.f4753f.entrySet()) {
            i10 |= entry.getValue().a();
        }
        androidx.work.i iVar = this.f4753f.get(this.f4752e);
        if (iVar != null) {
            this.f4757j.c(iVar.c(), i10, iVar.b());
        }
    }

    private void i(Intent intent) {
        p.c().d(f4747k, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f4750c.b(new RunnableC0085a(this.f4749b.w(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // h1.c
    public void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            p.c().a(f4747k, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f4749b.E(str);
        }
    }

    @Override // e1.b
    public void e(String str, boolean z10) {
        Map.Entry<String, androidx.work.i> entry;
        synchronized (this.f4751d) {
            l1.p remove = this.f4754g.remove(str);
            if (remove != null ? this.f4755h.remove(remove) : false) {
                this.f4756i.d(this.f4755h);
            }
        }
        androidx.work.i remove2 = this.f4753f.remove(str);
        if (str.equals(this.f4752e) && this.f4753f.size() > 0) {
            Iterator<Map.Entry<String, androidx.work.i>> it = this.f4753f.entrySet().iterator();
            Map.Entry<String, androidx.work.i> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f4752e = entry.getKey();
            if (this.f4757j != null) {
                androidx.work.i value = entry.getValue();
                this.f4757j.c(value.c(), value.a(), value.b());
                this.f4757j.d(value.c());
            }
        }
        b bVar = this.f4757j;
        if (remove2 == null || bVar == null) {
            return;
        }
        p.c().a(f4747k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())), new Throwable[0]);
        bVar.d(remove2.c());
    }

    @Override // h1.c
    public void f(List<String> list) {
    }

    void j(Intent intent) {
        p.c().d(f4747k, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f4757j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        this.f4757j = null;
        synchronized (this.f4751d) {
            this.f4756i.e();
        }
        this.f4749b.u().i(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(b bVar) {
        if (this.f4757j != null) {
            p.c().b(f4747k, "A callback already exists.", new Throwable[0]);
        } else {
            this.f4757j = bVar;
        }
    }
}
