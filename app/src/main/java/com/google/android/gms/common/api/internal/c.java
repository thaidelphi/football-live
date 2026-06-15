package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f12195a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zaad f12196b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(zaad zaadVar, TaskCompletionSource taskCompletionSource) {
        this.f12196b = zaadVar;
        this.f12195a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Map map;
        map = this.f12196b.f12262b;
        map.remove(this.f12195a);
    }
}
