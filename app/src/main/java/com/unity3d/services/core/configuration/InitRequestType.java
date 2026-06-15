package com.unity3d.services.core.configuration;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public enum InitRequestType {
    PRIVACY("privacy"),
    TOKEN("token_srr");
    
    private String _callType;

    InitRequestType(String str) {
        this._callType = str;
    }

    public String getCallType() {
        return this._callType;
    }
}
