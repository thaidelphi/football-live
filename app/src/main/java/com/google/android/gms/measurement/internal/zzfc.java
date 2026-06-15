package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfc {

    /* renamed from: a  reason: collision with root package name */
    private final String f13516a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13517b;

    /* renamed from: c  reason: collision with root package name */
    private String f13518c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ y f13519d;

    public zzfc(y yVar, String str, String str2) {
        this.f13519d = yVar;
        Preconditions.g(str);
        this.f13516a = str;
    }

    public final String a() {
        if (!this.f13517b) {
            this.f13517b = true;
            this.f13518c = this.f13519d.j().getString(this.f13516a, null);
        }
        return this.f13518c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f13519d.j().edit();
        edit.putString(this.f13516a, str);
        edit.apply();
        this.f13518c = str;
    }
}
