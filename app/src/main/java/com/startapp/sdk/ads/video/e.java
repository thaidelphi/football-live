package com.startapp.sdk.ads.video;

import com.startapp.sdk.ads.video.b;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.i;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f22798a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i.b f22799b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.a f22800c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f22801d;

    public e(f fVar, String str, b.C0250b c0250b, b.c cVar) {
        this.f22801d = fVar;
        this.f22798a = str;
        this.f22799b = c0250b;
        this.f22800c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f22801d;
        fVar.a(fVar.f22803b, this.f22798a, this.f22799b, this.f22800c);
    }
}
