package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopicsStore.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class u0 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<u0> f15054d;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f15055a;

    /* renamed from: b  reason: collision with root package name */
    private q0 f15056b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f15057c;

    private u0(SharedPreferences sharedPreferences, Executor executor) {
        this.f15057c = executor;
        this.f15055a = sharedPreferences;
    }

    public static synchronized u0 b(Context context, Executor executor) {
        u0 u0Var;
        synchronized (u0.class) {
            WeakReference<u0> weakReference = f15054d;
            u0Var = weakReference != null ? weakReference.get() : null;
            if (u0Var == null) {
                u0Var = new u0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                u0Var.d();
                f15054d = new WeakReference<>(u0Var);
            }
        }
        return u0Var;
    }

    private synchronized void d() {
        this.f15056b = q0.d(this.f15055a, "topic_operation_queue", ",", this.f15057c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(t0 t0Var) {
        return this.f15056b.b(t0Var.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized t0 c() {
        return t0.a(this.f15056b.f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean e(t0 t0Var) {
        return this.f15056b.g(t0Var.e());
    }
}
