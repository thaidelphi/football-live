package com.unity3d.ads.core.data.repository;

import com.adcolony.sdk.AdColonyAppOptions;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.jvm.internal.o;
import t8.a;
/* compiled from: AndroidMediationRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidMediationRepository$mediationProvider$1 extends o implements a<ClientInfoOuterClass.MediationProvider> {
    final /* synthetic */ AndroidMediationRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMediationRepository$mediationProvider$1(AndroidMediationRepository androidMediationRepository) {
        super(0);
        this.this$0 = androidMediationRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final ClientInfoOuterClass.MediationProvider invoke() {
        boolean r10;
        boolean l10;
        boolean l11;
        boolean l12;
        ClientInfoOuterClass.MediationProvider mediationProvider;
        String name = this.this$0.getName();
        if (name != null) {
            r10 = b9.o.r(name, "AppLovinSdk_", false, 2, null);
            if (r10) {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            } else {
                l10 = b9.o.l(name, AdColonyAppOptions.ADMOB, true);
                if (l10) {
                    mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB;
                } else {
                    l11 = b9.o.l(name, "MAX", true);
                    if (l11) {
                        mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
                    } else {
                        l12 = b9.o.l(name, AdColonyAppOptions.IRONSOURCE, true);
                        mediationProvider = l12 ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
                    }
                }
            }
            if (mediationProvider != null) {
                return mediationProvider;
            }
        }
        return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
    }
}
