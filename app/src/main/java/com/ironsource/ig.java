package com.ironsource;

import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum ig {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f17828b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f17833a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final ig a(Integer num) {
            ig igVar;
            ig[] values = ig.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    igVar = null;
                    break;
                }
                igVar = values[i10];
                if (num != null && igVar.b() == num.intValue()) {
                    break;
                }
                i10++;
            }
            return igVar == null ? ig.UnknownProvider : igVar;
        }

        public final ig a(String dynamicDemandSourceId) {
            List c02;
            Integer f10;
            kotlin.jvm.internal.n.f(dynamicDemandSourceId, "dynamicDemandSourceId");
            c02 = b9.p.c0(dynamicDemandSourceId, new String[]{"_"}, false, 0, 6, null);
            if (c02.size() < 2) {
                return ig.UnknownProvider;
            }
            f10 = b9.n.f((String) c02.get(1));
            return a(f10);
        }
    }

    ig(int i10) {
        this.f17833a = i10;
    }

    public final int b() {
        return this.f17833a;
    }
}
