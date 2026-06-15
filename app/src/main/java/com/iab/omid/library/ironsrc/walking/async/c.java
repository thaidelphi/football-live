package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f15932a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f15933b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f15934c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f15935d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f15932a = linkedBlockingQueue;
        this.f15933b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f15934c.poll();
        this.f15935d = poll;
        if (poll != null) {
            poll.a(this.f15933b);
        }
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.a
    public void a(b bVar) {
        this.f15935d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f15934c.add(bVar);
        if (this.f15935d == null) {
            a();
        }
    }
}
