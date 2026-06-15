package com.ironsource.mediationsdk;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ISContainerParams {

    /* renamed from: a  reason: collision with root package name */
    private final int f18481a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18482b;

    public ISContainerParams(int i10, int i11) {
        this.f18481a = i10;
        this.f18482b = i11;
    }

    public static /* synthetic */ ISContainerParams copy$default(ISContainerParams iSContainerParams, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = iSContainerParams.f18481a;
        }
        if ((i12 & 2) != 0) {
            i11 = iSContainerParams.f18482b;
        }
        return iSContainerParams.copy(i10, i11);
    }

    public final int component1() {
        return this.f18481a;
    }

    public final int component2() {
        return this.f18482b;
    }

    public final ISContainerParams copy(int i10, int i11) {
        return new ISContainerParams(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ISContainerParams) {
            ISContainerParams iSContainerParams = (ISContainerParams) obj;
            return this.f18481a == iSContainerParams.f18481a && this.f18482b == iSContainerParams.f18482b;
        }
        return false;
    }

    public final int getHeight() {
        return this.f18482b;
    }

    public final int getWidth() {
        return this.f18481a;
    }

    public int hashCode() {
        return (this.f18481a * 31) + this.f18482b;
    }

    public String toString() {
        return "ISContainerParams(width=" + this.f18481a + ", height=" + this.f18482b + ')';
    }
}
