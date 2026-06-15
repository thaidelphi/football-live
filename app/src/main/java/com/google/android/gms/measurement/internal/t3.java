package com.google.android.gms.measurement.internal;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class t3 implements s {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f13165a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzkz f13166b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t3(zzkz zzkzVar, String str) {
        this.f13166b = zzkzVar;
        this.f13165a = str;
    }

    @Override // com.google.android.gms.measurement.internal.s
    public final void a(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.f13166b.k(i10, th, bArr, this.f13165a);
    }
}
