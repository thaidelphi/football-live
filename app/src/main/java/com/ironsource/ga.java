package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceAES;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ga implements ks<String> {

    /* renamed from: a  reason: collision with root package name */
    private final String f17551a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17552b;

    public ga(String encryptedResponse, String descriptionKey) {
        kotlin.jvm.internal.n.f(encryptedResponse, "encryptedResponse");
        kotlin.jvm.internal.n.f(descriptionKey, "descriptionKey");
        this.f17551a = encryptedResponse;
        this.f17552b = descriptionKey;
    }

    @Override // com.ironsource.ks
    /* renamed from: b */
    public String a() {
        String value = IronSourceAES.decode(this.f17552b, this.f17551a);
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        kotlin.jvm.internal.n.e(value, "value");
        return value;
    }
}
