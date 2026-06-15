package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class ew {

    /* renamed from: c  reason: collision with root package name */
    public static final a f17337c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final o1 f17338a;

    /* renamed from: b  reason: collision with root package name */
    private final xo f17339b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final ew a(w2 adTools, w1 adUnitData, xo outcomeReporter, zv waterfallInstances, g0 adInstanceLoadStrategy) {
            kotlin.jvm.internal.n.f(adTools, "adTools");
            kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
            kotlin.jvm.internal.n.f(outcomeReporter, "outcomeReporter");
            kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
            kotlin.jvm.internal.n.f(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.q() ? new ot(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new la(adTools, outcomeReporter, waterfallInstances);
        }
    }

    public ew(o1 adTools, xo outcomeReporter) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(outcomeReporter, "outcomeReporter");
        this.f17338a = adTools;
        this.f17339b = outcomeReporter;
    }

    private final void b(a0 a0Var, List<? extends a0> list) {
        for (a0 a0Var2 : list) {
            if (a0Var2 == a0Var) {
                a0Var.a(true);
                return;
            }
            a0Var2.a(false);
            IronLog ironLog = IronLog.INTERNAL;
            o1 o1Var = this.f17338a;
            ironLog.verbose(o1.a(o1Var, a0Var2.p() + " - not ready to show", (String) null, 2, (Object) null));
        }
    }

    public abstract void a();

    public abstract void a(a0 a0Var);

    public final void a(a0 instance, String str, qk publisherDataHolder) {
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(publisherDataHolder, "publisherDataHolder");
        this.f17339b.a(instance, str, publisherDataHolder);
    }

    public final void a(a0 instanceToShow, List<? extends a0> orderedInstances) {
        kotlin.jvm.internal.n.f(instanceToShow, "instanceToShow");
        kotlin.jvm.internal.n.f(orderedInstances, "orderedInstances");
        b(instanceToShow, orderedInstances);
        c(instanceToShow);
    }

    public abstract void b(a0 a0Var);

    public abstract void c(a0 a0Var);
}
