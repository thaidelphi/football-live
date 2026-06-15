package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class w3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f13215a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13216b = "_err";

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Bundle f13217c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ x3 f13218d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w3(x3 x3Var, String str, String str2, Bundle bundle) {
        this.f13218d = x3Var;
        this.f13215a = str;
        this.f13217c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13218d.f13227a.f((zzaw) Preconditions.m(this.f13218d.f13227a.c0().r0(this.f13215a, this.f13216b, this.f13217c, "auto", this.f13218d.f13227a.zzav().a(), false, true)), this.f13215a);
    }
}
