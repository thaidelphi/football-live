package com.ironsource;

import android.app.Activity;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface td {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final c f20833a;

        public a(c strategyType) {
            kotlin.jvm.internal.n.f(strategyType, "strategyType");
            this.f20833a = strategyType;
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.f20833a;
            }
            return aVar.a(cVar);
        }

        public final a a(c strategyType) {
            kotlin.jvm.internal.n.f(strategyType, "strategyType");
            return new a(strategyType);
        }

        public final c a() {
            return this.f20833a;
        }

        public final c b() {
            return this.f20833a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f20833a == ((a) obj).f20833a;
        }

        public int hashCode() {
            return this.f20833a.hashCode();
        }

        public String toString() {
            return "Config(strategyType=" + this.f20833a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f20834a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.MANUAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f20834a = iArr;
            }
        }

        public final td a(o1 adTools, a config, qd fullscreenAdUnitFactory) {
            kotlin.jvm.internal.n.f(adTools, "adTools");
            kotlin.jvm.internal.n.f(config, "config");
            kotlin.jvm.internal.n.f(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            int i10 = a.f20834a[config.b().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return new ud(adTools, fullscreenAdUnitFactory);
                }
                throw new i8.l();
            }
            return new be(adTools, config, fullscreenAdUnitFactory);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum c {
        MANUAL("Manual"),
        PROGRESSIVE_ON_SHOW("ProgressiveOnShow");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f20838a;

        c(String str) {
            this.f20838a = str;
        }

        public final String b() {
            return this.f20838a;
        }
    }

    void a(Activity activity, z1 z1Var);

    void a(n2 n2Var);
}
