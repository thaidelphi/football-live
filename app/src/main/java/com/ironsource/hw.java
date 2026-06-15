package com.ironsource;

import com.google.android.gms.common.api.Api;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.q7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class hw<Smash extends q7<?>> {

    /* renamed from: g  reason: collision with root package name */
    public static final a f17741g = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f17742a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f17743b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Smash> f17744c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Smash> f17745d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Smash> f17746e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Smash> f17747f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: com.ironsource.hw$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public /* synthetic */ class C0221a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17748a;

            static {
                int[] iArr = new int[dw.values().length];
                try {
                    iArr[dw.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[dw.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f17748a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final <Smash extends q7<?>> hw<Smash> a(dw loadingStrategy, int i10, boolean z10, List<? extends Smash> waterfall) {
            kotlin.jvm.internal.n.f(loadingStrategy, "loadingStrategy");
            kotlin.jvm.internal.n.f(waterfall, "waterfall");
            int i11 = C0221a.f17748a[loadingStrategy.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return new v7(i10, z10, waterfall, false, 8, null);
                }
                throw new i8.l();
            }
            return new ka(i10, z10, waterfall);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hw(int i10, boolean z10, List<? extends Smash> waterfall) {
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        this.f17742a = i10;
        this.f17743b = z10;
        this.f17744c = waterfall;
        this.f17745d = new ArrayList();
        this.f17746e = new ArrayList();
        this.f17747f = new ArrayList();
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int b() {
        Integer num;
        List<Smash> list = this.f17744c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q7) obj).y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(a((q7) it.next()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(a((q7) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        return num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    public final List<Smash> a() {
        return this.f17747f;
    }

    public final List<Smash> c() {
        return this.f17745d;
    }

    public abstract void c(Smash smash);

    public final int d() {
        return this.f17745d.size() + this.f17746e.size() + this.f17747f.size();
    }

    public final void d(Smash smash) {
        IronLog ironLog;
        String str;
        IronLog ironLog2;
        StringBuilder sb;
        String str2;
        List<Smash> list;
        kotlin.jvm.internal.n.f(smash, "smash");
        if (!smash.x()) {
            if (smash.y()) {
                IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
                list = this.f17746e;
            } else {
                if (smash.z()) {
                    ironLog2 = IronLog.INTERNAL;
                    sb = new StringBuilder();
                    sb.append(smash.g().name());
                    sb.append(" - Smash ");
                    sb.append(smash.k());
                    str2 = " still loading";
                } else if (smash.A().get()) {
                    ironLog2 = IronLog.INTERNAL;
                    sb = new StringBuilder();
                    sb.append(smash.g().name());
                    sb.append(" - Smash ");
                    sb.append(smash.k());
                    str2 = " marked as loading candidate";
                } else if (!this.f17743b || !b(smash)) {
                    c(smash);
                    return;
                } else {
                    ironLog = IronLog.INTERNAL;
                    str = smash.g().name() + " - Smash " + smash.k() + " is not better than already loaded smashes";
                }
                sb.append(str2);
                ironLog2.verbose(sb.toString());
                list = this.f17747f;
            }
            list.add(smash);
            return;
        }
        ironLog = IronLog.INTERNAL;
        str = smash.g().name() + " - smash " + smash.k() + " is failed to load";
        ironLog.verbose(str);
    }

    public boolean e() {
        return d() >= this.f17742a;
    }
}
