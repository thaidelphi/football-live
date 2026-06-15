package com.ironsource;

import com.ironsource.t;
import com.ironsource.zf;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class np {

    /* renamed from: a  reason: collision with root package name */
    private final vl f19435a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, t> f19436b;

    public np(vl tools, Map<LevelPlay.AdFormat, t> adFormatsConfigurations) {
        kotlin.jvm.internal.n.f(tools, "tools");
        kotlin.jvm.internal.n.f(adFormatsConfigurations, "adFormatsConfigurations");
        this.f19435a = tools;
        this.f19436b = adFormatsConfigurations;
    }

    private final void a(zf.a aVar, String str, LevelPlay.AdFormat adFormat, t.d dVar) {
        h8 b10 = dVar.b();
        if (b10 != null) {
            n8 n8Var = n8.ShowCount;
            a(aVar.a(str, adFormat, n8Var, new e8(b10.a(), b10.b(), b10.c())), str, adFormat, n8Var);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, n8 n8Var) {
        Throwable d10 = i8.o.d(obj);
        if (d10 != null) {
            this.f19435a.a(str, adFormat, new i8().a(n8Var), d10.getMessage());
        }
    }

    private final void b(zf.a aVar, String str, LevelPlay.AdFormat adFormat, t.d dVar) {
        n8 n8Var = n8.Delivery;
        oa c10 = dVar.c();
        a(aVar.a(str, adFormat, n8Var, new e8(c10 != null ? Boolean.valueOf(c10.a()) : null, null, null, 6, null)), str, adFormat, n8Var);
    }

    private final void c(zf.a aVar, String str, LevelPlay.AdFormat adFormat, t.d dVar) {
        cp e8 = dVar.e();
        if (e8 != null) {
            n8 n8Var = n8.Pacing;
            a(aVar.a(str, adFormat, n8Var, new e8(e8.a(), e8.b(), m8.Second)), str, adFormat, n8Var);
        }
    }

    public final void a(zf.a cappingService) {
        kotlin.jvm.internal.n.f(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, t> entry : this.f19436b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, t.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                t.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }
}
