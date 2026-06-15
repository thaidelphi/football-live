package com.applovin.impl.privacy.cmp;

import com.applovin.sdk.AppLovinCmpError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CmpErrorImpl implements AppLovinCmpError {

    /* renamed from: a  reason: collision with root package name */
    private final AppLovinCmpError.Code f8382a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8383b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8384c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8385d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.f8384c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.f8385d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.f8382a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.f8383b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i10, String str2) {
        this.f8382a = code;
        this.f8383b = str;
        this.f8384c = i10;
        this.f8385d = str2;
    }
}
