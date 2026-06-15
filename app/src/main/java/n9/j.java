package n9;

import com.google.android.gms.common.api.Api;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q9.g;
/* compiled from: ConnectionPool.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class j {

    /* renamed from: g  reason: collision with root package name */
    private static final Executor f28861g = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), o9.c.G("OkHttp ConnectionPool", true));

    /* renamed from: a  reason: collision with root package name */
    private final int f28862a;

    /* renamed from: b  reason: collision with root package name */
    private final long f28863b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f28864c;

    /* renamed from: d  reason: collision with root package name */
    private final Deque<q9.c> f28865d;

    /* renamed from: e  reason: collision with root package name */
    final q9.d f28866e;

    /* renamed from: f  reason: collision with root package name */
    boolean f28867f;

    /* compiled from: ConnectionPool.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long a10 = j.this.a(System.nanoTime());
                if (a10 == -1) {
                    return;
                }
                if (a10 > 0) {
                    long j10 = a10 / 1000000;
                    long j11 = a10 - (1000000 * j10);
                    synchronized (j.this) {
                        try {
                            j.this.wait(j10, (int) j11);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public j() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    private int e(q9.c cVar, long j10) {
        List<Reference<q9.g>> list = cVar.f30163n;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference<q9.g> reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                v9.g.l().u("A connection to " + cVar.p().a().l() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f30192a);
                list.remove(i10);
                cVar.f30160k = true;
                if (list.isEmpty()) {
                    cVar.f30164o = j10 - this.f28863b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    long a(long j10) {
        synchronized (this) {
            q9.c cVar = null;
            long j11 = Long.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            for (q9.c cVar2 : this.f28865d) {
                if (e(cVar2, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j12 = j10 - cVar2.f30164o;
                    if (j12 > j11) {
                        cVar = cVar2;
                        j11 = j12;
                    }
                }
            }
            long j13 = this.f28863b;
            if (j11 < j13 && i10 <= this.f28862a) {
                if (i10 > 0) {
                    return j13 - j11;
                } else if (i11 > 0) {
                    return j13;
                } else {
                    this.f28867f = false;
                    return -1L;
                }
            }
            this.f28865d.remove(cVar);
            o9.c.h(cVar.q());
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(q9.c cVar) {
        if (!cVar.f30160k && this.f28862a != 0) {
            notifyAll();
            return false;
        }
        this.f28865d.remove(cVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Socket c(n9.a aVar, q9.g gVar) {
        for (q9.c cVar : this.f28865d) {
            if (cVar.l(aVar, null) && cVar.n() && cVar != gVar.d()) {
                return gVar.m(cVar);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q9.c d(n9.a aVar, q9.g gVar, c0 c0Var) {
        for (q9.c cVar : this.f28865d) {
            if (cVar.l(aVar, c0Var)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(q9.c cVar) {
        if (!this.f28867f) {
            this.f28867f = true;
            f28861g.execute(this.f28864c);
        }
        this.f28865d.add(cVar);
    }

    public j(int i10, long j10, TimeUnit timeUnit) {
        this.f28864c = new a();
        this.f28865d = new ArrayDeque();
        this.f28866e = new q9.d();
        this.f28862a = i10;
        this.f28863b = timeUnit.toNanos(j10);
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j10);
    }
}
