package com.startapp;

import android.os.Build;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.concurrent.Executor;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a8 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractCollection f21764a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f21765b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f21766c;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f21767a;

        public a(Runnable runnable) {
            this.f21767a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f21767a.run();
            } finally {
                a8.this.a();
            }
        }
    }

    public a8(Executor executor) {
        if (Build.VERSION.SDK_INT >= 9) {
            this.f21764a = new ArrayDeque();
        } else {
            this.f21764a = new LinkedList();
        }
        this.f21765b = executor;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.Queue] */
    public final synchronized void a() {
        Runnable runnable = (Runnable) this.f21764a.poll();
        this.f21766c = runnable;
        if (runnable != null) {
            this.f21765b.execute(runnable);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.Queue] */
    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.f21764a.offer(new a(runnable));
        if (this.f21766c == null) {
            a();
        }
    }
}
