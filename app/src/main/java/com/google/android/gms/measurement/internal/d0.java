package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final String f12897a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzfv f12898b;

    public d0(zzfv zzfvVar, String str) {
        this.f12898b = zzfvVar;
        Preconditions.m(str);
        this.f12897a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f12898b.f13220a.zzay().m().b(this.f12897a, th);
    }
}
