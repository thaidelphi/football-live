package com.unity3d.services.core.webview.bridge;
/* compiled from: IEventSender.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface IEventSender {
    boolean canSend();

    boolean sendEvent(Enum<?> r12, Enum<?> r22, Object... objArr);
}
