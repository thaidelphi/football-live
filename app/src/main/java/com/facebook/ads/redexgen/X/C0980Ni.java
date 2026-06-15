package com.facebook.ads.redexgen.X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.annotation.DataClassGenerate;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointQeConfig;", "", "enableMultipleUsersPerManager", "", "<init>", "(Z)V", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DataClassGenerate
/* renamed from: com.facebook.ads.redexgen.X.Ni  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0980Ni extends AbstractC0933Ll {
    public final boolean A00;

    public C0980Ni() {
        this(false, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0980Ni) && this.A00 == ((C0980Ni) obj).A00;
    }

    public final int hashCode() {
        return AbstractC0943Lv.A00(this.A00);
    }

    public final String toString() {
        return super.toString();
    }

    public C0980Ni(boolean z10) {
        this.A00 = z10;
    }

    public /* synthetic */ C0980Ni(boolean z10, int i10, AbstractC2127nl abstractC2127nl) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
