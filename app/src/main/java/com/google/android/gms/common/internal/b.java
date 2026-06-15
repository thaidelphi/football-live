package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b extends zag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f12541a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LifecycleFragment f12542b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Intent intent, LifecycleFragment lifecycleFragment, int i10) {
        this.f12541a = intent;
        this.f12542b = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void a() {
        Intent intent = this.f12541a;
        if (intent != null) {
            this.f12542b.startActivityForResult(intent, 2);
        }
    }
}
