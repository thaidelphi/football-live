package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.oe  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2168oe<ModelType, StateType> {
    public final ModelType A03;
    public final StateType A04;
    public final String A05;
    public final String A06;
    public List<InterfaceC2170og<ModelType, StateType>> A01 = null;
    public C2166oc A00 = C2166oc.A0B;
    public boolean A02 = false;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oe != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C2168oe(ModelType model, StateType state, String str) {
        this.A03 = model;
        this.A04 = state;
        this.A06 = str;
        this.A05 = str;
    }

    public static /* synthetic */ C2166oc A00(C2168oe c2168oe) {
        return c2168oe.A00;
    }

    public static /* synthetic */ Object A01(C2168oe c2168oe) {
        return c2168oe.A03;
    }

    public static /* synthetic */ Object A02(C2168oe c2168oe) {
        return c2168oe.A04;
    }

    public static /* synthetic */ String A03(C2168oe c2168oe) {
        return c2168oe.A06;
    }

    public static /* synthetic */ List A04(C2168oe c2168oe) {
        return c2168oe.A01;
    }

    public static /* synthetic */ boolean A05(C2168oe c2168oe) {
        return c2168oe.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oe != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.og != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C2168oe<ModelType, StateType> A06(InterfaceC2170og<ModelType, StateType> interfaceC2170og) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC2170og);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oe != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C2166oc<ModelType, StateType> A07() {
        return new C2166oc<>(this);
    }
}
