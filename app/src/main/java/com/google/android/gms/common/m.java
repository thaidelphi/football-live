package com.google.android.gms.common;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m {

    /* renamed from: e  reason: collision with root package name */
    private static final m f12643e = new m(true, 3, 1, null, null);

    /* renamed from: a  reason: collision with root package name */
    final boolean f12644a;

    /* renamed from: b  reason: collision with root package name */
    final String f12645b;

    /* renamed from: c  reason: collision with root package name */
    final Throwable f12646c;

    /* renamed from: d  reason: collision with root package name */
    final int f12647d;

    private m(boolean z10, int i10, int i11, String str, Throwable th) {
        this.f12644a = z10;
        this.f12647d = i10;
        this.f12645b = str;
        this.f12646c = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static m b() {
        return f12643e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m c(String str) {
        return new m(false, 1, 5, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m d(String str, Throwable th) {
        return new m(false, 1, 5, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m f(int i10) {
        return new m(true, i10, 1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m g(int i10, int i11, String str, Throwable th) {
        return new m(false, i10, i11, str, th);
    }

    String a() {
        return this.f12645b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.f12644a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f12646c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f12646c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
