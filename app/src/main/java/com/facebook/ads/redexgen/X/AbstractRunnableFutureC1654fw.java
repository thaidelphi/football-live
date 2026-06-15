package com.facebook.ads.redexgen.X;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: com.facebook.ads.redexgen.X.fw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractRunnableFutureC1654fw<R, E extends Exception> implements RunnableFuture<R> {
    public Exception A00;
    public R A01;
    public Thread A02;
    public boolean A03;
    public final C1599f2 A05 = new C1599f2();
    public final C1599f2 A04 = new C1599f2();
    public final Object A06 = new Object();

    public abstract R A02() throws Exception;

    public abstract void A04();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fw != com.google.android.exoplayer2.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    private R A01() throws ExecutionException {
        if (!this.A03) {
            if (this.A00 == null) {
                return this.A01;
            }
            throw new ExecutionException(this.A00);
        }
        throw new CancellationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fw != com.google.android.exoplayer2.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    public final void A03() {
        this.A04.A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fw != com.google.android.exoplayer2.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.A06) {
            if (this.A03 || this.A04.A03()) {
                return false;
            }
            this.A03 = true;
            A04();
            Thread thread = this.A02;
            if (thread != null) {
                if (z10) {
                    thread.interrupt();
                }
            } else {
                this.A05.A04();
                this.A04.A04();
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fw != com.google.android.exoplayer2.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        this.A04.A00();
        return A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fw != com.google.android.exoplayer2.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    @Override // java.util.concurrent.Future
    public final R get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.A04.A05(TimeUnit.MILLISECONDS.convert(j10, timeUnit))) {
            return A01();
        }
        throw new TimeoutException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fw != com.google.android.exoplayer2.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A03;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fw != com.google.android.exoplayer2.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A04.A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fw != com.google.android.exoplayer2.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            synchronized (this.A06) {
                try {
                    if (this.A03) {
                        try {
                            return;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    this.A02 = Thread.currentThread();
                    this.A05.A04();
                    try {
                        this.A01 = A02();
                        synchronized (this.A06) {
                            try {
                                this.A04.A04();
                                this.A02 = null;
                                Thread.interrupted();
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e8) {
                        this.A00 = e8;
                        synchronized (this.A06) {
                            try {
                                this.A04.A04();
                                this.A02 = null;
                                Thread.interrupted();
                            } catch (Throwable th4) {
                                th = th4;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        } catch (Throwable th7) {
            BQ.A00(th7, this);
        }
    }
}
