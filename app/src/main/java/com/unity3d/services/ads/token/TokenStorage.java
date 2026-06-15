package com.unity3d.services.ads.token;

import i8.w;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: TokenStorage.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface TokenStorage {
    void appendTokens(JSONArray jSONArray) throws JSONException;

    void createTokens(JSONArray jSONArray) throws JSONException;

    void deleteTokens();

    w getNativeGeneratedToken();

    String getToken();

    void setInitToken(String str);
}
