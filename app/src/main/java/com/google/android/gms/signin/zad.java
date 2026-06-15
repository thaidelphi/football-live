package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zad {

    /* renamed from: a  reason: collision with root package name */
    public static final Api.ClientKey<SignInClientImpl> f13782a;
    @ShowFirstParty

    /* renamed from: b  reason: collision with root package name */
    public static final Api.ClientKey<SignInClientImpl> f13783b;

    /* renamed from: c  reason: collision with root package name */
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> f13784c;

    /* renamed from: d  reason: collision with root package name */
    static final Api.AbstractClientBuilder<SignInClientImpl, zac> f13785d;

    /* renamed from: e  reason: collision with root package name */
    public static final Scope f13786e;

    /* renamed from: f  reason: collision with root package name */
    public static final Scope f13787f;

    /* renamed from: g  reason: collision with root package name */
    public static final Api<SignInOptions> f13788g;

    /* renamed from: h  reason: collision with root package name */
    public static final Api<zac> f13789h;

    static {
        Api.ClientKey<SignInClientImpl> clientKey = new Api.ClientKey<>();
        f13782a = clientKey;
        Api.ClientKey<SignInClientImpl> clientKey2 = new Api.ClientKey<>();
        f13783b = clientKey2;
        a aVar = new a();
        f13784c = aVar;
        b bVar = new b();
        f13785d = bVar;
        f13786e = new Scope("profile");
        f13787f = new Scope("email");
        f13788g = new Api<>("SignIn.API", aVar, clientKey);
        f13789h = new Api<>("SignIn.INTERNAL_API", bVar, clientKey2);
    }
}
