package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.ut;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class le implements ut {

    /* renamed from: a  reason: collision with root package name */
    private final a f18187a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        void a(Runnable runnable, long j10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ut.a f18188a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f18189b;

        b(ut.a aVar, Runnable runnable) {
            this.f18188a = aVar;
            this.f18189b = runnable;
        }

        @Override // com.ironsource.hr
        public void a() {
            if (this.f18188a.b()) {
                return;
            }
            this.f18189b.run();
        }
    }

    public le() {
        this(null, 1, null);
    }

    public le(a handler) {
        kotlin.jvm.internal.n.f(handler, "handler");
        this.f18187a = handler;
    }

    public /* synthetic */ le(a aVar, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? me.a(new Handler(Looper.getMainLooper())) : aVar);
    }

    private final hr a(ut.a aVar, Runnable runnable) {
        return new b(aVar, runnable);
    }

    @Override // com.ironsource.ut
    public ut.a a(Runnable task, long j10) {
        kotlin.jvm.internal.n.f(task, "task");
        ut.a aVar = new ut.a();
        this.f18187a.a(a(aVar, task), c9.b.m(j10));
        return aVar;
    }
}
