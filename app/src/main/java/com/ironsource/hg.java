package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class hg implements uu {

    /* renamed from: c  reason: collision with root package name */
    private static boolean f17678c;

    /* renamed from: e  reason: collision with root package name */
    private static final yj f17680e;

    /* renamed from: f  reason: collision with root package name */
    private static final yj f17681f;

    /* renamed from: g  reason: collision with root package name */
    private static final yj f17682g;

    /* renamed from: a  reason: collision with root package name */
    public static final hg f17676a = new hg();

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f17677b = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private static final i8.g f17679d = i8.h.b(a.f17683a);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.a<ir> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17683a = new a();

        a() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final ir invoke() {
            return new ir(0, null, null, 7, null);
        }
    }

    static {
        yj yjVar = new yj("isadplayer-background");
        yjVar.start();
        yjVar.a();
        f17680e = yjVar;
        yj yjVar2 = new yj("isadplayer-publisher-callbacks");
        yjVar2.start();
        yjVar2.a();
        f17681f = yjVar2;
        yj yjVar3 = new yj("isadplayer-release");
        yjVar3.start();
        yjVar3.a();
        f17682g = yjVar3;
    }

    private hg() {
    }

    public static /* synthetic */ void a(hg hgVar, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        hgVar.b(runnable, j10);
    }

    private final ir b() {
        return (ir) f17679d.getValue();
    }

    public static /* synthetic */ void b(hg hgVar, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        hgVar.c(runnable, j10);
    }

    public static /* synthetic */ void c(hg hgVar, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        hgVar.d(runnable, j10);
    }

    private final boolean f(Runnable runnable) {
        return f17678c && b().getQueue().contains(runnable);
    }

    public final Looper a() {
        return f17680e.getLooper();
    }

    @Override // com.ironsource.uu
    public void a(Runnable action) {
        kotlin.jvm.internal.n.f(action, "action");
        c(this, action, 0L, 2, null);
    }

    @Override // com.ironsource.uu
    public void a(Runnable action, long j10) {
        kotlin.jvm.internal.n.f(action, "action");
        if (f17678c) {
            b().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            f17682g.a(action, j10);
        }
    }

    public final void a(boolean z10) {
        f17678c = z10;
    }

    public final void b(Runnable action) {
        kotlin.jvm.internal.n.f(action, "action");
        a(this, action, 0L, 2, null);
    }

    public final void b(Runnable action, long j10) {
        kotlin.jvm.internal.n.f(action, "action");
        f17680e.a(action, j10);
    }

    public final ThreadPoolExecutor c() {
        return b();
    }

    public final void c(Runnable action) {
        kotlin.jvm.internal.n.f(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final void c(Runnable action, long j10) {
        kotlin.jvm.internal.n.f(action, "action");
        f17681f.a(action, j10);
    }

    public final void d(Runnable action) {
        kotlin.jvm.internal.n.f(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void d(Runnable action, long j10) {
        kotlin.jvm.internal.n.f(action, "action");
        f17677b.postDelayed(action, j10);
    }

    public final boolean d() {
        return f17678c;
    }

    public final void e(Runnable action) {
        kotlin.jvm.internal.n.f(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            f17682g.b(action);
        }
    }
}
