package com.unity3d.mediation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LevelPlayAdError {
    public static final a Companion = new a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    /* renamed from: a  reason: collision with root package name */
    private final IronSourceError f23756a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23757b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23758c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public LevelPlayAdError(IronSourceError ironSourceError, String adId, String str) {
        n.f(adId, "adId");
        this.f23756a = ironSourceError;
        this.f23757b = adId;
        this.f23758c = str;
    }

    public /* synthetic */ LevelPlayAdError(IronSourceError ironSourceError, String str, String str2, int i10, h hVar) {
        this(ironSourceError, str, (i10 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(String adId, String adUnitId, int i10, String errorMessage) {
        this(new IronSourceError(i10, errorMessage), adId, adUnitId);
        n.f(adId, "adId");
        n.f(adUnitId, "adUnitId");
        n.f(errorMessage, "errorMessage");
    }

    public final String getAdId() {
        return this.f23757b;
    }

    public final String getAdUnitId() {
        return this.f23758c;
    }

    public final int getErrorCode() {
        IronSourceError ironSourceError = this.f23756a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    public final String getErrorMessage() {
        IronSourceError ironSourceError = this.f23756a;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("adUnitId: ");
        sb.append(this.f23758c);
        sb.append(' ');
        IronSourceError ironSourceError = this.f23756a;
        sb.append(ironSourceError != null ? ironSourceError.toString() : null);
        return sb.toString();
    }
}
