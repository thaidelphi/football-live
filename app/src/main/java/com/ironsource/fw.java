package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.q7;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class fw<Smash extends q7<?>> {

    /* renamed from: a  reason: collision with root package name */
    private final u0 f17500a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            a10 = l8.b.a(Integer.valueOf(((q7) t10).i().l()), Integer.valueOf(((q7) t11).i().l()));
            return a10;
        }
    }

    public fw(u0 managerData) {
        kotlin.jvm.internal.n.f(managerData, "managerData");
        this.f17500a = managerData;
    }

    public final boolean a(q7<?> smash, List<? extends Smash> waterfall) {
        Object obj;
        kotlin.jvm.internal.n.f(smash, "smash");
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((q7) obj).x()) {
                break;
            }
        }
        return kotlin.jvm.internal.n.a(obj, smash);
    }

    public final boolean a(List<? extends Smash> waterfall) {
        int i10;
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        if ((waterfall instanceof Collection) && waterfall.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = waterfall.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((q7) it.next()).y() && (i10 = i10 + 1) < 0) {
                    j8.q.i();
                }
            }
        }
        return i10 >= this.f17500a.i();
    }

    public final List<Smash> b(List<? extends Smash> waterfall) {
        List<Smash> I;
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        I = j8.y.I(waterfall, new a());
        return I;
    }

    public final Smash c(List<? extends Smash> waterfall) {
        Object obj;
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((q7) obj).B()) {
                break;
            }
        }
        return (Smash) obj;
    }

    public final gw<Smash> d(List<? extends Smash> waterfall) {
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(this.f17500a.b().name() + " waterfall size: " + waterfall.size());
        hw<Smash> a10 = hw.f17741g.a(this.f17500a.c() ? dw.BIDDER_SENSITIVE : dw.DEFAULT, this.f17500a.i(), this.f17500a.m(), waterfall);
        for (Smash smash : waterfall) {
            a10.d(smash);
            if (a10.e()) {
                return new gw<>(a10);
            }
        }
        return new gw<>(a10);
    }
}
