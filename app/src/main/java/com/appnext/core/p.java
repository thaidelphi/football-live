package com.appnext.core;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p {
    private static int dD = Runtime.getRuntime().availableProcessors();
    private static final TimeUnit dF = TimeUnit.SECONDS;
    private static volatile p dH;
    private final BlockingQueue<Runnable> dE = new LinkedBlockingQueue();
    private ThreadPoolExecutor dG = (ThreadPoolExecutor) Executors.newCachedThreadPool();

    public static p ac() {
        if (dH == null) {
            synchronized (l.class) {
                if (dH == null) {
                    dH = new p();
                }
            }
        }
        return dH;
    }

    public final void a(Runnable runnable) {
        if (runnable != null) {
            this.dG.execute(runnable);
        }
    }
}
