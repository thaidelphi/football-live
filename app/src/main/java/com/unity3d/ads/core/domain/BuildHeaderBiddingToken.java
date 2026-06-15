package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
/* compiled from: BuildHeaderBiddingToken.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface BuildHeaderBiddingToken {

    /* compiled from: BuildHeaderBiddingToken.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(BuildHeaderBiddingToken buildHeaderBiddingToken, boolean z10, m8.d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                return buildHeaderBiddingToken.invoke(z10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    Object invoke(boolean z10, m8.d<? super HeaderBiddingTokenOuterClass.HeaderBiddingToken> dVar);
}
