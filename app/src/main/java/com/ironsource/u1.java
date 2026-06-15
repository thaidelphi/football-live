package com.ironsource;

import com.ironsource.ff;
import com.ironsource.t;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class u1 implements k8 {

    /* renamed from: a  reason: collision with root package name */
    private final vl f20915a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, t> f20916b;

    public u1(vl tools, Map<LevelPlay.AdFormat, t> adFormatsConfigurations) {
        kotlin.jvm.internal.n.f(tools, "tools");
        kotlin.jvm.internal.n.f(adFormatsConfigurations, "adFormatsConfigurations");
        this.f20915a = tools;
        this.f20916b = adFormatsConfigurations;
    }

    private final void a(ff.a aVar, String str, t.d dVar) {
        h8 b10 = dVar.b();
        if (b10 != null) {
            n8 n8Var = n8.ShowCount;
            a(aVar.a(str, n8Var, new e8(b10.a(), b10.b(), b10.c())), str, n8Var);
        }
    }

    private final void a(Object obj, String str, n8 n8Var) {
        Throwable d10 = i8.o.d(obj);
        if (d10 != null) {
            this.f20915a.a(str, new i8().a(n8Var), d10.getMessage());
        }
    }

    private final void b(ff.a aVar, String str, t.d dVar) {
        cp e8 = dVar.e();
        if (e8 != null) {
            n8 n8Var = n8.Pacing;
            a(aVar.a(str, n8Var, new e8(e8.a(), e8.b(), e8.c())), str, n8Var);
        }
    }

    @Override // com.ironsource.k8
    public void a(ff.a cappingService) {
        kotlin.jvm.internal.n.f(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, t> entry : this.f20916b.entrySet()) {
            for (Map.Entry<String, t.d> entry2 : entry.getValue().a().entrySet()) {
                String key = entry2.getKey();
                t.d value = entry2.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }
}
