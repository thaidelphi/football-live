package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23363a;

    /* renamed from: b  reason: collision with root package name */
    public final b f23364b;

    /* renamed from: d  reason: collision with root package name */
    public final a f23366d = new a();

    /* renamed from: c  reason: collision with root package name */
    public final Handler f23365c = new Handler(Looper.getMainLooper());

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            t0.this.a();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements n6 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f23368a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ n6 f23369b;

        public b(n6 n6Var) {
            this.f23369b = n6Var;
        }

        @Override // com.startapp.n6
        public final synchronized void a(Object obj) {
            if (!this.f23368a) {
                this.f23368a = true;
                t0.this.f23365c.removeCallbacksAndMessages(null);
                this.f23369b.a(obj);
            }
        }
    }

    public t0(Context context, n6 n6Var) {
        this.f23363a = context;
        this.f23364b = new b(n6Var);
    }

    public abstract void a();
}
