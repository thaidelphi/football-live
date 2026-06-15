package com.ironsource.mediationsdk.model;

import com.ironsource.lp;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class BasePlacement {

    /* renamed from: a  reason: collision with root package name */
    private final int f18932a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18933b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f18934c;

    /* renamed from: d  reason: collision with root package name */
    private final lp f18935d;

    public BasePlacement(int i10, String placementName, boolean z10, lp lpVar) {
        n.f(placementName, "placementName");
        this.f18932a = i10;
        this.f18933b = placementName;
        this.f18934c = z10;
        this.f18935d = lpVar;
    }

    public /* synthetic */ BasePlacement(int i10, String str, boolean z10, lp lpVar, int i11, h hVar) {
        this((i11 & 1) != 0 ? 0 : i10, str, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? null : lpVar);
    }

    public final lp getPlacementAvailabilitySettings() {
        return this.f18935d;
    }

    public final int getPlacementId() {
        return this.f18932a;
    }

    public final String getPlacementName() {
        return this.f18933b;
    }

    public final boolean isDefault() {
        return this.f18934c;
    }

    public final boolean isPlacementId(int i10) {
        return this.f18932a == i10;
    }

    public String toString() {
        return "placement name: " + this.f18933b;
    }
}
