package z1;

import java.util.Queue;
import z1.m;
/* compiled from: BaseKeyPool.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
abstract class d<T extends m> {

    /* renamed from: a  reason: collision with root package name */
    private final Queue<T> f33424a = s2.k.e(20);

    abstract T a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public T b() {
        T poll = this.f33424a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t10) {
        if (this.f33424a.size() < 20) {
            this.f33424a.offer(t10);
        }
    }
}
