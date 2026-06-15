package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class c2 extends fc {

    /* renamed from: a  reason: collision with root package name */
    private final o1 f16812a;

    /* renamed from: b  reason: collision with root package name */
    private final f1 f16813b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16814c;

    public c2(o1 adTools, f1 adProperties, String str) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        this.f16812a = adTools;
        this.f16813b = adProperties;
        this.f16814c = str;
    }

    public /* synthetic */ c2(o1 o1Var, f1 f1Var, String str, int i10, kotlin.jvm.internal.h hVar) {
        this(o1Var, f1Var, (i10 & 4) != 0 ? null : str);
    }

    @Override // com.ironsource.d2
    public Map<String, Object> a(b2 b2Var) {
        Map<String, Object> a10 = a(this.f16813b);
        a10.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        a10.put("sessionDepth", Integer.valueOf(this.f16812a.f()));
        String str = this.f16814c;
        if (str != null) {
            a10.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return a10;
    }
}
