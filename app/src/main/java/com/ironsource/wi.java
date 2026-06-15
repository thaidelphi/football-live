package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum wi {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f21295b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f21300a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final wi a(int i10) {
            wi wiVar;
            wi[] values = wi.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    wiVar = null;
                    break;
                }
                wiVar = values[i11];
                if (wiVar.f21300a == i10) {
                    break;
                }
                i11++;
            }
            return wiVar == null ? wi.NotSupported : wiVar;
        }
    }

    wi(int i10) {
        this.f21300a = i10;
    }

    public final int b() {
        return this.f21300a;
    }

    public final boolean b(wi instanceType) {
        kotlin.jvm.internal.n.f(instanceType, "instanceType");
        return instanceType.b() == this.f21300a;
    }
}
