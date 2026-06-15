package com.startapp;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a5 {

    /* renamed from: a  reason: collision with root package name */
    public final j3 f21757a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f21758b;

    /* renamed from: c  reason: collision with root package name */
    public String f21759c = "";

    public a5(j3 j3Var) {
        this.f21757a = j3Var;
    }

    public final void a(k6 k6Var) {
        j3 j3Var = this.f21757a;
        j3Var.f22129f = k6Var;
        j3Var.f22128e.clear();
        j3Var.f22130g = 0;
        j3Var.f22131h.clear();
        HashMap<String, s7> hashMap = j3Var.f22126c;
        if (hashMap != null) {
            for (s7 s7Var : hashMap.values()) {
                if (s7Var != null) {
                    s7Var.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
            j3Var.f22126c.clear();
        }
    }
}
