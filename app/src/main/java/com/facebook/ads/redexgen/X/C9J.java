package com.facebook.ads.redexgen.X;

import com.facebook.ads.redexgen.X.C9I;
import com.facebook.ads.redexgen.X.C9K;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
/* renamed from: com.facebook.ads.redexgen.X.9J  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C9J<T extends C9K, E extends C9I> {
    public final Map<Class<E>, List<WeakReference<T>>> A00 = new HashMap();
    public final Queue<E> A01 = new ArrayDeque();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A00(E e8) {
        List<WeakReference<T>> list;
        if (this.A00 == null || (list = this.A00.get(e8.getClass())) == null) {
            return;
        }
        A01(list);
        if (list.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : new ArrayList(list)) {
            C9K c9k = (C9K) weakReference.get();
            if (c9k != null && c9k.A00(e8)) {
                c9k.A03(e8);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A02(E e8) {
        if (this.A01.isEmpty()) {
            this.A01.add(e8);
            while (!this.A01.isEmpty()) {
                A00(this.A01.peek());
                this.A01.remove();
            }
        } else {
            this.A01.add(e8);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A05(T t10) {
        if (t10 == null) {
            return false;
        }
        Class<E> A01 = t10.A01();
        if (this.A00.get(A01) == null) {
            this.A00.put(A01, new ArrayList());
        }
        List<WeakReference<T>> list = this.A00.get(A01);
        A01(list);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).get() == t10) {
                return false;
            }
        }
        return list.add(new WeakReference<>(t10));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9J != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9K, E extends com.facebook.ads.redexgen.X.9I> */
    /* JADX WARN: Incorrect condition in loop: B:5:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(java.util.List<java.lang.ref.WeakReference<T>> r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L2d
            r3 = 0
            r2 = 0
        L4:
            int r0 = r5.size()
            if (r2 >= r0) goto L1f
            java.lang.Object r1 = r5.get(r2)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L1c
            int r0 = r3 + 1
            r5.set(r3, r1)
            r3 = r0
        L1c:
            int r2 = r2 + 1
            goto L4
        L1f:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L25:
            if (r0 < r3) goto L2d
            r5.remove(r0)
            int r0 = r0 + (-1)
            goto L25
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C9J.A01(java.util.List):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9J != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9K, E extends com.facebook.ads.redexgen.X.9I> */
    public final synchronized void A03(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t10 : subscribers) {
            A05(t10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9J != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9K, E extends com.facebook.ads.redexgen.X.9I> */
    public final synchronized void A04(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t10 : subscribers) {
            A06(t10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9J != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9K, E extends com.facebook.ads.redexgen.X.9I> */
    public final synchronized boolean A06(T subscriber) {
        if (subscriber == null) {
            return false;
        }
        List<WeakReference<T>> list = this.A00.get(subscriber.A01());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).get() == subscriber) {
                list.get(i10).clear();
                return true;
            }
        }
        return false;
    }
}
