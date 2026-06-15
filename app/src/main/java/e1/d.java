package e1;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import e1.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import m1.k;
/* compiled from: Processor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d implements b, k1.a {

    /* renamed from: l  reason: collision with root package name */
    private static final String f24840l = p.f("Processor");

    /* renamed from: b  reason: collision with root package name */
    private Context f24842b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.work.b f24843c;

    /* renamed from: d  reason: collision with root package name */
    private n1.a f24844d;

    /* renamed from: e  reason: collision with root package name */
    private WorkDatabase f24845e;

    /* renamed from: h  reason: collision with root package name */
    private List<e> f24848h;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, j> f24847g = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private Map<String, j> f24846f = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Set<String> f24849i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    private final List<b> f24850j = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    private PowerManager.WakeLock f24841a = null;

    /* renamed from: k  reason: collision with root package name */
    private final Object f24851k = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Processor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private b f24852a;

        /* renamed from: b  reason: collision with root package name */
        private String f24853b;

        /* renamed from: c  reason: collision with root package name */
        private b6.a<Boolean> f24854c;

        a(b bVar, String str, b6.a<Boolean> aVar) {
            this.f24852a = bVar;
            this.f24853b = str;
            this.f24854c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                z10 = this.f24854c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f24852a.e(this.f24853b, z10);
        }
    }

    public d(Context context, androidx.work.b bVar, n1.a aVar, WorkDatabase workDatabase, List<e> list) {
        this.f24842b = context;
        this.f24843c = bVar;
        this.f24844d = aVar;
        this.f24845e = workDatabase;
        this.f24848h = list;
    }

    private static boolean d(String str, j jVar) {
        if (jVar != null) {
            jVar.d();
            p.c().a(f24840l, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        p.c().a(f24840l, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    private void m() {
        synchronized (this.f24851k) {
            if (!(!this.f24846f.isEmpty())) {
                this.f24842b.startService(androidx.work.impl.foreground.a.d(this.f24842b));
                PowerManager.WakeLock wakeLock = this.f24841a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f24841a = null;
                }
            }
        }
    }

    @Override // k1.a
    public void a(String str) {
        synchronized (this.f24851k) {
            this.f24846f.remove(str);
            m();
        }
    }

    @Override // k1.a
    public void b(String str, androidx.work.i iVar) {
        synchronized (this.f24851k) {
            p.c().d(f24840l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            j remove = this.f24847g.remove(str);
            if (remove != null) {
                if (this.f24841a == null) {
                    PowerManager.WakeLock b10 = k.b(this.f24842b, "ProcessorForegroundLck");
                    this.f24841a = b10;
                    b10.acquire();
                }
                this.f24846f.put(str, remove);
                androidx.core.content.a.k(this.f24842b, androidx.work.impl.foreground.a.c(this.f24842b, str, iVar));
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.f24851k) {
            this.f24850j.add(bVar);
        }
    }

    @Override // e1.b
    public void e(String str, boolean z10) {
        synchronized (this.f24851k) {
            this.f24847g.remove(str);
            p.c().a(f24840l, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            for (b bVar : this.f24850j) {
                bVar.e(str, z10);
            }
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.f24851k) {
            contains = this.f24849i.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z10;
        synchronized (this.f24851k) {
            z10 = this.f24847g.containsKey(str) || this.f24846f.containsKey(str);
        }
        return z10;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.f24851k) {
            containsKey = this.f24846f.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.f24851k) {
            this.f24850j.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.f24851k) {
            if (g(str)) {
                p.c().a(f24840l, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            j a10 = new j.c(this.f24842b, this.f24843c, this.f24844d, this, this.f24845e, str).c(this.f24848h).b(aVar).a();
            b6.a<Boolean> b10 = a10.b();
            b10.addListener(new a(this, str, b10), this.f24844d.a());
            this.f24847g.put(str, a10);
            this.f24844d.c().execute(a10);
            p.c().a(f24840l, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean d10;
        synchronized (this.f24851k) {
            boolean z10 = true;
            p.c().a(f24840l, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f24849i.add(str);
            j remove = this.f24846f.remove(str);
            if (remove == null) {
                z10 = false;
            }
            if (remove == null) {
                remove = this.f24847g.remove(str);
            }
            d10 = d(str, remove);
            if (z10) {
                m();
            }
        }
        return d10;
    }

    public boolean n(String str) {
        boolean d10;
        synchronized (this.f24851k) {
            p.c().a(f24840l, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            d10 = d(str, this.f24846f.remove(str));
        }
        return d10;
    }

    public boolean o(String str) {
        boolean d10;
        synchronized (this.f24851k) {
            p.c().a(f24840l, String.format("Processor stopping background work %s", str), new Throwable[0]);
            d10 = d(str, this.f24847g.remove(str));
        }
        return d10;
    }
}
