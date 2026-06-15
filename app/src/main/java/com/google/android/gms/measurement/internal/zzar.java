package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzar {

    /* renamed from: a  reason: collision with root package name */
    final String f13305a;

    /* renamed from: b  reason: collision with root package name */
    final String f13306b;

    /* renamed from: c  reason: collision with root package name */
    final String f13307c;

    /* renamed from: d  reason: collision with root package name */
    final long f13308d;

    /* renamed from: e  reason: collision with root package name */
    final long f13309e;

    /* renamed from: f  reason: collision with root package name */
    final zzau f13310f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzar(zzfy zzfyVar, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzau zzauVar;
        Preconditions.g(str2);
        Preconditions.g(str3);
        this.f13305a = str2;
        this.f13306b = str3;
        this.f13307c = true == TextUtils.isEmpty(str) ? null : str;
        this.f13308d = j10;
        this.f13309e = j11;
        if (j11 != 0 && j11 > j10) {
            zzfyVar.zzay().r().b("Event created with reverse previous/current timestamps. appId", zzeo.u(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfyVar.zzay().m().a("Param name can't be null");
                    it.remove();
                } else {
                    Object j12 = zzfyVar.I().j(next, bundle2.get(next));
                    if (j12 == null) {
                        zzfyVar.zzay().r().b("Param value can't be null", zzfyVar.y().e(next));
                        it.remove();
                    } else {
                        zzfyVar.I().x(bundle2, next, j12);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        } else {
            zzauVar = new zzau(new Bundle());
        }
        this.f13310f = zzauVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzar a(zzfy zzfyVar, long j10) {
        return new zzar(zzfyVar, this.f13307c, this.f13305a, this.f13306b, this.f13308d, j10, this.f13310f);
    }

    public final String toString() {
        String str = this.f13305a;
        String str2 = this.f13306b;
        String obj = this.f13310f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }

    private zzar(zzfy zzfyVar, String str, String str2, String str3, long j10, long j11, zzau zzauVar) {
        Preconditions.g(str2);
        Preconditions.g(str3);
        Preconditions.m(zzauVar);
        this.f13305a = str2;
        this.f13306b = str3;
        this.f13307c = true == TextUtils.isEmpty(str) ? null : str;
        this.f13308d = j10;
        this.f13309e = j11;
        if (j11 != 0 && j11 > j10) {
            zzfyVar.zzay().r().c("Event created with reverse previous/current timestamps. appId, name", zzeo.u(str2), zzeo.u(str3));
        }
        this.f13310f = zzauVar;
    }
}
