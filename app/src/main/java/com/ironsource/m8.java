package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum m8 {
    Day("d", 86400000),
    Hour("h", 3600000),
    Second("s", 1000);
    

    /* renamed from: c  reason: collision with root package name */
    public static final a f18453c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f18458a;

    /* renamed from: b  reason: collision with root package name */
    private final long f18459b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final m8 a(String str) {
            m8[] values;
            for (m8 m8Var : m8.values()) {
                if (kotlin.jvm.internal.n.a(m8Var.f18458a, str)) {
                    return m8Var;
                }
            }
            return null;
        }
    }

    m8(String str, long j10) {
        this.f18458a = str;
        this.f18459b = j10;
    }

    public static /* synthetic */ long a(m8 m8Var, Integer num, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                num = 1;
            }
            return m8Var.a(num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
    }

    public final long a(Integer num) {
        return (num != null ? num.intValue() : 1) * this.f18459b;
    }
}
