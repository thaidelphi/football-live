package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import c6.e;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import f6.c;
import f6.h;
import f6.r;
import java.util.Arrays;
import java.util.List;
import n6.d;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.1.1 */
@Keep
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<c<?>> getComponents() {
        return Arrays.asList(c.e(d6.a.class).b(r.j(e.class)).b(r.j(Context.class)).b(r.j(d.class)).f(new h() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // f6.h
            public final Object a(f6.e eVar) {
                d6.a c10;
                c10 = d6.b.c((e) eVar.a(e.class), (Context) eVar.a(Context.class), (d) eVar.a(d.class));
                return c10;
            }
        }).e().d(), z6.h.b("fire-analytics", "21.1.1"));
    }
}
