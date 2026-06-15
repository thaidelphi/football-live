package com.applovin.impl;

import java.util.Iterator;
import java.util.Objects;
/* compiled from: R8$$SyntheticClass */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final /* synthetic */ class wa {
    public static /* synthetic */ String a(CharSequence charSequence, Iterable iterable) {
        Objects.requireNonNull(charSequence, "delimiter");
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }
}
