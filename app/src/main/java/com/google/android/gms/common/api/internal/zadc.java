package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zadc {

    /* renamed from: c  reason: collision with root package name */
    public static final Status f12373c = new Status(8, "The connection to Google Play services was lost");
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final Set<BasePendingResult<?>> f12374a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b  reason: collision with root package name */
    private final j0 f12375b = new j0(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(BasePendingResult<? extends Result> basePendingResult) {
        this.f12374a.add(basePendingResult);
        basePendingResult.o(this.f12375b);
    }

    public final void b() {
        BasePendingResult[] basePendingResultArr;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f12374a.toArray(new BasePendingResult[0])) {
            basePendingResult.o(null);
            if (basePendingResult.n()) {
                this.f12374a.remove(basePendingResult);
            }
        }
    }
}
