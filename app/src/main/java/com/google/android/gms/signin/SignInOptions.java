package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {

    /* renamed from: j  reason: collision with root package name */
    public static final SignInOptions f13757j = new SignInOptions(false, false, null, false, null, null, false, null, null, null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13758a = false;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13759b = false;

    /* renamed from: c  reason: collision with root package name */
    private final String f13760c = null;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f13761d = false;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f13764g = false;

    /* renamed from: e  reason: collision with root package name */
    private final String f13762e = null;

    /* renamed from: f  reason: collision with root package name */
    private final String f13763f = null;

    /* renamed from: h  reason: collision with root package name */
    private final Long f13765h = null;

    /* renamed from: i  reason: collision with root package name */
    private final Long f13766i = null;

    /* synthetic */ SignInOptions(boolean z10, boolean z11, String str, boolean z12, String str2, String str3, boolean z13, Long l10, Long l11, zaf zafVar) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SignInOptions) {
            boolean z10 = ((SignInOptions) obj).f13758a;
            return Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.b(bool, bool, null, bool, bool, null, null, null, null);
    }
}
