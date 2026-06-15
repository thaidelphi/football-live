package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a extends zag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f12538a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f12539b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f12540c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Intent intent, Activity activity, int i10) {
        this.f12538a = intent;
        this.f12539b = activity;
        this.f12540c = i10;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void a() {
        Intent intent = this.f12538a;
        if (intent != null) {
            this.f12539b.startActivityForResult(intent, this.f12540c);
        }
    }
}
