package com.adcolony.sdk;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e0 {

    /* renamed from: c  reason: collision with root package name */
    static e0 f5975c;

    /* renamed from: d  reason: collision with root package name */
    static e0 f5976d;

    /* renamed from: e  reason: collision with root package name */
    static e0 f5977e;

    /* renamed from: f  reason: collision with root package name */
    static e0 f5978f;

    /* renamed from: g  reason: collision with root package name */
    static e0 f5979g;

    /* renamed from: h  reason: collision with root package name */
    static e0 f5980h;

    /* renamed from: i  reason: collision with root package name */
    static e0 f5981i;

    /* renamed from: a  reason: collision with root package name */
    private final int f5982a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5983b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        StringBuilder f5984a = new StringBuilder();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(String str) {
            this.f5984a.append(str);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(Object obj) {
            if (obj != null) {
                this.f5984a.append(obj.toString());
            } else {
                this.f5984a.append("null");
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(int i10) {
            this.f5984a.append(i10);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(e0 e0Var) {
            e0Var.a(this.f5984a.toString());
        }
    }

    static {
        new e0(3, false);
        f5975c = new e0(3, true);
        f5976d = new e0(2, false);
        f5977e = new e0(2, true);
        f5978f = new e0(1, false);
        f5979g = new e0(1, true);
        f5980h = new e0(0, false);
        f5981i = new e0(0, true);
    }

    e0(int i10, boolean z10) {
        this.f5982a = i10;
        this.f5983b = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        com.adcolony.sdk.a.b().q().a(this.f5982a, str, this.f5983b);
    }
}
