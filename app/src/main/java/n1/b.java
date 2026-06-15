package n1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import m1.g;
/* compiled from: WorkManagerTaskExecutor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements n1.a {

    /* renamed from: a  reason: collision with root package name */
    private final g f27838a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f27839b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final Executor f27840c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f27838a = new g(executor);
    }

    @Override // n1.a
    public Executor a() {
        return this.f27840c;
    }

    @Override // n1.a
    public void b(Runnable runnable) {
        this.f27838a.execute(runnable);
    }

    @Override // n1.a
    public g c() {
        return this.f27838a;
    }

    public void d(Runnable runnable) {
        this.f27839b.post(runnable);
    }
}
