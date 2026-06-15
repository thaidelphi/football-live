package n3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
/* compiled from: AudioBecomingNoisyManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f27879a;

    /* renamed from: b  reason: collision with root package name */
    private final a f27880b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27881c;

    /* compiled from: AudioBecomingNoisyManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final InterfaceC0321b f27882a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f27883b;

        public a(Handler handler, InterfaceC0321b interfaceC0321b) {
            this.f27883b = handler;
            this.f27882a = interfaceC0321b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f27883b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f27881c) {
                this.f27882a.w();
            }
        }
    }

    /* compiled from: AudioBecomingNoisyManager.java */
    /* renamed from: n3.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0321b {
        void w();
    }

    public b(Context context, Handler handler, InterfaceC0321b interfaceC0321b) {
        this.f27879a = context.getApplicationContext();
        this.f27880b = new a(handler, interfaceC0321b);
    }

    public void b(boolean z10) {
        if (z10 && !this.f27881c) {
            a5.p0.M0(this.f27879a, this.f27880b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f27881c = true;
        } else if (z10 || !this.f27881c) {
        } else {
            this.f27879a.unregisterReceiver(this.f27880b);
            this.f27881c = false;
        }
    }
}
