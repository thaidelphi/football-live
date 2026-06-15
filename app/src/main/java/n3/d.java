package n3;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;
import n3.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AudioFocusManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f27905a;

    /* renamed from: b  reason: collision with root package name */
    private final a f27906b;

    /* renamed from: c  reason: collision with root package name */
    private b f27907c;

    /* renamed from: d  reason: collision with root package name */
    private p3.e f27908d;

    /* renamed from: f  reason: collision with root package name */
    private int f27910f;

    /* renamed from: h  reason: collision with root package name */
    private AudioFocusRequest f27912h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f27913i;

    /* renamed from: g  reason: collision with root package name */
    private float f27911g = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private int f27909e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioFocusManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f27914a;

        public a(Handler handler) {
            this.f27914a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            d.this.h(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f27914a.post(new Runnable() { // from class: n3.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.a.this.b(i10);
                }
            });
        }
    }

    /* compiled from: AudioFocusManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void G(float f10);

        void H(int i10);
    }

    public d(Context context, Handler handler, b bVar) {
        this.f27905a = (AudioManager) a5.a.e((AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f27907c = bVar;
        this.f27906b = new a(handler);
    }

    private void a() {
        this.f27905a.abandonAudioFocus(this.f27906b);
    }

    private void b() {
        if (this.f27909e == 0) {
            return;
        }
        if (a5.p0.f482a >= 26) {
            c();
        } else {
            a();
        }
        m(0);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f27912h;
        if (audioFocusRequest != null) {
            this.f27905a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int e(p3.e eVar) {
        if (eVar == null) {
            return 0;
        }
        switch (eVar.f29653c) {
            case 0:
                a5.t.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (eVar.f29651a == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                a5.t.i("AudioFocusManager", "Unidentified audio usage: " + eVar.f29653c);
                return 0;
            case 16:
                return a5.p0.f482a >= 19 ? 4 : 2;
        }
        return 3;
    }

    private void f(int i10) {
        b bVar = this.f27907c;
        if (bVar != null) {
            bVar.H(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !p()) {
                m(3);
                return;
            }
            f(0);
            m(2);
        } else if (i10 == -1) {
            f(-1);
            b();
        } else if (i10 != 1) {
            a5.t.i("AudioFocusManager", "Unknown focus change type: " + i10);
        } else {
            m(1);
            f(1);
        }
    }

    private int i() {
        if (this.f27909e == 1) {
            return 1;
        }
        if ((a5.p0.f482a >= 26 ? k() : j()) == 1) {
            m(1);
            return 1;
        }
        m(0);
        return -1;
    }

    private int j() {
        return this.f27905a.requestAudioFocus(this.f27906b, a5.p0.e0(((p3.e) a5.a.e(this.f27908d)).f29653c), this.f27910f);
    }

    private int k() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f27912h;
        if (audioFocusRequest == null || this.f27913i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f27910f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f27912h);
            }
            this.f27912h = builder.setAudioAttributes(((p3.e) a5.a.e(this.f27908d)).b().f29657a).setWillPauseWhenDucked(p()).setOnAudioFocusChangeListener(this.f27906b).build();
            this.f27913i = false;
        }
        return this.f27905a.requestAudioFocus(this.f27912h);
    }

    private void m(int i10) {
        if (this.f27909e == i10) {
            return;
        }
        this.f27909e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f27911g == f10) {
            return;
        }
        this.f27911g = f10;
        b bVar = this.f27907c;
        if (bVar != null) {
            bVar.G(f10);
        }
    }

    private boolean n(int i10) {
        return i10 == 1 || this.f27910f != 1;
    }

    private boolean p() {
        p3.e eVar = this.f27908d;
        return eVar != null && eVar.f29651a == 1;
    }

    public float g() {
        return this.f27911g;
    }

    public void l(p3.e eVar) {
        if (a5.p0.c(this.f27908d, eVar)) {
            return;
        }
        this.f27908d = eVar;
        int e8 = e(eVar);
        this.f27910f = e8;
        boolean z10 = true;
        if (e8 != 1 && e8 != 0) {
            z10 = false;
        }
        a5.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int o(boolean z10, int i10) {
        if (n(i10)) {
            b();
            return z10 ? 1 : -1;
        } else if (z10) {
            return i();
        } else {
            return -1;
        }
    }
}
