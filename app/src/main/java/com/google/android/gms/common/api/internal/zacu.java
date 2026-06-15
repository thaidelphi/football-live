package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final /* synthetic */ class zacu implements RemoteCall {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BiConsumer f12365a;

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        this.f12365a.accept((Api.AnyClient) obj, (TaskCompletionSource) obj2);
    }
}
