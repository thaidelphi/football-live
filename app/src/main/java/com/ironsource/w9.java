package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum w9 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f21272b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f21278a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final w9 a(String str) {
            w9 w9Var;
            w9[] values = w9.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    w9Var = null;
                    break;
                }
                w9Var = values[i10];
                if (kotlin.jvm.internal.n.a(w9Var.b(), str)) {
                    break;
                }
                i10++;
            }
            return w9Var == null ? w9.NONE : w9Var;
        }
    }

    w9(String str) {
        this.f21278a = str;
    }

    public static final w9 a(String str) {
        return f21272b.a(str);
    }

    public final String b() {
        return this.f21278a;
    }
}
