package com.adcolony.sdk;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class f0 {

    /* renamed from: e  reason: collision with root package name */
    static final SimpleDateFormat f5987e = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    private Date f5988a;

    /* renamed from: b  reason: collision with root package name */
    private int f5989b;

    /* renamed from: c  reason: collision with root package name */
    private b0 f5990c;

    /* renamed from: d  reason: collision with root package name */
    protected String f5991d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        protected f0 f5992a = new f0();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(int i10) {
            this.f5992a.f5989b = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(b0 b0Var) {
            this.f5992a.f5990c = b0Var;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(String str) {
            this.f5992a.f5991d = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public f0 a() {
            if (this.f5992a.f5988a == null) {
                this.f5992a.f5988a = new Date(System.currentTimeMillis());
            }
            return this.f5992a;
        }
    }

    f0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        int i10 = this.f5989b;
        return i10 != -1 ? i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN LOG LEVEL" : "Debug" : "Info" : "Warn" : "Error" : "Fatal";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f5991d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return f5987e.format(this.f5988a);
    }

    public String toString() {
        return d() + " " + b() + "/" + a().a() + ": " + c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0 a() {
        return this.f5990c;
    }
}
