package b2;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: GlideExecutor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a implements ExecutorService {

    /* renamed from: b  reason: collision with root package name */
    private static final long f4978b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c  reason: collision with root package name */
    private static volatile int f4979c;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f4980a;

    /* compiled from: GlideExecutor.java */
    /* renamed from: b2.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0097a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f4981a;

        /* renamed from: b  reason: collision with root package name */
        private int f4982b;

        /* renamed from: c  reason: collision with root package name */
        private int f4983c;

        /* renamed from: d  reason: collision with root package name */
        private c f4984d = c.f4995d;

        /* renamed from: e  reason: collision with root package name */
        private String f4985e;

        /* renamed from: f  reason: collision with root package name */
        private long f4986f;

        C0097a(boolean z10) {
            this.f4981a = z10;
        }

        public a a() {
            if (!TextUtils.isEmpty(this.f4985e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f4982b, this.f4983c, this.f4986f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f4985e, this.f4984d, this.f4981a));
                if (this.f4986f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f4985e);
        }

        public C0097a b(String str) {
            this.f4985e = str;
            return this;
        }

        public C0097a c(int i10) {
            this.f4982b = i10;
            this.f4983c = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GlideExecutor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final String f4987a;

        /* renamed from: b  reason: collision with root package name */
        final c f4988b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f4989c;

        /* renamed from: d  reason: collision with root package name */
        private int f4990d;

        /* compiled from: GlideExecutor.java */
        /* renamed from: b2.a$b$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0098a extends Thread {
            C0098a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (b.this.f4989c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    b.this.f4988b.a(th);
                }
            }
        }

        b(String str, c cVar, boolean z10) {
            this.f4987a = str;
            this.f4988b = cVar;
            this.f4989c = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C0098a c0098a;
            c0098a = new C0098a(runnable, "glide-" + this.f4987a + "-thread-" + this.f4990d);
            this.f4990d = this.f4990d + 1;
            return c0098a;
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f4992a = new C0099a();

        /* renamed from: b  reason: collision with root package name */
        public static final c f4993b;

        /* renamed from: c  reason: collision with root package name */
        public static final c f4994c;

        /* renamed from: d  reason: collision with root package name */
        public static final c f4995d;

        /* compiled from: GlideExecutor.java */
        /* renamed from: b2.a$c$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0099a implements c {
            C0099a() {
            }

            @Override // b2.a.c
            public void a(Throwable th) {
            }
        }

        /* compiled from: GlideExecutor.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class b implements c {
            b() {
            }

            @Override // b2.a.c
            public void a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* compiled from: GlideExecutor.java */
        /* renamed from: b2.a$c$c  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0100c implements c {
            C0100c() {
            }

            @Override // b2.a.c
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f4993b = bVar;
            f4994c = new C0100c();
            f4995d = bVar;
        }

        void a(Throwable th);
    }

    a(ExecutorService executorService) {
        this.f4980a = executorService;
    }

    public static int a() {
        if (f4979c == 0) {
            f4979c = Math.min(4, b2.b.a());
        }
        return f4979c;
    }

    public static C0097a b() {
        return new C0097a(true).c(a() >= 4 ? 2 : 1).b("animation");
    }

    public static a c() {
        return b().a();
    }

    public static C0097a d() {
        return new C0097a(true).c(1).b("disk-cache");
    }

    public static a e() {
        return d().a();
    }

    public static C0097a g() {
        return new C0097a(false).c(a()).b("source");
    }

    public static a h() {
        return g().a();
    }

    public static a i() {
        return new a(new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, f4978b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b("source-unlimited", c.f4995d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f4980a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f4980a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f4980a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f4980a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f4980a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f4980a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f4980a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f4980a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f4980a.submit(runnable);
    }

    public String toString() {
        return this.f4980a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f4980a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f4980a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f4980a.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f4980a.submit(callable);
    }
}
