package com.unity3d.ads.core.extensions;

import gatewayprotocol.v1.InitializationResponseOuterClass;
import kotlin.jvm.internal.n;
import u7.d;
/* compiled from: AdFormatExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdFormatExtensionsKt {

    /* compiled from: AdFormatExtensions.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationResponseOuterClass.AdFormat.values().length];
            try {
                iArr[InitializationResponseOuterClass.AdFormat.AD_FORMAT_REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationResponseOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationResponseOuterClass.AdFormat.AD_FORMAT_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final d toUnityAdFormat(InitializationResponseOuterClass.AdFormat adFormat) {
        n.f(adFormat, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return d.BANNER;
            }
            return d.INTERSTITIAL;
        }
        return d.REWARDED;
    }
}
