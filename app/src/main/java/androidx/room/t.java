package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
/* compiled from: InvalidationLiveDataContainer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class t {

    /* renamed from: a  reason: collision with root package name */
    final Set<LiveData> f4281a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final q0 f4282b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(q0 q0Var) {
        this.f4282b = q0Var;
    }
}
