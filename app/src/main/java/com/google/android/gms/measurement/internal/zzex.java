package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzex {

    /* renamed from: a  reason: collision with root package name */
    private final String f13497a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13498b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13499c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13500d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ y f13501e;

    public zzex(y yVar, String str, boolean z10) {
        this.f13501e = yVar;
        Preconditions.g(str);
        this.f13497a = str;
        this.f13498b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f13501e.j().edit();
        edit.putBoolean(this.f13497a, z10);
        edit.apply();
        this.f13500d = z10;
    }

    public final boolean b() {
        if (!this.f13499c) {
            this.f13499c = true;
            this.f13500d = this.f13501e.j().getBoolean(this.f13497a, this.f13498b);
        }
        return this.f13500d;
    }
}
