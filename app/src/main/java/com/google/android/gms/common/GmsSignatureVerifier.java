package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.ironsource.dp;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GmsSignatureVerifier {

    /* renamed from: a  reason: collision with root package name */
    private static final b f12013a;

    /* renamed from: b  reason: collision with root package name */
    private static final b f12014b;

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap f12015c;

    static {
        o oVar = new o();
        oVar.d("com.google.android.gms");
        oVar.a(204200000L);
        i iVar = k.f12638d;
        oVar.c(zzag.zzn(iVar.u0(), k.f12636b.u0()));
        i iVar2 = k.f12637c;
        oVar.b(zzag.zzn(iVar2.u0(), k.f12635a.u0()));
        f12013a = oVar.e();
        o oVar2 = new o();
        oVar2.d(dp.f17077b);
        oVar2.a(82240000L);
        oVar2.c(zzag.zzm(iVar.u0()));
        oVar2.b(zzag.zzm(iVar2.u0()));
        f12014b = oVar2.e();
        f12015c = new HashMap();
    }
}
