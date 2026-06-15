package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.oN  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2151oN {
    public static String[] A02 = {"FI4CSn5g4hVI", "oUnbtikCS", "OTKcg3hD6eE6nFWotwGGZ5F", "qSmHeLCnLYm7Z6Tg4tQ0z3dsx", "SCLx27yKxe6yDyiZK0iEJT9ptP", "bFFCI01IIFvt0fl9DXgL6XUawg", "6J2GgEdIUlJLk3yvVentjGe1dkRWCLvM", "KM6GnpQ6vjKv"};
    public final Map<String, C2166oc> A00;
    public final Set<C2166oc> A01;

    public C2151oN() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C2166oc> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C2166oc> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        Iterator<C2166oc> it = this.A01.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A02;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A02[6] = "aJOeJxsM87dt105FXzNZlrhAEbJ2aQd4";
            if (hasNext) {
                C2166oc next = it.next();
                this.A00.put(next.A02, next);
            } else {
                this.A01.clear();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C2166oc c2166oc) {
        if (this.A01.add(c2166oc)) {
            this.A00.remove(c2166oc.A02);
            return true;
        }
        return false;
    }
}
