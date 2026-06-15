package com.iab.omid.library.adcolony.walking.a;

import com.iab.omid.library.adcolony.walking.a.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f15668a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f15669b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f15670c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f15671d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f15668a = linkedBlockingQueue;
        this.f15669b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f15670c.poll();
        this.f15671d = poll;
        if (poll != null) {
            poll.a(this.f15669b);
        }
    }

    @Override // com.iab.omid.library.adcolony.walking.a.b.a
    public void a(b bVar) {
        this.f15671d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f15670c.add(bVar);
        if (this.f15671d == null) {
            a();
        }
    }
}
