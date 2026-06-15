package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final s f13148a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13149b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f13150c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f13151d;

    /* renamed from: e  reason: collision with root package name */
    private final String f13152e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f13153f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ t(String str, s sVar, int i10, Throwable th, byte[] bArr, Map map, zzer zzerVar) {
        Preconditions.m(sVar);
        this.f13148a = sVar;
        this.f13149b = i10;
        this.f13150c = th;
        this.f13151d = bArr;
        this.f13152e = str;
        this.f13153f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13148a.a(this.f13152e, this.f13149b, this.f13150c, this.f13151d, this.f13153f);
    }
}
