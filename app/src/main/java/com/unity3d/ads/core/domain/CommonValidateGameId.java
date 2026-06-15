package com.unity3d.ads.core.domain;

import kotlin.jvm.internal.n;
/* compiled from: CommonValidateGameId.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonValidateGameId implements ValidateGameId {
    private final GetGameId getGameId;
    private final SetGameId setGameId;

    public CommonValidateGameId(GetGameId getGameId, SetGameId setGameId) {
        n.f(getGameId, "getGameId");
        n.f(setGameId, "setGameId");
        this.getGameId = getGameId;
        this.setGameId = setGameId;
    }

    @Override // com.unity3d.ads.core.domain.ValidateGameId
    public boolean invoke(String str) {
        if (this.getGameId.invoke() != null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        this.setGameId.invoke(str);
        return true;
    }
}
