package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class i {

    /* renamed from: a  reason: collision with root package name */
    final String f12996a;

    /* renamed from: b  reason: collision with root package name */
    final String f12997b;

    /* renamed from: c  reason: collision with root package name */
    final long f12998c;

    /* renamed from: d  reason: collision with root package name */
    final long f12999d;

    /* renamed from: e  reason: collision with root package name */
    final long f13000e;

    /* renamed from: f  reason: collision with root package name */
    final long f13001f;

    /* renamed from: g  reason: collision with root package name */
    final long f13002g;

    /* renamed from: h  reason: collision with root package name */
    final Long f13003h;

    /* renamed from: i  reason: collision with root package name */
    final Long f13004i;

    /* renamed from: j  reason: collision with root package name */
    final Long f13005j;

    /* renamed from: k  reason: collision with root package name */
    final Boolean f13006k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        Preconditions.g(str);
        Preconditions.g(str2);
        Preconditions.a(j10 >= 0);
        Preconditions.a(j11 >= 0);
        Preconditions.a(j12 >= 0);
        Preconditions.a(j14 >= 0);
        this.f12996a = str;
        this.f12997b = str2;
        this.f12998c = j10;
        this.f12999d = j11;
        this.f13000e = j12;
        this.f13001f = j13;
        this.f13002g = j14;
        this.f13003h = l10;
        this.f13004i = l11;
        this.f13005j = l12;
        this.f13006k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final i a(Long l10, Long l11, Boolean bool) {
        return new i(this.f12996a, this.f12997b, this.f12998c, this.f12999d, this.f13000e, this.f13001f, this.f13002g, this.f13003h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final i b(long j10, long j11) {
        return new i(this.f12996a, this.f12997b, this.f12998c, this.f12999d, this.f13000e, this.f13001f, j10, Long.valueOf(j11), this.f13004i, this.f13005j, this.f13006k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final i c(long j10) {
        return new i(this.f12996a, this.f12997b, this.f12998c, this.f12999d, this.f13000e, j10, this.f13002g, this.f13003h, this.f13004i, this.f13005j, this.f13006k);
    }
}
