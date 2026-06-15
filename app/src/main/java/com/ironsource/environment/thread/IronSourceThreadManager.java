package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ironsource.ir;
import com.ironsource.o9;
import com.ironsource.yj;
import i8.g;
import i8.i;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class IronSourceThreadManager {

    /* renamed from: a */
    private static boolean f17271a;

    /* renamed from: c */
    private static final Handler f17273c;

    /* renamed from: d */
    private static final yj f17274d;

    /* renamed from: e */
    private static final yj f17275e;

    /* renamed from: f */
    private static final yj f17276f;

    /* renamed from: g */
    private static final g f17277g;

    /* renamed from: h */
    private static final g f17278h;
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    /* renamed from: b */
    private static final Handler f17272b = new Handler(Looper.getMainLooper());

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends o implements t8.a<ir> {

        /* renamed from: a */
        public static final a f17279a = new a();

        a() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final ir invoke() {
            return new ir(0, null, null, 7, null);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class b extends o implements t8.a<yj> {

        /* renamed from: a */
        public static final b f17280a = new b();

        b() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final yj invoke() {
            yj yjVar = new yj("managersThread");
            yjVar.start();
            yjVar.a();
            return yjVar;
        }
    }

    static {
        g b10;
        g b11;
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        f17273c = new Handler(handlerThread.getLooper());
        yj yjVar = new yj("mediationBackground");
        yjVar.start();
        yjVar.a();
        f17274d = yjVar;
        yj yjVar2 = new yj("adapterBackground");
        yjVar2.start();
        yjVar2.a();
        f17275e = yjVar2;
        yj yjVar3 = new yj("publisher-callbacks");
        yjVar3.start();
        yjVar3.a();
        f17276f = yjVar3;
        b10 = i.b(a.f17279a);
        f17277g = b10;
        b11 = i.b(b.f17280a);
        f17278h = b11;
    }

    private IronSourceThreadManager() {
    }

    private final ir a() {
        return (ir) f17277g.getValue();
    }

    public static final void a(Runnable it, final CountDownLatch latch) {
        n.f(it, "$it");
        n.f(latch, "$latch");
        it.run();
        new Runnable() { // from class: com.ironsource.environment.thread.b
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.a(latch);
            }
        }.run();
    }

    public static final void a(CountDownLatch latch) {
        n.f(latch, "$latch");
        latch.countDown();
    }

    private final boolean a(Runnable runnable) {
        return f17271a && a().getQueue().contains(runnable);
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j10);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j10);
    }

    public final void executeTasks(boolean z10, boolean z11, List<? extends Runnable> tasks) {
        n.f(tasks, "tasks");
        if (!z10) {
            for (Runnable runnable : tasks) {
                runnable.run();
            }
        } else if (!z11) {
            for (Runnable runnable2 : tasks) {
                postMediationBackgroundTask$default(INSTANCE, runnable2, 0L, 2, null);
            }
        } else {
            final CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
            for (final Runnable runnable3 : tasks) {
                postMediationBackgroundTask$default(INSTANCE, new Runnable() { // from class: com.ironsource.environment.thread.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        IronSourceThreadManager.a(runnable3, countDownLatch);
                    }
                }, 0L, 2, null);
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e8) {
                o9.d().a(e8);
            }
        }
    }

    public final Handler getInitHandler() {
        return f17273c;
    }

    public final yj getSharedManagersThread() {
        return (yj) f17278h.getValue();
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f17271a;
    }

    public final void postAdapterBackgroundTask(Runnable action) {
        n.f(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postAdapterBackgroundTask(Runnable action, long j10) {
        n.f(action, "action");
        if (f17271a) {
            a().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            f17275e.a(action, j10);
        }
    }

    public final void postMediationBackgroundTask(Runnable action) {
        n.f(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(Runnable action, long j10) {
        n.f(action, "action");
        if (f17271a) {
            a().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            f17274d.a(action, j10);
        }
    }

    public final void postOnUiThreadTask(Runnable action) {
        n.f(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(Runnable action, long j10) {
        n.f(action, "action");
        f17272b.postDelayed(action, j10);
    }

    public final void postPublisherCallback(Runnable action) {
        n.f(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(Runnable action, long j10) {
        n.f(action, "action");
        f17276f.a(action, j10);
    }

    public final void removeAdapterBackgroundTask(Runnable action) {
        n.f(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            f17275e.b(action);
        }
    }

    public final void removeMediationBackgroundTask(Runnable action) {
        n.f(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            f17274d.b(action);
        }
    }

    public final void removeUiThreadTask(Runnable action) {
        n.f(action, "action");
        f17272b.removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z10) {
        f17271a = z10;
    }
}
