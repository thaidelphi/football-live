package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b implements PendingResult.StatusListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BasePendingResult f12188a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zaad f12189b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(zaad zaadVar, BasePendingResult basePendingResult) {
        this.f12189b = zaadVar;
        this.f12188a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void a(Status status) {
        Map map;
        map = this.f12189b.f12261a;
        map.remove(this.f12188a);
    }
}
