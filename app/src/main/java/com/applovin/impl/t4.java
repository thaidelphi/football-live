package com.applovin.impl;

import com.applovin.mediation.MaxError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t4 {

    /* renamed from: a  reason: collision with root package name */
    private final u4 f9276a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9277b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9278c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9279d;

    /* renamed from: e  reason: collision with root package name */
    private final MaxError f9280e;

    /* renamed from: f  reason: collision with root package name */
    private final long f9281f;

    /* renamed from: g  reason: collision with root package name */
    private final long f9282g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f9283h;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(t4 t4Var);
    }

    private t4(u4 u4Var, com.applovin.impl.mediation.g gVar, String str, MaxError maxError, long j10, long j11) {
        this(u4Var, str, maxError, j10, j11, gVar != null ? gVar.i() : null, gVar != null ? gVar.b() : null, false);
    }

    public static t4 a(u4 u4Var, com.applovin.impl.mediation.g gVar, String str, long j10, long j11) {
        if (u4Var != null) {
            if (gVar != null) {
                return new t4(u4Var, gVar, str, null, j10, j11);
            }
            throw new IllegalArgumentException("No adapterWrapper specified");
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public long b() {
        return this.f9282g;
    }

    public MaxError c() {
        return this.f9280e;
    }

    public String d() {
        return this.f9277b;
    }

    public String e() {
        return this.f9279d;
    }

    public u4 f() {
        return this.f9276a;
    }

    public boolean g() {
        return this.f9283h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f9276a);
        sb.append(", mSdkVersion='");
        sb.append(this.f9277b);
        sb.append('\'');
        sb.append(", mAdapterVersion='");
        sb.append(this.f9278c);
        sb.append('\'');
        sb.append(", mSignalDataLength='");
        String str = this.f9279d;
        sb.append(str != null ? str.length() : 0);
        sb.append('\'');
        sb.append(", mErrorMessage=");
        MaxError maxError = this.f9280e;
        sb.append(maxError != null ? maxError.getMessage() : "");
        sb.append('}');
        return sb.toString();
    }

    private t4(u4 u4Var, String str, MaxError maxError, long j10, long j11, String str2, String str3, boolean z10) {
        this.f9276a = u4Var;
        this.f9279d = str;
        this.f9280e = maxError;
        this.f9281f = j10;
        this.f9282g = j11;
        this.f9277b = str2;
        this.f9278c = str3;
        this.f9283h = z10;
    }

    public static t4 a(u4 u4Var, MaxError maxError) {
        return a(u4Var, (com.applovin.impl.mediation.g) null, maxError, -1L, -1L);
    }

    public static t4 a(u4 u4Var, com.applovin.impl.mediation.g gVar, MaxError maxError, long j10, long j11) {
        if (u4Var != null) {
            return new t4(u4Var, gVar, null, maxError, j10, j11);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static t4 a(t4 t4Var) {
        return new t4(t4Var.f(), t4Var.e(), t4Var.c(), t4Var.f9281f, t4Var.f9282g, t4Var.d(), t4Var.a(), true);
    }

    public String a() {
        return this.f9278c;
    }
}
