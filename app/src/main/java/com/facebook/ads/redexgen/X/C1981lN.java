package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.protobuf.CodedOutputStream;
/* renamed from: com.facebook.ads.redexgen.X.lN  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1981lN extends C4L {
    public static String[] A01 = {"gP5iRBNUcEm4", "hagqDV25a6ynaoYCoJf0l9z0sKG8jhWl", "ooYhQl9ZMyV9UByvd6u2ZbJwINTXZRCk", "quE", "9rQMt62DD9QRN345Nnq0LTFFdDUm2qAK", "qEkkF74LDRYf2iXVehyp9KJG4XjlQH4Q", "6Z5psXCaQYJ6H", "E0d3lf1uFrHxpWzWCxHKFqknJeusaBoL"};
    public final /* synthetic */ C05234v A00;

    public C1981lN(C05234v c05234v) {
        this.A00 = c05234v;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A01() > 1;
    }

    @Override // com.facebook.ads.redexgen.X.C4L
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C05234v.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A01());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4L
    public final void A08(View view, AnonymousClass56 anonymousClass56) {
        super.A08(view, anonymousClass56);
        anonymousClass56.A0O(C05234v.class.getName());
        anonymousClass56.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            if (A01[3].length() != 3) {
                throw new RuntimeException();
            }
            A01[1] = "jglgbim5NCizxs0Sda1mccX23gBCKHWl";
            anonymousClass56.A0N(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            anonymousClass56.A0N(8192);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4L
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        switch (i10) {
            case CodedOutputStream.DEFAULT_BUFFER_SIZE /* 4096 */:
                if (!this.A00.canScrollHorizontally(1)) {
                    return false;
                }
                this.A00.setCurrentItem(this.A00.A00 + 1);
                return true;
            case 8192:
                if (!this.A00.canScrollHorizontally(-1)) {
                    return false;
                }
                this.A00.setCurrentItem(this.A00.A00 - 1);
                return true;
            default:
                return false;
        }
    }
}
