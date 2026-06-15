package com.google.android.gms.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final /* synthetic */ class zaa implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ zaa f12771a = new zaa();

    private /* synthetic */ zaa() {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        Map map = (Map) obj;
        int i10 = GoogleApiAvailability.f12016d;
        return Tasks.forResult(null);
    }
}
