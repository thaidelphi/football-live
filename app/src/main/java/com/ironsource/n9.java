package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class n9 {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f19392a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19393b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f19394c;

    public n9(Throwable throwable) {
        boolean w10;
        boolean w11;
        kotlin.jvm.internal.n.f(throwable, "throwable");
        this.f19392a = throwable;
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        kotlin.jvm.internal.n.e(stackTrace, "throwable.stackTrace");
        sb.append(throwable.toString());
        sb.append(System.lineSeparator());
        boolean z10 = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(';' + System.lineSeparator());
            String stackTraceElement2 = stackTraceElement.toString();
            kotlin.jvm.internal.n.e(stackTraceElement2, "elem.toString()");
            String e8 = o9.d().e();
            kotlin.jvm.internal.n.e(e8, "getInstance().keyword");
            w11 = b9.p.w(stackTraceElement2, e8, false, 2, null);
            if (w11) {
                z10 = true;
            }
        }
        Throwable cause = this.f19392a.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            kotlin.jvm.internal.n.e(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement3 : stackTrace2) {
                sb.append(stackTraceElement3.toString());
                sb.append(';' + System.lineSeparator());
                String stackTraceElement4 = stackTraceElement3.toString();
                kotlin.jvm.internal.n.e(stackTraceElement4, "elem.toString()");
                String e10 = o9.d().e();
                kotlin.jvm.internal.n.e(e10, "getInstance().keyword");
                w10 = b9.p.w(stackTraceElement4, e10, false, 2, null);
                if (w10) {
                    z10 = true;
                }
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.n.e(sb2, "builder.toString()");
        this.f19393b = sb2;
        this.f19394c = z10;
    }

    public static /* synthetic */ n9 a(n9 n9Var, Throwable th, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = n9Var.f19392a;
        }
        return n9Var.a(th);
    }

    public final n9 a(Throwable throwable) {
        kotlin.jvm.internal.n.f(throwable, "throwable");
        return new n9(throwable);
    }

    public final Throwable a() {
        return this.f19392a;
    }

    public final String b() {
        return this.f19393b;
    }

    public final Throwable c() {
        return this.f19392a;
    }

    public final boolean d() {
        return this.f19394c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9) && kotlin.jvm.internal.n.a(this.f19392a, ((n9) obj).f19392a);
    }

    public int hashCode() {
        return this.f19392a.hashCode();
    }

    public String toString() {
        return "CrashReportWrapper(throwable=" + this.f19392a + ')';
    }
}
