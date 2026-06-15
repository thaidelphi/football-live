package n3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StreamVolumeManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g3 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f27988a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f27989b;

    /* renamed from: c  reason: collision with root package name */
    private final b f27990c;

    /* renamed from: d  reason: collision with root package name */
    private final AudioManager f27991d;

    /* renamed from: e  reason: collision with root package name */
    private c f27992e;

    /* renamed from: f  reason: collision with root package name */
    private int f27993f;

    /* renamed from: g  reason: collision with root package name */
    private int f27994g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f27995h;

    /* compiled from: StreamVolumeManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void B(int i10, boolean z10);

        void t(int i10);
    }

    /* compiled from: StreamVolumeManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = g3.this.f27989b;
            final g3 g3Var = g3.this;
            handler.post(new Runnable() { // from class: n3.h3
                @Override // java.lang.Runnable
                public final void run() {
                    g3.b(g3.this);
                }
            });
        }
    }

    public g3(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f27988a = applicationContext;
        this.f27989b = handler;
        this.f27990c = bVar;
        AudioManager audioManager = (AudioManager) a5.a.h((AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f27991d = audioManager;
        this.f27993f = 3;
        this.f27994g = f(audioManager, 3);
        this.f27995h = e(audioManager, this.f27993f);
        c cVar = new c();
        try {
            a5.p0.M0(applicationContext, cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f27992e = cVar;
        } catch (RuntimeException e8) {
            a5.t.j("StreamVolumeManager", "Error registering stream volume receiver", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(g3 g3Var) {
        g3Var.h();
    }

    private static boolean e(AudioManager audioManager, int i10) {
        if (a5.p0.f482a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return f(audioManager, i10) == 0;
    }

    private static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e8) {
            a5.t.j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e8);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        int f10 = f(this.f27991d, this.f27993f);
        boolean e8 = e(this.f27991d, this.f27993f);
        if (this.f27994g == f10 && this.f27995h == e8) {
            return;
        }
        this.f27994g = f10;
        this.f27995h = e8;
        this.f27990c.B(f10, e8);
    }

    public int c() {
        return this.f27991d.getStreamMaxVolume(this.f27993f);
    }

    public int d() {
        if (a5.p0.f482a >= 28) {
            return this.f27991d.getStreamMinVolume(this.f27993f);
        }
        return 0;
    }

    public void g(int i10) {
        if (this.f27993f == i10) {
            return;
        }
        this.f27993f = i10;
        h();
        this.f27990c.t(i10);
    }
}
