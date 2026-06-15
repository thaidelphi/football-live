package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class g0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f17505c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final w1 f17506a;

    /* renamed from: b  reason: collision with root package name */
    private final zv f17507b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: com.ironsource.g0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public /* synthetic */ class C0219a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17508a;

            static {
                int[] iArr = new int[dw.values().length];
                try {
                    iArr[dw.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[dw.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f17508a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final g0 a(w1 adUnitData, zv waterfallInstances) {
            kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
            kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
            int i10 = C0219a.f17508a[(adUnitData.d() ? dw.BIDDER_SENSITIVE : dw.DEFAULT).ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return adUnitData.q() ? new nt(adUnitData, waterfallInstances) : new ha(adUnitData, waterfallInstances);
                }
                throw new i8.l();
            }
            return new u7(adUnitData, waterfallInstances);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<a0> f17509a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<a0> f17510b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<a0> f17511c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private boolean f17512d;

        public final List<a0> a() {
            return this.f17509a;
        }

        public final void a(boolean z10) {
            this.f17512d = z10;
        }

        public final List<a0> b() {
            return this.f17510b;
        }

        public final List<a0> c() {
            return this.f17511c;
        }

        public final boolean d() {
            return this.f17512d;
        }

        public final boolean e() {
            return g() == 0;
        }

        public final boolean f() {
            return this.f17509a.isEmpty() && this.f17511c.isEmpty();
        }

        public final int g() {
            return this.f17509a.size() + this.f17510b.size() + this.f17511c.size();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f17513a;

        /* renamed from: b  reason: collision with root package name */
        private final List<a0> f17514b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(a0 a0Var, List<? extends a0> orderedInstances) {
            kotlin.jvm.internal.n.f(orderedInstances, "orderedInstances");
            this.f17513a = a0Var;
            this.f17514b = orderedInstances;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, a0 a0Var, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                a0Var = cVar.f17513a;
            }
            if ((i10 & 2) != 0) {
                list = cVar.f17514b;
            }
            return cVar.a(a0Var, list);
        }

        public final a0 a() {
            return this.f17513a;
        }

        public final c a(a0 a0Var, List<? extends a0> orderedInstances) {
            kotlin.jvm.internal.n.f(orderedInstances, "orderedInstances");
            return new c(a0Var, orderedInstances);
        }

        public final List<a0> b() {
            return this.f17514b;
        }

        public final a0 c() {
            return this.f17513a;
        }

        public final List<a0> d() {
            return this.f17514b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.n.a(this.f17513a, cVar.f17513a) && kotlin.jvm.internal.n.a(this.f17514b, cVar.f17514b);
            }
            return false;
        }

        public int hashCode() {
            a0 a0Var = this.f17513a;
            return ((a0Var == null ? 0 : a0Var.hashCode()) * 31) + this.f17514b.hashCode();
        }

        public String toString() {
            return "ShowSelection(instanceToShow=" + this.f17513a + ", orderedInstances=" + this.f17514b + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            a10 = l8.b.a(Integer.valueOf(((a0) t10).h().l()), Integer.valueOf(((a0) t11).h().l()));
            return a10;
        }
    }

    public g0(w1 adUnitData, zv waterfallInstances) {
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        this.f17506a = adUnitData;
        this.f17507b = waterfallInstances;
    }

    private final List<a0> b() {
        List<a0> I;
        I = j8.y.I(this.f17507b.b(), new d());
        return I;
    }

    private final boolean b(a0 a0Var, b bVar) {
        IronLog ironLog;
        StringBuilder sb;
        String str;
        List<a0> c10;
        if (!a0Var.u()) {
            if (a0Var.v()) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose(a0Var.d().name() + " - Instance " + a0Var.p() + " is already loaded");
                c10 = bVar.b();
            } else if (a0Var.w()) {
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.verbose(a0Var.d().name() + " - Instance " + a0Var.p() + " still loading");
                c10 = bVar.c();
            } else if (!a(a0Var, this.f17507b)) {
                a(a0Var, bVar);
                return a(bVar);
            } else {
                ironLog = IronLog.INTERNAL;
                sb = new StringBuilder();
                sb.append(a0Var.d().name());
                sb.append(" - Instance ");
                sb.append(a0Var.p());
                str = " is not better than already loaded instances";
            }
            c10.add(a0Var);
            return a(bVar);
        }
        ironLog = IronLog.INTERNAL;
        sb = new StringBuilder();
        sb.append(a0Var.d().name());
        sb.append(" - Instance ");
        sb.append(a0Var.p());
        str = " is failed to load";
        sb.append(str);
        ironLog.verbose(sb.toString());
        return a(bVar);
    }

    public abstract void a(a0 a0Var, b bVar);

    public final boolean a() {
        int i10;
        List<a0> b10 = this.f17507b.b();
        if ((b10 instanceof Collection) && b10.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 0;
            for (a0 a0Var : b10) {
                if (a0Var.v() && (i10 = i10 + 1) < 0) {
                    j8.q.i();
                }
            }
        }
        return i10 >= this.f17506a.k();
    }

    public final boolean a(a0 instance) {
        Object obj;
        kotlin.jvm.internal.n.f(instance, "instance");
        Iterator<T> it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((a0) obj).u()) {
                break;
            }
        }
        return kotlin.jvm.internal.n.a(obj, instance);
    }

    protected boolean a(a0 instance, zv waterfallInstances) {
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        return false;
    }

    public boolean a(b loadSelection) {
        kotlin.jvm.internal.n.f(loadSelection, "loadSelection");
        return loadSelection.g() >= this.f17506a.k();
    }

    public final c c() {
        Object obj;
        List<a0> b10 = b();
        Iterator<T> it = b10.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a0) obj).v()) {
                break;
            }
        }
        return new c((a0) obj, b10);
    }

    public final b d() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(this.f17506a.b().a().name() + " waterfall size: " + this.f17507b.b().size());
        b bVar = new b();
        Iterator<a0> it = this.f17507b.b().iterator();
        while (it.hasNext() && !b(it.next(), bVar)) {
        }
        return bVar;
    }
}
