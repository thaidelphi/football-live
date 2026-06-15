package a2;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f202a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final b f203b = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskCacheWriteLocker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Lock f204a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        int f205b;

        a() {
        }
    }

    /* compiled from: DiskCacheWriteLocker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<a> f206a = new ArrayDeque();

        b() {
        }

        a a() {
            a poll;
            synchronized (this.f206a) {
                poll = this.f206a.poll();
            }
            return poll == null ? new a() : poll;
        }

        void b(a aVar) {
            synchronized (this.f206a) {
                if (this.f206a.size() < 10) {
                    this.f206a.offer(aVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.f202a.get(str);
            if (aVar == null) {
                aVar = this.f203b.a();
                this.f202a.put(str, aVar);
            }
            aVar.f205b++;
        }
        aVar.f204a.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) s2.j.d(this.f202a.get(str));
            int i10 = aVar.f205b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                aVar.f205b = i11;
                if (i11 == 0) {
                    a remove = this.f202a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f203b.b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f205b);
            }
        }
        aVar.f204a.unlock();
    }
}
