package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class qg extends Throwable {

    /* renamed from: a  reason: collision with root package name */
    private final IronSourceError f19888a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.n.f(error, "error");
        this.f19888a = error;
    }

    public final IronSourceError a() {
        return this.f19888a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.n.a(qg.class, obj.getClass())) {
            return false;
        }
        qg qgVar = (qg) obj;
        if (this.f19888a.getErrorCode() != qgVar.f19888a.getErrorCode()) {
            return false;
        }
        return kotlin.jvm.internal.n.a(this.f19888a.getErrorMessage(), qgVar.f19888a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f19888a.getErrorCode()), this.f19888a.getErrorMessage());
    }
}
