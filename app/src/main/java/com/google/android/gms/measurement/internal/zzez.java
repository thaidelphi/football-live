package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzez {

    /* renamed from: a  reason: collision with root package name */
    private final String f13506a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13507b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13508c;

    /* renamed from: d  reason: collision with root package name */
    private long f13509d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ y f13510e;

    public zzez(y yVar, String str, long j10) {
        this.f13510e = yVar;
        Preconditions.g(str);
        this.f13506a = str;
        this.f13507b = j10;
    }

    public final long a() {
        if (!this.f13508c) {
            this.f13508c = true;
            this.f13509d = this.f13510e.j().getLong(this.f13506a, this.f13507b);
        }
        return this.f13509d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f13510e.j().edit();
        edit.putLong(this.f13506a, j10);
        edit.apply();
        this.f13509d = j10;
    }
}
