package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class x3 {

    /* renamed from: a  reason: collision with root package name */
    private final View f9575a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendlyObstructionPurpose f9576b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9577c;

    public x3(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f9575a = view;
        this.f9576b = friendlyObstructionPurpose;
        this.f9577c = str;
    }

    public String a() {
        return this.f9577c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f9576b;
    }

    public View c() {
        return this.f9575a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x3 x3Var = (x3) obj;
        View view = this.f9575a;
        if (view == null ? x3Var.f9575a == null : view.equals(x3Var.f9575a)) {
            if (this.f9576b != x3Var.f9576b) {
                return false;
            }
            String str = this.f9577c;
            String str2 = x3Var.f9577c;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    public int hashCode() {
        View view = this.f9575a;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f9576b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f9577c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
