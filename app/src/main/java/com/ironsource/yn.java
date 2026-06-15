package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class yn implements yp {

    /* renamed from: a  reason: collision with root package name */
    private final String f21562a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21563a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final String f21564b = "IronSource";

        private a() {
        }
    }

    public yn(String networkInstanceId) {
        kotlin.jvm.internal.n.f(networkInstanceId, "networkInstanceId");
        this.f21562a = networkInstanceId;
    }

    @Override // com.ironsource.yp
    public String value() {
        if (this.f21562a.length() == 0) {
            return "";
        }
        if (kotlin.jvm.internal.n.a(this.f21562a, "0") || kotlin.jvm.internal.n.a(this.f21562a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.f21562a;
    }
}
