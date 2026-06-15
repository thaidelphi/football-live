package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: NetworkTimeoutException.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class NetworkTimeoutException extends UnityAdsNetworkException {
    public /* synthetic */ NetworkTimeoutException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i10, h hVar) {
        this(str, (i10 & 2) != 0 ? OperationType.UNKNOWN : operationType, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : num2, (i10 & 64) == 0 ? str4 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkTimeoutException(String message, OperationType type, Integer num, String str, String str2, Integer num2, String str3) {
        super(message, type, num, str, str2, num2, str3);
        n.f(message, "message");
        n.f(type, "type");
    }
}
