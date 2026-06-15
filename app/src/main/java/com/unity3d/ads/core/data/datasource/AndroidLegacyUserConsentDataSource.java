package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
/* compiled from: AndroidLegacyUserConsentDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidLegacyUserConsentDataSource implements LegacyUserConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage privateStorage;

    public AndroidLegacyUserConsentDataSource(FlattenerRulesUseCase flattenerRulesUseCase, JsonStorage privateStorage) {
        n.f(flattenerRulesUseCase, "flattenerRulesUseCase");
        n.f(privateStorage, "privateStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.privateStorage = privateStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource
    public String getPrivacyData() {
        JSONObject flattenJson;
        JSONObject data = this.privateStorage.getData();
        if (data == null || (flattenJson = new JsonFlattener(data).flattenJson(".", this.flattenerRulesUseCase.invoke())) == null) {
            return null;
        }
        return flattenJson.toString();
    }
}
