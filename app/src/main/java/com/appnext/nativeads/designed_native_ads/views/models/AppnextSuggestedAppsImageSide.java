package com.appnext.nativeads.designed_native_ads.views.models;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public enum AppnextSuggestedAppsImageSide {
    Right,
    Left;

    /* renamed from: com.appnext.nativeads.designed_native_ads.views.models.AppnextSuggestedAppsImageSide$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] gl;

        static {
            int[] iArr = new int[AppnextSuggestedAppsImageSide.values().length];
            gl = iArr;
            try {
                iArr[AppnextSuggestedAppsImageSide.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                gl[AppnextSuggestedAppsImageSide.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final AppnextSuggestedAppsImageSide getOppositeSide() {
        int i10 = AnonymousClass1.gl[ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return Right;
            }
            return Left;
        }
        return Right;
    }
}
