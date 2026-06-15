package pl.droidsonroids.gif;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: GifRenderingExecutor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class c extends ScheduledThreadPoolExecutor {

    /* compiled from: GifRenderingExecutor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static final c f30019a = new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a() {
        return b.f30019a;
    }

    private c() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }
}
