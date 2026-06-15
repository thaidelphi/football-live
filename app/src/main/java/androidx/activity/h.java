package androidx.activity;

import i8.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: FullyDrawnReporter.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f749a;

    /* renamed from: b  reason: collision with root package name */
    private final t8.a<w> f750b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f751c;

    /* renamed from: d  reason: collision with root package name */
    private int f752d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f753e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f754f;

    /* renamed from: g  reason: collision with root package name */
    private final List<t8.a<w>> f755g;

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f756h;

    public h(Executor executor, t8.a<w> reportFullyDrawn) {
        kotlin.jvm.internal.n.f(executor, "executor");
        kotlin.jvm.internal.n.f(reportFullyDrawn, "reportFullyDrawn");
        this.f749a = executor;
        this.f750b = reportFullyDrawn;
        this.f751c = new Object();
        this.f755g = new ArrayList();
        this.f756h = new Runnable() { // from class: androidx.activity.g
            @Override // java.lang.Runnable
            public final void run() {
                h.d(h.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(h this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        synchronized (this$0.f751c) {
            this$0.f753e = false;
            if (this$0.f752d == 0 && !this$0.f754f) {
                this$0.f750b.invoke();
                this$0.b();
            }
            w wVar = w.f26638a;
        }
    }

    public final void b() {
        synchronized (this.f751c) {
            this.f754f = true;
            Iterator<T> it = this.f755g.iterator();
            while (it.hasNext()) {
                ((t8.a) it.next()).invoke();
            }
            this.f755g.clear();
            w wVar = w.f26638a;
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f751c) {
            z10 = this.f754f;
        }
        return z10;
    }
}
