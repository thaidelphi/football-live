package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import g9.l0;
import g9.w;
import java.util.Comparator;
import java.util.PriorityQueue;
import l8.b;
import m9.a;
import m9.c;
/* compiled from: DownloadPriorityQueue.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DownloadPriorityQueue {
    private final a mutex = c.a(false);
    private final w<PriorityItem> nextTurn = l0.a(null);
    private final PriorityQueue<PriorityItem> queue = new PriorityQueue<>(50, new Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            a10 = b.a(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t10).getPriority()), Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t11).getPriority()));
            return a10;
        }
    });

    /* compiled from: DownloadPriorityQueue.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i10) {
            this.priority = i10;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(int r11, t8.l<? super m8.d<? super i8.w>, ? extends java.lang.Object> r12, m8.d<? super i8.w> r13) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke(int, t8.l, m8.d):java.lang.Object");
    }
}
