package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f16188a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f16189b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f16190c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f16191d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f16188a = linkedBlockingQueue;
        this.f16189b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f16190c.poll();
        this.f16191d = poll;
        if (poll != null) {
            poll.a(this.f16189b);
        }
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.a
    public void a(b bVar) {
        this.f16191d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f16190c.add(bVar);
        if (this.f16191d == null) {
            a();
        }
    }
}
