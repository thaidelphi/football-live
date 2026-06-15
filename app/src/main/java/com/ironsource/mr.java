package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class mr {

    /* renamed from: c  reason: collision with root package name */
    public static final a f19300c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f19301d = 2070;

    /* renamed from: e  reason: collision with root package name */
    public static final int f19302e = 2080;

    /* renamed from: f  reason: collision with root package name */
    public static final int f19303f = 2090;

    /* renamed from: g  reason: collision with root package name */
    public static final int f19304g = 2100;

    /* renamed from: h  reason: collision with root package name */
    public static final int f19305h = 2110;

    /* renamed from: a  reason: collision with root package name */
    private final int f19306a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19307b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public mr(int i10, String errorMessage) {
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        this.f19306a = i10;
        this.f19307b = errorMessage;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mr(com.ironsource.mediationsdk.logger.IronSourceError r3) {
        /*
            r2 = this;
            java.lang.String r0 = "error"
            kotlin.jvm.internal.n.f(r3, r0)
            int r0 = r3.getErrorCode()
            java.lang.String r3 = r3.getErrorMessage()
            java.lang.String r1 = "error.errorMessage"
            kotlin.jvm.internal.n.e(r3, r1)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mr.<init>(com.ironsource.mediationsdk.logger.IronSourceError):void");
    }

    public static /* synthetic */ mr a(mr mrVar, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = mrVar.f19306a;
        }
        if ((i11 & 2) != 0) {
            str = mrVar.f19307b;
        }
        return mrVar.a(i10, str);
    }

    public final int a() {
        return this.f19306a;
    }

    public final mr a(int i10, String errorMessage) {
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        return new mr(i10, errorMessage);
    }

    public final String b() {
        return this.f19307b;
    }

    public final int c() {
        return this.f19306a;
    }

    public final String d() {
        return this.f19307b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mr) {
            mr mrVar = (mr) obj;
            return this.f19306a == mrVar.f19306a && kotlin.jvm.internal.n.a(this.f19307b, mrVar.f19307b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f19306a * 31) + this.f19307b.hashCode();
    }

    public String toString() {
        return "SdkError(errorCode=" + this.f19306a + ", errorMessage=" + this.f19307b + ')';
    }
}
