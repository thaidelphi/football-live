package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.5E  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class C5E {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.5C] */
    public static C5C A00(final C5D c5d) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.5C
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
                return (AccessibilityNodeInfo) C5D.this.A56(i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
                return C5D.this.A6O(str, i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo findFocus(int i10) {
                return (AccessibilityNodeInfo) C5D.this.A6P(i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i10, int i11, Bundle bundle) {
                return C5D.this.AG3(i10, i11, bundle);
            }
        };
    }
}
