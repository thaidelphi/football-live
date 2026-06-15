package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e0 extends FutureTask implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private final long f12909a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f12910b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12911c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzfv f12912d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(zzfv zzfvVar, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f12912d = zzfvVar;
        Preconditions.m(str);
        atomicLong = zzfv.f13542l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f12909a = andIncrement;
        this.f12911c = str;
        this.f12910b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            zzfvVar.f13220a.zzay().m().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        e0 e0Var = (e0) obj;
        boolean z10 = this.f12910b;
        if (z10 != e0Var.f12910b) {
            return !z10 ? 1 : -1;
        }
        int i10 = (this.f12909a > e0Var.f12909a ? 1 : (this.f12909a == e0Var.f12909a ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 > 0) {
            return 1;
        }
        this.f12912d.f13220a.zzay().o().b("Two tasks share the same index. index", Long.valueOf(this.f12909a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f12912d.f13220a.zzay().m().b(this.f12911c, th);
        super.setException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(zzfv zzfvVar, Callable callable, boolean z10, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f12912d = zzfvVar;
        Preconditions.m("Task exception on worker thread");
        atomicLong = zzfv.f13542l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f12909a = andIncrement;
        this.f12911c = "Task exception on worker thread";
        this.f12910b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            zzfvVar.f13220a.zzay().m().a("Tasks index overflow");
        }
    }
}
