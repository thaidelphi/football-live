package com.appnext.a;

import android.content.Context;
import android.widget.VideoView;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends VideoView {
    private InterfaceC0144a hE;

    /* renamed from: com.appnext.a.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0144a {
        void aF();

        void onPause();
    }

    public a(Context context) {
        super(context);
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        super.pause();
        InterfaceC0144a interfaceC0144a = this.hE;
        if (interfaceC0144a != null) {
            interfaceC0144a.onPause();
        }
    }

    public final void setPlayPauseListener(InterfaceC0144a interfaceC0144a) {
        this.hE = interfaceC0144a;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        super.start();
        InterfaceC0144a interfaceC0144a = this.hE;
        if (interfaceC0144a != null) {
            interfaceC0144a.aF();
        }
    }
}
