package com.unity3d.services.core.di;
/* compiled from: IServiceComponent.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface IServiceComponent {

    /* compiled from: IServiceComponent.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class DefaultImpls {
        public static IServiceProvider getServiceProvider(IServiceComponent iServiceComponent) {
            return ServiceProvider.INSTANCE;
        }
    }

    IServiceProvider getServiceProvider();
}
