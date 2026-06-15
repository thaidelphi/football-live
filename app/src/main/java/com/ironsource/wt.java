package com.ironsource;

import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class wt {

    /* renamed from: a */
    public static final wt f21318a = new wt();

    /* renamed from: b */
    private static final i8.g f21319b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.a<ir> {

        /* renamed from: a */
        public static final a f21320a = new a();

        a() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final ir invoke() {
            return new ir(16, null, null, 6, null);
        }
    }

    static {
        i8.g b10;
        b10 = i8.i.b(a.f21320a);
        f21319b = b10;
    }

    private wt() {
    }

    private final ir a() {
        return (ir) f21319b.getValue();
    }

    public static /* synthetic */ void a(wt wtVar, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        wtVar.a(runnable, j10);
    }

    public final void a(Runnable action) {
        kotlin.jvm.internal.n.f(action, "action");
        a(this, action, 0L, 2, null);
    }

    public final void a(Runnable action, long j10) {
        kotlin.jvm.internal.n.f(action, "action");
        a().schedule(action, j10, TimeUnit.MILLISECONDS);
    }
}
