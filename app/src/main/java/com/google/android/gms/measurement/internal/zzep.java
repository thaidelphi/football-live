package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzep {

    /* renamed from: a  reason: collision with root package name */
    public final String f13493a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13494b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13495c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f13496d;

    public zzep(String str, String str2, Bundle bundle, long j10) {
        this.f13493a = str;
        this.f13494b = str2;
        this.f13496d = bundle;
        this.f13495c = j10;
    }

    public static zzep b(zzaw zzawVar) {
        return new zzep(zzawVar.f13312a, zzawVar.f13314c, zzawVar.f13313b.n0(), zzawVar.f13315d);
    }

    public final zzaw a() {
        return new zzaw(this.f13493a, new zzau(new Bundle(this.f13496d)), this.f13494b, this.f13495c);
    }

    public final String toString() {
        String str = this.f13494b;
        String str2 = this.f13493a;
        String obj = this.f13496d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
