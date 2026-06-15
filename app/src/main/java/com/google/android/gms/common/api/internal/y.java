package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;
import com.ironsource.b9;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final ApiKey<?> f12257a;

    /* renamed from: b  reason: collision with root package name */
    private final Feature f12258b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ y(ApiKey apiKey, Feature feature, zabr zabrVar) {
        this.f12257a = apiKey;
        this.f12258b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof y)) {
            y yVar = (y) obj;
            if (Objects.a(this.f12257a, yVar.f12257a) && Objects.a(this.f12258b, yVar.f12258b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f12257a, this.f12258b);
    }

    public final String toString() {
        return Objects.c(this).a(b9.h.W, this.f12257a).a("feature", this.f12258b).toString();
    }
}
