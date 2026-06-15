package com.unity3d.ads.core.domain.privacy;

import com.ironsource.b9;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import j8.p;
import j8.q;
import java.util.List;
/* compiled from: DeveloperConsentFlattenerRulesUseCase.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DeveloperConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    public JsonFlattenerRules invoke() {
        List g10;
        List b10;
        List g11;
        g10 = q.g("privacy", "gdpr", "pipl", "user");
        b10 = p.b(b9.h.X);
        g11 = q.g("ts");
        return new JsonFlattenerRules(g10, b10, g11);
    }
}
