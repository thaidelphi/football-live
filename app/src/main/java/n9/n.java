package n9;

import com.google.android.gms.common.api.Api;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n9.x;
/* compiled from: Dispatcher.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class n {

    /* renamed from: c  reason: collision with root package name */
    private Runnable f28899c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f28900d;

    /* renamed from: a  reason: collision with root package name */
    private int f28897a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f28898b = 5;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<x.b> f28901e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private final Deque<x.b> f28902f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    private final Deque<x> f28903g = new ArrayDeque();

    private <T> void d(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f28899c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (g() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private boolean g() {
        int i10;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<x.b> it = this.f28901e.iterator();
            while (it.hasNext()) {
                x.b next = it.next();
                if (this.f28902f.size() >= this.f28897a) {
                    break;
                } else if (i(next) < this.f28898b) {
                    it.remove();
                    arrayList.add(next);
                    this.f28902f.add(next);
                }
            }
            z10 = h() > 0;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((x.b) arrayList.get(i10)).l(c());
        }
        return z10;
    }

    private int i(x.b bVar) {
        int i10 = 0;
        for (x.b bVar2 : this.f28902f) {
            if (!bVar2.m().f29002f && bVar2.n().equals(bVar.n())) {
                i10++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(x.b bVar) {
        synchronized (this) {
            this.f28901e.add(bVar);
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b(x xVar) {
        this.f28903g.add(xVar);
    }

    public synchronized ExecutorService c() {
        if (this.f28900d == null) {
            this.f28900d = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), o9.c.G("OkHttp Dispatcher", false));
        }
        return this.f28900d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(x.b bVar) {
        d(this.f28902f, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(x xVar) {
        d(this.f28903g, xVar);
    }

    public synchronized int h() {
        return this.f28902f.size() + this.f28903g.size();
    }
}
