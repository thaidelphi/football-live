package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: RequestExecutor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class h {

    /* compiled from: RequestExecutor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f2729a;

        /* renamed from: b  reason: collision with root package name */
        private int f2730b;

        /* compiled from: RequestExecutor.java */
        /* renamed from: androidx.core.provider.h$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        private static class C0042a extends Thread {

            /* renamed from: a  reason: collision with root package name */
            private final int f2731a;

            C0042a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f2731a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f2731a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f2729a = str;
            this.f2730b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0042a(runnable, this.f2729a, this.f2730b);
        }
    }

    /* compiled from: RequestExecutor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class b<T> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Callable<T> f2732a;

        /* renamed from: b  reason: collision with root package name */
        private androidx.core.util.b<T> f2733b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f2734c;

        /* compiled from: RequestExecutor.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.core.util.b f2735a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f2736b;

            a(androidx.core.util.b bVar, Object obj) {
                this.f2735a = bVar;
                this.f2736b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f2735a.accept(this.f2736b);
            }
        }

        b(Handler handler, Callable<T> callable, androidx.core.util.b<T> bVar) {
            this.f2732a = callable;
            this.f2733b = bVar;
            this.f2734c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t10;
            try {
                t10 = this.f2732a.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f2734c.post(new a(this.f2733b, t10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void b(Executor executor, Callable<T> callable, androidx.core.util.b<T> bVar) {
        executor.execute(new b(androidx.core.provider.b.a(), callable, bVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw e8;
        } catch (ExecutionException e10) {
            throw new RuntimeException(e10);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
